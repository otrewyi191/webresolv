package com.zzx.test;

import com.zzx.getlist.ParseHtml;
import com.zzx.springconfig.Config;
import com.zzx.util.ReadFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/5/6 0006.
 */
public class testReadFile {
    public static void main(String[] args) {
/*        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        ReadFile readFile = (ReadFile) applicationContext.getBean(ReadFile.class);*/
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(Config.class);

/*        ReadFile readFile = (ReadFile)  ctx.getBean(ReadFile.class);
        String s=readFile.read();*/

        ParseHtml parseHtml=(ParseHtml)ctx.getBean(ParseHtml.class);


        System.out.println("end");
    }

}
