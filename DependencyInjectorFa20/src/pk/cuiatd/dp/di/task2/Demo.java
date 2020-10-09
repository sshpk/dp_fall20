package pk.cuiatd.dp.di.task2;

public class Demo {
	public static void main(String[] args) {
		User user = new User("Sajid", "Abbottabad");
		UserServiceDependencyInjector injector = 
				new UserServiceDependencyInjector();

		UserService service = injector.getUserService();

		service.persistUser(user );
	}
}
