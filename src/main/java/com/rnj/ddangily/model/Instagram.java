package com.rnj.ddangily.model;

import java.io.Serializable;
import java.util.Date;

public class Instagram implements Serializable {
    private Long instagramId;

    private Long id;

    private String mediaType;

    private String mediaUrl;

    private String permalink;

    private String username;

    private String caption;

    private Byte enabled;

    private Date collectionTime;

    private Date lastUpdateTime;

    private static final long serialVersionUID = 1L;

    public Long getInstagramId() {
        return instagramId;
    }

    public void setInstagramId(Long instagramId) {
        this.instagramId = instagramId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    public Date getCollectionTime() {
        return collectionTime;
    }

    public void setCollectionTime(Date collectionTime) {
        this.collectionTime = collectionTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", instagramId=").append(instagramId);
        sb.append(", id=").append(id);
        sb.append(", mediaType=").append(mediaType);
        sb.append(", mediaUrl=").append(mediaUrl);
        sb.append(", permalink=").append(permalink);
        sb.append(", username=").append(username);
        sb.append(", caption=").append(caption);
        sb.append(", enabled=").append(enabled);
        sb.append(", collectionTime=").append(collectionTime);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append("]");
        return sb.toString();
    }
}