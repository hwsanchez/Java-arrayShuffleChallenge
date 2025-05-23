import java.util.Arrays;
//Note: The array must have an even number of elements in order to work!
//This new comment was added in a different branch
public class Main {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,4,5,6,7,8,9,10, 11, 12, 13, 14};
        int lenNum1 = num1.length;

        int[] shuffled = new int[lenNum1];
        for (int i = 0; i < lenNum1 - 1; i++) {
            if(i * 2 + 1 <= lenNum1){
                shuffled[2 * i] = num1[i];
                shuffled[2 * i + 1] = num1[lenNum1/2 + i];
            }

        }
        System.out.println("Original array: " + Arrays.toString(num1));
        System.out.println("Shuffled array:" + Arrays.toString(shuffled));
    }
}
