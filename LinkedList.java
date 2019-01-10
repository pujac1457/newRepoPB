import java.util.HashSet;


import java.util.Set;

public class LinkedList {
	Node head;
	class Node {
		Node next;
		int val;
		public Node(int x){
			val=x;
		}
	}	
	public void main (String args[]){
		LinkedList newList=new LinkedList();
		newList.push(7);
		newList.push(3);
		newList.push(7);
		newList.push(8);
		deleteDuplicates(newList);
	}


	public void deleteDuplicates(LinkedList list) {
		Node head = list.head;
		Node previous=null;
		Set<Integer> hashSet=new HashSet<>();
		
		while(head!=null){
			if(hashSet.contains(head.val))
				previous.next=head.next;
			else{
				hashSet.add(head.val);	
				previous=head;
			}
				
			head=head.next;
		}   
    }
	
	public void push(int x){
		Node newNode=new Node(x);
		newNode.next=head;
		head=newNode;
	}
}
	
