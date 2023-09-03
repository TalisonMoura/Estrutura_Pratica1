import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Questao1();
        Questao2();

    }

    static void Questao1(){
        Random numRandon = new Random();
        Scanner ler = new Scanner(System.in);
        int vet[] = new int[10];

        for (int i = 0; i < 10; i++){
            vet[i] = numRandon.nextInt(999);
            System.out.print(vet[i] + "|");
        }
        System.out.print("\nInsira um número, para buscar no vetor: ");
        int num = ler.nextInt();
        boolean encontrado = false;
        int i = 0;
        for (i = 0; i < 10; i++){
            if(num == vet[i]){
                encontrado = true;
                break;
            }
        }
        if(encontrado)
            System.out.print("Posição do meliante: " + i);
        else
            System.out.println("Não localizado!");
    }
    static void Questao2(){
        Random numRandon = new Random();
        Scanner ler = new Scanner(System.in);
        int[] vet = new int[50];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = numRandon.nextInt(99);
        }
        int aux = 0;

        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length - 1; j++) {
                if(vet[j] > vet[j + 1]){
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
        System.out.print("\nInsira um número, para buscar no vetor: ");
        int num = ler.nextInt();
        BublleSort(num,vet);
    }
    private static void BublleSort(int find, int[] num) {
        int inicio = 0;
        int meio = 0;
        int fim = num.length - 1;
        boolean encontrado = false;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (num[meio] == find) {
                System.out.println("Número encontrado!");
                encontrado = true;
            }
            if (num[meio] < find) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        if(!encontrado)
            System.out.println("Não encontrou o número: " + find);
    }
}