package com.company;

public class KlasaGlowna {

    private String pole = "Nazwa";

    @Override
    public String toString() {
        return "Testowa{" + "pole" + getPole() + "/" + '}';
    }

    public String getPole() {
        return pole;
    }

    public void setPole(String pole) {
        this.pole = pole;
    }
}
