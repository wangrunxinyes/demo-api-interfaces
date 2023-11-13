package com.wangrunxin.demo.interfaces.service.food;

import com.wangrunxin.demo.entity.meta.Food;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangrunxin
 * @version 1.0
 * @date 1/11/2023 11:50
 */
@FeignClient(
        name = "food-seata-service",
        url = "${wangrunxin.service.food-seata}"
)
public interface FoodSeataService {
    public final static String GetFoodByID = "/food-service/get-by-id";
    public final static String UpdateFood = "/food-service/update";
    public final static String SaveFood = "/food-service/save";

    @PostMapping(GetFoodByID)
    Food getFoodByID(@RequestParam(name = "id") Integer id);

    @PostMapping(UpdateFood)
    public Object updateFood() throws Exception;

    @PostMapping(SaveFood)
    public void save(@RequestParam String suffix);
}
