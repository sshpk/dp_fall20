package pk.cuiatd.dp.cmd;

public class WriteFileCommand implements Command{
	FileSystemReciever reciever;
	

	public WriteFileCommand(FileSystemReciever reciever) {
		this.reciever = reciever;
	}

	@Override
	public void execute() {
		reciever.writeFile();
		
	}

	@Override
	public void undo() {
		reciever.writeFile();
		
	}

}

