package View;

import java.util.Scanner;

public class BouchonView {
    private Scanner scanner = new Scanner(System.in);


    public void afficherMenu() {
        System.out.println("\n********** Fabrication de Bouchons **********");
        System.out.println("1. Créer des capsules");
        System.out.println("2. Créer des bouchons en liege");
        System.out.println("3. Créer des bouchons a visser");
        System.out.println("4. Quitter");
        System.out.print("Votre choix : ");
    }


    public int lireChoix() {
        try{
            return Integer.parseInt(scanner.nextLine());
        }
        catch(Exception e){
            return 0;
        }
    }


    public void afficherMessage(String message) {
        System.out.println(message);
    }
}
