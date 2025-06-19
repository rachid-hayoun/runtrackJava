import java.util.Scanner;

public class job8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un entier n : ");
        int n = sc.nextInt();

        int somme = 0;

        for (int i = 1; i <= n; i++) {
            somme += i * i * i; 
        }

        System.out.println("La somme des " + n + " premiers cubes est : " + somme);

        sc.close();
    }
}

