import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Scanner myObj = new Scanner(System.in); 
  System.out.println("Entetr a number for multipication table:");
  int x = Integer.parseInt(myObj.nextLine());
  System.out.println("you entered:"+x);

  for(int i=0;i<=10;i++){
    System.out.println(x +"*"+ i + "="+x*i);
  }
}
}