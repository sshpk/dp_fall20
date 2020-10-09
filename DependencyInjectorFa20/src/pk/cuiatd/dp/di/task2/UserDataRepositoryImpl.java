package pk.cuiatd.dp.di.task2;

public class UserDataRepositoryImpl implements UserDataRepository {

	@Override
	public void save(User user) {
		System.out.println("The data of "+user + " is saved now");
	}

}
