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
	/*
	public void addNumbers(){
		for(int number: numberList){
			numberList.addAll(number, numberList);
		}
	}
	*/

	
}
