package mx.edu.uttt.Matrices;

public class Auto {
    private  String model;
    private int milesDriven;
    private double gallonOfGas;

    public Auto() {
        this.model = "Unknow";
    }

    public Auto(String model, double gallonOfGas, int milesDriven) {
        this.model = model;
        this.setGallonOfGas( gallonOfGas);
        this.setMilesDriven(milesDriven);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMilesDriven() {
        return milesDriven;
    }

    public void setMilesDriven(int milesDriven) {
        if(milesDriven >= 0) {
            this.milesDriven = milesDriven;
        }else{
            System.out.println("Miles driven cannot be negative");
            System.out.println("Value not charged");
        }
    }

    public double getGallonOfGas() {
        return gallonOfGas;
    }

    public void setGallonOfGas(double gallonOfGas) {
        if(gallonOfGas >= 0.0) {
            this.gallonOfGas = gallonOfGas;
        }else {
            System.out.println("Galons Of Gas cannot be negatuve");
            System.out.println("galons Of Gas Not Changed");
        }
    }

    public double calculateMilesPerGallon(){
        if(gallonOfGas != 0.0){
            return milesDriven / gallonOfGas;

        }else{
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", milesDriven=" + milesDriven +
                ", gallonOfGas=" + gallonOfGas +
                '}';
    }
}
