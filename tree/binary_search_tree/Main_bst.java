package binary_search_tree;
import java.util.Scanner;

public class Main_bst {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
//		own_try bst =new own_try();
//		bst.populate(sc);
//		bst.visualize();
		kunal_code bst= new kunal_code();
		int [] arr= {1,2,3,4,5,6};
		bst.sortedarr(arr);
		System.out.println(bst.balanced());
		bst.display();
		System.out.println(bst.rootheight());
		bst.innorder();
		System.out.println();
		bst.preorder();
		System.out.println();
		bst.postorder();
		sc.close();
	}
}
