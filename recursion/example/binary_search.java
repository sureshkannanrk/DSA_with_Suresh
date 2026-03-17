package example;

public class binary_search {
	public static void main(String [] args)
	{
		int[] arr= {1,2,3,4,5,6,8};
		int target=9;
		int index=search(arr, target, 0, arr.length-1);
		System.out.print(index);
	}
	public static int search(int[] arr, int key, int st,int end)
	{
		if(st>end) return -1;
		int mid =st+(end-st)/2;
		if(arr[mid]==key) return mid;
		else if(arr[mid]>key) return search(arr, key,st,mid-1);
		else return search(arr,key,mid+1,end);
	}
}
