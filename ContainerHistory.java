package containers;

import java.util.*;

// Here we develop a specific tool for recording the container situation.
// Since this tool would make the Container class grow too large,
// a new class is created for this.

public class ContainerHistory {

    // Attributes
    private ArrayList<Double> containerHistory;
    
    // Constructor
    public ContainerHistory() {
        // Creates an empty log list
        containerHistory = new ArrayList<>();   
    }
    
    // Methods
    public void add(double situation) {
        this.containerHistory.add(situation);
    }
    
    public void reset() {
        this.containerHistory.clear();
    }
    
    @Override
    public String toString() {
        return this.containerHistory.toString();
    }

    
    /*
     * Implementing analysis methods for this class
    */
    
    public double maxValue() {
        double max = Double.MIN_VALUE;
        for (double value : containerHistory)
            if (value > max)
                max = value;
        return max;
    }
    
    public double minValue() {
        double min = Double.MAX_VALUE;
        for (double value : containerHistory)
            if (value < min)
                min = value;
        return min;
    } 
    
    public double average() {
        int i = 0;
        double sum = 0;
        Iterator<Double> iterator = this.containerHistory.iterator();        
        while (iterator.hasNext()) {
            i += 1; // Count the amount of items in the History list
            sum = sum + iterator.next();
        }
        if (i== 0)
            i = 1;  // No division by 0!
        return (sum / (double)i);
    }   
    
    public double greatestFluctuation() {
        
        // Add here the logic to calcualte the fluctuation.
        // return value 1 for now
        
        return 1.0;
    }
    
    public double variance() {

        // Add here the logic to calcualte the variance.
        // return value 1 for now
        
        return 1.0;
    }
    
}
