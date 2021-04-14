package src.store.mapper;

import src.store.bean.Carousel;

public interface CarouselMapper {
    Carousel getCarouselById(int carousel_id);
    void insertCarousel(Carousel carousel);
    void deletCarouselById(int carousel_id);
}
