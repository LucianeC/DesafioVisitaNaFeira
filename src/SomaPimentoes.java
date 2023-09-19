import java.util.Scanner;

public class SomaPimentoes {
    public static void main(String[] args) {
        Scanner valorPimentoesA = new Scanner(System.in);
        System.out.println("Valor de Pimentões Amarelo:");
        int A = valorPimentoesA.nextInt();
        System.out.println("Valor de Pimentões Vermelho: ");
        Scanner valorPimentoesB = new Scanner(System.in);
        int B = valorPimentoesB.nextInt();

        int X = A + B;
        System.out.println("X =" + X);
    }
}
