package AVL;

public class Main_avl {
	public static void main(String[] args)
	{
		balanced_tree tree = new balanced_tree();
		for(int i=1;i<10;i++)
		{
			tree.insert(i);
		}
		
		tree.display();
	}

}
