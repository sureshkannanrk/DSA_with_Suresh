package double_linked_list;

public class double_ll {
	node head;
	node tail;
	int size;
	private class node{
		node prev;
		node next;
		int data;
		node(int val)
		{
			data=val;
			size++;
		}
	}
	public void insertatbeg(int val)
	{
		node newnode = new node(val);
		if(head==null)
		{
			head=newnode;
			tail=newnode;
			return;
		}
		newnode.next=head;
		head.prev=newnode;
		head=newnode;
	}
	
	public void display()
	{
		node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print("END");
		System.out.println();
		
	}
	
	public void insertatend(int val)
	{
		
		if(size==0)
		{
			insertatbeg(val);
			return;
		}
		node newnode= new node(val);
		tail.next=newnode;
		newnode.prev=tail;
		tail=newnode;
	}
	public void insertatposition(int pos, int val) throws Exception 
	{
		if(size<pos && pos<0)
		{
			throw new Exception("invalid position");
		}
		if(pos== size)
		{
			insertatend(val);
			return;
		}
		node newnode= new node(val);
		node place=getnode(pos-1);
		place.prev.next=newnode;
		newnode.prev=place.prev;
		newnode.next=place;
		place.prev=newnode;
		
	}
	public node getnode(int pos)
	{
		node temp= head;
		for(int i=0;i<pos;i++)
		{
			temp=temp.next;
		}
		return temp;
	}
	
}
