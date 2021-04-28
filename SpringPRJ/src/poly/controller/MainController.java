package poly.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    private Logger log = Logger.getLogger(this.getClass());

    @RequestMapping(value = "index")
    public String index() throws Exception {

        log.info(this.getClass().getName() + ".index start!");

        log.info(this.getClass().getName() + ".index end!");

        return "/index";
    }

}
