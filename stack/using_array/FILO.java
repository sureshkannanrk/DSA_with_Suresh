package using_array;

public class FILO {
	int arr[];
	int size=-1;
	public FILO(int nodes)
	{
		arr=new int[nodes];
	}
	public void push(int val)
	{
		pv_push(val);
	}
	public void pv_push(int val)
	{
		arr[++size]=val;
	}
	
	// pop the stack value
	public int pop()
	{
		return pv_pop();
	}
	private int pv_pop()
	{
		return arr[size--];
	}
	
	public boolean isempty()
	{
		return pv_isempty();
	}
	private boolean pv_isempty()
	{
		return size<0;
	}
}

