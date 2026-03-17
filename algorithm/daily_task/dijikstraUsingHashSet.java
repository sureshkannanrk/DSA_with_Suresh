package daily_task;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class dijikstraUsingHashSet {
	
	public static void shortestpath(HashMap<Integer, List<int []>> graph, int source, int V)
	{
		int dis[] =new int[V];
		Arrays.fill(dis, Integer.MAX_VALUE);
		dis[source]=0;
		Set<Integer> unvisited =new HashSet<>();
		for(int i=0;i<V;i++)
		{
			unvisited.add(i);
		}
		
		while(!unvisited.isEmpty())
		{
			
			int vector_storing =-1;
			int mindigit =Integer.MAX_VALUE;
			
			for(int vector: unvisited)
			{
				if(dis[vector]<mindigit)
				{
					mindigit=dis[vector];
					vector_storing= vector;
				}
			}
			unvisited.remove(vector_storing);
			for(int[] vector_arr: graph.getOrDefault(vector_storing, new ArrayList<int[]>()))
			{
				int node =vector_arr[0];
				int weight =vector_arr[1];
				if(dis[vector_storing]!=Integer.MAX_VALUE && unvisited.contains(node) && dis[vector_storing ]+ weight< dis[node])
				{
					dis[node]=dis[vector_storing ]+ weight;
				}
			}		
		}
		System.out.print(Arrays.toString(dis));
	}
}
