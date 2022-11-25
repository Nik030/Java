package a40_41.CLASSWORK40_41.Array;

import a40_41.CLASSWORK40_41.Utility.ArrayUtil;

import java.util.Arrays;

public class ArrayCopy {
    // сделать метод копирования +
    // сделать метод сортировки
    // сделать метод поиска

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = copyOf(array1); //array2 = 1, 2, 3, 4, 5, 6
      //  int[] array2 = array1   не правильный способ копирования массивов
        // проверка правильности метода copyOf
        array1[0] = 1000;
        System.out.print("array 1 = ");
        // print(array1);
        System.out.println(Arrays.toString(array1));
        System.out.print("array 2 = ");
        System.out.print(Arrays.toString(array2));
        // тестирование метода поиска
        int findIndexOfElement = ArrayUtil.findElement(array1,  5); // 4
        System.out.println("result is = " + findIndexOfElement);
        findIndexOfElement = ArrayUtil.findElement(array1, 10);
        System.out.println("result of second search = " + findIndexOfElement);

        int[] arrayInteger = null; // переменная не ссылается ни на какой объект в области памяти
        // переменная - не проиницианализирована, не ссфлается ни на какой обЪект
        // мы не имеем права работать с этой переменной, пока у нее не появится ссылка на объект
        findIndexOfElement = ArrayUtil.findElement(arrayInteger, 1);
        System.out.println(" result of the first search = " + findIndexOfElement);
        //System.out.print(arrayInteger[0]);
        arrayInteger = new int[10];
        arrayInteger = ArrayUtil.fillArray(arrayInteger, 999);
        System.out.println("result of work method fillArray = " + Arrays.toString(arrayInteger));


    }
    // 1, 2, 3, 4, 5, 6 -- inputArray
    // 1, 0, 0, 0, 0, 0 -- newArray
    public static int[] copyOf(int[] inputArray) {
        int lengthOldArray = inputArray.length;
        int[] newArray = new int[lengthOldArray];

        for (int i = 0; i < inputArray.length; i++) {  // inputArray.fori
            int value = inputArray[i]; //1
            newArray[i] = value;       //1
        }
        return newArray;
    }

    public static void print(int[] array) {
        // array.length  - operator get count of element
        //for (int index = array.length - 1; index >= 0; index--) {
        for (int index = 0; index < array.length; index++) {
            int element = array[index];
            System.out.print(element + " ");
        }
    }
}
