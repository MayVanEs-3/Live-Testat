import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Collatz {
	int number;
	int ungerade;
	int gerade;
	int newNumber;
	
	StringArrayStack stack = new StringArrayStack(number);
	
	//ArrayList<Integer> numberList = new ArrayList<>();
	//ListIterator<Integer> iterator = numberList.listIterator();
	
	
	public int FormelZurBerechnung(int number){
		ungerade = number+1;
		gerade = number;
		
		if(number != 0){
			if(number == ungerade){
				return newNumber = (3* number)+1;
			}else{
				if(number == gerade){
					return newNumber = number/2;
				}
			}
		}
		return number;
	}
	protected String[] Stack = null;
	protected int pointer;
	
	
	public boolean isEmpty(){
		return pointer == 0;
	}
	
	public void push(int number){
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
		

	
}
