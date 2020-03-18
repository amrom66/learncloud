package tk.amrom.sentinel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author linjinbao66@gmail.com
 * @date 2020/3/18
 */
@Controller
public class SentinelController {
    @RequestMapping("/sentinel")
    @ResponseBody
    public String sentinel(){
        return "sentinel ....";
    }
}
