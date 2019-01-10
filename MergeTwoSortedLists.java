
public class MergeTwoSortedLists {
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode l3 = null;
		
		if(l1==null && l2==null)
			return l1;
		if(l1==null)
			return l2;
		if(l2==null)
			return l1;
		if(l1.val<l2.val){
			l3=new ListNode(l1.val);
			l1=l1.next;}
		else
		{
			l3=new ListNode(l2.val);
			l2=l2.next;
		}
		ListNode head=l3;
			
		while(l1!=null && l2!=null ){
			
				
			if(l1.val<l2.val ){
				l3.next=new ListNode(l1.val);
				l1=l1.next;
			}
			else{
				l3.next=new ListNode(l2.val);
				l2=l2.next;
			}
			l3=l3.next;
			
		}
		
		while(l1 != null)
        {
            l3.next = new ListNode(l1.val);
            l1 = l1.next;
            l3 = l3.next;
        }
        
        while(l2 != null)
        {
            l3.next = new ListNode(l2.val);
            l2 = l2.next;
            l3 = l3.next;
        }
		return head;
        
    } 
	
	public static void main(String args[]){
		ListNode l1=new ListNode(10);
		ListNode head1=l1;
		//head1=l1;
		l1.next=new ListNode(23);
		l1=l1.next;
		l1.next=new ListNode(52);
		l1=l1.next;
		l1.next=new ListNode(300);
		l1=l1.next;
		
		
		ListNode l2=new ListNode(0);
		ListNode head2=l2;
		//head2=l2;
		l2.next=new ListNode(3);
		l2=l2.next;
		l2.next=new ListNode(3);
		l2=l2.next;
		l1.next=new ListNode(4);
		l1=l1.next;
		
		ListNode l3=mergeTwoLists(head1,head2);
		while(l3!=null){
			System.out.print(l3.val+"->");
			l3=l3.next;}
		
	}
	

}
