import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] oneArray = new int[3];
        oneArray[0] = 1;
        oneArray[1] = 2;
        oneArray[2] = 3;
        double[] twoArray = {1.57, 7.654, 9.986};
        char[] threeArray = {'a', 'b', 'c', 'd'};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] oneArray = new int[3];
        oneArray[0] = 1;
        oneArray[1] = 2;
        oneArray[2] = 3;
        double[] twoArray = {1.57, 7.654, 9.986};
        char[] threeArray = {'a', 'b', 'c', 'd'};
        for (int i = 0; i < oneArray.length; i++) {
            System.out.print(oneArray[i]);
            if (i < oneArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < twoArray.length; i++) {
            System.out.print(twoArray[i]);
            if (i < twoArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < threeArray.length; i++) {
            System.out.print(threeArray[i]);
            if (i < threeArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] oneArray = new int[3];
        oneArray[0] = 1;
        oneArray[1] = 2;
        oneArray[2] = 3;
        double[] twoArray = {1.57, 7.654, 9.986};
        char[] threeArray = {'a', 'b', 'c', 'd'};
        for (int i = oneArray.length - 1; i >= 0; i--) {
            System.out.print(oneArray[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = twoArray.length - 1; i >= 0; i--) {
            System.out.print(twoArray[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = threeArray.length - 1; i >= 0; i--) {
            System.out.print(threeArray[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] oneArray = new int[3];
        oneArray[0] = 1;
        oneArray[1] = 2;
        oneArray[2] = 3;
        for (int i = 0; i < oneArray.length; i++) {
            if (oneArray[i] % 2 != 0) {
                oneArray[i] += 1;
            }
        }
        System.out.println(Arrays.toString(oneArray));
    }
}