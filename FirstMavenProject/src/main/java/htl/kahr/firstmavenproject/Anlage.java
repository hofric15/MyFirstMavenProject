package htl.kahr.firstmavenproject;

public class Anlage {

    private double anschaffungswert;
    private int nutzungsdauer;
    private double buchwert;

    public Anlage(double anschaffungswert, int nutzungsdauer) {
        this.anschaffungswert = anschaffungswert;
        this.nutzungsdauer = nutzungsdauer;
    }

    public double jahresAfa() {
        return anschaffungswert / nutzungsdauer;
    }

    public void updateBuchwert(int jahreGenutzt) {

        buchwert = anschaffungswert - (jahresAfa() * jahreGenutzt);
        //return this.jahresAfa()*jahreGenutzt;
        if (jahreGenutzt > nutzungsdauer) {
            buchwert = 1.0;
        }
    }

    public double getAnschaffungswert() {
        return anschaffungswert;
    }

    public int getNutzungsdauer() {
        return nutzungsdauer;
    }

    public double getBuchwert() {
        return buchwert;
    }

}
