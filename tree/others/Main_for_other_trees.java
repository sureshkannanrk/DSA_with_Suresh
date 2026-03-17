package others;




public class Main_for_other_trees{
	public static void main(String[] args)
	{
//		segment_tree seg_tree = new segment_tree();
//		int [] arr= {4,3,7,1,-3,4,4,5};
//		seg_tree.insert(arr);
//		seg_tree.display();
//		int ans=seg_tree.sum(4, 7);
//		System.out.println(ans);
//		
//		seg_tree.update(1,7);
//		seg_tree.display();
		
//		spanning_tree Sptree = new spanning_tree();
//		ArrayList<ArrayList<Integer>> list= new ArrayList<>(List.of(
//		        new ArrayList<>(),
//		        new ArrayList<>(List.of(2, 3)),
//		        new ArrayList<>(List.of( 3)),
//		        new ArrayList<>(List.of(4))
//		    )); 
//		Sptree.tree(list,0);
		
		min_heap_using_aray min =new min_heap_using_aray(9);
		min.insert(10);
		min.insert(30);
		min.insert(15);
		min.insert(40);
		min.insert(34);
		min.insert(12);
		min.insert(98);
		min.insert(9);
		System.out.println("initial display: ");
		min.display();
		
		
		// pop 1
		System.out.println("after poping: ");
		System.out.println(min.pop());
		min.display();
		
		
		
		// pop 2
		System.out.println("after poping: ");
		System.out.println(min.pop());
		min.display();
		
		
		
		// pop 3
		System.out.println("after poping: ");
		System.out.println(min.pop());
		min.display();
		
		
		
		// pop 4
		System.out.println("after poping: ");
		System.out.println(min.pop());
		min.display();
	}
}
