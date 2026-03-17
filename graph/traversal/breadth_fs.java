package traversal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

import using_array.FIFO;
import using_array.FILO;

public class breadth_fs {
	ArrayList<HashMap<Integer,Integer>> list = new ArrayList<>();
	Scanner sc= new Scanner(System.in);
	
	
	public breadth_fs(int nodes)
	{
		for(int i=0;i<=nodes;i++)
		{
			list.add(new HashMap<>());
		}
	}
	// Alternation to hashmap
	public class map
	{
		int weight;
		int destination;
	}
	
	public void addedge(int source, int destination, int weight)
	{
		list.get(source).put(destination, weight);
		list.get(destination).put(source, weight);
	}
	
	public void display()
	{
		for(int i=0;i<list.size();i++)
		{
			for(Entry<Integer, Integer> entry :list.get(i).entrySet())
			{
				System.out.println("source: "+i+" | destination "+entry.getKey()+" | weight: "+entry.getValue());
			}
		}
	}
	

	
	
	public void bfs_traversal()
	{
		pv_bfs_traversal();
	}
	private void pv_bfs_traversal()
	{
		int vis[]=new int[list.size()];
		FIFO queue =new FIFO(list.size());
		System.out.print("Enter the root node:");
		int root=sc.nextInt();
		queue.push(root);
		while(!queue.isempty())
		{
			int pop =queue.pop();
			if(vis[pop]==0)
			{
				System.out.print(pop+"----> ");
				vis[pop]=1;
			}
			for(Entry<Integer,Integer> entry : list.get(pop).entrySet())
			{
				if(vis[entry.getKey()] ==0)
				{
					queue.push(entry.getKey());
				}
			}
		}
	}
	
	
	// dfs traversal
	public void dfs_traversal()
	{
		pv_dfs_traversal();
	}
	private void pv_dfs_traversal()
	{
		int vis[] =new int[list.size()];
		FILO stack = new FILO(list.size());
		System.out.print("Enter the starting node:");
		int root =sc.nextInt();
		stack.push(root);
		while(!stack.isempty())
		{
			int pop=stack.pop();
			if(vis[pop] ==0)  System.out.print(pop+"----> ");
			vis[pop]=1;
			for(Entry<Integer,Integer> entry : list.get(pop).entrySet())
			{
				if(vis[entry.getKey()]==0)
				{
					stack.push(entry.getKey());
				}
			}
		}
	}
	
	
	
}
