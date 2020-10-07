package pk.cuiatd.dp.di.task;

public class XBoxGamepad implements IGamepadFunctionality{
	final String gamepadName = "XBox Controller";
	float vibrationPower = 1.0f;
	
	@Override
	public String getGamepadName() {
		return gamepadName;
	}

	@Override
	public void setVibrationPower(float InPower) {
		this.vibrationPower = Math.max(InPower, Math.min(0.0f, 1.0f));
		
	}

}
