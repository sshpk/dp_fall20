package pk.cuiatd.dp.memento;

public class Caretaker {
	private Object snapshot;
	
	public void save(TextEditor editor){
		this.snapshot = editor.save();
	}
	public void undo(TextEditor editor){
		editor.restore(snapshot);
	}
}
