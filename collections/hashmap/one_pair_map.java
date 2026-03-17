package hashmap;

public class one_pair_map {
	private int key;
	private int  value;
	
	
	public void setpair(int K, int V)
	{
		setkey(K);
		setvalue(V);
	}
	public one_pair_map()
	{
		
	}
	public one_pair_map(int K, int V)
	{
		setkey(K);
		setvalue(V);
	}
	public int getkey() {
		return key;
	}
	public void setkey(int key) {
		this.key = key;
	}
	public int getvalue() {
		return value;
	}
	public void setvalue(int value) {
		this.value = value;
	}
	
}
