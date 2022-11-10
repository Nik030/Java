package CLASSWORK.Array;

public class ArrayLearn {


        public static int printAntGet(int param) {
            System.out.println("input param is = " + param);
            return param; // 10
        }

        public static void main(String[] args) {
            int value = 10; //10
            int valueInteger = value; // valueInteger = 10
            valueInteger = printAntGet(value); // valueInteger = 10
            valueInteger = valueInteger + 2; // valueInteger = 12

            System.out.println("Value is = " + value);
            System.out.println("valueInteger is = " + valueInteger);

            // example with reference data type

            // heap  - хранит объекты
            // heap -> [0,0,0,0,0,0,0,0,0,0]
            int[] array1 = new int[10]; // [0,0,0,0,0,0,0,0,0,0] - reference  = address
            System.out.println(array1);

            //element 1, 2, 3, 4, 5, 6, 7, 8, 9
            //index   0  1  2  3  4  5  6  7  8

            //element 9, 2, 3, 4, 5, 6, 7, 8, 1 index++ 1 step
            //index   0  1  2  3  4  5  6  7  8

            //element 9, 2, 3, 4, 5, 6, 7, 8, 1 index++ 2 step
            //index   0  1  2  3  4  5  6  7  8  6 = array.length - 1 - index = 9 - 1 - 2

            //array[0] -> array[8] == 1 9 ; 9 1
            //
            // result = 9, 8 ,7, 6, 5, 4, 3, 2, 1 -
            int[] forwardArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            // show array before reverse
            print(forwardArray);
            System.out.println();


            // 9, 8 ,7, 6, 5, 4, 3, 2, 1
            int[] reverseArray = reverse(forwardArray);
            // System.out.println(reverseArray);
            // array on screen
            print(reverseArray);
        }

        public static void print(int[] array) {
            // array.length  - operator get count of element
            //for (int index = array.length - 1; index >= 0; index--) {
            for (int index = 0; index < array.length; index++) {
                int element = array[index];
                System.out.print(element + " ");
            }
        }

        public static int[] reverse(int[] arrays) {
            // length  = size = count element = 9
            // run tasks
            // for loop - start .. condition(end) .. count
            for (int index = 0; index < arrays.length/2; index++) {
                // index = 0; index = 1;
                int first = index; // first = 1
                int second = arrays.length - index - 1; // second = 8
                int tempFirstInteger = arrays[first]; //tempFirstInteger = 1 index = 0 || arrays[1] = 2
                int tempSecondInteger = arrays[second]; // tempSecondInteger = 9 index = 8 || tempSecondInteger = array[8] = 1
                arrays[first] = tempSecondInteger; // arrays[0] = 9 || arrays[1] = tempSecondInteger = 1
                arrays[second] = tempFirstInteger; // array[8] = 1
                // array = [9, 2, 3, 4, 5, 6, 7, 8, 1]
                // index =  0  1  2  3  4  5  6  7  8
            }
            return arrays;
        }


    }

