// To use Arrays.toString()
import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        /**
         ** Using arraycopy()
         */
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = new int[array1.length];

        System.arraycopy(array1, 0, array2, 0, array1.length);
        System.out.println("array2 = " + Arrays.toString(array2));

        int[] array3 = new int[5];
        System.arraycopy(array1, 2, array3, 1, 2);
        System.out.println("array3 = " + Arrays.toString(array3));
        
        /**
         ** Using copyOfRange()
         */
        int[] source = {1, 2, 3, 4, 5};
        
        // Copy the source array to the destination array
        int[] destination1 = Arrays.copyOfRange(source, 0, source.length);
        System.out.println("destination1 = " + Arrays.toString(destination1));
        
        // Copy from index 2 to 5
        int[] destination2 = Arrays.copyOfRange(source, 2, 5);
        System.out.println("destination2 = " + Arrays.toString(destination2));

        /**
         ** Copy 2D array
         */
        int[][] array2D = {
            {1, 2, 3},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
        };


        // Using Loop
        int[][] array2DClone = new int[array2D.length][];

        for (int i = 0; i < array2D.length; ++i) {
            array2DClone[i] = new int[array2D[i].length];
            for (int j = 0; j < array2D[i].length; ++j) {
                array2DClone[i][j] = array2D[i][j];
            }
        }
        
        System.out.println("array2DClone: " + Arrays.deepToString(array2DClone));
        
        // Using arrayCopy
        int[][] array2DClone2 = new int[array2D.length][];
        for (int i = 0; i < array2DClone2.length; ++i) {
            array2DClone2[i] = new int[array2D[i].length];
            System.arraycopy(array2D[i], 0, array2DClone2[i], 0, array2DClone2[i].length);
        }

        System.out.println("array2DClone2: " + Arrays.deepToString(array2DClone2));
    }
}
