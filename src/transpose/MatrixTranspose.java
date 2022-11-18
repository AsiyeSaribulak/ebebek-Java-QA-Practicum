package transpose;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Satır sayısını giriniz: ");
        int row = scanner.nextInt();
        System.out.println("Sütun sayısını giriniz: ");
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];
        int[][] transpose = new int[col][row];

        for (int i = 0; i < matrix.length; i++){//matrisin elemanlarını teker teker girelim
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(+ i +".Satır " + j +". Sütun: elemanı giriniz: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matris: ");//oluşturduğumuz matrisi yazdıralım
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++){//matrisin transpozunu bulalım
            for (int j = 0; j < matrix[i].length; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transposed matris: ");

        for (int i = 0; i < transpose.length; i++){//transpozu yazdıralım
            for (int j = 0; j < transpose[i].length; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }


    }
}

