package pk.cui.dp.q2;

import java.util.HashMap;
import java.util.Map;


public class DocumentRepo {
	private final Map<Long, Document> collection = new HashMap<Long, Document>();

	public void add(Document doc) throws DocumentDuplicateException {
		if (collection.containsKey(doc.getId())) {
			throw new DocumentDuplicateException("Duplicated document with id: " + doc.getId());
		}

		// add copy of the document
		collection.put(doc.getId(), new Document(doc));
	}
	public void update(Document doc) throws DocumentNotFoundException, VersionMismatchException {
		if (!collection.containsKey(doc.getId())) {
			throw new DocumentNotFoundException("Document with id: " + doc.getId()+" Not found ");
		}

		Document latestDoc = collection.get(doc.getId());

		if (doc.getVersion() != latestDoc.getVersion()) {
			throw new VersionMismatchException(
					"Tried to update stale version " + doc.getVersion()
					+ " while actual version is " + latestDoc.getVersion()
					);
		}

		// update version, including client representation - modify by reference here
		doc.setVersion(doc.getVersion() + 1);

		// save document copy to repository
		collection.put(doc.getId(), new Document(doc));
	}
	public Document get(long docId) throws DocumentNotFoundException {

		if (!collection.containsKey(docId)) {
			throw new DocumentNotFoundException("Document with id: " + docId+" Not found ");
		}
		return new Document(collection.get(docId));
	}
}
