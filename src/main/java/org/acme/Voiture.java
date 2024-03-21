package org.acme;

import org.acme.GeneratedMethods;

public class Voiture {
    private double position;
    private double vitesse;

    public Voiture() {
        this.position = 0.0;
        this.vitesse = 0.0;
    }

    public void gauche() {
        Integer deplacement = GeneratedMethods.gauche();
        this.position += deplacement;
    }

    public void droite() {
        Integer deplacement = GeneratedMethods.droite();
        this.position += deplacement;
    }

    public void avancer() {
        // Augmenter la position de la voiture en fonction de sa vitesse
        this.position += this.vitesse;
    }

    public void accelerer(double acceleration) {
        // Augmenter la vitesse de la voiture
        this.vitesse += acceleration;
    }

    public double getPosition() {
        return position;
    }

    public double getVitesse() {
        return vitesse;
    }
}

