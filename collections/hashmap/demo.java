package hashmap;


import java.util.PriorityQueue;

public class demo {
	public static void main(String [] args)
	{	
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) ->  b-a);
		pq.add(10);
		pq.add(30);
		System.out.print(pq.poll());
}
}