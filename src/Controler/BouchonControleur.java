package Controler;

import Model.Bouchon;
import Model.FabriqueBouchons;
import View.BouchonView;

public class BouchonControleur {
        private FabriqueBouchons fabriqueBouchons;
        private BouchonView bouchonView;

        // Constructeur
        public BouchonControleur(FabriqueBouchons fabriqueBouchons, BouchonView bouchonView) {
            this.fabriqueBouchons = fabriqueBouchons;
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
                        fabriquerBouchon("capsule");
                        break;
                    case 2:
                        fabriquerBouchon("bouchonLiege");
                        break;
                    case 3:
                        fabriquerBouchon("bouchonVis");
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
        private void fabriquerBouchon(String typeBouchon) {
                Bouchon bouchon = fabriqueBouchons.fabriquerBouchon(typeBouchon);
                bouchon.fabriquer();

        }
    }

