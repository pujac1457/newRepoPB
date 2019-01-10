
public class Test_LRUCache {
	
	public static void main(String args[]){
		LRUCache newLRU=new LRUCache(1);
		newLRU.put(2,1);
		//newLRU.put(2,2);
		System.out.println(newLRU.get(2));
		newLRU.put(3,2);
		System.out.println(newLRU.get(2));

		System.out.println(newLRU.get(3));
	
	}

}
