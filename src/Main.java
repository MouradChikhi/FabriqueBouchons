import Controler.BouchonControleur;
import Model.FabriqueBouchons;
import View.BouchonView;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FabriqueBouchons fabrique = new FabriqueBouchons();
        BouchonView view = new BouchonView();
        BouchonControleur controleur = new BouchonControleur(fabrique, view);

        controleur.executer();
    }
}