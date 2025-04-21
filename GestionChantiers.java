package org.example;

import java.util.ArrayList;
import java.util.List;

public class GestionChantiers {
    private List<Ouvriers> ouvriers;

    public GestionChantiers() {
        this.ouvriers = new ArrayList<>();
    }

    public void ajouterOuvrier(Ouvriers ouvrier) {
        ouvriers.add(ouvrier);
        System.out.println("✅ Ouvrier ajouté avec succès !");
    }

    public void afficherOuvriers() {
        if (ouvriers.isEmpty()) {
            System.out.println("❌ Aucun ouvrier enregistré.");
        } else {
            for (Ouvriers o : ouvriers) {
                o.afficherInfos();
                System.out.println("--------------------------");
            }
        }
    }
}

