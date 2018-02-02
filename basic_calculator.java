import java.util.Scanner;

 class basic_calculator{

   public static void main(String[] args){

   Scanner num = new Scanner(System.in);
   double firstNum,secondNum,result;
   System.out.println("Enter first number:");
   firstNum = num.nextDouble();
   System.out.println("Enter second number:");
   secondNum = num.nextDouble();
   result = firstNum + secondNum;
   System.out.println(result);



   }
 }
