public class MultidimensionalArray {
    public static void main(String[] args) {

        /*
        // create a 2d array
        // int[][] a = new int[3][4];
        int[][] array2D = {
            {1, 2, 3},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
      
        // calculate the length of each row
        System.out.println("Length of row 1: " + array2D[0].length);
        System.out.println("Length of row 2: " + array2D[1].length);
        System.out.println("Length of row 3: " + array2D[2].length);

        // Print 2d array
        // for (int index = 0; index < a.length; ++index) {
        //     for (int itemIndex = 0; itemIndex < a[index].length; ++itemIndex) {
        //         System.out.print(a[index][itemIndex] + " ");
        //     }
            
        //     System.out.println();
        // }

        for(int[] row : array2D) {
            for(int item : row) {
                System.out.print(item + " ");
            }

            System.out.println();
        }
        */

        // test is a 3d array
        int[][][] array3D = {
            {
                {1, -2, 3}, 
                {2, 3, 4}
            }, 
            { 
                {-4, -5, 6, 9}, 
                {1}, 
                {2, 3}
            } 
        };

        // for..each loop to iterate through elements of 3d array
        for (int[][] array2DIndex: array3D) {
            for (int[] array1DIndex: array2DIndex) {
                for(int item: array1DIndex) {
                    System.out.print(item + " ");
                }
                
                System.out.println();
            }

            System.out.println();
        }
    }
}