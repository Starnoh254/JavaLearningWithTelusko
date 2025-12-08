public class Lesson {
    public static void main (String args []){
        int nums [] = {3,7,2,4};
        nums[1] = 6;

        int nums2 [] = new int[4];
        for (int i = 0 ; i < 4 ; i++){
            nums2[i] = i;
        }

        for(int number : nums2) {
            System.out.println(number);
        }
    }
}
