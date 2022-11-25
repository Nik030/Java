package HOMEWORK_45_56M;


public class EvenOrOdd {
    public int b = 10;               //2 задача
    public int a = 100;


    static boolean EvenOrOdd(int a) {           // 1 задача
        return (a % 2 == 0);
    }


    public static void main(String[] args) {      // 1 задача
        System.out.println(EvenOrOdd(5));
    }

        public void swap ( int a, int b){           // 2 задача

            this.a = b;
            this.b = a;
            System.out.println(a + b);
        }
    }


