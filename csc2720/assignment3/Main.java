public class Main { // Inventory Class
  public static void main(String[] args) {
    ProductInventory inventory = new ProductInventory();
    inventory.addProduct("Xbox One", "shelf2", 25, 500.32f);

    inventory.addProduct("Apple iphone 7 plus 32gb rose gold", "box1", 10, 699.80f); // Add Products to inventory
    inventory.addProduct("Apple iphone 7 plus 32gb rose gold", "shelf3", 4, 699.80f);// Add Products to inventory

    inventory.addProduct("Microsoft Office 360 ", "box15", 30, 122.90f); // Add Products to inventory

    inventory.showInventory(); // display the inventory

    inventory.sortInventory(); // Sorts products in inventory based on quantity avail
    inventory.showInventory(); // display it again inventory

    System.out.println(inventory.countTotalQuant("Apple iphone 7 plus 32gb rose gold"));
    System.out.println(inventory.countNeededQuantity("Apple iphone 7 plus 32gb rose gold", 101));

    inventory.removeMaximum(); // Removes Product with Maximum Quantity
    inventory.removeProduct("Apple iphone 7 plus 32gb rose gold", "shelf4");

    inventory.showInventory(); // display it again inventory
    System.out.println(inventory.getTotalQuantity());
  }
}