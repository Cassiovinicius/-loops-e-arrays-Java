package exercÍciosDIO.arrays;

import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[5]; // a variavel consoante vai receber um array de string de 6 espaço
        int quantidadeConsoantes = 0; // esta variavel recebera a quantidade a cada rodada com + 1
        int count = 0; // variavel contador começa com zero
        do{
            System.out.println("Letra: "); 
            String letra = scan.next(); // criada a variavel letra para receber a entrada

            if( !(letra.equalsIgnoreCase("a") |    //usado o sinal de negação "!" para ignora quando receber a consoantes.
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u") 
            )){
                consoantes[count] = letra; // a variavel consoantes vai receber cada letra na posição de count, e vai armazenar.
                quantidadeConsoantes++; // apos receber a letra se não for vogal "a,e,i,o,u" ela vai adicionar mais 1.
            }
            count++;
        }while(count < consoantes.length); // apos atigir a contagem de 6 "tamanho do array" se encerra.
        
        System.out.print("consoantes: ");
        for (String consoante: consoantes) { // agora para imprimir os valores usamos um foreach para comparar e eliminar o null do array
            if(consoante !=null) // se consoante for diferente de null escreva 
              System.out.print(consoante+" "); //  a cada rodada ate final do laço vai escrever as consoantes
        }
    }
}
