import java.util.Arrays;

public class Ex1 {

public static void main(String[] args) {
    //System.out.println(isSumBetween10And20(5, 15)); // true
    //System.out.println(isSumBetween10And20(7, 15)); // false

    //System.out.println(isPositive(5)); // true
    //System.out.println(isPositive(-3)); // false

    //printString("abcd", 5); // abcdabcdabcdabcdabcd

    //System.out.println(isLeapYear(2024));
    //System.out.println(isLeapYear(2022));

    //System.out.println(Arrays.toString(createArray(7, 8)));
    //System.out.println(Arrays.toString(createArray(10, 4)));


    // 1
    // int[] array = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    // System.out.println(Arrays.toString(array));

    // for (int i = 0; i < array.length; i++){
    //     if (array[i] == 1){
    //         array[i] = 0;
    //     }
    //     else{
    //         array[i] = 1;
    //     }
    // }
    // System.out.println(Arrays.toString(array));



    //2
    // int[] a = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
    // System.out.println((Arrays.toString(a)));
    // for (int i = 0; i < a.length; i++) {
    //     if (a[i] < 6){
    //         a[i]=a[i]*2;
    //     }
    // }
    // System.out.println((Arrays.toString(a)));


    //3
    int[][] b = new int[5][5];
        for (int i = 0; i < b.length; i++) {
            b[i][i] = 1;
            b[i][b.length - i - 1] = 1;
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
}   


/**
 * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
 * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 */
private static boolean isSumBetween10And20(int a, int b) {
    // проверить, что сумма a и b лежит между 10 и 20
    int sum = a + b;
    if ((sum >= 10) & (sum <= 20))
        return true;

    else
        return false;

}

private static boolean isPositive(int x) {
    // проверить, что х положительное
    if (x > 0)
    return true;
    else
    return false;
}

private static void printString(String source, int repeat) {
    // напечатать строку source repeat раз
    for (int i = 1; i <= repeat; i++) {
        System.out.print(source);
    }
}

private static boolean isLeapYear(int year) {
    // проверить, является ли год високосным. если да - return true
    if (year %4 == 0)
    return true;
    else
    return false;
}

private static int[] createArray(int len, int initalValue) {
    // должен вернуть массив длины len, каждое значение которого равно initialValue
    int[] arr = new int[len];
    for (int i = 0; i < len; i++) {
        arr[i] = initalValue;
    }
    return arr;
}


  //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
  //Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
  //2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
  //3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
  //и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
  //Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
  //Также заполнить элементы побочной диагонали

}