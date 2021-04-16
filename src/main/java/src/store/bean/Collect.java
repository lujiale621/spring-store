package src.store.bean;

public class Collect {
    private int id;
    private int user_id;
    private int product_id;
    private int collect_time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getCollect_time() {
        return collect_time;
    }

    public void setCollect_time(int collect_time) {
        this.collect_time = collect_time;
    }

    @Override
    public String toString() {
        return "Collect{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", product_id=" + product_id +
                ", collect_time=" + collect_time +
                '}';
    }
}
