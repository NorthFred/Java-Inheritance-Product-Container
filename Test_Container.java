
package containers;


public class Test_Container {
 
    public static void main (String[] args) {
        
        // Create a new bottle container with 2 L volume
        Container bottle = new Container(2);
        
        bottle.addToTheContainer(0.5);
        bottle.addToTheContainer(1);
        bottle.takeFromTheContainer(0.2);
        
        System.out.println(bottle);
    }
}
