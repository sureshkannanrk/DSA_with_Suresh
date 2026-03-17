package others;

public class min_heap_using_aray {
	
	// initialization 
	int arr[];
	int bucket_size;
	int element_fills=-1;
	
	
	// constructor for initialize the size of the array: 
	min_heap_using_aray(int size)
	{
		this.bucket_size=size;
		arr =new int[size];
	}
	
	
	// function for get the parent node
	public int getparent(int node)
	{
		return (node-1)/2;
	}
	
	
	// to swap the values in the array:
	public void swap( int temp,int temp2)
	{
		int temp3 =arr[temp];
		arr[temp]=arr[temp2];
		arr[temp2]=temp3;
	}
	
	
	
	// to get the left element
	private int getleft(int node)
	{
		return node*2+1;
	}
	
	// to get the right element
	private int getright(int node)
	{
		return node*2+2;
	}
	
	
	
	
	
	// function for inserting the element
	public void insert(int value)
	{
		if(bucket_size ==element_fills)
		{
			return;
		}
		if(element_fills ==0)
		{
			arr[++element_fills]=value;
			return;
		}
		if(value<arr[0])
		{
			int temp =arr[0];
			arr[0]=value;
			value=temp;
		}
		arr[++element_fills]=value;
		heapdown(element_fills);
		
	}
	
	
	// after the insertion we need to heapdown the elements, for that we initialize this function
	public void heapdown(int i)
	{
		int largest=i;
		int parent=getparent(i);
		if(arr[largest]<arr[parent])
		{
			largest=parent;
		}
		if(largest !=i )
		{
			swap(i,largest);
			heapdown(largest);
		}
	}
	
	public void display()
	{
		for(int i=0;i<= element_fills;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	
	public int pop()
	{
		if(bucket_size==0)
		{
			return -1;
		}
		int pop =arr[0];
		arr[0]=arr[element_fills];
		arr[element_fills--]=0;
		heapify(0);
		return pop;
	}
	
	public void heapify(int i)
	{
		int smalest=i;
		int left = getleft(i);
		int right = getright(i);
		
		
		
		if( left< element_fills && arr[left] < arr[smalest])
		{
			smalest=left;
		}
		if( right< element_fills && arr[right]< arr[smalest])
		{
			smalest =right;
		}
		
		if(smalest !=i)
		{
			swap(smalest,i);
			heapify(smalest);
		}
	}
	
	
	

}
