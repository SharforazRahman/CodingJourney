import java.util.Scanner;

public class countingOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Valid Number: ");
        int a = sc.nextInt();
        int count = 0;
        String str = Integer.toString(a);
        for(int i = 0; i < str.length(); i ++){
            if(str.trim().charAt(i) == '5'){
                count++;
            }
        }
        System.out.println("So the occurrences of this number is: ");
        System.out.print(count);


        System.out.println();
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        System.out.println("Another way of doing the code");

        int number = 45536;

        int count2 = 0;
        while (number > 0){
            int reminder = number%10;
            if(reminder == 5){
                count2++;
            }
            number = number/10;
        }
        System.out.print("So the occurrences of this number is: ");
        System.out.print(count);
    }
}
