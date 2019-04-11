package cn.zhiu.base.api.user.controller;

import cn.zhiu.base.api.user.bean.user.UserInfo;
import cn.zhiu.base.api.user.bean.user.UserInfoResponse;
import cn.zhiu.base.api.user.service.user.UserInfoApiService;
import cn.zhiu.framework.base.api.core.request.ApiRequest;
import cn.zhiu.framework.base.api.core.request.ApiRequestBody;
import cn.zhiu.framework.base.api.core.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserInfoController implements UserInfoApiService {

    @Autowired
    private UserInfoApiService userInfoApiService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public UserInfo get(@PathVariable("id") String id) {
        return userInfoApiService.get(id);
    }

    @RequestMapping(value = "/detail/{userId}", method = RequestMethod.GET)
    public UserInfoResponse getUserInfo(@PathVariable("userId") String userId) {
        return userInfoApiService.getUserInfo(userId);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public UserInfo save(@RequestBody UserInfo model) {
        return userInfoApiService.save(model);
    }

    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public boolean del(String userId) {
        return userInfoApiService.del(userId);
    }

    @Override
    public UserInfo findOne(ApiRequest apiRequest) {
        return userInfoApiService.findOne(apiRequest);
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public List<UserInfoResponse> findAll(ApiRequest apiRequest) {
        return userInfoApiService.findAll(apiRequest);
    }

    @RequestMapping(value = "/list/page", method = RequestMethod.POST)
    public ApiResponse<UserInfoResponse> findAll(ApiRequestBody requestBody) {
        return userInfoApiService.findAll(requestBody);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<UserInfoResponse> findAll() {
        return userInfoApiService.findAll();
    }

}
