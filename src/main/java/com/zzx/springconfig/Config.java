package com.zzx.springconfig;

import com.zzx.util.ReadFile;
import org.jsoup.Jsoup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/5/6 0006.
 */
@Configuration
@ComponentScan(basePackages = "com.zzx")
public class Config {

    @Bean
    public ReadFile readfile()
    {
        ReadFile readFile=new ReadFile();
        readFile.setFilepath("g:\\sis\\mulu.htm");
        return readFile;
    }

    @Bean
    @Qualifier("filepathmulu")
    public String filepath(){
        return "g:\\sis\\mulu.htm";
    }

    @Bean
    @Qualifier("charset")
    public String charset(){
        return "GBK";
    }
}
