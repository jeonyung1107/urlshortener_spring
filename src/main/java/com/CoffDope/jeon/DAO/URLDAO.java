package com.CoffDope.jeon.DAO;

import com.CoffDope.jeon.model.URLModel;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class URLDAO {
    @Autowired
    private SqlSessionTemplate sqlSession;

    public void insertURL(URLModel uv){
        sqlSession.insert("URLDO.insertURL",uv);
    }

    public URLModel getURL(URLModel uv){
        return (URLModel) sqlSession.selectOne("URLDO.getURL",uv);
    }
}
