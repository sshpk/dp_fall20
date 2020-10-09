package pk.cuiatd.dp.di.task2;

class User {
	String name;
	String address;

	public User(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
public String getAddress() {
	return address;
}
@Override
public String toString() {
	return "User [name=" + name + ", address=" + address + "]";
}


}
