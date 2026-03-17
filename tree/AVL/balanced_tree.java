package AVL;
import java.lang.Math;

public class balanced_tree {
	private class Node
	{
		private Node left;
		private Node right;
		private int data;
		private int height;
		Node(int val)
		{
			data=val;
		}
		public int getvalue()
		{
			return data;
		}
		public int getheight(Node node)
		{
			if(node == null)
			{
				return -1;
			}
			return node.height;
		}
		
	}
	
	private Node root;
	
	public void insert(int val)
	{
		root=insert(val,root);
	}
	private Node insert(int val, Node node)
	{
		if(node == null)
		{
			return new Node(val);
		}
		if(val>=node.getvalue())
		{
			node.right=insert(val,node.right);
		}
		else
		{
			node.left=insert(val,node.left);
		}
		
		node.height=Math.max(node.getheight(node.left), node.getheight(node.right))+1;
		
		return rotation(node);
	}
	public void display()
	{
		display(root,0);
	}
	private void display(Node node, int val)
	{
		if(node == null)
		{
			return;
		}
		display(node.right,val+1);
		if(val!=0)
		{
			for(int i=0;i<val-1;i++)
			{
				System.out.print("|\t");
			}
			System.out.println("------->"+node.data);
		}
		else
		{
			System.out.println(node.data);
		}
		display(node.left,val+1);
	}
	
	// rotation going to done here:
	private Node rotation(Node node)
	{
		if(node.getheight(node.left)-node.getheight(node.right)>1)
		{
			if(node.getheight(node.left.left)-node.getheight(node.left.right)<0)
			{
				node.left=leftrotation(node.left);
			}
			return rightrotation(node);
		}
		if(node.getheight(node.left)-node.getheight(node.right)<-1)
		{
			if(node.getheight(node.right.left)-node.getheight(node.right.right)>0)
			{
				node.right=rightrotation(node.left);
			}
			return leftrotation(node);
			
		}
		return node;
	}
	private Node leftrotation(Node node)
	{
		Node temp=node.right;
		node.right=temp.left;
		temp.left=node;
		
		node.height=Math.max(node.getheight(node.left), node.getheight(node.right))+1;
		temp.height=Math.max(temp.getheight(temp.left), temp.getheight(temp.right))+1;
		
		return temp;
		
	}
	
	private Node rightrotation(Node node)
	{
		Node temp =node.left;
		node.left=temp.right;
		temp.right=node;
		
		node.height=Math.max(node.getheight(node.left), node.getheight(node.right))+1;
		temp.height=Math.max(temp.getheight(temp.left), temp.getheight(temp.right))+1;
		
		return temp;
		
	}
}
