
public class Node {
	Node next;
	int val;
	public Node(int x){
		val=x;
	}
	
	public void push(int x){
		Node newNode=new Node(x);
		newNode=newNode.next;
	}
}
