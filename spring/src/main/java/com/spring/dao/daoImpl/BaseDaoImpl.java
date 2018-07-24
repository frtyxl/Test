//package com.spring.dao.daoImpl;
//
//import com.spring.dao.BaseDao;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.support.SqlSessionDaoSupport;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.io.Serializable;
//import java.util.List;
//import java.util.Map;
//
//public abstract class BaseDaoImpl<T> extends SqlSessionDaoSupport implements BaseDao<T> {
//
//    @Autowired
//    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
//        super.setSqlSessionFactory(sqlSessionFactory);
//    }
//
//    private String nameSpace;  // 命名空间
//    public String getNameSpace() {
//        return nameSpace;
//    }
//
//    public void setNameSpace(String nameSpace) {
//        this.nameSpace = nameSpace;
//    }
//
//    public List<T> find(Map map){  // 跟具条件查询多个结果
//        List<T> list = this.getSqlSession().selectList(nameSpace + ".find",map);
//        return  list;
//    }
//
//   public T get(Serializable id){ // 根据id查询数据
//        return this.getSqlSession().selectOne(nameSpace + ".get",id);
//   }
//
//   public void insert(T entiy){
//        this.getSqlSession().insert(nameSpace + ".insert",entiy);
//    }   // 插入，用实体作为参数
//   public void update(T entiy){
//       this.getSqlSession().update(nameSpace + ".update",entiy);
//    }  // 修改，用实体作为参数
//    public void deleteById(Serializable id){
//        this.getSqlSession().delete(nameSpace + ".delete",id);
//    }   // 按照id删除一条；支持整型和字符型id
//    public void delete(Serializable[] ids){
//        this.getSqlSession().delete(nameSpace + ".delete",ids);
//    }   // 按照id批量删除，支持整型和字符型id
//}
