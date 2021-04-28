package poly.service;

import poly.dto.FoodDTO;

import java.util.List;
import java.util.Map;

public interface IFoodService {

    // 웹상(CGV 홈페이지)에서 영화 순위정보 가져오기
    Map<String, String> getFoodInfoFromWEB() throws Exception;

    Map<String, String> getFoodInfoFromWEToday() throws Exception;
}