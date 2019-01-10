
public class longestUnivaluePath {
	
	public static int ans; 
	
	public static int longestUnivaluePath1(TreeNode root) {
		//ans=0;
		return longestUnivaluePath( root) ;
	}
	public static int longestUnivaluePath(TreeNode root) {
        TreeNode current=root;
       
        if(current==null)
        	return 0; 
        int leftLength=longestUnivaluePath(current.left);
        int rightLength=longestUnivaluePath(current.right);
        int arrowLeft=0;
        int arrowRight=0;
        
        if(current!=null && current.val==current.left.val) 
        	arrowLeft=arrowLeft+leftLength+1;
        if(current!=null && current.val==current.right.val) 
        	arrowRight=arrowRight+rightLength+1;
        
        ans=Math.max(ans,arrowLeft+ arrowRight);
       
        
        return Math.max(ans, arrowRight);
    } 
	public static void main(String args[]){
		TreeNode newTree=new TreeNode(2);
		newTree.left=new TreeNode(7);
		newTree.right=new TreeNode(5);
		newTree.left.left=new TreeNode(1);
		newTree.left.right=new TreeNode(3);
		
		newTree.right.left=new TreeNode(5);
		newTree.right.right=new TreeNode(5);
		
		System.out.println(longestUnivaluePath(newTree));
	}

}
