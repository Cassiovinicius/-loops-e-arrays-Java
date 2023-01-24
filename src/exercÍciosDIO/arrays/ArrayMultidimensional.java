package exercÍciosDIO.arrays;

import java.util.Random;
/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] Matriz = new int[4][4];

        for(int i = 0; i < Matriz.length; i++){ //for para percorrer espaço  matriz
            for(int j = 0; j < Matriz[i].length;j++){ //for para percorrer espaço dentro da linha
                Matriz[i][j] = random.nextInt(9); // função random adiciona um numero aleatorio na posição do array
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha: Matriz) {
            for (int coluna : linha ) {
                System.out.print(coluna + " ");
            }
        System.out.println();
        }
    }
}
