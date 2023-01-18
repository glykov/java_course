import java.util.Arrays;

public class Homework8 {
    public static void main(String[] args) {
        // task 1
        int[] iArray = new int[3];
        iArray[0] = 1;
        iArray[1] = 2;
        iArray[2] = 3;
        
        double[] dArray = {1.57, 7.654, 9.986};

        char[] cArray = {'H', 'e', 'l', 'l', 'o'};

        // task 2
        System.out.println(iArray[0] + ", " + iArray[1] + ", " + iArray[2]);
        
        System.out.printf("%.3f, %.3f, %.3f\n", dArray[0], dArray[1], dArray[2]);
        
        for (int i = 0; i < cArray.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(cArray[i]);
        }
        System.out.println();

        // task 3
        System.out.println(iArray[2] + ", " + iArray[1] + ", " + iArray[0]);
        
        System.out.printf("%.3f, %.3f, %.3f\n", dArray[2], dArray[1], dArray[0]);
        
        for (int i = cArray.length - 1; i >= 0; i--) {
            if (i != cArray.length - 1) {
                System.out.print(", ");
            }
            System.out.print(cArray[i]);
        }
        System.out.println();

        // task 4
        for (int i = 0; i < iArray.length; i++) {
            if (iArray[i] % 2 != 0) {
                iArray[i] += 1;
            }
        }
        System.out.println(Arrays.toString(iArray));
    }
}
