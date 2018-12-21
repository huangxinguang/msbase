package com.starlight.ms.datasite.model;

import java.util.Date;

/**
 * @author xghuang
 * @date 2018/12/19
 * @time 14:35
 * @desc:文件对象
 */
public class FileRecord {
    private String id;

    private String storagePath;

    private String storagePathOrigin;

    private String createUserName;

    private Date createTime;

    private String lastModifyUserName;

    private Date lastModifyTime;

    private String lastModifyUserId;

    private Long fileSize;

    private String createUserId;

    private String customAttributes;

    private String fileName;

    private String extensionName;

    private String objectId;

    private String contentType;

    public String getId() {
        return id;
    }

    public FileRecord setId(String id) {
        this.id = id;
        return this;
    }

    public String getStoragePath() {
        return storagePath;
    }

    public FileRecord setStoragePath(String storagePath) {
        this.storagePath = storagePath;
        return this;
    }

    public String getStoragePathOrigin() {
        return storagePathOrigin;
    }

    public FileRecord setStoragePathOrigin(String storagePathOrigin) {
        this.storagePathOrigin = storagePathOrigin;
        return this;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public FileRecord setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public FileRecord setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getLastModifyUserName() {
        return lastModifyUserName;
    }

    public FileRecord setLastModifyUserName(String lastModifyUserName) {
        this.lastModifyUserName = lastModifyUserName;
        return this;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public FileRecord setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        return this;
    }

    public String getLastModifyUserId() {
        return lastModifyUserId;
    }

    public FileRecord setLastModifyUserId(String lastModifyUserId) {
        this.lastModifyUserId = lastModifyUserId;
        return this;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public FileRecord setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public FileRecord setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }

    public String getCustomAttributes() {
        return customAttributes;
    }

    public FileRecord setCustomAttributes(String customAttributes) {
        this.customAttributes = customAttributes;
        return this;
    }

    public String getFileName() {
        return fileName;
    }

    public FileRecord setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public String getExtensionName() {
        return extensionName;
    }

    public FileRecord setExtensionName(String extensionName) {
        this.extensionName = extensionName;
        return this;
    }

    public String getObjectId() {
        return objectId;
    }

    public FileRecord setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    public String getContentType() {
        return contentType;
    }

    public FileRecord setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
}
