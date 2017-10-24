import java.util.*;
public class practice01
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    System.out.println("請輸入第一個數字");
    int num1 = input.nextInt(); 
    System.out.println("請輸入第二個數字");
    int num2 = input.nextInt(); 
    
    int total = num1+num2;
    System.out.println("兩數字總合為 "+total);
     
  }
}
