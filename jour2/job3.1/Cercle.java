import java.util.Scanner ;

public class Cercle{
    public int x = 7 ;
    public int y = 12 ;

    public int rayon(){
        return x * y;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Cercle cercle = new Cercle() ;

        System.out.println("Le rayon du cercle est de : " + cercle.rayon());
        sc.close();
    }
}
