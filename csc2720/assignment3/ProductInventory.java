public class ProductInventory {
    class ProductException extends RuntimeException {
        public ProductException(String s) {
            super(s);
        }
    }

    ProductNode inventoryHead = new ProductNode();
    // init the Inventory Head, to be used by the linkedlist

    public void showInventory() {// print inventory
        if (inventoryHead.next != null) { // if the head is not null, print the products available formatted properly

            System.out.printf("\n%50s%20s%15s%15s", "Product Name", "Locator", "Quantity", "Price"); // print the table
                                                                                                     // shape
            System.out
                    .println("\n-------------------------------------------------------------------------------------");
            ProductNode curr = inventoryHead.next;
            while (curr != null) // until nodes are not null, (when we reach to the end, )
            {
                System.out.printf("%50s%50s%15d%15.2f\n", curr.name, curr.locator, curr.quantity, curr.price); // print
                                                                                                               // the
                                                                                                               // inventories
                curr = curr.next;
            }
        } else {
            throw new ProductException("Empty Inventory"); // if there are no products, throw exc
        }
    }

    public int getTotalQuantity()
    // total quantity available in the inv
    {
        int totQuant = 0; // will be used for iterationg
        if (inventoryHead.next != null) {
            ProductNode curr = inventoryHead.next;
            while (curr != null) { // iterate through each node
                totQuant += curr.quantity; // add quantity
                curr = curr.next; // go the next one
            }
        }
        return totQuant; // return res
    }

    int totalProduct = 0; // a variable for debugging

    public ProductNode removeMaximum() { // remove max node present
        ProductNode maxNodeLast = null; // var to be used before prev node
        ProductNode maxNode = null; // empty var that will be used

        if (inventoryHead.next != null) 
        {
            // go until the end
            ProductNode curr = inventoryHead.next;
            ProductNode prev = inventoryHead;
            maxNode = curr; // this will be used for maximum node
            maxNodeLast = prev;
            while (curr != null) 
            { // iterate thorough all
                if (maxNode.quantity < curr.quantity) 
                { // if it's bigger store. simple temp bubblesort like stuff
                    maxNodeLast = prev; // save last node from max
                    maxNode = curr; // save node
                }
                prev = curr; // iterate
                curr = curr.next; // iterate
            }
            maxNodeLast.next = maxNode.next;
            totalProduct--;
        }
        return maxNode; // returning the max node
    }

    public void sortInventory() 
    { // sort inven with max quantity and min quantity
        if (inventoryHead.next != null) {
            ProductInventory sortInvNode = new ProductInventory();
            while (inventoryHead.next != null) 
            { // iteration
                ProductNode maxNode = removeMaximum(); // find max node using removeMax defined above
                // add it to the front
                sortInvNode.addProduct(maxNode.name, maxNode.locator, maxNode.quantity, maxNode.price);

            }
            inventoryHead.next = sortInvNode.inventoryHead.next; // iterate
        }
    }

    public void addProduct(String productName, String locator, int quantity, float price) 
    {
        ProductNode node = new ProductNode(productName, locator, quantity, price); // create node using const
        if (inventoryHead == null) // the node is inventory head if it's the first node available
        {
            inventoryHead = node;
        } else {
            ProductNode last = inventoryHead; // start from the last
            while (last.next != null)
             { // iterate
                last = last.next; // assign to next
            }
            last.next = node; // or assign to node if last.next is null
        }
    }

    public void removeProduct(String productName, String locator) 
    {
        if (inventoryHead.next != null) 
        { // iterate until end, it's not like addProduct
            ProductNode curr = inventoryHead.next; // temp variable, kinda like locators of Pointer in C++
            ProductNode prev = inventoryHead; // temp variable, kinda like locators of Pointer in C++
            while (curr != null)
            { // iterate
                if (curr.name.equalsIgnoreCase(productName) && curr.locator.equalsIgnoreCase(locator)) 
                { // find the product to remove
                    if (prev == inventoryHead) 
                    { // if matched, remove
                        inventoryHead.next = curr.next;
                    } 
                    else 
                    {
                        prev.next = curr.next; // if not continue
                    }
                    break;
                }
                prev = curr;
                curr = curr.next;
            }
            totalProduct--; // will be used for debug
        }
    }

    public int countNeededQuantity(String productName, int neededQuantity) 
    {
        // simple quantity needed pass value - current val
        int quant = countTotalQuant(productName); // call the method below, using the value from there if it's less than
                                                  // required quantity
        if (quant < neededQuantity)
        {
            return (neededQuantity - quant); // return it if it's less than needed quantity
        }
        return 0;
    }

    public int countTotalQuant(String productName) 
    {
        int totalQuantity = 0; // will be used for curr quantity
        if (inventoryHead.next != null) 
        {
            ProductNode curr = inventoryHead.next;
            while (curr != null) 
            {
                if (curr.name.equalsIgnoreCase(productName)) 
                {
                    totalQuantity += curr.quantity; // get the total quantity for that specific node we're talking
                                                    // about, the Productname
                }
                curr = curr.next;
            }
        }
        return totalQuantity; // return total quantity
    }

}