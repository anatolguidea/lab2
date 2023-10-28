public class Parfum {
    private String mirosul;
    private String culoare;
    private String genul;
    private double volumL;
    private String firma;

    Parfum(String mirosul, String culoare, String genul, double volumL, String firma) {
        this.mirosul = mirosul;
        this.culoare = culoare;
        this.genul = genul;
        this.volumL = volumL;
        this.firma = firma;
    }

    public String getMirosul() {
        return this.mirosul;
    }

    public String getCuloare() {
        return this.culoare;
    }

    public String getGenul() {
        return this.genul;
    }

    public double getVolumL() {
        return this.volumL;
    }

    public String getFirma() {
        return this.firma;
    }

    public void setMirosul(String mirosul) {
        this.mirosul = mirosul;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setGenul(String genul) {
        this.genul = genul;
    }

    public void setVolumL(double volumL) {
        this.volumL = volumL;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String toString() {
        return "parfum: { \nmirosul: " + this.mirosul + "\nculoarea: " + this.culoare + "\ngenul: " + this.genul + "\nvolumul: " + this.volumL + "\nfirma: " + this.firma + "}";
    }
}
