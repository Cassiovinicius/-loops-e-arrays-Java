package exercÍciosDIO.arrays;

import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random(); // objeto random criando para voltar numeros aleatorios //
        int[] numerosAleatorios = new int[20];  //criando array de 20 numeros
        
        for(int i=0;i < numerosAleatorios.length;i++){ //laço for para armazenar os numeros no array
            int numeros = random.nextInt(100);
            numerosAleatorios[i] = numeros; // armazenado os numeros na posição do array
            System.out.print(numerosAleatorios[i]+" "); //impressão do array com numeros armazeando na posição i 
        }
        System.out.print("\nNumeros Aleatorios: "); 
        for (int numero : numerosAleatorios) {   // foreach para mostra o array fora do laço 
            System.out.print(numero + " ");
        }
        System.out.print("\nNumeros antecessores: ");
        for (int numero : numerosAleatorios) { // foreach para mostra o array fora do laço com adição de + 1
            System.out.print(numero - 1 + " ");
        }
        System.out.print("\nNumeros sucessores: ");
        for (int numero : numerosAleatorios) {  // foreach para mostra o array fora do laço com adição de -1
            System.out.print(numero + 1 + " ");
        }

       } 
    }

