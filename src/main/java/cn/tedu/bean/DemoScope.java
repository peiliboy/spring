package cn.tedu.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(scopeName = "prototype")
@Component
public class DemoScope {

}
