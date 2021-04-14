package src.store.mapper;

import src.store.bean.Carousel;
import src.store.bean.Category;

public interface CategoryMapper {
    Category getCategorylById(int category_id);
    void insertCategory(Category category);
    void deletCategoryById(int category_id);
}
