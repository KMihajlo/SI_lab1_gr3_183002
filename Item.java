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