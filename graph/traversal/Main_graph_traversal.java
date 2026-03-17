package traversal;

import java.util.Scanner;

public class main_class {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int nodes =sc.nextInt();
		breadth_fs graph =new breadth_fs(nodes);
		graph.addedge(1, 2, 8);
		graph.addedge(1, 3, 4);
		graph.addedge(3, 4, 43);
		graph.addedge(2, 5, 54);
		graph.display();
		graph.bfs_traversal();
		graph.dfs_traversal();
		sc.close();
	}
}
