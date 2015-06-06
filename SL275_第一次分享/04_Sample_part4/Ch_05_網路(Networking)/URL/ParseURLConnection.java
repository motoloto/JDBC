/*
執行:java ParseURLConnection http://tw.yahoo.com/index.html
*/

import java.net.*;
import java.io.*;
import java.util.Date;

public class ParseURLConnection {
    public static void main(String args[]) throws IOException{
        URL url = null;
        URLConnection urlConn=null;
        try {
            url = new URL(args[0]); //由命令列輸入建立URL物件
        } catch (MalformedURLException mue) {
             System.out.println("error: " + mue);
        }
        
        System.out.println("url:" + url.toExternalForm());
        System.out.println("Protocol:" + url.getProtocol());
        System.out.println("Host:" + url.getHost());
        System.out.println("Port:" + url.getPort());
        System.out.println("File:" + url.getFile());
        System.out.println("Ref:" + url.getRef());
        System.out.println();
        
        urlConn = url.openConnection();
        urlConn.connect();
        System.out.println("Content Type:" + urlConn.getContentType());
        System.out.println("Content Encoding:" + urlConn.getContentEncoding());
        System.out.println("Content Length:" + urlConn.getContentLength());
        System.out.println("Date:" + new Date(urlConn.getDate()));
        System.out.println("Last Modified:" + new Date(urlConn.getLastModified()));
        System.out.println("Expiration:" + new Date(urlConn.getExpiration()));
        System.out.println();
        
        if (urlConn instanceof HttpURLConnection){
            HttpURLConnection h = (HttpURLConnection)urlConn;
            System.out.println("Request Method:" + h.getRequestMethod());
            System.out.println("Response message:" + h.getResponseMessage());
            System.out.println("Response Code:" + h.getResponseCode());
            System.out.println();
        }
        
        System.out.println("url Content:" + url.getContent());
        System.out.println("url Content:" + urlConn.getContent());
    }
}