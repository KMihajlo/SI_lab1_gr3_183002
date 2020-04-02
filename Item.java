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

	//TODO setters and getters

	double taxReturn () {
		//TODO
	}
}