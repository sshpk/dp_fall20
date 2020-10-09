package pk.cuiatd.dp.di.task2;

public class UserServiceDependencyInjector {
	public UserService getUserService(){
		return new UserService(new UserDataRepositoryImpl());
	}
}
