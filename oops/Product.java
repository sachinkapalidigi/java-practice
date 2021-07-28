public class Product {
    private String itemNo; // read only
    private String name; // read only
    private double price;
    private short quantity;

    public Product(String itemNo, String name){
        this.itemNo = itemNo;
        this.name = name;
    }

    public String getItemNo(){
        return this.itemNo;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(short price){
        this.price = price;
    }

    public short getQuantity(){
        return this.quantity;
    }

    public void setQuantity(short quantity){
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        // 
        Product p1 = new Product("#a1", "Book");
        System.out.println(p1.getItemNo());
    }
}
