import java.util.Scanner;

public class job5 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Entre 1 valeure : ");
        int n = sc.nextInt();

        System.out.println("Entre 2eme valeure : ");
        int n2 = sc.nextInt();

        System.out.println("Entre 3eme valeure : ");
        int n3 = sc.nextInt();

        if ( n > n2 ) 
        { System.out.println("n est supérieur à n2 ");
        }
        if ( n2 > n3 )
        { System.out.println("n2 est supérieur à n3 ");
        }
        else { System.out.println("n3 est supérieur a n2"); } 
          sc.close();       
    }
}
