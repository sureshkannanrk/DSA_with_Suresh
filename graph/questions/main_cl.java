package questions;


public class main_cl {
	public static void main(String[] args)
	{
		
//		island_pbm sol =new island_pbm(5);
//		sol.insert(0, 1);
//		sol.insert(0, 0);
//		sol.insert(1, 0);
//		sol.insert(1, 1);
//		sol.insert(2,3);
//		sol.insert(2, 4);
//		sol.insert(3, 3);
//		sol.insert(3, 4);
//		sol.insert(2, 2);
//		int count=sol.count_island();
//		System.out.print(count);
		
		cyclic_graph gr = new cyclic_graph(7);
		gr.addedge(1, 2);
		gr.addedge(1, 5);
		gr.addedge(2, 6);
		gr.addedge(6, 4);
		gr.addedge(4, 3);
		gr.addedge(3, 5);
		gr.addedge(3, 7);
		gr.display();
		
		System.out.println(gr.iscyclic()? "yeah it has cyclic " : "no cyclic there" );
		
		}
		
		
}
