package Models;

import java.sql.Time;

public class PerishableGoods extends Commodity{

   private Time maximumStorageTime;
    public PerishableGoods(int id, int productCode, String name, int wholesalePrice, int retailPrice, String description, Time maximumStorageTime) {
        super(id, productCode, name, wholesalePrice, retailPrice, description);
        this.maximumStorageTime = maximumStorageTime;
    }

    public Time getMaximumStorageTime() {
        return maximumStorageTime;
    }

    public void setMaximumStorageTime(Time maximumStorageTime) {
        this.maximumStorageTime = maximumStorageTime;
    }
}
