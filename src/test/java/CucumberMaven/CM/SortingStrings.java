package trainingProgrammes;

import java.util.ArrayList;
import java.util.Collections;

//Sort the strings based on the length of the string in an array
public class SortingStrings {
	int newLength=0;
	 ArrayList<String> newarry=new ArrayList<>();
	 
	void descendingOrder(ArrayList<String> namesList){	
		 while(!namesList.isEmpty()) {
	            String bigger = "";
	            //traverse through the entire list and get the bigger name
	            for(String name : namesList) {
	                if(name.length()>bigger.length()) {
	                    bigger = name;
	                }
	            }  
	            //now add the bigger name into another list
	            newarry.add(bigger);
	            //remove the bigger name from the list so that in the next looping this is not considered
	            while(namesList.contains(bigger)) {
	            	namesList.remove(bigger);
	            }
	        }
         System.out.println("Descending Order--"+newarry);
	}
	
	void ascendingOrder(){
		Collections.reverse(newarry);
		System.out.println("Ascending Order--"+newarry);
	}
  
/*	for(int i=0;i<namesList.size();i++){
		int length=namesList.get(i).length();
		if(length<newLength){
			String temp=
			namesList.set(i-1, namesList.get(i));
			namesList.remove(i);
		}
		newLength=length;
	}
	System.out.println(namesList);*/
	public static void main(String[] args) {
		ArrayList<String> namesList=new ArrayList<>();
		namesList.add("JAVA");
		namesList.add(" C");
		namesList.add("C++");
		namesList.add("GROOVY");
		namesList.add("PHP");
		namesList.add("JAVASCRIPT");
		SortingStrings sort=new SortingStrings();
		sort.descendingOrder(namesList);
		sort.ascendingOrder();
	}

}
