package binery_tree;

import java.util.Scanner;

public class binary_tree {
	Node root;
	public class Node{
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
		System.out.print("enther the value for root:");
		int num=sc.nextInt();
		root=new Node(num);
		populate(sc,root);
	}
	public void populate(Scanner sc, Node node)
	{
		if(node == null)
		{
			return;
		}
		System.out.print("Are Going to link left for:"+ node.data);
		boolean left=sc.nextBoolean();
		if(left)
		{
			System.out.print("Enter the data for the node:");
			int num=sc.nextInt();
			Node left_node=new Node(num);
			node.left=left_node;
			populate(sc,node.left);
		}
		System.out.print("Are going to link right for:"+ node.data);
		boolean right=sc.nextBoolean();
		if(right)
		{
			System.out.print("Enter the data for the node:");
			int num=sc.nextInt();
			Node right_node=new Node(num);
			node.right=right_node;
			populate(sc, node.right);
		}
	}
	
	
	public void visualize()
	{
		visualize(root,0);
	}
	public void visualize(Node node, int level)
	{
		if(node== null)
		{
			return;
		}
		visualize(node.right,level+1);
		if(level!=0)
		{
			for(int i=0;i<level-1;i++)
			{
				System.out.print("|\t\t");
			}
			System.out.println("|---------->"+node.data);
		}
		else
		{
			System.out.println(node.data);
		}
		visualize(node.left,level+1);
	}
}
