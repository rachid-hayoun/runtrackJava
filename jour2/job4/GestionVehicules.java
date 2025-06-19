import java.util.Scanner ;

public class GestionVehicules {
    public String marque ;
    public String date_achat ;
    public int prix_achat ;
    public int prix_courant ;

    public int setInfos(String marque, String date_achat,int prix_achat){
        this.marque  = marque;
        this.date_achat = date_achat;
        this.prix_achat = prix_achat;
        return this.prix_achat;
    }

    public void print(){
        System.out.println("Marque :"+ marque + "Date d'achat :" + date_achat + "Prix d'achat : ");
    }
public static void main(String [] args){
    GestionVehicules vehicule = new GestionVehicules();
    vehicule.setInfos("Opel Corsa\n", "19/06/2025\n", 2300);
    vehicule.print();

}
}
