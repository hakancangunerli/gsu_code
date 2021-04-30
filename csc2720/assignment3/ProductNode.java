public class ProductNode{
    ProductNode next;
    String name;
    String locator;
    int quantity;
    float price;
    // these variables will be used throughout the class so they're global 
    
    public ProductNode(){ // the empty constructor,
          name="";
          locator="";
          quantity = 0;
          price = 0;
          next = null;
    }

    public ProductNode(String name, String locator, int quantity, float price){ // constructor with parameters. 
          this.name = name;
          this.locator = locator;
          this.quantity = quantity;
          this.price = price;
          this.next = null;
    }




}