package doubly_circular_list;

public class circular_list {
	node head;
	node tail;
	int size;
	public class node{
		node prev;
		node next;
		int data;
		node(int val)
		{
			size++;
			data=val;
		}
	}
	public void insertatend(int val)
	{
		node newnode=new node(val);
		
		if(head==null)
		{
			head=newnode;
			tail=newnode;
			tail.next=newnode;
			head.prev=tail;
			return;
		}
		tail.next=newnode;
		newnode.prev=tail;
		tail=newnode;
		tail.next=head;
		head.prev=tail;
	}
	public void display()
	{
		node temp=tail;
		int i=0;
		while(temp!=null&& i<size*2)
		{
			System.out.print(temp.data+"->");
			temp=temp.prev;
			i++;
		}
		System.out.print("END");
		System.out.println();
	}
	public void stackpop()
	{
		head=head.next;
		head.prev=tail;
		tail.next=head;
		size--;
		
	}
}
