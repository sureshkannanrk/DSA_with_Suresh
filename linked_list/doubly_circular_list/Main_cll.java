package doubly_circular_list;

public class Main_cll {
	public static void main(String [] args)
	{
		circular_list list= new circular_list();
		list.insertatend(37);
		list.insertatend(74);
		list.insertatend(82);
		list.display();
		list.stackpop();
		list.display();
	}
}
