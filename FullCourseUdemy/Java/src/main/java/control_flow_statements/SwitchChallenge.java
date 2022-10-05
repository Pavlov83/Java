package control_flow_statements;

public class SwitchChallenge {

    /* create a new switch statement using char instead of int
       create a new char variable
       create a switch statement testing for A,B,C,D,E
       display a message if any of these are found and then break
       add a default which displays a message saying not found!
     */

    public static void main(String[] args) {


        char switchVar = 'D';

        switch(switchVar){
            case 'A' :
                System.out.println("The case is A");
                break;
            case 'B':
                System.out.println("The case is B");
                break;
            case 'D':
                System.out.println("The case is D");
                break;
            default:
                System.out.println("The case is unexpected letter");
                break;
        }


    }
}
