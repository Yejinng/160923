

public class MyStack<T> implements Stack<T> {
	//머지...................................................
	private int i;
	private String push;
	private String pop;
	private int size;
	private int top;
	private T[] buffer;
	
	public MyStack(int size){
		resize(size);
		
	}

	public void resize(int size){
		
		T[] tempBuffer = (T[])new Object[size];
//		String[] tempBuffer = new String[size];
		for(int i=0; i<top; i++){
			tempBuffer[i] = buffer[i];
		}
		buffer = tempBuffer;
		this.size = size;
	}
	
	@Override
	public void push(T item) {
		if(top ==size){
			resize(size*2);
		} 
		buffer[top++] = item;
		
	}

	@Override
	public T pop() throws MyStackException {
		if(top == 0){
			throw new MyStackException();
		}return buffer[--top]; 
		
	}

	@Override
	public boolean isEmpty() {
		
		return top==0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return top;
	}

}
