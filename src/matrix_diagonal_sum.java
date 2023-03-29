public class matrix_diagonal_sum {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int store_value = 0;
        int storing_repeatedValue = 0;

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(i == j){
                    store_value = store_value+mat[i][j];
                }
                if(i+j == mat.length-1){
                    store_value = store_value+mat[i][j];
                }
                if(i == j && i + j == mat[i].length-1){
                    storing_repeatedValue = mat[i][j];
                }
            }
        }
        System.out.println(store_value-storing_repeatedValue);
    }
}
