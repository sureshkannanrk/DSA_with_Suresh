package using_array;

public class Main_q_array {
	public static void main(String[] args)
	{
		FIFO queue = new FIFO(5);
		queue.push(4);
		queue.push(5);
		System.out.println(queue.size());
		System.out.println(queue.pop());
		System.out.println(queue.size());
		System.out.println(queue.pop());
		System.out.println(queue.size());
	}
}
