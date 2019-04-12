package cn.zhiu.base.api.cloud.disk.service.directory;

import cn.zhiu.base.api.cloud.disk.bean.directory.UserDirectory;
import cn.zhiu.framework.base.api.core.request.ApiRequest;
import cn.zhiu.framework.base.api.core.request.ApiRequestBody;
import cn.zhiu.framework.base.api.core.response.ApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: yujuan
 * @Date: 19-4-11 12:13
 * @Description:
 */
@FeignClient(value = "service-cloud-disk")
public interface UserDirectoryApiService {

    @RequestMapping(value = "/directory/{id}", method = RequestMethod.GET)
    UserDirectory get(@PathVariable("id") Long id);

    @RequestMapping(value = "/directory", method = RequestMethod.POST)
    UserDirectory save(@RequestBody UserDirectory model);

    @RequestMapping(value = "/directory", method = RequestMethod.DELETE)
    boolean del(@RequestParam("id") Long id);

    @RequestMapping(value = "/directory/deleteBatch", method = RequestMethod.POST)
    boolean deleteBatch(@RequestBody List<Long> id);

    @RequestMapping(value = "/directory/list", method = RequestMethod.POST)
    List<UserDirectory> findAll(@RequestBody ApiRequest apiRequest);

    @RequestMapping(value = "/directory/list/page", method = RequestMethod.POST)
    ApiResponse<UserDirectory> findAll(@RequestBody ApiRequestBody requestBody);

    @RequestMapping(value = "/directory/all", method = RequestMethod.GET)
    List<UserDirectory> findAll();

    @RequestMapping(value = "/directory/batch", method = RequestMethod.PUT)
    void updateBatch(@RequestBody List<UserDirectory> models);

    @RequestMapping(value = "/directory/batch", method = RequestMethod.PUT)
    UserDirectory update(@RequestBody UserDirectory models);
}
