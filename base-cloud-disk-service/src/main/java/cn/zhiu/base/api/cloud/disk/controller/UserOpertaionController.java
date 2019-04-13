package cn.zhiu.base.api.cloud.disk.controller;

import cn.zhiu.base.api.cloud.disk.bean.operation.UserOperation;
import cn.zhiu.base.api.cloud.disk.service.operation.UserOperationApiService;
import cn.zhiu.framework.base.api.core.request.ApiRequest;
import cn.zhiu.framework.base.api.core.request.ApiRequestBody;
import cn.zhiu.framework.base.api.core.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: yujuan
 * @Date: 19-4-12 16:47
 * @Description:
 */
@RestController
@RequestMapping
public class UserOpertaionController {

    @Autowired
    UserOperationApiService userOperationApiService;


    @RequestMapping(value = "/operation/{id}", method = RequestMethod.GET)
    public UserOperation get(@PathVariable("id") Long id){
        return userOperationApiService.get(id);
    }

    @RequestMapping(value = "/operation", method = RequestMethod.POST)
    public UserOperation save(@RequestBody UserOperation model){
        return userOperationApiService.save(model);
    }

    @RequestMapping(value = "/operation", method = RequestMethod.DELETE)
    public boolean del(@RequestParam("id") Long id){
        return userOperationApiService.del(id);
    }

    @RequestMapping(value = "/operation/list", method = RequestMethod.POST)
    public List<UserOperation> findAll(@RequestBody ApiRequest apiRequest){
        return userOperationApiService.findAll(apiRequest);
    }

    @RequestMapping(value = "/operation/list/page", method = RequestMethod.POST)
    public ApiResponse<UserOperation> findAll(@RequestBody ApiRequestBody requestBody){
        return userOperationApiService.findAll(requestBody);
    }

    @RequestMapping(value = "/operation/all", method = RequestMethod.GET)
    public List<UserOperation> findAll(){
        return userOperationApiService.findAll();
    }

}
