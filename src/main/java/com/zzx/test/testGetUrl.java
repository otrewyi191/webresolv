package com.zzx.test;

import com.zzx.getWebPage.FetchUrl;
import com.zzx.getlist.ParseHtml;
import com.zzx.getlist.ParseRows;
import com.zzx.springconfig.Config;
import org.jsoup.nodes.Document;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/5/6 0006.
 */
public class testGetUrl {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(Config.class);

        FetchUrl fetchUrl=(FetchUrl)ctx.getBean(FetchUrl.class);
        fetchUrl.get();

        System.out.println("end");
    }
}
