package top.yfine.wx.wxsdkdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 杨帆
 * @date 2018/12/26 16:29
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index() {
        return "index.html";
    }
}
