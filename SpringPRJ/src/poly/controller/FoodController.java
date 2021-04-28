package poly.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import poly.service.IFoodService;

import java.util.Map;

/*
 * Controller 선언해야만 Spring 프레임워크에서 Controller인지 인식 가능
 * 자바 서블릿 역할 수행
 * */
@Controller
public class FoodController {

    private Logger log = Logger.getLogger(this.getClass());

    @Resource(name = "FoodService")
    private IFoodService foodService;

    @RequestMapping(value = "food/getFoodInfoFromWEB")
    @ResponseBody
    public Map<String, String> getFoodInfoFromWEB()
            throws Exception {

        log.info(this.getClass().getName() + "getFoodInfoFromWEB start !!");

        Map<String, String> rMap = foodService.getFoodInfoFromWEB();

        log.info(this.getClass().getName() + ".getFoodInfoFromWEB end!!");

        return rMap;
    }

    @RequestMapping(value = "food/getFoodInfoFromWEBtToday")
    @ResponseBody
    public Map<String, String> getFoodInfoFromWEBtToday()
            throws Exception {

        log.info(this.getClass().getName() + "getFoodInfoFromWEBtToday start !!");

        Map<String, String> rMap = foodService.getFoodInfoFromWEToday();

        log.info(this.getClass().getName() + ".getFoodInfoFromWEBtToday end!!");

        return rMap;
    }

}