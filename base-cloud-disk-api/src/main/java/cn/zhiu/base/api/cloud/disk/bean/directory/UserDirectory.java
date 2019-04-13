package cn.zhiu.base.api.cloud.disk.bean.directory;

import cn.zhiu.bean.cloud.disk.entity.enums.file.Status;
import cn.zhiu.framework.base.api.core.annotation.request.RequestApiBean;
import cn.zhiu.framework.base.api.core.bean.AbstractBaseApiBean;

/**
 * @Auther: yujuan
 * @Date: 19-4-11 12:10
 * @Description:
 */
@RequestApiBean
public class UserDirectory extends AbstractBaseApiBean {

    private Long id;

    private String userId;

    private String directoryName;

    private Long parentId;

    private String path;

    private Status status;

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

    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
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
}
