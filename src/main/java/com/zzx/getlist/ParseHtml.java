package com.zzx.getlist;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2017/5/6 0006.
 */
@Component
public class ParseHtml {
    @Autowired
    @Qualifier("filepathmulu")
    private String filepath;

    @Autowired
    @Qualifier("charset")
    private String charset;

    public Document parse() {
        // 从文件中加载 HTML 文档
        File input = new File(filepath);
        Document doc = null;
        try {
            //relative baseurl
            doc = Jsoup.parse(input, charset, "http://www.oschina.net/");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }
}
