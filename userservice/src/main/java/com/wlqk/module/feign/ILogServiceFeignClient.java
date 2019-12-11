package com.wlqk.module.feign;

import com.wlqk.module.model.TestParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="log-service")
public interface ILogServiceFeignClient {

    @RequestMapping(value = "/log/{id}",method = RequestMethod.GET)
    public String test(@PathVariable("id") Long id);

    @RequestMapping(value = "/log/post",method = RequestMethod.POST)
    public String post(@RequestBody TestParam testParam);

}
