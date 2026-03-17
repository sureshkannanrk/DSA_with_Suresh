package single_linked_list;

public class Main_sll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("my name is suresh kannan");
//		single_ll ll =new single_ll();
//		ll.insrtatbeg(5);
//		ll.insrtatbeg(10);
//		ll.insrtatbeg(60);
//		ll.insrtatbeg(40);
//		ll.insrtatbeg(30);
//		ll.display();
//		System.out.println(ll.gettail());
//		ll.insertatlast(20);
//		ll.insertatlast(30);
//		
//		
//		ll.display();
//		System.out.println(ll.gettail());
//		System.out.println(ll.getsize());
		
		single_ll ll2 = new single_ll();
		ll2.insrtatbeg(20);
		ll2.insertatlast(30);
		ll2.display();
		System.out.println();
		System.out.println(ll2.getsize());
		System.out.println(ll2.gettail());
		ll2.insertatlast(50);
		ll2.insrtatbeg(33);
		ll2.display();
		ll2.insertatposition(2,3);
		System.out.println();
		System.out.println(ll2.getsize());
		System.out.println();
		ll2.display();
		System.out.println();
		System.out.println(ll2.gettail());
		System.out.println(ll2.getsize());
		System.out.println(ll2.gethead());
		ll2.deletion(30);
		ll2.display();
		
		
		

	}

}
