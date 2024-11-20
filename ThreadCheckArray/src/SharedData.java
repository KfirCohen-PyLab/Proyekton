/**
 * The SharedData class is a container for shared data used in a multi-threaded 
 * or collaborative environment. It includes an integer array, a boolean array, 
 * a boolean flag, and a constant integer value.
 */
public class SharedData {

    private int[] array;        // Stores an array of integers
    private boolean[] winArray; // Stores an array of boolean values, typically used to track results
    private boolean flag;       // A boolean flag, potentially used for control or status signaling
    private final int b;        // A constant integer value, initialized during object creation

    /**
     * Constructs a SharedData object with the specified integer array and constant value.
     *
     * @param array the integer array to be stored
     * @param b     the constant integer value to be assigned
     */
    public SharedData(int[] array, int b) {
        this.array = array;
        this.b = b;
    }

    /**
     * Retrieves the boolean array used for tracking results or states.
     *
     * @return the boolean array
     */
    public boolean[] getWinArray() {
        return winArray;
    }

    /**
     * Sets the boolean array used for tracking results or states.
     *
     * @param winArray the boolean array to be set
     */
    public void setWinArray(boolean[] winArray) {
        this.winArray = winArray;
    }

    /**
     * Retrieves the integer array.
     *
     * @return the integer array
     */
    public int[] getArray() {
        return array;
    }

    /**
     * Retrieves the constant integer value.
     *
     * @return the constant integer value
     */
    public int getB() {
        return b;
    }

    /**
     * Retrieves the boolean flag.
     *
     * @return the boolean flag
     */
    public boolean getFlag() {
        return flag;
    }

    /**
     * Sets the boolean flag to the specified value.
     *
     * @param flag the new value for the boolean flag
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
