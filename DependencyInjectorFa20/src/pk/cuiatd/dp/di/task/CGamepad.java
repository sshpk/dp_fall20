package pk.cuiatd.dp.di.task;

public class CGamepad implements IGamepadFunctionalityInjector{
	IGamepadFunctionality gamepadFunctionality;
	@Override
	public void injectFunctionality(IGamepadFunctionality inGamepadFunctionality) {
		gamepadFunctionality = inGamepadFunctionality;
		
	}
	public CGamepad() {
	}
	
	public CGamepad(IGamepadFunctionality gamepadFunctionality) {
		this.gamepadFunctionality = gamepadFunctionality;
	}
	public void setGamepadFunctionality(IGamepadFunctionality gamepadFunctionality) {
		this.gamepadFunctionality = gamepadFunctionality;
	}
	public void showCase(){
		System.out.println("We're using the {0} right now, do you want to change the vibrating power?\r\n"+gamepadFunctionality.getGamepadName());
	}

}
