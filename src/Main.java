import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Level 1:
        // Создайте массив размером 100 символов, заполните все ячейки значением 10.
        // 1 и 99 ячейки заполните значениями, равными 0
        int[] testIntArray1 = new int[100];

        Arrays.fill(testIntArray1, 10);
        testIntArray1[0] = 0;
        testIntArray1[99] = 0;

        System.out.println(Arrays.toString(testIntArray1));

        // Level 2:
        // Создайте массив размером 100 символов, заполните все ячейки согласно такому правилу:
        // 1 ячейка - 111, 2ая - 222, 3ая - 333,….  11ая - 111, 12ая - 222, 13ая - 333.
        // Найдите сумму значений всех ячеек
        System.out.println();
        int[] testIntArray2 = new int[100];

        for (int i = 0; i < testIntArray2.length; i++) {
            testIntArray2[i] = 111 * ((i + 1) % 10);
        }

        System.out.println(Arrays.toString(testIntArray2));
    }
}