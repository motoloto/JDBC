/*  

      ���դ@ ��W
        File f0 = new File("c:\\javawork");       //�HFile���󬰫غc��,����1.txt����W
        File f1 = new File(f0 ,"1.txt");     
      
      ���դG �إ߸�Ƨ�
      ���դT �إ߷s�ɮ� 
      ���ե| �R��
      ���դ� createTempFile( , , ) , deleteOnExit();
      
      ���դ� �t�� Temp file
        String tmpdir = System.getProperty("java.io.tmpdir");    //���ըt�� Temp file  
        System.out.println(tmpdir);
        File f1 = new File(tmpdir); 
*/

import java.io.*;

public class File3_Test {
  
   public static void main(String args[]) {

     File f0 = new File("c:\\javawork");       //�HFile���󬰫غc��,����1.txt����W
     File f1 = new File(f0 ,"1.txt");     
       
     if(f1.exists()) 
     	  System.out.println(f1.getName()+ " ---> it exists !");
     else System.out.println(f1.getName()+ " ---> not exists !");
          
     if(!f1.isFile()) 
     	  System.out.println(f1.getName()+ " ---> Not a file !");
     else System.out.println(f1.getName()+ " ---> is a file !");
   
     System.out.println();
       
     if(f1.getName().equals("1.txt")) {
       File f_ren = new File("c:\\javawork\\2.txt");               //���դ@
       System.out.println("f1.renameTo()= "+f1.renameTo(f_ren));   //��W
     }   
      
     File f_mkd = new File("c:\\javawork\\TempDir");               //���դG
       System.out.println("f_mkd.mkdir()= "+f_mkd.mkdir());        //�إ߸�Ƨ�
      
     File f_new=null;                                               
     try{                                                          //���դT
        f_new = new File("c:\\javawork\\TempDir\\new.txt");        //�إ߷s�ɮ�    
       System.out.println("f_new.createNewFile()= "+f_new.createNewFile());
     }catch(IOException e){} 
 
     System.out.println("f_new.delete()= "+f_new.delete());        //���ե| �R��(�ɮ�)
     System.out.println("f_mkd.delete()= "+f_mkd.delete());        //���ե| �R��(��Ƨ�)

    /*  
     try{                                                          
       File Dir = new File("c:\\javawork");                        //���դ�
       File f_temp = File.createTempFile("delOnExit",".tmp",Dir);  //createTempFile
       f_temp.deleteOnExit();                                      //deleteOnExit()
      }catch(IOException e){}                                      //(��: ��JVM������, �|�۰ʲ������ɮ�, ��jdk1.3 �� jdk1.4.1����, ��jdk1.4.0�L��)
    */  
     
     
     //���դ�  //���ըt�� Temp Dir  //�O��Ƨ��~�����C�X���e
     System.out.println("===============================================");
     
     if(!f1.isDirectory()){
     	System.out.println(f1.getName()+ " ---> Not a directory !");
      	System.exit(0);
     } else System.out.println(f1.getName()+ " ---> is a directory !");           
    
     
     System.out.println("f1.list() �^�� [String ����}�C] ");  
     String contents[]=f1.list();
       for (int i=0; i< contents.length; i++)
     System.out.println(" "+contents[i]); 
      
     System.out.println();        
   
     System.out.println("f1.listFiles() �^�� [File ����}�C] ");     
     File contents2[]=f1.listFiles();
       for (int i=0; i< contents2.length; i++)
       System.out.println(" "+contents2[i]);  
      
   }   
}
   
      