package pk.cuiatd.dp.builder;

public interface Builder {
	void setSize(Size size);
	void setLength(Length length);
	void setExitTemprature(double temperature);
	void setRoastLevel(Roast roast);
	Espresso getResult();
	void setType(Type espresso);
}
