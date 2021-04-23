package src.store.controller;

import io.swagger.annotations.Api;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import src.store.bean.Carousel;

import src.store.mapper.CarouselMapper;
/*maybe this is not need*/
@Api(description = "商品目录接口")
@RestController()
public class SqlCarouselController {
    @Autowired
    CarouselMapper carouselmapper;

    @RequestMapping(value = "/carousel/getcarouselbyid",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public Carousel CarOptSearchById(@Param("carousel_id")int carousel_id){
        return carouselmapper.getCarouselById(carousel_id);
    }
    @RequestMapping(value = "/carousel/getcarousel",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public Carousel[] CarOptSearch(){
        return carouselmapper.getCarousel();
    }
    @RequestMapping(value = "/carousel/insertcarousel",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public void CarOptInsert(@Param("carousel_id")int carousel_id,@Param("imgPath") String imgPath,@Param("describes")String describes){
        Carousel carousel = new Carousel();
        carousel.setDescribes(describes);
        carousel.setImgPath(imgPath);
        carouselmapper.insertCarousel(carousel);
    }
    @RequestMapping(value = "/carousel/deletecarouselbyId",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public void CarOptDeleteById(@Param("carousel_id")int carousel_id){
        carouselmapper.deletCarouselById(carousel_id);
    }

}
