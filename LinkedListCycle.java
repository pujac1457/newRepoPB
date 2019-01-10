import java.util.HashMap;
import java.util.Map;

class ListNode {
     int val;
     ListNode next;
      ListNode(int x) {
         val = x;
         next = null;
     }
  }
public class LinkedListCycle {

	public boolean hasCycle(ListNode head) {
		ListNode current=head;
		Map<ListNode,Integer> hashMap1=new HashMap<>();
		int i=1;
		while (current!=null){
			if(hashMap1.containsKey(current) && hashMap1.get(current)>0)
				return true;
			hashMap1.put(current, i);
			i++;
			current=current.next;
		}
			
        return false;
    	}
}
