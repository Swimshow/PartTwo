package PartTwo;
import AssignmentThree.*;


public class Driver {
//messing around here sorry!
	

	public static void main(String[] args) {
		LinkedListEmployee theList = new LinkedListEmployee();
		theList.addNode(10);
		theList.addNode(5);
		theList.addNode(80);
		theList.printForward();
		// just a test. 
		System.out.println(theList.numberOfElements);
		theList.printBackward();

	}

}
