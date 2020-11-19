package pk.cuiatd.dp.memento;


public class Demo {

	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();

		TextEditor textEditor = new TextEditor("data.txt");
		textEditor.write("this is the first line\n");
		System.out.println(textEditor+"\n\n");

		//now write something else
		textEditor.write("this is the second line\n");
		textEditor.write("this is the third line\n");
		
		// lets save the file
		caretaker.save(textEditor);
		//checking file contents

		textEditor.write("this is the fourth line\n");
		System.out.println(textEditor+"\n\n");

		//lets undo to last save
		caretaker.undo(textEditor);

		//checking file contents
		System.out.println(textEditor+"\n\n");



	}

}
