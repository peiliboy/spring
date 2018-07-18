package cn.tedu.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//Component实例化BeanLife对象
//@Component("beanLife")，给对象起别名，缺省值为当前类的名字首字母变小写
@Component("beanLife")
public class BeanLife {
    public BeanLife() {
        System.out.println("构造方法");
    }

    //定义初始化方法的注解
    @PostConstruct
    public void init(){
        System.out.println("init");
    }

    public void execute(){
        System.out.println("execute");
    }
    //注解表示定义销毁的方法
    @PreDestroy
    public void destory(){
        System.out.println("destory");
    }
}
