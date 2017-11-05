package bart;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int myIntArray[] = new int[10]; //Array with 10 elements
        myIntArray[5] = 50;
        System.out.println("6th element of myIntArray is: " + myIntArray[5]);

        double myDoubleArray[] = new double[10];
        myDoubleArray[0] = 11.3;
        System.out.println("1st element of myDoubleArray is " + myDoubleArray[0]);

        int[] myArrayInt2 = new int[10];

        for (int i=0; i < 10; i++) {
            myArrayInt2[i] = i*10;
            System.out.println("Element " + i + " value is " + myArrayInt2[i]);
        }

        //using length
        int[] myArrayInt3 = new int[25];

        for (int i=0; i<myArrayInt3.length; i++) {
            myArrayInt3[i] = i*10;
            System.out.println("Element " + i + " value is " + myArrayInt3[i]);
        }

        int[] myArrayInt4 = new int[3];

        for (int i=0; i<myArrayInt4.length; i++) {
            myArrayInt4[i] = i*100;
            System.out.println("Element " + i + " value is " + myArrayInt4[i]);
        }

        printArray(myArrayInt4);

        // real use of array
        int[] myIntagers = getIntagers(5);
        for (int i=0; i<myIntagers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntagers[i]);
        }
        System.out.println("The average is " + getAverage(myIntagers));
    }


    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            array[i] = i*10;
            System.out.println("Element " + i + " value is " + array[i]);
        }
    }

    private static int[] getIntagers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;

        for (int i=0; i<array.length; i++) {
            sum = sum + array[i];
        }
        return (double) sum / (double) array.length;
    }
}
