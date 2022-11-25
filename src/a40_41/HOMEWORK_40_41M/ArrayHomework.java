package a40_41.HOMEWORK_40_41M;

public class ArrayHomework {
    public static void main(String[] args) {   /// Из двух массивов создать один
        int[] array1 = {2, 3, 1, 6, 7, 4};
        int[] array2 = {20, 1, 33, 2, 55};
        int[] array3 = new int[array1.length + array2.length];

        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
            count++;
        }
        for (int j = 0; j < array2.length; j++) {
            array3[count++] = array2[j];
        }
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }


    }
}
