import java.util.Scanner;

public class keepingNumberInput_till_enter_X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int storing = 0;
        int convert_String = 0;
        while (true) {
            System.out.print("Enter a digit: ");
            String a = sc.next();
            if(a.equals("x")){
                break;
            }
            convert_String = Integer.parseInt(a);
            storing = storing + convert_String;
        }
        System.out.println(storing);
    }
}
