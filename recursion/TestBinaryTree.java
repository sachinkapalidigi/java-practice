import java.util.*;

class TreeNode {
	int value;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int val, TreeNode l, TreeNode r){
        value = val;
        left=l;
        right=r;
    }
}


class TestBinaryTree {
	
	public static void main(String[] args){
		
		TreeNode root = getTestCase();

        System.out.println("Pre Order");
        preOrder(root);
        
        System.out.println("\n In Order");
        inOrder(root);

        System.out.println("\n Post Order");
        postOrder(root);

        System.out.println("\n In Order Iterative");
        inOrderIterative(root);

        
	}

	static TreeNode getTestCase(){
        //            10
        //        20     50 
        //      30  40  60  70
        TreeNode ll = new TreeNode(30, null, null);
        TreeNode lr = new TreeNode(40, null, null);
		TreeNode left = new TreeNode(20, ll, lr);
		TreeNode root = new TreeNode(10, left, null);
		TreeNode right = new TreeNode(50, null, null);
		
		root.right = right;
		right.left = new TreeNode(60, null, null);
		right.right = new TreeNode(70, null, null);
		
		return root;
    }


    static void preOrder(TreeNode root){
        if(root == null) return;
        
        System.out.print(root.value + " ");
        preOrder(root.left);
        preOrder(root.right);
        return;
    }
    static void inOrder(TreeNode root){
        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.value + " ");
        inOrder(root.right);
        return;
    }

    static void postOrder(TreeNode root){
        if(root == null) return;
        
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + " ");
        return;
    }

    static void inOrderIterative(TreeNode root){
        // iterative solution for inorder traversal
        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode curr = root;
        while(!(curr == null && st.empty())){
            
            if(curr == null)	{
                curr = st.pop();
                System.out.print(curr.value+" ");
                curr = curr.right;
            }else {
                st.push(curr);
                curr = curr.left;
            }
            
        }
    
    }
    
	
}
