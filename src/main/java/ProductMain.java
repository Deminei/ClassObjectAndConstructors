public class ProductMain {
    public static void main(String[] args) {
        //Instantiated Product object
        Product product1 = new Product(10.0, 5, "LED Bow Tie");

        //Product methods called
        product1.printProduct();
        System.out.println("Total Cost is: $" + product1.totalCost());

        System.out.println();
    }
}
