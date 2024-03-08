package org.acme;

import io.quarkus.logging.Log;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;

public class MyApp  implements QuarkusApplication {

    @Override
    public int run(String... args) throws Exception {
        System.out.println("Do startup logic here");
        Log.info("Do startup logic here");

        Voiture voiture = new Voiture();
        voiture.simulation();

        Quarkus.waitForExit();
        return 0;
    }

    void animateGameTitle() {
        String title = gameTitle();
        int position = 0;

        while (true) {
            System.out.print("\r");
            System.out.flush();
            System.out.print(title.substring(position) + title.substring(0, position));
            position = (position + 1) % title.length();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    String gameTitle(String t,int position) {
        int pTemp = Math.max(position,2);
        if (position>5) pTemp = 5;
        return "#".repeat(pTemp)+t;
    }

    String gameTitle() {
        return gameTitle("carmageddon", 5);
    }
}