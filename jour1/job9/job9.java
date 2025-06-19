import java.util.Scanner;

public class job9 {
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez votre âge : ");
        int age = sc.nextInt();

        if (age < 18){System.out.println("Vous être mineur(e)");}
        else { System.out.println("Vous êtes majeur(e)");}
          sc.close();
    }
}
