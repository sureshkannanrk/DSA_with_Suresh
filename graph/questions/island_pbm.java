package questions;

public class island_pbm {
	int arr[][] ;
	public island_pbm(int val)
	{
		arr=new int[val][val];
	}
	
	public void insert(int i,int j)
	{
		arr[i][j]=1;
	}
	
	public int count_island()
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j] ==1)
				{
					count=count+1;
					travel(arr,i,j);
				}
			}
		}
		return count;
	}
	
	private void travel(int[][] arr, int i,int j)
	{
		arr[i][j]=0;
		if(j+1<arr.length && arr[i][j+1]==1)
		{
			travel(arr,i,j+1);
		}
		if(i+1<arr.length && arr[i+1][j]==1)
		{
			travel(arr,i+1,j);
		}
		if(j-1>=0 && arr[i][j-1]==1)
		{
			travel(arr,i,j-1);
		}
	}
	
	
}
