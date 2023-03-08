
public class ItemOrder {
	
	private Item i;
	private int q;
	
	public ItemOrder(Item item, int qty)
	{
		i = item;
		q = qty;
	}
	
	public double getP()
	{
		return q;
	}
	
	public double getPrice()
	{
		double price = i.priceFor(q);
		return price;
	}
	
	public Item getItem()
	{
		return i;
	}
	
	public boolean equals(Object obj)
	{
		ItemOrder other = (ItemOrder) obj;
		if(i.equals(other.getItem()))
		{
			return true;
		}
		return false;
	}

}
