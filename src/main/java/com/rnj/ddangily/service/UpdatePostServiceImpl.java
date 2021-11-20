package com.rnj.ddangily.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rnj.ddangily.dao.InstagramDao;
import com.rnj.ddangily.model.Instagram;
import com.rnj.ddangily.model.InstagramExample;
import com.rnj.ddangily.persistence.InstagramMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UpdatePostServiceImpl implements UpdatePostService{

    Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    MasterConfigService masterConfigService;

    @Autowired
    HttpService httpService;

    @Autowired
    InstagramMapper instagramMapper;

    @Autowired
    InstagramDao instagramDao;

    @Override
    public void updateInstagramPosts() {
        String dataUrl = masterConfigService.getDataUrl();
        String response = httpService.sendGetRequest(dataUrl).toString();

        ObjectMapper om = new ObjectMapper();
        Map<String,Object> map = (Map<String, Object>) JSONValue.parse(response);
        map = keyConvStyleClient(map);

        Object data = map.get("data");
//        JSONArray jsonArr = new JSONArray(data);

        om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {

            /* UPSERT */
            List<Instagram> posts = om.convertValue(data,new TypeReference<List<Instagram>>(){});
            for (Instagram post:posts){
                List<Instagram> instagramList = duplicateCheck(post.getId());

//                if (duplicateCheck(post.getId()) == 0){
                if (instagramList.size() == 0){
                    instagramMapper.insertSelective(post);
                } else {
//                    post.setCollectionTime(instagramList.get(0).getCollectionTime());
                    post.setLastUpdateTime(new Date());
                    InstagramExample example = new InstagramExample();
                    example.createCriteria()
                                    .andIdEqualTo(post.getId());
                    instagramMapper.updateByExampleSelective(post,example);
                }
            }

        } catch (Exception e){
            logger.error("ERROR",e);

        }
        logger.debug("hi");
    }

    public List<Instagram> duplicateCheck(long postId){
//    public Instagram duplicateCheck(long postId){
//        return instagramDao.selectCount(postId);
        return instagramDao.selectList(postId);
    }






    public Map keyConvStyleClient(Map map) {
        Iterator<String> iterKey = map.keySet().iterator();
        Map resultMap = new HashMap();
//        Map newMap = new HashMap();
        JSONArray arr = null;
        while (iterKey.hasNext()) {
            String key = iterKey.next();
            String typeName = map.get(key).getClass().getSimpleName();

            if (typeName.indexOf("JSONArray") >= 0) { // 리스트로 간주.

//                List<Map> newList = new LinkedList<Map>();
                List subList = (List) map.get(key);
                logger.debug("hi");
                arr = new JSONArray();
                for (int i = 0; i < subList.size(); i++) {
                    Map subItem = (Map) subList.get(i);
//                    Map returnItem = new HashMap();
                    Iterator<String> keys = subItem.keySet().iterator();
                    JSONObject obj = new JSONObject();
                    while (keys.hasNext()){
                        String keyName = keys.next();

                        String result = convertVariableRevert(keyName);
                        logger.debug("result:[{}]",result);
                        obj.put(result,subItem.get(keyName));
                    }
                    arr.add(obj);
                }
                resultMap.put("data",arr);
            }
        }
//        logger.debug("arr:[{}]",arr);
        return resultMap;
    }
    public String convertVariableRevert(String key) {
        StringBuffer sb = new StringBuffer(); // 새로 생성
        for (int i = 0; i < key.length(); i++) {
            String str = String.valueOf(key.charAt(i));
            if (str.equals("_")) {
                sb.append(String.valueOf(key.charAt(i + 1)).toUpperCase());
                i++;
            } else {
                sb.append(str);
            }
        }
//        logger.debug("sb.toString:[{}]",sb.toString());
        return sb.toString();
    }
}
