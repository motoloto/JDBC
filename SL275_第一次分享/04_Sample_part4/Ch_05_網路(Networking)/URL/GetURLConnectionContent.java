/*
java GetURLConnectionContent http://tw.yahoo.com/index.html
*/
import java.net.*;
import java.io.*;

class GetURLConnectionContent {
    public static void main(String args[]) {
        URL urllink = null;
        if (args.length != 1) {
            System.out.println("java UrlList <URL>"); //URL由命令列輸入
            System.exit(0);
        }
        try {
            urllink = new URL(args[0]); //建立URL物件url
        } catch (MalformedURLException e) {
            System.out.println("Malformed URL error!");
        }

        try {
            //以URL物件建立URLConnection物件
            URLConnection urlConn = urllink.openConnection();
            //以URLConnection物件取得輸入資料流
            InputStream ins = urlConn.getInputStream();

            //建立URL資料流
            BufferedReader file = new BufferedReader(new InputStreamReader(ins));
            String data;
            while ((data = file.readLine()) != null) {
                System.out.println(data);
            }

            file.close();
            ins.close();
            System.exit(0);
        } catch (IOException ioe) {
            System.out.println("IO error!");
        }
    }
}