package pk.cuiatd.dp.cmd;

public class FileInvoker {
	// implement stack
	Command cmd;
	public FileInvoker(Command cmd) {
		this.cmd = cmd;
	}
	void execute(){
		cmd.execute();
	}
	void undo(){
		cmd.undo();
	}
	
}
