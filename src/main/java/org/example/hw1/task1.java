package org.example.hw1;

//1. Реализуйте метод, принимающий в качестве аргументов двумерный массив.
//   Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова, детализировать какие строки со столбцами не требуется.
public class task1 {
    public static void main(String[] args) {
        int[][] ints = new int[2][];
        ints[0] = new int[]{0, 1, 2, 3, 4, 5};
        ints[1] = new int[]{9, 8, 7, 6, 12, 11};

        try {
            System.out.println(matrixCount(ints));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Работа продолжена.");
    }


    public static int matrixCount(int[][] matrix) {
        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i].length != matrix.length) {
                    throw new RuntimeException("Массив не квадратный.");
                }

            }
        }
        return result;
    }
}
