/*
    File dir = new File("c:\\javawork");           //�إߥؿ�����
    File dir = new File("c:\\javawork\\emptyDir"); //�إߥؿ�����, �ťؿ�
    File dir = new File("javawork");               //���󤣬O�ؿ� ?
*/

import java.io.*;

public class File1_Dir {
  
  public static void main(String args[]) {
         
    File dir = new File("c:\\javawork");     //�إߥؿ�����
        
    String contents[] = dir.list();          //���o�ؿ������ؿ��B�ɮװ}�C 
         
    if (!dir.isDirectory())
         System.out.println("Not a directory");
    else if (contents.length==0)
         System.out.println("�ؿ� "+dir.getName()+" ���L�ɮ�");
    else 
         for (int i = 0; i < contents.length; i++)
         System.out.println(contents[i]);    //�C�X�ؿ������ؿ��B�ɮ�
              
  }
      
}        
