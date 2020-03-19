package tk.amrom.servicec.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linjinbao66@gmail.com
 * @date 2020/3/19
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class FirstController {

    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @RequestMapping("/get")
    public boolean get(){
        return useLocalCache;
    }

}
