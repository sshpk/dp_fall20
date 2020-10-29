package pk.cuiatd.dp.chain.hw;

public class Demo {

	public static void main(String[] args) {
		Handler textHandler = new TextHandler("Notepad++");
		Handler docHandler = new DocHandler("MS Word");
		Handler pdfHandler = new PDFHandler("Adobe Acrobat");
		Handler mp3Handler = new MP3Handler("VLC Media Player");

		textHandler.setNext(docHandler);
		docHandler.setNext(pdfHandler);
		pdfHandler.setNext(mp3Handler);

		File file = null;
		file = new File("Abc.doc","C:", Type.DOC);
		textHandler.handle(file);
		
		System.out.println("--------------------------");
		file = new File("Def.pdf","C:", Type.PDF);
		textHandler.handle(file);
		
		System.out.println("--------------------------");
		file = new File("Ghi.txt", "C:", Type.TXT);
		textHandler.handle(file);
		
		System.out.println("--------------------------");
		file = new File("Jkl.mp3", "C:", Type.MP3);
		textHandler.handle(file);
		
		System.out.println("--------------------------");
		file = new File("Mno.gif", "C:", Type.GIF);
		textHandler.handle(file);


	}

}
