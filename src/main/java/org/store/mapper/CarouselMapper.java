package src.store.mapper;


import org.apache.ibatis.annotations.Mapper;
import src.store.bean.Carousel;

@Mapper
public interface CarouselMapper {
    Carousel getCarouselById(int carousel_id);
    Carousel[] getCarousel();
    void insertCarousel(Carousel carousel);
    void deletCarouselById(int carousel_id);
}
