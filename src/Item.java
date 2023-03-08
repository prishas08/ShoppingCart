
public class Item {
	
	private double pr;
	private String n;
	private int bq;
	private double bp;
	
	public Item(String name, double price)
	{
		this(name, price, 0, price);
	}
	
	// IMPORTANT - the bulk quantity in runner is the minimum quantity to get the discounted price!! Change everything to reflect that, the priceFor needs to be 
	// edited to show that if the quantity is higher or equal to bulk quantity, the quantity needs to be multiplied by the discounted bulk price!!!
	
	public Item(String name, double price, int bulkQty, double bulkPrice)
	{
		if(price < 0 || bulkQty < 0 || bulkPrice < 0)
		{
			throw new IllegalArgumentException("Error");
		}
		n = name;
		pr = price;
		bq = bulkQty;
		bp = bulkPrice;
		
		
	}
	
	// the price is being multiplied by the quantity after total price is already calculated. This is because the priceFor is being called three times (one when typed
	// and once in itemOrder and once in Shopping cart)?. Calculates correct price for second and third, not for first and fourth >> meaning it works for prices with
	// no bulk price/bulk quantity but does not work for the ones with a bulk price or bulk quantity.
	public double priceFor(int quantity)
	{
		double newPrice = 0.0;
		if(quantity < 0)
		{
			throw new IllegalArgumentException("Error");
		}
		else if (quantity >= bq)
		{
			newPrice = quantity * bp;
		}
		else
		{
			newPrice = pr * quantity;
		}
		return newPrice;
		
	}
	
	public double getPrice()
	{
		return pr;
	}

	
	@Override
	public boolean equals(Object obj)
	{
		Item other = (Item) obj;
		if(this.n.equals(other.n))
		{
			return true;
		}
		return false;
	}
	
	@Override
	public String toString()
	{
		String s = n + " , $" + pr;
		return s;
	}
	
	
}
