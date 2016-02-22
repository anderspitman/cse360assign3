
package cse360assign3;

public class Calculator {

    private int total;
    
    /** Default Constructor
     * @author Anders Pitman
     * @return new Calculator
     */
    public Calculator () {
        total = 0;  // not needed - included for clarity
    }
    
    /** Get the total of the calculation.
     * @author Anders Pitman
     * @return total of the calculation
     */
    public int getTotal () {
        return total;
    }
    
    /** Add an integer to the current total
     * @author Anders Pitman
     * @param value integer to add
     */
    public void add (int value) {
        total += value;        
    }
    
    /** Subtract integer from the current total
     * @author Anders Pitman
     * @param value integer to subtract
     */
    public void subtract (int value) {
        total -= value; 
    }
    
    /** Multiply the current total by an integer
     * @author Anders Pitman
     * @param value integer to multiply total by
     */
    public void multiply (int value) {
        total *= value;        
    }
    
    /** Divide the current total by an integer
     * @author Anders Pitman
     * @param value integer to divide total by
     */
    public void divide (int value) {
        if (value == 0) {
            total = 0;
        } 
        else {
            total /= value;
        }
    }
    
    /** Return a string representation of the calculation history
     * @author Anders Pitman
     * @return string representation of calculation history
     */
    public String getHistory () {
        return "";
    }
}
