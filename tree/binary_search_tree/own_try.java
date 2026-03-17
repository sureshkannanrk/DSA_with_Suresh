package binary_search_tree;
import java.util.Scanner;

public class own_try {
	private Node root;
	int height;
	public class Node
	{
		Node left;
		Node right;
		int data;
		Node(int val)
		{
			data=val;
		}
	}
	public void populate(Scanner sc)
	{
		System.out.print("Enter the root data:");
		int root_data=sc.nextInt();
		root=new Node(root_data);
		System.out.print("Are going to create another one:");
		boolean flag=sc.nextBoolean();
		while(flag)
		{
			System.out.print("Enter the data:");
			int node_data=sc.nextInt();
			populate(root,node_data);
			System.out.print("Are going to create another:");
			flag=sc.nextBoolean();
		}
	}
	public void populate(Node node, int key_value)
	{
		if(node == null)
		{
			return;
		}
		if(key_value<= node.data)
		{
			if(node.left!=null) populate(node.left,key_value);
			else
			{
				node.left= new Node(key_value);
			}
		}
		else
		{
			if(node.right!=null) populate(node.right,key_value);
			else
			{
				node.right=new Node(key_value);
			}
		}
		
	}
	public void visualize()
	{
		visualize(root,0);
	}
	public void visualize(Node node, int level)
	{
		if(node==null)
		{
			return;
		}
		visualize(node.right, level+1);
		if(level!=0)
		{
			for(int i=0;i<level-1;i++)
			{
				System.out.print("|\t");
			}
			System.out.println("|-------->"+node.data);
		}
		else
		{
			System.out.println(node.data);
		}
		visualize(node.left,level+1);
	}
}
