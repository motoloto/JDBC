/*
java GetURLContent http://tw.yahoo.com/index.html
*/
import java.net.*;
import java.io.*;

class GetURLContent {
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
            //�إ�URL��Ƭy
            BufferedReader file =
                new BufferedReader(new InputStreamReader(urllink.openStream()));
            String data;
            while ((data = file.readLine()) != null) {
                System.out.println(data);
            }
            file.close();
            System.exit(0);
        } catch (IOException ioe) {
            System.out.println("IO error!");
        }
    }
}