import Controler.BouchonControleur;
import Model.FabriqueBouchons;
import View.BouchonView;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BouchonView view = new BouchonView();
        BouchonControleur controleur = new BouchonControleur(view);

        controleur.executer();
    }
}