package Models;

public class FragileGoods extends Commodity{
   private double theBrittlenessCoefficient;

    public FragileGoods(int id, int productCode, String name, int wholesalePrice, int retailPrice, String description, double theBrittlenessCoefficient) {
        super(id, productCode, name, wholesalePrice, retailPrice, description);
        this.theBrittlenessCoefficient = theBrittlenessCoefficient;
    }

    public double getTheBrittlenessCoefficient() {
        return theBrittlenessCoefficient;
    }

    public void setTheBrittlenessCoefficient(double theBrittlenessCoefficient) {
        this.theBrittlenessCoefficient = theBrittlenessCoefficient;
    }
}
