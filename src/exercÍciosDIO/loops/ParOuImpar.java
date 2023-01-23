package exercÍciosDIO.loops;
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int count = 0;
        int quantPares = 0,quantImpares = 0;

        System.out.println("quantidades de numeros: ");
        quantNumeros = scan.nextInt();
    
        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if(numero % 2 == 0)quantPares++;
            else quantImpares ++;

            count++;
        }while(count < quantNumeros);

        System.out.println("A quantidade de pares é "+ quantPares);
        System.out.println("A quantidade impares é "+ quantImpares);
    }
}
