import java.util.Arrays;

public class MyArrays {

    public void printArrayList(){
        int[] arrayList = {21,22,23,24};

        System.out.println("Single Array");

        System.out.println("Method 1: toString");
            System.out.println(Arrays.toString(arrayList));

        System.out.println("Method 2: for-each loop");
        for (int num : arrayList){
            System.out.print(num + " ");
        }

    }

    public void printDoubleArray(){
        int[][] matrix = {{21,22,23},{31,32,33},{41,42,43}};

        System.out.println("Double Array");
        // Method 1: Using Arrays.toString()
        System.out.println("Method 1: toString\n" + Arrays.deepToString(matrix));

        // Method 2: Using a for loop
        System.out.print("Method 2: for loop\n");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(Arrays.toString(matrix[i]) + " ");
        }
        System.out.println();

        // Method 3: Using for-each loop
        System.out.print("Method 3: for-each loop\n");
        for (int[] value : matrix) {
            System.out.print(Arrays.toString(value) + " ");
        }
        System.out.println();
    }
}
