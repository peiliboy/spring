package cn.tedu.bean;

import cn.tedu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService2 {

    /*
    @Autowired默认按照类型依赖注入，如要需要使用属性名依赖注入，需要和@Autowire配合使用
    @Autowire实现依赖注入的时候不能单独使用
     */
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    public void addUser(){
        userDao.insertUser();
    }
}
