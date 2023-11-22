package core;

public class Stack implements IStack {
	
    private int maxSize;
    private Object[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new Object[maxSize];
        this.top = -1;
    }
    
    public boolean isEmpty() {
        if(top == -1) {
        	return true;
        }
        else {
        	return false;
        }
    }

	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	
    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(Object value) {
        if (top == -1 || value.getClass().equals(stackArray[top].getClass())) {
            top++;
            stackArray[top] = value;
        }
        else {
        	throw new RuntimeException("All elements in the stack must be of the same type.");
        }
    }
    public Object getTop() {
        if (top >= 0) {
            return stackArray[top];
        } 
        else {
            return 0;
        }
    }
    public Object pop() {
        if (top >= 0) { 
            Object value = stackArray[top];
            top--;
            return value;
        } else {
            return -1;
        }
    }
}
