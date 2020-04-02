class Item {
	int id;
	String name;
	double price;

	//TODO add variable.
	class Tip{
		static double a = 0.18, b = 0.5, c = 0.0;

		double geta(){
			return a;
		}
		double getb(){
			return b;
		}
		double getc(){
			return c;
		}
	}
	Tip tax = new Tip();

	//TODO constructor
	Tip(int id, String name, double price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}

	//TODO setters and getters
	int setId(int id)
	{
		this.id = id;
	}
	String setName(String name)
	{
		this.name = name;
	}
	double setPrice(double price)
	{
		this.price = price;
	}
	void getId()
	{
		return id;
	}
	void getName()
	{
		return name;
	}
	void getPrice()
	{
		return price;
	}

	double taxReturn () {
		//TODO
		return price * 0.15;
	}
}

class Receipt{
	
	List<Item> items = new ArrayList<Item>();

	public void add(int id, Item t)
	{
		if(id >= 0 && id <= items.length){
 		Item[] newData = (Item[])new Object[items.length + 1];

 		for(int i = 0; i < id; i++)
 			newData[i] = items[i];

 		newData[id] = t;

 		for(int i = id; i < items.length; i++)
 			newData[i+1] = items[i];

 		items = newData;
 		items.length = items.length + 1;

	}
	public void delete(int id)
	{
		if(id >= 0 && id < items.length){

 		Item[] newData = (Item[])new Object[items.length - 1];

 		for(int i = 0; i < id; i++)
 		newData[i] = items[i];

 		for(int i = id + 1; i < items.length; i++)
 		newData[i-1] = items[i];

 		items = newData;
 		items.length = items.length - 1;
	}
}