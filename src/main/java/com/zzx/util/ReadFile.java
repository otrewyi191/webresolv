package com.zzx.util;

import com.zzx.bean.Post;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;

/**
 * Created by Administrator on 2017/5/6 0006.
 */
//@Component
public class ReadFile {

    private String filepath;

    public ReadFile() {

    }

    public String read( ) {

        File f = new File(filepath);
        try {
            FileInputStream fileInputStream=new FileInputStream(f);
            String s = org.apache.commons.io.IOUtils.toString(fileInputStream,"GBK");
            return s;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getFilepath() {
        return filepath;
    }
}
