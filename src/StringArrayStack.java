public class StringArrayStack {
	
	protected String[] Stack = null;
	protected int pointer;
	
	StringArrayStack(int size){
		Stack = new String[size];
		pointer = 0;
	}
	
	public boolean isEmpty(){
		return pointer == 0;
	}
	
	public void push(String s){
		Stack[pointer] = s;
		pointer++;
	}
	
	public String pop(){
		String s;
		if(isEmpty()){
			System.out.println("Error: Stack Underflow");
			return null;
		}else{
			pointer--;
			s = Stack[pointer];
			Stack[pointer] = null;
			return s;
		}
	}
	/*
	public String peek(){
		String s;
		if(isEmpty()){
			System.out.println("Error: Stack Underflow");
			return null;
		}else{
			s = Stack[pointer-1];
			return s;
		}
	}
	*/
	
	
	
}