package questions;
import java.util.ArrayList;

import hashmap.one_pair_map;
import list.queue_pair;

public class cyclic_graph {
	ArrayList<ArrayList<Integer>> list= new ArrayList<>();
	int size;
	
	
	public cyclic_graph(int size)
	{
		for(int i=0;i<=size;i++)
		{
			list.add(new ArrayList<>());
		}
		this.size=size+1;
	}
	
	public void addedge(int source, int destination )
	{
		list.get(source).add(destination);
		list.get(destination).add(source);
	}
	
	public void display()
	{
		for(int i=0;i<list.size();i++)
		{
			for(int j=0;j<list.get(i).size();j++)
			{
				if(list.get(i).size() != 0) 				System.out.println(i +" ----->"+ list.get(i).get(j));

			}
		}
	}
	
	public boolean iscyclic()
	{
		int vis[] =new int[size];
		queue_pair qu =new queue_pair(size);
		qu.insert(1,0);
		vis[1]=1;
		return pv_iscyclic(qu,vis);
	}
	private boolean pv_iscyclic(queue_pair q, int [] vis )
	{
		while(!q.isempty())
		{
			one_pair_map pairs =q.map_pop();
			int node= pairs.getkey();
			int parent= pairs.getvalue();
			for(int i=0;i<list.get(node).size();i++)
			{
				int adj= list.get(node).get(i);
				if(vis[adj]==0)
				{
					vis[adj]=1;
					q.insert(adj, node);
				}
				else if( parent != adj) return true;

				
			}
		}
		return false;
	}
}
