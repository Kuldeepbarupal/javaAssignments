import java.util.*;

public class calculater {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    String calc=sc.next();
    int result;

    switch(calc)
    {
      case "+": result=a+b;
      System.out.println("hello"+result);
      break;
      case "-" : result=a-b;
      System.out.println("hello"+result);
      break;
      case "*" : result = a*b;
      System.out.println("hello"+result);
      break;
      case "/": result = a/b;
      System.out.println("hello"+result);
      break;
      case "%": result = a%b;
      System.out.println("hello"+result);
      break;
    }
  }
}
