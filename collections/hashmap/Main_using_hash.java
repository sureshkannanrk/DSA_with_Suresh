package hashmap;

public class Main_using_hash {
	public static void main(String[] args)
	{
		HashUsingMap<String, Integer> map =new HashUsingMap<>(5);
		
		map.put("bng",12);
		map.put("kkj",16);
		map.put("yt",80);
		map.put("hsf",90);
		map.put("ket",90);
		map.put("kee",10);
		map.put("bnj",12);
		map.put("kkk",16);
		map.put("ytl",80);
		map.put("hsz",90);
		map.put("kev",90);
		map.tostring();
		System.out.println();
		System.out.println("size: "+map.getsize());
		System.out.print(map.get("bng"));
	}
	
}
