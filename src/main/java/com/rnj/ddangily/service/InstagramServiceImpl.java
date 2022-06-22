package com.rnj.ddangily.service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.rnj.ddangily.dao.InstagramDao;
import com.rnj.ddangily.entity.Instagram;
import com.rnj.ddangily.utils.HttpUtils;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Type;
import java.util.*;

@Transactional
@Service
@Slf4j
public class InstagramServiceImpl implements InstagramService {

    Logger logger = LoggerFactory.getLogger(this.getClass().getName());


    @Autowired
    MasterConfigService masterConfigService;

    @Autowired
    InstagramDao instagramDao;


    @Override
    public void updatePosts() {
        String url = masterConfigService.getDataUrl();
        String responseStr = HttpUtils.sendAndGetResponse(url);

        Gson gson = new Gson();
        JsonObject response = gson.fromJson(responseStr, JsonObject.class);

        Type founderListType = new TypeToken<ArrayList<Instagram>>(){}.getType();
        List<Instagram> posts = gson.fromJson(response.get("data"), founderListType);
//        log.debug("posts : [{}]", posts);

        for (Instagram instagram : posts) {
            Optional<Instagram> instagramData = duplicateCheck(instagram.getInstagramId());

            // Insert
            if (!instagramData.isPresent()) {
                instagram.setEnabled((byte) 1);
                instagramDao.insert(instagram);
                continue;
            }

            // Update
            Instagram post = instagramData.get();
            post.setLastUpdateTime(new Date());
        }
    }

    public Optional<Instagram> duplicateCheck(long postId){
        return instagramDao.selectByInstagramId(postId);
    }



//    public Map keyConvStyleClient(Map map) {
//        Iterator<String> iterKey = map.keySet().iterator();
//        Map resultMap = new HashMap();
////        Map newMap = new HashMap();
//        JSONArray arr = null;
//        while (iterKey.hasNext()) {
//            String key = iterKey.next();
//            String typeName = map.get(key).getClass().getSimpleName();
//
//            if (typeName.indexOf("JSONArray") >= 0) { // 리스트로 간주.
//
////                List<Map> newList = new LinkedList<Map>();
//                List subList = (List) map.get(key);
//                logger.debug("hi");
//                arr = new JSONArray();
//                for (int i = 0; i < subList.size(); i++) {
//                    Map subItem = (Map) subList.get(i);
////                    Map returnItem = new HashMap();
//                    Iterator<String> keys = subItem.keySet().iterator();
//                    JSONObject obj = new JSONObject();
//                    while (keys.hasNext()){
//                        String keyName = keys.next();
//
//                        String result = convertVariableRevert(keyName);
//                        logger.debug("result:[{}]",result);
//                        obj.put(result,subItem.get(keyName));
//                    }
//                    arr.add(obj);
//                }
//                resultMap.put("data",arr);
//            }
//        }
////        logger.debug("arr:[{}]",arr);
//        return resultMap;
//    }

    @Override
    public Optional<List<Instagram>> getPosts() {
        return instagramDao.selectAll();
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
