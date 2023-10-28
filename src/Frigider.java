public class Frigider {
        private String modelul;
        private String culoare;
        private double anul;
        private double dimensiuni;

        Frigider(String modelul, String culoare, double anul, double dimensiuni) {
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

        public double getDimensiuni() {
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

        public void setDimensiuni(double dimensiuni) {
            this.dimensiuni = dimensiuni;
        }

        public String toString() {
            return  "Frigider:{ \n" +
                    "Modelul: " + this.modelul + "\n" +
                    "Culoarea: " + this.culoare + "\n" +
                    "Anul: " + this.anul + "\n" +
                    "Inaltimea: " + this.dimensiuni + " }";
        }

}
