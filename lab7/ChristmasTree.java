package javalab.lab7;

public class ChristmasTree {
    public int height;
    public String producer;
    public double price;
    public String material;

    private String color;
    private int dateMade;
    private String width;
    private String style;
    private String treeFamily;

    private static final int staticDate = 29;

    protected int discount;
    protected String lightBulbType;


    public ChristmasTree(int height, String producer, double price, String material) {
        this.height = height;
        this.producer = producer;
        this.price = price;
        this.material = material;
    }

    public ChristmasTree(int height, String producer, double price, String material, String color,
                         int dateMade, String width, String style, String treeFamily,
                         int discount, String lightBulbType) {
        this.height = height;
        this.producer = producer;
        this.price = price;
        this.material = material;
        this.color = color;
        this.dateMade = dateMade;
        this.width = width;
        this.style = style;
        this.treeFamily = treeFamily;
        this.discount = discount;
        this.lightBulbType = lightBulbType;
    }

    @Override
    public String toString() {
        return "LAB7.LAB7.ChristmasTree { \n" +
                "Height=" + height + ", \n" +
                "Producer='" + producer + "', \n" +
                "Price=" + price + ", \n" +
                "Material='" + material + "', \n" +
                "Color='" + color + "', \n" +
                "Date Made=" + dateMade + ", \n" +
                "Width='" + width + "', \n" +
                "Style='" + style + "', \n" +
                "Tree Family='" + treeFamily + "', \n" +
                "Discount=" + discount + "%, \n" +
                "Light Bulb Type='" + lightBulbType + "', \n" +
                "} \n";
    }


    public static void printStaticPutUP() {
        System.out.println("Day when should You put up your Christmas tree is " +
                staticDate + " November");
    }

    public void printPutUP() {
        System.out.println("Day when should You put up your Christmas tree is " +
                staticDate + " November");
    }

    public void resetValues(int height, String producer, double price, String material,
                            String color, int dateMade, String width, String style,
                            String treeFamily, int discount, String lightBulbType) {
        new ChristmasTree(height, producer, price, material, color, dateMade, width,
                style, treeFamily, discount, lightBulbType);
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDateMade() {
        return dateMade;
    }

    public void setDateMade(int dateMade) {
        this.dateMade = dateMade;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getTreeFamily() {
        return treeFamily;
    }

    public void setTreeFamily(String treeFamily) {
        this.treeFamily = treeFamily;
    }
}
