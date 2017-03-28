/**
 * Created by oliva on 28.03.2017.
 */
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws Exception {
        int array[] = new int[50];
        double ar1[] = new double [8];

        printArray("ODD NUMBERS", array);
        printArray1("RANDOM NUMBERS", ar1);

    }
    private static void printArray(String message, int array[]) {
        System.out.println(message + ": [length: " + array.length + "]");
        int i = 0;
        array[i]=1;
        System.out.print(array[i]);
        for ( i = 1; i < array.length; i++) {
            array[i]=array[i-1]+2;
           if (i != 0){
                System.out.print(",");
            }
            System.out.print(array[i]);

        }
       System.out.println();
       System.out.println(Arrays.toString(array));
       System.out.println();

        for ( i = 49; i>0 ; i--) {
           System.out.print(array[i] + " ");
        }

    }
    private static void printArray1(String message, double ar1[]) {
        System.out.println();
        for (  int r = 0; r < ar1.length; r++) {
            ar1[r] = Math.floor(Math.random() * 10);

        }
        System.out.println(Arrays.toString(ar1));

        for (  int r = 0; r < ar1.length; r++) {
         int ost = Integer.valueOf(r % 2);
          if (ost!=0) {
                ar1[r] = 0;
            }
           }
        System.out.println(Arrays.toString(ar1));
    }
}
