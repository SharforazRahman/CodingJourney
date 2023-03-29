import java.util.Scanner;

public class reverseProgramme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int i = sc.nextInt();
        String str = "";
        while (i > 0){
            int reminder = i%10;
            str = str + reminder;
            i = i/10;
        }
        System.out.println(str);
        sc.close();
    }
}
