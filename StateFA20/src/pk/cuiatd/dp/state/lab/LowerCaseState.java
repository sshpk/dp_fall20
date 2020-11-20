package pk.cuiatd.dp.state.lab;

class LowerCaseState implements State {
	@Override
	public void writeName(Context context, String name) {
		System.out.println(name.toLowerCase());
        context.setState(new MultipleUpperCaseState());
	}
}
