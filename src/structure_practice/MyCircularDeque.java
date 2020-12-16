package structure_practice;

public class MyCircularDeque {
	//用动态数组
		private int capacity;
	    private int[] arr;
	    private int front;//定义头尾指针
	    private int rear;


	public MyCircularDeque(int k) {
		capacity = k+1;
		arr = new int[capacity];
		front = 0;//头指针指向第一个存放的元素，插入时先减再赋值
		rear = 0;//尾节点指向下一个元素插入的位置，插入时先赋值再加
		
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
    	if(isFull())return false;
    	front = (front-1+capacity)%capacity;
    	arr[front] = value;
    	return true;
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
    	if(isFull())return false;
    	arr[rear] = value;
    	rear = (rear+1)%capacity;
    	return true;
    	
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
    	if(isEmpty())return false;
    	front = (front+1)%capacity;
    	return true;
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
    	if(isEmpty())return false;
    	rear = (rear-1+capacity)%capacity;
    	return true;

    }
    
    /** Get the front item from the deque. */
    public int getFront() {
    	if(isEmpty())return -1;
    	return arr[front];
    }
    
    /** Get the last item from the deque. */
    public int getRear() {
    	if(isEmpty())return -1;
    	return arr[(rear-1+capacity)%capacity];
    }
    
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
    	return front == rear;
    }
    
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
    	return (rear+1)%capacity == front;//常用写法，判断循环链是否为空
    }
}

