package daily_task;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class main_for_algorithm {
	public static void main(String args[])
	{
		
		HashMap<Integer, List<int []>> graph =new HashMap<>();
		graph.put(0, Arrays.asList(new int[] {1,2}, new int[] {2,4}));
		graph.put(1, Arrays.asList(new int[] {3,7}, new int[] {2,1}));
		graph.put(2, Arrays.asList(new int[] {4,3}));
		graph.put(3, Arrays.asList(new int[] {4,1}));
		dijikstraUsingHashSet.shortestpath(graph, 0, 5);
	}
}
