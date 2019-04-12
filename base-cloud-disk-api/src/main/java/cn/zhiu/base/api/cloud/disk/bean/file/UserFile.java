package cn.zhiu.base.api.cloud.disk.bean.file;

import cn.zhiu.bean.cloud.disk.entity.enums.file.Status;
import cn.zhiu.framework.base.api.core.annotation.request.RequestApiBean;
import cn.zhiu.framework.base.api.core.bean.AbstractBaseApiBean;

import java.util.Date;

/**
 * @Auther: yujuan
 * @Date: 19-4-11 12:11
 * @Description:
 */
@RequestApiBean
public class UserFile extends AbstractBaseApiBean {
    private Long id;

    private String userId;

    private String fileName;

    private String fileId;

    private Long fileSize;

    private String fileExtension;

    private Long dirId;

    private String path;

    private Status status;

    private Date fileUpdateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public Long getDirId() {
        return dirId;
    }

    public void setDirId(Long dirId) {
        this.dirId = dirId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getFileUpdateTime() {
        return fileUpdateTime;
    }

    public void setFileUpdateTime(Date fileUpdateTime) {
        this.fileUpdateTime = fileUpdateTime;
    }
}
