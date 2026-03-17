package others;

public class segment_tree {
	public class Node {
		 private int data;
		 private int nodest;
		 private int nodeend;
		 private Node left;
		 private Node right;
		public Node(int nodest, int nodeend)
		{
			this.nodest=nodest;
			this.nodeend=nodeend;
		}
	}
	private Node root;
	
	public void insert(int arr[])
	{
		root=insert(arr,0,arr.length-1);
	}
	private Node insert( int[] arr,int nodest, int nodeend)
	{
		if(nodest == nodeend)
		{
			Node temp=new Node(nodest,nodeend);
			temp.data=arr[nodest];
			return temp;
		}
		Node newnode =new Node(nodest, nodeend);
		int mid=(nodest+nodeend)/2;
		
		newnode.left= insert(arr,nodest,mid);
		newnode.right=insert(arr, mid+1, nodeend);
		
		newnode.data=newnode.right.data+newnode.left.data;
		
		return newnode;
	}
	
	
	public void display()
	{
		display(root);
	}
	private void display(Node node)
	{
		if(node== null) return;
		
		System.out.print(node.nodest+" =>  ");
		System.out.print("data "+node.data);
		System.out.print("  <= "+node.nodeend);
		
		
		
	    System.out.println();
	    display(node.left);
		display(node.right);	
	}
	
	
	public int sum(int st, int end)
	{
		return sum(root,st,end);
	}
	private int sum(Node node , int st, int end)
	{
		if(node==null) return 0;
		if(node.nodest >= st && node.nodeend <= end )
		{
			return node.data;
		}
		if(node.nodeend<st || node.nodest > end )
		{
			return 0;
		}
		
		return sum(node.left,st,end)+ sum(node.right,st,end);
		
	}

	public void update(int index, int value)
	{
		update(root, index, value);
	}
	private int update(Node node, int index, int value)
	{
		if(node.nodest == index && node.nodeend == index)
		{
			node.data=value;
			return node.data;
		}
		else if(index >=node.nodest && index <=node.nodeend)
		{
			update(node.left,index, value);
			update(node.right,index, value);
			node.data=node.left.data+node.right.data;
			return node.data;
		}
		else
		{
			return 0;
		}
	}
}
