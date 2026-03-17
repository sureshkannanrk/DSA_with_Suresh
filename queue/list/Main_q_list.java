package list;


import hashmap.one_pair_map;

public class Main_q_list {
	public static void main(String[] args)
	{
		queue_pair q = new queue_pair(5);
		q.insert(4,6);
		q.insert(5, 7);
		q.insert(3, 2);
		System.out.print(q.size);
		one_pair_map map = q.map_pop();
		q.map_pop();
		q.map_pop();
		System.out.println(q.size);
		System.out.println(map);
		System.out.println(q.list_show());
		System.out.println(q.isempty());
		
	}
}
