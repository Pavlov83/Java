// use of Switch-Case statements

public class SwitchCase{

  public static void main(String[] args){
    int a = 4;

    switch (a){

      case 0:
        System.out.println("zero");
        break;
      case 1:
        int b = (a + 5);
        System.out.println("8 is: " + b);
        break;
     case 2:
        int c = (a * 5);
        System.out.println("C is: " + c);
    case 3:
        int d = (a + 50);
        System.out.println(d);
        break;
    case 4:
        System.out.println("We got four");
        break;
    default:
        System.out.println("Nothing to see here, move along");
        break;          
    }
  }
}
