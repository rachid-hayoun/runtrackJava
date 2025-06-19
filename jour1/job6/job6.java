import java.util.Scanner;

public class job6 {
    public static void  main(String[]args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Entrer 1ere valeur : ");
        int n = sc.nextInt();

        System.out.println("Entrer 2eme valeure : ");
        int n2 = sc.nextInt();
        
        System.out.println("Entrer 3eme valeure : ");
        int n3 = sc.nextInt();

        System.out.println("Entrer 4eme valeure : ");
        int n4 = sc.nextInt();

        System.out.println("Entrer 5eme valeure : ");
        int n5 = sc.nextInt();

    int resultat = n + n2 + n3 + n4 + n5;

    System.out.println(resultat /5);
      sc.close();
    }
}
