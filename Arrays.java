public class Arrays {
    public static void main(String args []) {
        int [][] nums = new int[3][4];
        int matrix [][] = new int[3][3];
        

        for(int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 4 ; j++){
                int attempts = 0;
                int random = (int) (Math.random() * 101);
                while (random != 100){
                    random = (int) (Math.random() * 101);
                    attempts++;
                }

                nums[i][j] = random;
                System.out.println("Got 100 after " + attempts + " attempts");
                
            }
        }

        for(int i = 0; i < 3 ; i++ ){
            for (int j = 0 ; j < 4 ; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }


        for(int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                int attempts = 0;
                int random = (int) (Math.random() * 101);
                while (random != 100){
                    random = (int) (Math.random() * 101);
                    attempts++;
                }
                matrix[i][j] = random;
                System.out.println("Got 100 after " + attempts + " attempts");
            }
        }

        for(int i = 0; i < 3 ; i++ ){
            for (int j = 0 ; j < 3 ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int n[] : nums) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();    
        }
    }
}
