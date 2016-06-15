import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;


public class Collatz  {
	List<Integer> numberList = new ArrayList<Integer>();
	Iterator<Integer> iterator = numberList.iterator();
	
	int number;
	int ungerade;
	int gerade;
	int newNumber;
	
	
	public int FormelZurBerechnung(int number){
		ungerade = number+1;
		gerade = number;
		
		while(number!=0 && number >= 1){
			if(number == ungerade){
				 newNumber = (3* number)+1;
				 numberList.add(newNumber);
				 return newNumber;
			}else{
				if(number == gerade){
					 newNumber = number/2;
					 numberList.add(newNumber);
					 return newNumber;
				}
			}
		}
		return newNumber ;
		
	}
	
}
