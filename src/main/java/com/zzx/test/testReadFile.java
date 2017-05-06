package com.zzx.test;

import com.zzx.util.ReadFile;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/5/6 0006.
 */
@Component
public class testReadFile {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("g:/spring.xml");
        ReadFile readFile = (ReadFile) applicationContext.getBean(ReadFile.class);
        System.out.println("hi");
    }

}
