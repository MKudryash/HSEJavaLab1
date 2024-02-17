package Models;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Сommodity – Товар:
 * Свойства:
 * id – идентификатор; к
 * productCode – Код товара; к
 * name – Наименование; к
 * wholesalePrice – Оптовая цена; к
 * retailPrice – Розничная цена; к
 * description – Описание;
 */
public class Commodity {
    private int id;
    private int productCode;
    private String name;
    private int wholesalePrice;
    private int retailPrice;
    private String description;

    public Commodity(int id, int productCode, String name, int wholesalePrice, int retailPrice, String description) {
        this.setId(id);
        this.setProductCode(productCode);
        this.setName(name);
        this.setWholesalePrice(wholesalePrice);
        this.setRetailPrice(retailPrice);
        this.setDescription(description);
    }

    public String toString() {
        return "Id: '" + this.id + "', ProductCode: '" + this.productCode  +
                "', Name: '" + this.name + "'" + "', WholesalePrice: '" + this.wholesalePrice +
                "', RetailPrice: '" + this.retailPrice + "', Description: '" + this.description+"'";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(int wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(int retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
