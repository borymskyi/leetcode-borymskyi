package com.borymskyi.other;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Base {
    public static void main(String[] args) {


        /**
         * search max value
         */
        /*int[] arr = new int[] {1, 9, 20, 4, 40, 95, 65};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);*/


        /**
         * search average value arr
         */
        /*int[] arr2 = new int[] {1, 9, 20, 4, 40, 95, 65, 599, 200, 2, 500};
        int sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum = sum + arr2[i];
        }
        double average = (double)sum / (double)arr2.length;
        System.out.println(average);*/


        /**
         * copying values to another array
         */
        /*int[] arr1 = new int[] {1, 9, 20, 4, 40, 95, 65, 599, 200, 2, 500};
        int[] arr2 = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ", ");
        }*/


        /**
         * rearranging array elements in reverse order
         */
        /*int[] arr1 = new int[] {1, 9, 20, 4, 40, 95, 65, 599, 200, 2, 500};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < arr1.length / 2; i++) {
            int temp = arr1[i];
            arr1[i] = arr1[arr1.length - 1 - i]; //arr[0] = arr[10 - 1 - 0] = arr[9]
            arr1[arr1.length - 1 - i] = temp;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ", ");
        }*/

        /**
         * Matrix multiplication by matrix (square matrices)
         * Умножение матрицы на матрицу (квадратные матрицы)
         */
//        int[][] a1 = new int[][] { {1, 40, 30}, {60, 10, 5, 2}, {90, 43, 64}};
//        int[][] a2 = new int[][] { {1, 3, 7}, {2, 5, 5, 2}, {4, 2, 2}};
//        int N = a1.length;
//        int[][] a3 = new int[N][N];
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                //вычисление скалаярного произведения
//                //строки i и столбца j.
//                for (int k = 0; k < N; k++) {
//                    a3[i][j] += a1[i][k] * a2[k][j];
//                }
//            }
//        }

        int[] a = new int[] {5, 10};
        int[] b = a;
        b[0] = 30;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + ", ");
        }
    }
}
