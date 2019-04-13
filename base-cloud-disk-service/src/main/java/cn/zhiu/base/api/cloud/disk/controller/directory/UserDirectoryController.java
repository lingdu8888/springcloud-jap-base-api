package cn.zhiu.base.api.cloud.disk.controller.directory;

import cn.zhiu.base.api.cloud.disk.bean.directory.UserDirectory;
import cn.zhiu.base.api.cloud.disk.service.directory.UserDirectoryApiService;
import cn.zhiu.framework.base.api.core.request.ApiRequest;
import cn.zhiu.framework.base.api.core.request.ApiRequestBody;
import cn.zhiu.framework.base.api.core.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: yujuan
 * @Date: 19-4-12 14:11
 * @Description:
 */
@RestController
@RequestMapping
public class UserDirectoryController {


    @Autowired
    private UserDirectoryApiService userDirectoryApiService;

    @RequestMapping(value = "/directory/{id}", method = RequestMethod.GET)
    public UserDirectory get(@PathVariable("id") Long id) {
        return userDirectoryApiService.get(id);
    }

    @RequestMapping(value = "/directory", method = RequestMethod.POST)
    public UserDirectory save(@RequestBody UserDirectory model) {
        return userDirectoryApiService.save(model);
    }

    @RequestMapping(value = "/directory", method = RequestMethod.DELETE)
    public boolean del(@RequestParam("id") Long id) {
        return userDirectoryApiService.del(id);

    }

    @RequestMapping(value = "/directory/deleteBatch", method = RequestMethod.POST)
    public boolean deleteBatch(@RequestBody List<Long> id) {
        return userDirectoryApiService.deleteBatch(id);

    }

    @RequestMapping(value = "/directory/list", method = RequestMethod.POST)
    public List<UserDirectory> findAll(@RequestBody ApiRequest apiRequest) {
        return userDirectoryApiService.findAll(apiRequest);

    }

    @RequestMapping(value = "/directory/list/page", method = RequestMethod.POST)
    public ApiResponse<UserDirectory> findAll(@RequestBody ApiRequestBody requestBody) {
        return userDirectoryApiService.findAll(requestBody);
    }

    @RequestMapping(value = "/directory/all", method = RequestMethod.GET)
    public List<UserDirectory> findAll() {
        return userDirectoryApiService.findAll();
    }

    @RequestMapping(value = "/directory/batch", method = RequestMethod.PUT)
    public List<UserDirectory> updateBatch(@RequestBody List<UserDirectory> models) {
        return userDirectoryApiService.updateBatch(models);
    }

    @RequestMapping(value = "/directory", method = RequestMethod.PUT)
    public UserDirectory update(@RequestBody UserDirectory model) {
        return userDirectoryApiService.update(model);
    }
    @RequestMapping(value = "/directory/findone", method = RequestMethod.POST)
    UserDirectory findOne(@RequestBody ApiRequest apiRequest){
        return userDirectoryApiService.findOne(apiRequest);
    }
}
