package containers;


public class ProductContainerRecorder extends ProductContainer {

    // Attributes
    double initialVolume;
    ContainerHistory historyrecord;
    
    // Constructor
    public ProductContainerRecorder(String productname, double capacity, double initialVolume) {
        
        super(productname, capacity);
        super.addToTheContainer(initialVolume); // Since intial volume was 0, add this as initial vol.
        
        // Activate the History
        historyrecord = new ContainerHistory();
        historyrecord.add(initialVolume);
    }
    
    public String history() {
        
        // Calling the toString method to print out the array.
        return historyrecord.toString();
    }
    
    // Overriding the method from the Container, this time we record it to history
    
    @Override
    public void addToTheContainer(double amount) {
        // If negative number is entered, nothing is changed
        if (amount < 0)
            amount = 0;
        // If amount is larger than current available capacity, rest is thrown away
        if (amount > getCurrentCapacity())
            amount = getCurrentCapacity();
        // Increase the volume of product with the given amount.
        super.volume += amount;
        // Record the volume of the product to the history array.
        historyrecord.add(super.volume);
    }
    
    @Override
    public double takeFromTheContainer(double amount) {
        // If negative number is entered, nothing is changed
        if (amount < 0)
            amount = 0;
        // If amount is larger than the product available, take all available.
        else if (amount > super.getVolume())
            amount = super.getVolume();
        // Subtract the volume of the product with given amount.
        super.volume -= amount;
        // Return the amount which could be taken out from the container.
        historyrecord.add(super.volume);
        return amount; 
    }

    public void printAnalysis() {
        System.out.println("Greatest product amount: " + historyrecord.maxValue() + "\n" +
               "Smallest product amount: " + historyrecord.minValue() + "\n" +
               "Average: " + historyrecord.average() + "\n" +
               "Greatest change: " + historyrecord.greatestFluctuation() + "\n" +
               "Variance: " + historyrecord.variance() + "\n");
    }
        
}
