/*  

      測試一 更名
        File f0 = new File("c:\\javawork");       //以File物件為建構元,測試1.txt之更名
        File f1 = new File(f0 ,"1.txt");     
      
      測試二 建立資料夾
      測試三 建立新檔案 
      測試四 刪除
      測試五 createTempFile( , , ) , deleteOnExit();
      
      測試六 系統 Temp file
        String tmpdir = System.getProperty("java.io.tmpdir");    //測試系統 Temp file  
        System.out.println(tmpdir);
        File f1 = new File(tmpdir); 
*/

import java.io.*;

public class File3_Test {
  
   public static void main(String args[]) {

     File f0 = new File("c:\\javawork");       //以File物件為建構元,測試1.txt之更名
     File f1 = new File(f0 ,"1.txt");     
       
     if(f1.exists()) 
     	  System.out.println(f1.getName()+ " ---> it exists !");
     else System.out.println(f1.getName()+ " ---> not exists !");
          
     if(!f1.isFile()) 
     	  System.out.println(f1.getName()+ " ---> Not a file !");
     else System.out.println(f1.getName()+ " ---> is a file !");
   
     System.out.println();
       
     if(f1.getName().equals("1.txt")) {
       File f_ren = new File("c:\\javawork\\2.txt");               //測試一
       System.out.println("f1.renameTo()= "+f1.renameTo(f_ren));   //更名
     }   
      
     File f_mkd = new File("c:\\javawork\\TempDir");               //測試二
       System.out.println("f_mkd.mkdir()= "+f_mkd.mkdir());        //建立資料夾
      
     File f_new=null;                                               
     try{                                                          //測試三
        f_new = new File("c:\\javawork\\TempDir\\new.txt");        //建立新檔案    
       System.out.println("f_new.createNewFile()= "+f_new.createNewFile());
     }catch(IOException e){} 
 
     System.out.println("f_new.delete()= "+f_new.delete());        //測試四 刪除(檔案)
     System.out.println("f_mkd.delete()= "+f_mkd.delete());        //測試四 刪除(資料夾)

    /*  
     try{                                                          
       File Dir = new File("c:\\javawork");                        //測試五
       File f_temp = File.createTempFile("delOnExit",".tmp",Dir);  //createTempFile
       f_temp.deleteOnExit();                                      //deleteOnExit()
      }catch(IOException e){}                                      //(註: 當JVM結束時, 會自動移除該檔案, 於jdk1.3 及 jdk1.4.1有效, 但jdk1.4.0無效)
    */  
     
     
     //測試六  //測試系統 Temp Dir  //是資料夾才能執行列出內容
     System.out.println("===============================================");
     
     if(!f1.isDirectory()){
     	System.out.println(f1.getName()+ " ---> Not a directory !");
      	System.exit(0);
     } else System.out.println(f1.getName()+ " ---> is a directory !");           
    
     
     System.out.println("f1.list() 回傳 [String 物件陣列] ");  
     String contents[]=f1.list();
       for (int i=0; i< contents.length; i++)
     System.out.println(" "+contents[i]); 
      
     System.out.println();        
   
     System.out.println("f1.listFiles() 回傳 [File 物件陣列] ");     
     File contents2[]=f1.listFiles();
       for (int i=0; i< contents2.length; i++)
       System.out.println(" "+contents2[i]);  
      
   }   
}
   
      