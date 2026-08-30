import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    number(a);
  }
  static void number(String a){
    for(int i=0;i<a.length();i++){
      char ch=a.charAt(i);
      if(ch>='0'&&ch<='9'){
        System.out.print(ch);
      }
    }
  }
}
        
  
