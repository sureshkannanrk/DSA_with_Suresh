package single_linked_list;

public class single_ll {
	node head;
	node tail;
	int size;
	
	
	public class node{
		int data;
		node next;
		
		node(int val)
		{
			this.data=val;
			next=null;
			size++;
		}
	}
	public  void insrtatbeg(int val) {
		node newnode =new node(val);
		
		if(head!=null)
		{
			newnode.next=head;
			head=newnode;
			
		}
		else {
			head=newnode;
			tail=newnode;
		}
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
	public void insertatlast(int val) 
	{
		if(head ==null)
		{
			insrtatbeg(val);
		}
		node newnode = new node(val);
			tail.next=newnode;
			tail= newnode;
		
		
	}
	public int gettail()
	{
		return tail.data;
	}
	
	
	public void insertatposition(int pos, int val)
	{
		if(pos>size)
		{
			return;
		}
		node temp= head;
		node newnode=new node(val);
		while(pos-1>1)
		{
			pos--;
			temp=temp.next;
		}
		newnode.next=temp.next;
		temp.next=newnode;
		
	}
	public int getsize()
	{
		return size;
	}
	
	public int gethead()
	{
		return head.data;
	}
	
	
	public void deletion(int val)
	{
		node temp =head;
		
		while(temp.next.data!=val)
		{
			temp=temp.next;
		}
		temp.next=temp.next.next;
		
	}
	
	
}
