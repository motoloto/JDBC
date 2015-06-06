
public class TestSplit_String_2{

    public static void main(String args[]) {
  
        String str1 = "boo:and:foo";
        
        String[] tokens1 = str1.split(":");     //{ "boo", "and", "foo" }
        for(int i=0 ; i<tokens1.length ; i++) {
            System.out.println(tokens1[i]);
        }

System.out.println("-----------------------");        
        
        String[] tokens2 = str1.split("o");     //{ "b", "", ":and:f" }
        for(int i=0 ; i<tokens2.length ; i++) {
            System.out.println(tokens2[i]);
        }

System.out.println("-----------------------");        
        
        
        String[] tokens3 = str1.split("o+");     //{ "b", ":and:f" }   //+�����N�h�ӭ��ƪ��r��
        for(int i=0 ; i<tokens3.length ; i++) {
            System.out.println(tokens3[i]);
        }

System.out.println("-----------------------");        
        
        String str = "http://tw.yahoo.com";
        String[] tokens = str.split("[:/.]+");   //{ "http", "tw", "yahoo", "com" } //[]���b[]�������N�@�Ӧr��
        for(int i=0 ; i<tokens.length ; i++) {
            System.out.println(tokens[i]);
        }
    }
}

