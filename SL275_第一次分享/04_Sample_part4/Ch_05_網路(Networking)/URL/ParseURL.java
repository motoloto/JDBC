/*
執行:java ParseURL http://tw.yahoo.com/index.html
*/

import java.net.*;
import java.io.*;

public class ParseURL {
    public static void main(String args[]) {
        URL url = null;
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
        try {
            System.out.println("Content:" + url.getContent());
        } catch (IOException ioe) {
        }
    }
}