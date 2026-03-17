package list;

import java.util.ArrayList;



import hashmap.one_pair_map;

public class queue_pair {
	ArrayList<one_pair_map>  list;
	public int size=-1;
	
	public queue_pair(int size)
	{
		list = new ArrayList<>(size+1);
		for(int i=0;i<=size;i++)
		{
			list.add(new one_pair_map());
		}
	}
	
	public void insert(int node, int parent)
	{
		list.get(++size).setpair(node,parent);
	}
	
	
	public one_pair_map map_pop()
	{
		one_pair_map pop =list.get(0);
		size--;
		list.remove(0);
		return pop;
	}
	
	
	public boolean isempty()
	{
		return size<0;
	}
	
	public ArrayList<one_pair_map> list_show()
	{
		return list;
	}
}
