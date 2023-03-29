import java.util.Scanner;
//To find out whether the given String is Palindrome or not.

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        StringBuilder input_One = new StringBuilder();

        for(int i = ch.length-1; i >= 0; i--){
            input_One.append(ch[i]);
        }
        System.out.println(str);
        if(str.equals(input_One.toString())){
            System.out.print("PALINDROME");
        }
        else {
            System.out.println("Not PALINDROME");
        }
    }
}
