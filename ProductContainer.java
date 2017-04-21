
package containers;

public class ProductContainer extends Container {

    // Attributes
    private String productname;
    
    // Constructor   
    public ProductContainer(String productname, double capacity) {
        // Capacity is inherited from Container class
        // It will be empty, since this defined in the constructor of the upper class.
        super(capacity);
        // Initalize the product name
        this.productname = productname;
    }
    
    // Accessor: getter
    public String getName() {
        return this.productname;
    }
    
    // Accessor: setter
    public void setName(String name) {
        this.productname = name;
    }

    @Override
    public String toString() {
        return this.productname + ": " + super.toString();
    }
}
