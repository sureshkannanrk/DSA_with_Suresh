package using_array;

public class FIFO {
	private int arr[];
	private int size=-1;
	public FIFO(int val)
	{
		arr=new int[val];
	}
	
	public void push(int val)
	{
		pv_push(val);
	}
	private void pv_push(int val)
	{
		if(size==arr.length-1) throw new IllegalStateException("queue is full");
		arr[++size]=val;
		
	}
	
	
	// pop in queue
	public int pop()
	{
		return pv_pop();
	}
	private int pv_pop()
	{
		if(size <0) throw new IllegalStateException("queue is full");
		int pop=arr[0];
		for(int i=0;i<size;i++)
		{
			arr[i]=arr[i+1];
		}
		size--;
		return pop;
	}
	
	public void display()
	{
		for(int i=0;i<=size;i++)
		{
			System.out.print(arr[i] +" | ");
		}
	}
	 public boolean isempty()
	 {
		 return pv_isempty();
	 }
	 private boolean pv_isempty()
	 {
		 return size<0;
	 }

	 
	 // get the size of the queue
	 
	 public int size()
	 {
		 return pv_size();
	 }
	 private int pv_size()
	 {
		 return size+1;
	 }
	 
	
}
