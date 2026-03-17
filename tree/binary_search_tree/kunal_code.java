package binary_search_tree;
import java.lang.Math;

public class kunal_code {
	private Node root;
	
	public class Node{
		private Node left;
		private Node right;
		private int value;
		private int height;
		Node(int val)
		{
			value=val;
		}
		public int getvalue(  )
		{
			
			return value;
		}
		
		
		public int getheight(Node node)
		{
			if(node == null)
				return -1;
			return node.height;
		}
	}
	
	public void insert(int val)
	{
		root=insert(val, root);
	}
	public  Node insert(int val, Node node)
	{
		if(node ==null)
		{
			return new Node(val);
		}
		if(node.getvalue()>= val)
		{
			node.left=insert(val,node.left);
		}
		else
		{
			node.right=insert(val,node.right);
		}
		
		node.height=Math.max(node.getheight(node.right), node.getheight(node.left))+1;
		
		return node;
	}
	
	public boolean balanced()
	{
		return balanced(root);
	}
	private boolean balanced(Node node)
	{
		if(node == null)
		{
			return true;
		}
		return Math.abs(node.getheight(node.left)-node.getheight(node.right))<=1 && balanced(node.left) && balanced(node.right);
	}
	
	public void display()
	{
		display(root,"Root node is:");
	}
	private void display(Node node, String details)
	{
		if(node== null) return;
		System.out.println(details+node.value);
		display(node.left,"The left child of "+node.value+ " is: ");
		display(node.right,"The right child of "+node.value+ " is: ");
	}
	public void populate(int[] nums)
	{
		for(int i=0;i<nums.length;i++)
		{
			insert(nums[i]);
		}
	}
	public int rootheight()
	{
		return root.height;
	}
	
	public void sortedarr(int[] arr)
	{
		sortedarr(arr,0,arr.length);
	}
	public void sortedarr(int[] arr, int st, int end)
	{
		if(st>=end)
		{
			return;
		}
		int mid =(st+end)/2;
		System.out.print(mid);
		insert(arr[mid]);
		sortedarr(arr,st,mid);
		sortedarr(arr,mid+1,end);
	}
	
	public void preorder()
	{
		preorder(root);
	}
	private void preorder(Node node)
	{
		if(node == null)
		{
			return;
		}
		System.out.print(node.value+"---->");
		preorder(node.left);
		preorder(node.right);
	}
	
	public void innorder()
	{
		innorder(root);
	}
	private void innorder(Node node)
	{
		if(node == null)
		{
			return;
		}
		innorder(node.left);
		System.out.print(node.value+"----->");
		innorder(node.right);
	}
	
	public void postorder()
	{
		postorder(root);
	}
	private void postorder(Node node)
	{
		if(node == null)
		{
			return;
		}
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.value+"----->");
	}
}
