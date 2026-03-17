package binery_tree;
import java.util.Scanner;

public class Main_btree {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		binary_tree bt = new binary_tree();
		bt.populate(sc);
		bt.visualize();
	}
}
