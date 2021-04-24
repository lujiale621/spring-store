package src.store.mapper;


import org.apache.ibatis.annotations.Mapper;
import src.store.bean.Category;
@Mapper
public interface CategoryMapper {
    Category getCategorylById(int category_id);
    void insertCategory(Category category);
    void deletCategoryById(int category_id);
}
