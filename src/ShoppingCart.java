import java.util.ArrayList;

public class ShoppingCart {

	private ArrayList<ItemOrder> io ;
	
	public ShoppingCart()
	{
		io = new ArrayList<ItemOrder>();
	}
	
	public void add(ItemOrder newOrder)
	{
		if(io.contains(newOrder))
		{
			for(int i = 0; i < io.size(); i++)
			{
				if(io.get(i).equals(newOrder))
				{
					io.set(i, newOrder);
				}
			}
		}
		else
		{
			io.add(newOrder);
		}
	}
	
	//Total is very wrong. something might be wrong with the size() bc when I made size another variable and added, the first value was correct, but then it went out
	//of bounds
	public double getTotal()
	{
		double t = 0.0;
		for(int i = 0; i < io.size(); i++)
		{
			t += io.get(i).getPrice();
		}
		return t;
	}
	
	@Override
	public String toString()
	{
		String s = "";
		return s;
	}
	
}
