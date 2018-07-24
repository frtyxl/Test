//package com.spring.dao;
//
//import java.io.Serializable;
//import java.util.List;
//import java.util.Map;
//
//// 泛型类，基础的dao接口
//public interface BaseDao<T> {
//    T get(Serializable id);  // 根据id查询数据
//    List<T> find(Map map);   // 跟具条件查询多个结果
//    void insert(T entiy);   // 插入，用实体作为参数
//    void update(T entiy);   // 修改，用实体作为参数
//    void deleteById(Serializable id);   // 按照id删除一条；支持整型和字符型id
//    void delete(Serializable[] ids);   // 按照id批量删除，支持整型和字符型id
//
//
//}
