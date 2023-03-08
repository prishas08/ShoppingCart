import java.util.ArrayList;

public class Catalog {
	
	private String n;
	private ArrayList<Item> list = new ArrayList<Item>();
	private int size;
	
	public Catalog(String name)
	{
		n = name;
	}
	
	public void add(Item item)
	{
		list.add(item);
		//size++;
	}
	
	public int size()
	{
		return list.size();
	}
	
	public Item get(int index)
	{
		Item i = list.get(index);
		return i;
	}
	
	public String getName()
	{
		String s = this.n;
		return s;
	}
	

}
