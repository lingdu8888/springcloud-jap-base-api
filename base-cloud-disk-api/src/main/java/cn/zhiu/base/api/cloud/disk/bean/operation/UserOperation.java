package cn.zhiu.base.api.cloud.disk.bean.operation;

import cn.zhiu.bean.cloud.disk.entity.enums.operation.FileOperationStatus;
import cn.zhiu.bean.cloud.disk.entity.enums.operation.FileOperationType;
import cn.zhiu.framework.base.api.core.annotation.request.RequestApiBean;
import cn.zhiu.framework.base.api.core.bean.AbstractBaseApiBean;

/**
 * @Auther: yujuan
 * @Date: 19-4-11 12:12
 * @Description:
 */
@RequestApiBean
public class UserOperation extends AbstractBaseApiBean {

    private String userId;

    private String fileId;

    private FileOperationType type;

    private FileOperationStatus status;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public FileOperationType getType() {
        return type;
    }

    public void setType(FileOperationType type) {
        this.type = type;
    }

    public FileOperationStatus getStatus() {
        return status;
    }

    public void setStatus(FileOperationStatus status) {
        this.status = status;
    }
}
