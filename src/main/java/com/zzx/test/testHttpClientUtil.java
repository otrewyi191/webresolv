package com.zzx.test;

import com.zzx.getWebPage.FetchUrl;
import com.zzx.springconfig.Config;
import com.zzx.util.HttpClientUtil;
import org.apache.commons.io.LineIterator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sun.net.www.http.HttpClient;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/**
 * Created by Administrator on 2017/5/6 0006.
 */
public class testHttpClientUtil {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(Config.class);

        String gbk = HttpClientUtil.getWithProxy("http://67.220.90.4/bbs/thread-7117777-1-2.html", new HashMap<>(), "GBK");

        assert gbk != null;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(gbk.getBytes());
        InputStreamReader inputStreamReader = new InputStreamReader(byteArrayInputStream);
        LineIterator lineIterator=new LineIterator(inputStreamReader);
        while (lineIterator.hasNext()) {
            String next = lineIterator.next();
            if (next.contains("attachment.php?aid=")) {
                System.out.println(next);
            }
        }


        System.out.println("end");
    }
}
