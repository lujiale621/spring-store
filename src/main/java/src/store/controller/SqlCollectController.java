package src.store.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import src.store.bean.Collect;
import src.store.mapper.CollectMapper;

@RestController
public class SqlCollectController {
    @Autowired
    CollectMapper collectMapper;

    @RequestMapping(value = "/collect/getallcollect",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public Collect CollectOptSearchAll(){
       return collectMapper.getCollect();
    }
    @RequestMapping(value = "/collect/getcollectbyid",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public Collect CollectOptSearchById(@Param("user_id")int user_id){
        return collectMapper.getCollectById(user_id);
    }
    @RequestMapping(value = "/collect/insertcollect",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public void CollectOptInsert(@Param("user_id")int user_id,@Param("product_id")int product_id,@Param("collect_time")long collect_time){
        Collect collect= new Collect();
        collect.setUser_id(user_id);
        collect.setProduct_id(product_id);
        collect.setCollect_time(collect_time);
        collectMapper.insertCollect(collect);
    }
    @RequestMapping(value = "/collect/deletecollect",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public void CollectOptDelete(@Param("user_id")int user_id,@Param("product_id")int product_id){
        collectMapper.deletCollectById(user_id,product_id);
    }
}
