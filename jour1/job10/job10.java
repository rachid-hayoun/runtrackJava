import java.util.Scanner;

public class job10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un entier positif : ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("La factorielle n'est définie que pour les entiers positifs.");
        } else {
            long factorielle = 1;
            for (int i = 1; i <= n; i++) {
                factorielle *= i;
            }

            System.out.println("La factorielle de " + n + " est : " + factorielle);
        }

        sc.close();
    }
}
