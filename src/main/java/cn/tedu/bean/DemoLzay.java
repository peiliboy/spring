package cn.tedu.bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy(true)
@Component
public class DemoLzay {
    public DemoLzay() {
        System.out.println("contructer");
    }
}
