public class Caiet {
    private String tipul;
    private String culoare;
    private double foi;
    private String dimensiuni;

    Caiet(String tipul, String culoare, double foi, String dimensiuni) {
        this.tipul = tipul;
        this.culoare = culoare;
        this.foi = foi;
        this.dimensiuni = dimensiuni;
    }

    public String getTipul() {
        return this.tipul;
    }

    public String getCuloare() {
        return this.culoare;
    }

    public double getFoi() {
        return this.foi;
    }

    public String getDimensiuni() {
        return this.dimensiuni;
    }

    public void setTipul(String tipul) {
        this.tipul = tipul;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setFoi(double foi) {
        this.foi = foi;
    }

    public void setDimensiuni(String dimensiuni) {
        this.dimensiuni = dimensiuni;
    }

    public String toString() {
        return "Caiet:{ \nTipul de foi: " + this.tipul + "\nCuloarea: " + this.culoare + "\nNumarul foilor: " + this.foi + "\nDimensiunile caietului: " + this.dimensiuni + " }";
    }
}
