package pk.cuiatd.dp.di.task;

public class CGameEngine {
	EPlatforms platform;
	CGamepad gamePad;
	
	public void setPlatform(EPlatforms platform){
		this.platform = platform;
		switch (platform){
			case Xbox:
				gamePad = new CGamepad(new XBoxGamepad());
				break;
				
			case Playstation:
				gamePad = new CGamepad();
				gamePad.setGamepadFunctionality(new PlaystationJoystick());
				break;
				
			case Steam:
				gamePad = new CGamepad();
				gamePad.setGamepadFunctionality(new SteamController());
				break;
		}
		gamePad.showCase();
	}
}
