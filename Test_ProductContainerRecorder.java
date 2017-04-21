package containers;


public class Test_ProductContainerRecorder {

    public static void main (String[] args) {
        
        ProductContainerRecorder juice = new ProductContainerRecorder("Juice", 1000.0, 800.0);
        juice.takeFromTheContainer(100);
        juice.takeFromTheContainer(100);
        juice.addToTheContainer(210);
        juice.addToTheContainer(25);
        juice.takeFromTheContainer(100);
        juice.addToTheContainer(50);
        
        System.out.println(juice);           // Juice: volume = 989.7, free space 10.3
        
        // history() does not work properly, yet:
        System.out.println(juice.history()); // [1000.0]
           // in fact, we only retrieve the original value which was given to the constructor...

        juice.printAnalysis();
    
    }
    

}
