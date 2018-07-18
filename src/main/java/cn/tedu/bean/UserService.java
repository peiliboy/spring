package cn.tedu.bean;

import cn.tedu.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    /*
    Resource 表示给成员变量赋值，依赖注入，使用此注解，可以省略set方法
    Resource 默认按属性名依赖注入，如果名称找不到，则按类型查找。可以使用name属性确定属性赋值时查找的具体名称
     */

    @Resource
    private UserDao userDao;

    public void addUser(){
        userDao.insertUser();
    }
}
