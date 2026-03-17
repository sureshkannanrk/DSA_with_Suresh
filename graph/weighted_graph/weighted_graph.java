package weighted_graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import daily_task.dijikstra;

public class weighted_graph {
	int size =0;
	ArrayList<HashMap<Integer, Integer>> list= new ArrayList<>();
	public weighted_graph(int size)
	{
		for(int i=0;i<=size;i++)
		{
			list.add(new HashMap<>()) ;
		}
		this.size=size+1;
	}
	
	public void insert(int src, int des, int weight)
	{
		list.get(src).put(des,weight);
		list.get(des).put(src,weight);
	}
	public void display()
	{
		for(int i=0;i<list.size();i++)
		{
			Map<Integer,Integer> map= list.get(i);
			for(Map.Entry<Integer, Integer> actmap : map.entrySet())
			{
				System.out.println("source: "+ i + "  destination: " + actmap.getKey() + "   weight: "+ actmap.getValue());
			}
		}
	}
	
	public int[] shortestpath(int src)
	{
		return pv_shortestpath(list,src);
	}
	private int[] pv_shortestpath(ArrayList<HashMap<Integer, Integer>> list, int src)
	{
		dijikstra obj1 = new dijikstra();
		return obj1.shortest_founder(list, src);
	}
}
