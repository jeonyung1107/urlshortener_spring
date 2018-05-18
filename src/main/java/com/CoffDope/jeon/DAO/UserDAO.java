package com.CoffDope.jeon.DAO;

import com.CoffDope.jeon.model.UserModel;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    public void addUser(UserModel userModel){
        sqlSessionTemplate.insert("user.addUser",userModel);
    }

    public void deleteUser(UserModel userModel){
        sqlSessionTemplate.delete("user.deleteUser",userModel);
    }

    public UserModel getUser(UserModel userModel){
        UserModel result = (UserModel) sqlSessionTemplate.selectOne("user.getUser",userModel);
        return result;
    }
}
