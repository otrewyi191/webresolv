package com.zzx.getlist;

import com.zzx.bean.Post;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2017/5/6 0006.
 */
@Component
public class ParseRows {

    public void parse(Document doc)
    {
        Elements tbody = doc.select("tbody");

        System.out.println(tbody.size());
        List<Post> collect = tbody
                .stream()
                .filter(e -> url(e) != null)
                .map((e->new Post(author(e),url(e),title(e))))
                .collect(Collectors.toList());

        System.out.println(collect.size());

        collect.forEach(e-> System.out.println(e));

    }

    private String author(Element element)
    {
        Elements select = element.select("td.author");
        return select.text();
    }

    private String title(Element element)
    {
        Elements select = element.select("span");
        return select.text();
    }

    private String url(Element element)
    {
        Elements span = element.select("span");
        if (span.size()==0) {
            return null;
        }
        Elements select1 = span.get(0).select("a");

        if (select1.size()==0) {
            return null;
        }
        String s = select1.get(0).attributes().get("href");
        if(s==null||s.equals(""))
        {
            return null;
        }
        return "http://67.220.90.4/bbs/"+s;
    }


}
