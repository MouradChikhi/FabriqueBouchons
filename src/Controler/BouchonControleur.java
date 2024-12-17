package Controler;

import Model.*;
import View.BouchonView;

public class BouchonControleur {
        private FabriqueBouchons fabriqueBouchons;
        private BouchonView bouchonView;

        // Constructeur
        public BouchonControleur( BouchonView bouchonView) {
            this.bouchonView = bouchonView;
        }

        // Méthode principale pour exécuter le programme
        public void executer() {
            int choix;
            do {
                bouchonView.afficherMenu();
                choix = bouchonView.lireChoix();

                switch (choix) {
                    case 1:
                        fabriqueBouchons = new FabriqueCapsule();
                        fabriquerBouchon();
                        break;
                    case 2:
                        fabriqueBouchons = new FabriqueBouchonLiege();
                        fabriquerBouchon();
                        break;
                    case 3:
                        fabriqueBouchons = new FabriqueBouchonVis();
                        fabriquerBouchon();
                        break;
                    case 4:
                        bouchonView.afficherMessage("Programme terminé. À bientôt !");

                        break;
                    default:
                        bouchonView.afficherMessage("Choix invalide. Veuillez réessayer.");
                }

            } while (choix != 4);
        }

        // Méthode pour fabriquer un bouchon
        private void fabriquerBouchon() {
            fabriqueBouchons.commanderBouchon().fabriquer();

        }
    }

