public class Masina {
    private String modelul;
    private String culoare;
    private double anul;
    private String dimensiuni;

    Masina(String modelul, String culoare, double anul, String dimensiuni) {
        this.modelul = modelul;
        this.culoare = culoare;
        this.anul = anul;
        this.dimensiuni = dimensiuni;
    }

    public String getModelul() {
        return this.modelul;
    }

    public String getCuloare() {
        return this.culoare;
    }

    public double getAnul() {
        return this.anul;
    }

    public String getDimensiuni() {
        return this.dimensiuni;
    }

    public void setModelul(String modelul) {
        this.modelul = modelul;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setAnul(double anul) {
        this.anul = anul;
    }

    public void setDimensiuni(String dimensiuni) {
        this.dimensiuni = dimensiuni;
    }

    public String toString() {
        return  "Masina:{ \n" +
                "Modelul: " + this.modelul + "\n" +
                "Culoarea: " + this.culoare + "\n" +
                "Anul: " + this.anul + "\n" +
                "Tipul caroseriei: " + this.dimensiuni + " }";
    }

}
