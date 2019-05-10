package cn.itcast.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {
    @Test
    public void testUser(){
        //1 加载Spring配置文件，根据创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("src/applicationContext.xml");
        //xml文件找不到报错问题：https://blog.csdn.net/baidu_32045201/article/details/78386058
        //2 得到配置创建的对象
        User user1 = (User)context.getBean("user");
        System.out.println(user1);
        user1.add();

        // 参数注入
        PropertyDemo1 demo = (PropertyDemo1)context.getBean("demo1");
        demo.testIt();

    }
}
