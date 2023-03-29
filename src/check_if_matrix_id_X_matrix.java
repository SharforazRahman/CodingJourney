public class check_if_matrix_id_X_matrix {
    public static void main(String[] args) {
        int[][] grid = {
                {2,0,0,1},
                {0,3,1,0},
                {0,5,2,0},
                {4,0,0,2}
        };
        int store_value_of_right_and_Left_side = 0;
        int storing_repeatedValue = 0;
        int sum_of_whole_array = 0;
        int sum_of_without_the_middle_one = 0;
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                sum_of_whole_array = sum_of_whole_array + grid[i][j];
                if((i == j)){
                    store_value_of_right_and_Left_side = store_value_of_right_and_Left_side+grid[i][j];
                    if(grid[i][j] == 0){
                        count++; // so there are no 0s in diagonal form, since count is 0;
                    }
                }
                if(i+j == grid.length-1){
                    store_value_of_right_and_Left_side = store_value_of_right_and_Left_side+grid[i][j];
                    if(grid[i][j] == 0){
                        count++; // so there are no 0s in diagonal form, since count is 0;
                    }
                }
                if(i == j && i + j == grid[i].length-1){
                    storing_repeatedValue = grid[i][j]; // storing the value which is in left diagonal and both right diagonal(middle value);
                }
            }
        }
        sum_of_without_the_middle_one = store_value_of_right_and_Left_side-storing_repeatedValue ;
        int result = sum_of_whole_array-sum_of_without_the_middle_one;
        if(count == 0 && result == 0){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
