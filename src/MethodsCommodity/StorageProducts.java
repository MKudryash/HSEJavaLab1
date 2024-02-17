package MethodsCommodity;

import Models.Commodity;

import java.util.ArrayList;

public class StorageProducts {
    private ArrayList<Commodity> commodityArrayList;

    public StorageProducts(ArrayList<Commodity> commodityArrayList) {
        this.commodityArrayList = commodityArrayList;
    }

    public void addElement(Commodity commodity) {
        commodityArrayList.add(commodity);
    }

    public void printArrayCommodity() {
        for (Commodity commodities : commodityArrayList)
            System.out.printf("Id: '" + commodities.getId() + "', ProductCode: '" + commodities.getProductCode() +
                    "', Name: '" + commodities.getName() + "'" + "', WholesalePrice: '" + commodities.getWholesalePrice() +
                    "', RetailPrice: '" + commodities.getRetailPrice() + "', Description: '" + commodities.getDescription() + "'\n");
    }

    public ArrayList<Commodity> getCommodityArrayList() {
        return commodityArrayList;
    }

    public void setCommodityArrayList(ArrayList<Commodity> commodityArrayList) {
        this.commodityArrayList = commodityArrayList;
    }
}
