public class add_digit {
    public static void main(String[] args) {
        int num = 128;
        int store_1 = 0;
        int store_2 = 0;
        int store_3 = 0;

        if (num > 100) {
            while (num > 0) {
                int reminder = num % 10;
                store_1 = (reminder + store_1); // calculating the number which is bigger than 100 and adding those;
                num = num / 10;
            }
            while (store_1 > 0) {
                int reminder = store_1 % 10;
                store_2 = (reminder + store_2); //calculating the number which is less/equal than 100 and adding those;
                store_1 = store_1 / 10;
            }
            while (store_2 > 0) {
                int reminder = store_2 % 10;
                store_3 = (reminder + store_3); //calculating the number which is less/equal than 10 and adding those;
                store_2 = store_2 / 10;
            }
            System.out.println(store_3);
        }



        else if (num <= 100 && num >= 10) {
            while (num > 0) {
                int reminder = num % 10;
                store_1 = (reminder + store_1); // calculating the number which is bigger than 100 and adding those;
                num = num / 10;
            }
            while (store_1 > 0) {
                int reminder = store_1 % 10;
                store_2 = (reminder + store_2); //calculating the number which is less/equal than 100 and adding those;
                store_1 = store_1 / 10;
            }
            System.out.println(store_2);
        }


        else  {
            while (num > 0) {
                int reminder = num % 10;
                store_1 = (reminder + store_1); // calculating the number which is bigger than 100 and adding those;
                num = num / 10;
            }
            System.out.println(store_1);
        }

    }
}