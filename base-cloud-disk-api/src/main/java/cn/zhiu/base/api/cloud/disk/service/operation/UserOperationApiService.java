package cn.zhiu.base.api.cloud.disk.service.operation;

import cn.zhiu.base.api.cloud.disk.bean.operation.UserOperation;
import cn.zhiu.framework.base.api.core.request.ApiRequest;
import cn.zhiu.framework.base.api.core.request.ApiRequestBody;
import cn.zhiu.framework.base.api.core.response.ApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: yujuan
 * @Date: 19-4-11 12:16
 * @Description:
 */
@FeignClient(value = "service-cloud-disk")
public interface UserOperationApiService {

    @RequestMapping(value = "/operation/{id}", method = RequestMethod.GET)
    UserOperation get(@PathVariable("id") Long id);

    @RequestMapping(value = "/operation", method = RequestMethod.POST)
    UserOperation save(@RequestBody UserOperation model);

    @RequestMapping(value = "/operation", method = RequestMethod.DELETE)
    boolean del(@RequestParam("id") Long id);

    @RequestMapping(value = "/operation/list", method = RequestMethod.POST)
    List<UserOperation> findAll(@RequestBody ApiRequest apiRequest);

    @RequestMapping(value = "/operation/list/page", method = RequestMethod.POST)
    ApiResponse<UserOperation> findAll(@RequestBody ApiRequestBody requestBody);

    @RequestMapping(value = "/operation/all", method = RequestMethod.GET)
    List<UserOperation> findAll();

}
