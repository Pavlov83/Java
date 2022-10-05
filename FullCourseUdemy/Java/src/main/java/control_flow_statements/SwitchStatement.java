package control_flow_statements;

public class SwitchStatement {

    public static void main(String[] args) {

        int value = 1;
        switch(value){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
            System.out.println("Value was 2");
            break;

            case 3:case 4: case 5:
                System.out.println("was a 3 or a 4 or a 5");
                System.out.println("Actually is " + value);
                break;

            default:
                System.out.println("The value is different than one and two");
                break;
        }
    }
}
