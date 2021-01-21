package pk.cui.dp.q2;

public class Demo {

	public static void main(String[] args) throws
	DocumentDuplicateException,
	DocumentNotFoundException,
	VersionMismatchException {
		int docId = 1;

		DocumentRepo docRepo = new DocumentRepo();
		Document doc = new Document();
		doc.setId(docId);
		docRepo.add(doc); 

		System.out.println("An empty document [id = "+doc.getId()+", version = "+ doc.getVersion()+ "] was added to repository");
		
		final Document aliceDoc = docRepo.get(docId);
		final Document bobDoc = docRepo.get(docId);
		

		aliceDoc.setName("System Requirement Specification"); 
		docRepo.update(aliceDoc); 
		System.out.println("Alice updates the document with new version "+ aliceDoc.getVersion());

		bobDoc.setDiagramPath("c:/documents/project/class_diagram.vsd"); 
		try {
			System.out.println("Bob tries to update the document with his version "+ bobDoc.getVersion());
			docRepo.update(bobDoc); 
			System.out.println("done");
		} catch (VersionMismatchException e) {
			e.printStackTrace();
		}

	}

}
