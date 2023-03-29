public class flipping_an_image {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[i].length; j++){
                System.out.print(image[i][j]+" ");
            }
            System.out.println();
        }
    }
}
