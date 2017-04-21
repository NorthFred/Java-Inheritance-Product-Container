
package containers;


public class Container {

    // Attributes
    protected double capacity;      // capacity won't change once set.
    protected double volume;      // volume of product in the container
    
    // Constructor
    public Container(double capacity) {
        // Calling the capacity setter
        capacity(capacity);
        // Initial product in the container is 0.
        this.volume = 0; 
    }
    
    // Accessor: Setter
    public void capacity(double cap) {
        
        if (cap <= 0)
            this.capacity = 0;
        else
            this.capacity = cap;
    }
    
    // Accessor: Getter
    public double getVolume() {
        return this.volume;
    }
    
    // Accessor: Getter
    public double getOriginalCapacity() {
        return this.capacity;
    }
    
    public double getCurrentCapacity() {
        // Current capacity is original capacity minus product volume
        return (getOriginalCapacity() - getVolume());
    }
    
    // Methods
    public void addToTheContainer(double amount) {
        // If negative number is entered, nothing is changed
        if (amount < 0)
            amount = 0;
        // If amount is larger than current available capacity, rest is thrown away
        if (amount > getCurrentCapacity())
            amount = getCurrentCapacity();
        // Increase the volume of product with the given amount.
        this.volume += amount;
    }
    
    public double takeFromTheContainer(double amount) {
        // If negative number is entered, nothing is changed
        if (amount < 0)
            amount = 0;
        // If amount is larger than the product available, take all available.
        else if (amount > getVolume())
            amount = getVolume();
        // Subtract the volume of the product with given amount.
        this.volume -= amount;
        // Return the amount which could be taken out from the container.
        return amount; 
    }
    
    @Override
    public String toString() {
        return "volume = " + getVolume() + ", free space = " + getCurrentCapacity();
    }
}
