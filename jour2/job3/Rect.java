import java.util.Scanner;

public class Rect{
    public int largeur;
    public int longueur;

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int surface() {
        return longueur * largeur;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rect rect = new Rect();

        System.out.print("Entrez la longueur : ");
        int l = sc.nextInt();
        rect.setLongueur(l);

        System.out.print("Entrez la largeur : ");
        int w = sc.nextInt();
        rect.setLargeur(w);

        System.out.println("La surface du rectangle est : " + rect.surface());

        sc.close();
    }
}
class Rectcolor extends Rect{
    public int color ;
}
class Figure{
    public int x ;
    public int y ;

    public void print(){
        Scanner sc = new Scanner (System.in);
        Figure figure = new Figure();

        System.out.println("x : " + x + "y : " + y);

        sc.close();
    }
}