package com.example.lab_1_sp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class SabloaneLabApp {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SabloaneLabApp.class, args);
        TransientComp transientBean = context.getBean(TransientComp.class);
        transientBean.operation();

        transientBean = context.getBean(TransientComp.class);
        transientBean.operation();

        SingletonComp singletonBean = context.getBean(SingletonComp.class);
        singletonBean.operation();

        singletonBean = context.getBean(SingletonComp.class);
        singletonBean.operation();

        ClientComp c = context.getBean(ClientComp.class);
        c.operation();

        c = (ClientComp)context.getBean("clientComponent");
        c.operation();

    }
}
