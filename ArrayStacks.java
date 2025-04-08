import java.util.Calendar;

public class ArrayStacks{

    //Length of custom array capacity (user Defined)
    protected int capacity;

    //Default Array capacity;
    public static final int CAPACITY = 10;

    //Array to implement stack
    protected int[] stack_rep;

    //Index to top of array
    protected int top = -1;

    //Initialize using default capacity
    public ArrayStacks(){
        this(CAPACITY);
    }

    /** Constructor to initialize using given length
     *Input int value of the size of array
     * @param size
     */
    public ArrayStacks(int size){
        capacity = size;
        stack_rep = new int[capacity];
    }

    /** Returns size of the stack.
     * <br> Time Complexity O(1)
     *
     * @return int size
     */
    public int size() {
        return (top+1);
    }

    /**
     * Adds element to top of array (FILO)
     * <br>Type int
     * <br>Time Complexity of O(1) single operation
     * @param element
     * @throws stackexception
     */
    public void push(int element) throws stackexception{
        try {
            stack_rep[++top] = element;
        }catch (Exception e){
            throw new stackexception("Stack OverFlow Error.");
        }/*finally {
            System.out.println("Attempted to add to stack");
        }*/
    }

    /**
     * Returns the most recent inserted value
     * <br> Time Complexity of O(1) singe operation
     * @return int data
     * @throws stackexception
     */
    public int pop() throws stackexception{
        //Var for saving the popped data
        int data;

        //Finally will run no matter what even with exceptions
        try {
            data = stack_rep[top];
            //Sets the current index to Integer.MIN_VALUE and then decrements to the previous value
            //Unnecessary mainly used for debugging
            stack_rep[top--] = Integer.MIN_VALUE;
            return data;
        }catch (Exception e){
            throw new stackexception("The Stack is Empty.");
        }/*finally {
            //System.out.println("Attempted to remove from stack");
        }*/
    }

    /**
     * Checks if array is empty or 0;
     * <br>Time Complexity O(1) single operation
     * @return boolean true or false
     */
    public boolean isEmpty(){
        return (size() == 0);
    }

    /**
     * Checks if array size is equal to capacity
     * @return boolean true or false
     */
    public boolean isFull(){
        return (size() == capacity);
    }

    /**
     * Gets the most recent value inserted without poping it
     * <br>Time Complexity is O(1)
     *
     * @return last value int
     * @throws stackexception
     */
    public int top() throws stackexception{
        if(isEmpty()){
            throw new stackexception("Stack is Empty");
        }
        return stack_rep[top];
    }

    /**
     * Gets the value after the most recent value or the 2nd value in the stack
     * <br>Time Complexity of O(1)
     * @return int value
     * @throws stackexception
     */
    public int peek() throws stackexception{
        if(top == -1){
            throw new stackexception("Stack underflow Error");
        }
        return stack_rep[top-1];
    }

    /**
     * Deletes the stack
     * <br> Time Complexity of O(1)
     * @throws stackexception
     */
    public void deleteStack() throws  stackexception{
        try {
            stack_rep = null;
            top = -1;
        } catch (Exception e){
            throw new stackexception("Stack not found or stack does not exist");
        }
    }

    /**
     * Worst Case Time Complexity of O(n), n being the number of elements in the array
     * @return string of all the values the the stack
     */
    public String toString(){
        String s = "[";
        if(size() > 0){
            s += stack_rep[0];
        }
        if(size() > 1){
            //Cause of time complexity other are just one
            for(int i = 1; i <= size() - 1; i++){
                s += "," + stack_rep[i];
            }
        }
        return s + "]";
    }

    public static void main(String[] args) throws stackexception{
        int cap = 4;
        ArrayStacks arr = new ArrayStacks(cap);

        for(int i=0; i < cap; i++){
            arr.push(i);
        }
        arr.pop();

        //Comment out for loop to check if it works size should print 0 and isFull should print false
        //isEmpty and isFull can both be false but only one can be true at a time
        System.out.println(arr.toString());
        System.out.println(arr.size());
        System.out.println(arr.isEmpty());
        System.out.println(arr.isFull());
        System.out.println(arr.top());
        System.out.println(arr.peek());

        arr.deleteStack();
        System.out.println(arr);
    }

}
