package others;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class spanning_tree {
	public  void tree(ArrayList<ArrayList<Integer>> list, int source)
	{
		int dis[] = new int[list.size()];
		Queue<Integer> q = new ArrayDeque<>();
		q.add(source);
		int size=1;
		dis[source]=1;
		while(!q.isEmpty())
		{
			int pop= q.poll();
			for(int i=0;i<list.get(pop).size();i++)
			{
				if(dis[list.get(pop).get(i)] == 0)
				{
					q.add(list.get(pop).get(i));
					dis[list.get(pop).get(i)] =1;
					size++;
				}
			}
		}
		if(size>list.size()-2)
		{
			System.out.println("spanning treee");
		}
	}
}
