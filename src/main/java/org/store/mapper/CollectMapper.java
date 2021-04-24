package src.store.mapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import src.store.bean.Collect;

@Mapper
public interface CollectMapper {

    Collect[] getCollect();
    Collect[] getCollectById(int user_id);
    Collect[] getCollectByKey(@Param("user_id")int user_id, @Param("product_id")int product_id);
    void insertCollect(Collect collect);
    void deletCollectById(@Param("user_id")int user_id, @Param("product_id")int product_id);
}
