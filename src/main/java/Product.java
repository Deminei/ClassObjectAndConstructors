public class Product {//Class with 3 attributes
    public double productCost;
    public int quantity;
    public String productName;

    //Constructor
    public Product(double productCost, int quantity, String productName) {
        this.productCost = productCost;
        this.quantity = quantity;
        this.productName = productName;
    }

    //Methods
    public double totalCost() {
        return productCost * quantity;
    }

    public void printProduct() {
        System.out.println(productName +" costs: $"+ productCost +" and "+ quantity +" units were purchased");

    }
}


