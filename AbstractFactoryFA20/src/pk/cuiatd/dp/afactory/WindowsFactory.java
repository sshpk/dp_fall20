package pk.cuiatd.dp.afactory;

public class WindowsFactory implements GUIFactory{

	@Override
	public Button createButton() {
		return new WinButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WinCheckbox();
	}

}
