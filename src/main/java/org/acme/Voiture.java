package org.acme;
import java.util.Scanner;


public class Voiture {
    private int positionX;
    private int positionY;
    // 0: nord, 1: est, 2: sud, 3: ouest
    private int direction;
    //en litre, initialisé à 60
    private int niveauCarburant;

    public Voiture() {
        this.niveauCarburant = 60;
        this.direction = 0;
        this.positionX = 0;
        this.positionY = 0;
    }

    public void simulation() {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean running = true;

        while (running) {
            System.out.print("Entrez une commande (avancer(z), reculer(s), gauche(q), droite(d)): ");
            input = scanner.nextLine();

            switch (input.toLowerCase()) {
                case "z":
                    avancer();
                    break;
                case "s":
                    reculer();
                    break;
                case "q":
                    tournerGauche();
                    break;
                case "d":
                    tournerDroite();
                    break;
                case "x":
                    running = false;
                    break;
                default:
                    System.out.println("Commande non reconnue.");
            }

            afficherPosition();
        }
    }

    public void avancer() {
        this.positionY+=1;
    }
    public void reculer() {
        this.positionY-=1;

    }
    public void tournerGauche() {
        direction = (direction + 3) % 4;
    }

    public void tournerDroite() {
        direction = (direction + 1) % 4;
    }

    // Méthode pour gérer la recharge de carburant à la station-service
    public void rechargerCarburant() {}

    public void afficherPosition() {
        System.out.println("Position actuelle : (" + positionX + ", " + positionY + ")");
        System.out.print("Direction actuelle : ");
        switch (direction) {
            case 0:
                System.out.println("Nord");
                break;
            case 1:
                System.out.println("Est");
                break;
            case 2:
                System.out.println("Sud");
                break;
            case 3:
                System.out.println("Ouest");
                break;
            default:
                System.out.println("Direction inconnue");
        }
    }
}

