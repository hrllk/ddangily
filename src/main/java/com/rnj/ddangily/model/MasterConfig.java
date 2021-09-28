package com.rnj.ddangily.model;

import java.io.Serializable;
import java.util.Date;

public class MasterConfig implements Serializable {
    private Long masterConfigId;

    private String masterType;

    private String masterKey;

    private String masterValue;

    private Byte enabled;

    private String createdBy;

    private Date createdAt;

    private String updatedBy;

    private Date lastUpdate;

    private static final long serialVersionUID = 1L;

    public Long getMasterConfigId() {
        return masterConfigId;
    }

    public void setMasterConfigId(Long masterConfigId) {
        this.masterConfigId = masterConfigId;
    }

    public String getMasterType() {
        return masterType;
    }

    public void setMasterType(String masterType) {
        this.masterType = masterType;
    }

    public String getMasterKey() {
        return masterKey;
    }

    public void setMasterKey(String masterKey) {
        this.masterKey = masterKey;
    }

    public String getMasterValue() {
        return masterValue;
    }

    public void setMasterValue(String masterValue) {
        this.masterValue = masterValue;
    }

    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", masterConfigId=").append(masterConfigId);
        sb.append(", masterType=").append(masterType);
        sb.append(", masterKey=").append(masterKey);
        sb.append(", masterValue=").append(masterValue);
        sb.append(", enabled=").append(enabled);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", lastUpdate=").append(lastUpdate);
        sb.append("]");
        return sb.toString();
    }
}