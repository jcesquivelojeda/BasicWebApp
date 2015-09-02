package tutorial.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by nick on 2/09/15.
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "view";
    }

}
