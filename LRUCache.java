import java.util.HashMap;
import java.util.LinkedList;

public class LRUCache {
	
	public class Node{
		int key;
		int val;
		public Node(int x,int y){
			key=x;
			val=y;
		}
	}
	
	LinkedList<Node> listToTrackRank=new LinkedList<>();
	HashMap<Integer,Node> hashMap=new HashMap<>();
	int cap=0;
	
	public LRUCache(int capacity){
		cap=capacity;
	}
	
	public int get(int someValue){
		
		if(hashMap.containsKey(someValue)){
			Node cur=hashMap.get(someValue);			
			listToTrackRank.remove(cur);
			listToTrackRank.addFirst(cur);
			return cur.val;
		}
		return -1;
	}
	
	public void put(int key,int value){
		if(hashMap.containsKey(key)){
			listToTrackRank.remove(hashMap.get(key));
			hashMap.remove(key);
		}
		
		Node newNode=new Node(key,value);
		listToTrackRank.addFirst(newNode);
		hashMap.put(key,newNode);
		
		if(listToTrackRank.size()>cap){
			Node nodeToRemove=listToTrackRank.getLast();
			listToTrackRank.removeLast();
			hashMap.remove(nodeToRemove.key);
		}
		
	}

}
