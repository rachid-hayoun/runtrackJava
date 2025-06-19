import java.util.Scanner;

public class job4{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entré un chiffre, je vous donnerai son carré :");
        int nombre = sc.nextInt();
        int carre = nombre * nombre ;
        System.out.println("Votre nombre est : " + nombre  + " et le carré de ce nombre est :" + carre);
        sc.close();
    }
}