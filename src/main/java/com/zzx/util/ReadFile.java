package com.zzx.util;

import com.zzx.bean.BeanA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sun.misc.IOUtils;

import java.io.*;

/**
 * Created by Administrator on 2017/5/6 0006.
 */
@Component
public class ReadFile {

    @Autowired
    private BeanA beanA;

    private String filepath = "test";

    public ReadFile() {

    }

    public void read( ) {

        File f = new File(filepath);
        try {
            FileInputStream fileInputStream=new FileInputStream(f);
            BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getFilepath() {
        return filepath;
    }
}
