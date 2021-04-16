package src.store.mapper;
import src.store.bean.Collect;

public interface CollectMapper {

    Collect getCollect();
    Collect getCollectById(int user_id);
    void insertCollect(Collect collect);
    void deletCollectById(int collect_id);
}
