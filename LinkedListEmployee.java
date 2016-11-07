package PartTwo;



public class LinkedListEmployee {
	EmployeeNode head= null;
	EmployeeNode tail = null; 
	int numberOfElements = 0;
	
	public void addNode(int x) {
		
		if (head == null){
		EmployeeNode newest = new EmployeeNode(x);
		tail=head=newest;
		}else {
			EmployeeNode newest = new EmployeeNode(x, head);
			head=newest;
		}
		
		
	}
	public class EmployeeNode {
		EmployeeNode next = null;
		int id;
		public EmployeeNode(int z) {
			id = z;
			numberOfElements++;
		}
		
		public EmployeeNode(int i, EmployeeNode r) {
			// int i is the  id
			// and a pointer to the next one on the ''right'' 
			numberOfElements++;
			id = i;
			next = r;
			//numberOfElements++;
		}
	
	}
	public void printForward() {
		EmployeeNode ghost;
		ghost =head;
		while (true) {
			System.out.println(ghost.id);
			ghost=ghost.next;
			
			if(ghost==null)break;
		}
		
	}
	public void printBackward() {
		int index = 0;
		EmployeeNode ghost = head;
		
		for (int i = numberOfElements; i > 0; i--) {
			while (index<i-1) {
				ghost=ghost.next;
				index++;
			}
			System.out.println(ghost.id);
			ghost=head;
			index=0;
		}
		
		}
	
}

