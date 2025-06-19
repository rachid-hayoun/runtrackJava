import java.util.Scanner;

public class job13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisissez un nombre n (<= 9) : ");
        int n = sc.nextInt();

        if (n <= 9 && n >= 0) {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Table de " + i + " = " + (n * i));
            }
        } else {
            System.out.println("Le nombre doit être compris entre 0 et 9, réessayez !");
        }
        sc.close();
    }
  
}
