/*
java GetURLConnectionContent http://tw.yahoo.com/index.html
*/
import java.net.*;
import java.io.*;

class GetURLConnectionContent {
    public static void main(String args[]) {
        URL urllink = null;
        if (args.length != 1) {
            System.out.println("java UrlList <URL>"); //URL�ѩR�O�C��J
            System.exit(0);
        }
        try {
            urllink = new URL(args[0]); //�إ�URL����url
        } catch (MalformedURLException e) {
            System.out.println("Malformed URL error!");
        }

        try {
            //�HURL����إ�URLConnection����
            URLConnection urlConn = urllink.openConnection();
            //�HURLConnection������o��J��Ƭy
            InputStream ins = urlConn.getInputStream();

            //�إ�URL��Ƭy
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