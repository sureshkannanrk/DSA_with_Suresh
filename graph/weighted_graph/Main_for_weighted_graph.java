package weighted_graph;

import java.util.Arrays;

public class Main_for_weighted_graph {
	public static void main(String[] args)
	{
		weighted_graph graph =new weighted_graph(6);
		graph.insert(1,3,4);
		graph.insert(1,2,4);
		graph.insert(2,3,2);
		graph.insert(3,4,4);
		graph.insert(4,5,2);
		graph.insert(6,5,1);
		graph.insert(6,3,3);
		graph.insert(5,3,7);
		graph.display();
		System.out.println();
		int arr[]= graph.shortestpath(4);
		System.out.println(Arrays.toString(arr));
		
		class product
		{
		}
		
		
		product arr2[] =new product[5];
		for(product pr: arr2)
		{
			System.out.print(pr);
		}
	}

}
