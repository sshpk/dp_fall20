package pk.cuiatd.dp.di.task;

public class PlaystationJoystick implements IGamepadFunctionality{
	final String gamepadName = "Playstation Controller";
	float vibrationPower = 100.0f;
	
	@Override
	public String getGamepadName() {
		return gamepadName;
	}

	@Override
	public void setVibrationPower(float InPower) {
		this.vibrationPower = Math.max(InPower*100.0f, Math.min(0.0f, 100.0f));
		
	}

}