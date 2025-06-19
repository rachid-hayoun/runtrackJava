import java.util.Scanner;

public class job2 {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entré votre prénom");
        String s = sc.nextLine();
        System.out.println("Bonjour" + s);
        sc.close();
}
}