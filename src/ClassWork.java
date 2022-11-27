import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
        int[] testInt = new int[20];
        String[] testString = new String[3];
        int[][] testDeep = new int[2][3];
        int[][][] testDeeper = new int[2][3][4];
        Random random = new Random();

        System.out.println(Arrays.toString(testInt));
        System.out.println(Arrays.toString(testString));
        System.out.println(Arrays.deepToString(testDeep));
        System.out.println(Arrays.deepToString(testDeeper));

        for (int i = 0; i < testInt.length; i++) {
            testInt[i] = random.nextInt(0,10);
            // System.out.println(testInt[i]);
        }

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите скорость машины: ");
        double speed = scanner.nextDouble();
        double[] speedArray = new double[101];

        speedArray[0] = speed;

        for (int i = 1; i < speedArray.length; i++) {
            speedArray[i] = speedArray[i - 1] * 0.95;
        }
        System.out.println(Arrays.toString(speedArray));

        System.out.println();
        int[] fibArray = new int[45];
        fibArray[0] = 1;
        fibArray[1] = 1;
        for (int i = 2; i < fibArray.length; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }
        System.out.println(Arrays.toString(fibArray));
    }

}
