package cscd211Classes;

public class Sandwich implements Comparable<Sandwich>
{
	private String name;
	private int calories;
	private String[] toppings;
	
	public Sandwich(final String name, final int calories, final String[] toppings)
	{
		if(calories == 0 || name.isEmpty() || toppings == null)
			throw new IllegalArgumentException("There's nothing there!");
		this.toppings = new String[toppings.length];
		for(int x = 0; x < this.toppings.length; x += 1)
			this.toppings[x] = toppings[x];
		this.calories = calories;
		this.name = name;
	}
	
	@Override
	public int compareTo(Sandwich AnotherSandwhich) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString(String name, int calories, String[] toppings)
	{
		return "Your "+name+" sandwich contains "+toppings+" and is "+calories+" calories!";
	}
	
	public int getCalories()
	{
		return this.calories;
	}
	
	public String[] getToppings()
	{
		return this.toppings;
	}
	
	@Override
	public boolean equals(final Object obj)
	{
		if(obj == null) return false;
		if(this == obj) return true;
		if(!(obj instanceof Sandwich)) return false;
		
		Sandwich anotherSandwhich = (Sandwich)obj;
		//TODO fix array equality
		return this.name.equals(anotherSandwhich.name) && this.calories == anotherSandwhich.calories && this.toppings.equals(obj) == anotherSandwhich.toppings.equals(obj); 
	}
	
	@Override
	public int hashCode()
	{
		return this.name.hashCode() + this.calories;
	}
	
}
