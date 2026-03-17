package hashmap;

public class HashUsingMap<K,V> {
	
	private int buck_size;
	private int size=0;
	Entity<K,V>[] map ;
	
	
	
	// contructor for both value and as well as the non sized array
	@SuppressWarnings("unchecked")
	public HashUsingMap() 
	{ 
		buck_size=10;
	    map= (Entity<K,V>[]) new Entity[buck_size];
	}
	@SuppressWarnings("unchecked")
	public HashUsingMap(int data)
	{
		buck_size =data;
		map= (Entity<K,V>[]) new Entity[buck_size];
	}
	
	
	
	
	// getting the value by using the key 
	public V get(K key)
	{
		int hash =key.hashCode();
		int index=(buck_size-1) & hash;
		Entity<K,V> temp =map[index];
		while(temp!=null)
		{
			if(temp.key.equals(key))
			{
				return temp.value;
			}
			temp=temp.next;
		}
		return null;
	}
	
	
	
	// getting the size which represents the no.of elements
	public int getsize()
	{
		return size;
	}
	
	
	
	//entity class for storing the elements
	private class Entity<k1,v1>
	{
		k1 key;
		v1 value;
		Entity<k1,v1> next;
		
		public Entity(k1 key, v1 value)
		{
			this.key =key;
			this.value=value;
		}
	}
	
	
	
	// put function for storing and updating the values using key
	public void put(K key, V value)
	{
		int hash=key.hashCode();
		int index=(buck_size-1)&hash;
		if(map[index] == null)
		{
			map[index]=new Entity<>(key,value);
		}
		else
		{
			Entity<K,V> temp =map[index];
			Entity<K,V> prev =map[index];
			while(temp.next!=null)
			{
				if(prev.key.equals(key))
				{
					prev.value=value;
				}
				temp=temp.next;
				prev=prev.next;
			}
			prev.next= new Entity<>(key, value);
		}
		size++;
	}
	
	
	
	//print the hashmap prettyly
	public void tostring()
	{
		System.out.print("[ ");
		for(Entity<K,V> con: map)
		{
			if(con != null)
			{
				while(con != null)
				{
					System.out.print("(" +con.key +" "+ con.value +"),");
					con=con.next;
				}
				
			}
		}
		System.out.print(" ]");
	}
	
	

}
