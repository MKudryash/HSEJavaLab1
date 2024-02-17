package Models;

public class OverallProduct extends Commodity{
    private int height;
    private int width;
    private int length;
    public OverallProduct(int id, int productCode, String name, int wholesalePrice, int retailPrice, String description, int height, int width, int length) {
        super(id, productCode, name, wholesalePrice, retailPrice, description);
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
