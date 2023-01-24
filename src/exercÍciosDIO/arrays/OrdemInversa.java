package exercÍciosDIO.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class OrdemInversa {
    public static void main(String[] args) {
        
        int[] vetor = {-5, -6, 15, 50, 8, 4};

        System.out.println(vetor.length); //observe que ele vai mostra a posição do vetro na memoria e não os numeros do
        System.out.print("vetor: ");
        int count = 0;
        while(count < (vetor.length-1)){
            System.out.print(vetor[count]+" ");
            count++;
        }
        System.out.print("\nvetor: ");
        for(int i = (vetor.length -1); i >=  0; i--){ // o contador recebe o tamano do meu vetor, depois tem que pecorrer ate chegar em 0; e cada rodada tira diminuit o contador ate chegar em zero.
            System.out.print(vetor[i]+ ","); // agora mostro o vetor na posição i para ver o numero dentro
        }
    }
}
