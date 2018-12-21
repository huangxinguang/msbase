package com.starlight.ms.datasite.dto;

import java.io.Serializable;

/**
 * @author xghuang
 * @date 2018/10/25
 * @time 15:20
 * @desc: 文件存储对象
 */
public class StorageResultDTO implements Serializable {
    /**
     * 拓展名
     */
    private String extensionName;
    /**
     * 存储路径
     */
    private String storagePath;

    /**
     * dms存储路径
     */
    private String storagePathOrigin;
    /**
     * 文件大小
     */
    private Long size;

    /**
     * 文件名称
     */
    private String name;
    /**
     * 文件类型
     */
    private String contentType;
    /**
     * 文件唯一标识ID
     */
    private String objectId;

    public String getExtensionName() {
        return extensionName;
    }

    public StorageResultDTO setExtensionName(String extensionName) {
        this.extensionName = extensionName;
        return this;
    }

    public String getStoragePath() {
        return storagePath;
    }

    public StorageResultDTO setStoragePath(String storagePath) {
        this.storagePath = storagePath;
        return this;
    }

    public Long getSize() {
        return size;
    }

    public StorageResultDTO setSize(Long size) {
        this.size = size;
        return this;
    }

    public String getName() {
        return name;
    }

    public StorageResultDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getContentType() {
        return contentType;
    }

    public StorageResultDTO setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public String getObjectId() {
        return objectId;
    }

    public StorageResultDTO setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    public String getStoragePathOrigin() {
        return storagePathOrigin;
    }

    public StorageResultDTO setStoragePathOrigin(String storagePathOrigin) {
        this.storagePathOrigin = storagePathOrigin;
        return this;
    }
}
