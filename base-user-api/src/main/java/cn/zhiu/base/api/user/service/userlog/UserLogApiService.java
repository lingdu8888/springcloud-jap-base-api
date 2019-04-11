package cn.zhiu.base.api.user.service.userlog;

import cn.zhiu.base.api.user.bean.userlog.UserLog;
import cn.zhiu.framework.base.api.core.request.ApiRequest;
import cn.zhiu.framework.base.api.core.request.ApiRequestPage;
import cn.zhiu.framework.base.api.core.response.ApiResponse;
import cn.zhiu.framework.base.api.core.service.BaseApiService;

import java.util.List;

public interface UserLogApiService extends BaseApiService {

    UserLog get(String logId);

    String save(UserLog model);

    boolean del(String logId);

    boolean exists(String logId);

    List<UserLog> findAll();

    List<UserLog> findAll(ApiRequest apiRequest);

    ApiResponse<UserLog> findAll(ApiRequest apiRequest, ApiRequestPage apiRequestPage);

    List<UserLog> findAndSortAll(ApiRequest apiRequest, ApiRequestPage apiRequestPage);
}