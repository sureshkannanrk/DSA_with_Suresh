package daily_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

import hashmap.one_pair_map;

public class dijikstra {
	
	public int[] shortest_founder(ArrayList<HashMap<Integer,Integer>> list,int src)
	{
		PriorityQueue<one_pair_map> q= new PriorityQueue<>( (a,b) -> a.getvalue() - b.getvalue()) ;
		q.add( new one_pair_map(src,0));
		int arr[] = new int[list.size()];
		Arrays.fill(arr,Integer.MAX_VALUE);
		arr[src]=0;
		return pv_shortest(list, q, arr);
	}
	
	private int[] pv_shortest(ArrayList<HashMap<Integer,Integer>> list, PriorityQueue<one_pair_map> q , int arr[])
	{
		
		while(!q.isEmpty())
		{
			one_pair_map temp =q.poll();
			
			
				for(Map.Entry<Integer, Integer> one_set: list.get(temp.getkey()).entrySet())
				{
					int cur_dis = temp.getvalue()+ one_set.getValue();
					if(arr[one_set.getKey()] > cur_dis)
					{
						q.add(new one_pair_map(one_set.getKey(),cur_dis));
						arr[one_set.getKey()] = cur_dis;
						
					}
				}
			
		}
		return arr;
	}
}
