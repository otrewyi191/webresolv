package com.zzx.getWebPage;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;
import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2017/5/6 0006.
 */
@Component
public class FetchUrl {

    private String proxyHost = "127.0.0.1";
    private int proxyPort = 1080;

    public void get()
    {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://67.220.90.4/bbs/forum-229-2.html");
        CloseableHttpResponse response1 = null;
        try {
            response1 = httpclient.execute(httpGet);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // The underlying HTTP connection is still held by the response object
        // to allow the response content to be streamed directly from the network socket.
        // In order to ensure correct deallocation of system resources
        // the user MUST either fully consume the response content  or abort request
        // execution by calling CloseableHttpResponse#close().
        //建立的http连接，仍旧被response1保持着，允许我们从网络socket中获取返回的数据
        //为了释放资源，我们必须手动消耗掉response1或者取消连接（使用CloseableHttpResponse类的close方法）

        try {
            System.out.println(response1.getStatusLine());
            HttpEntity entity1 = response1.getEntity();
            InputStream content = entity1.getContent();
            String s = IOUtils.toString(content);
            System.out.println(s);
            // do something useful with the response body
            // and ensure it is fully consumed
            EntityUtils.consume(entity1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                response1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
