package pk.cui.dp.q2;

public class Document {
	private long id;
	private String name = "";
	private Type type = Type.CLASS_DIAGRAM;
	private String diagramPath = "";
	private String description = "";

	private long version = 0;

	public Document(){

	}

	public Document(Document doc){
		this.id =doc.id;
		this.name = doc.name;
		this.type = doc.type;
		this.diagramPath = doc.diagramPath;
		this.description = doc.description;
		this.version = doc.version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getDiagramPath() {
		return diagramPath;
	}

	public void setDiagramPath(String diagramPath) {
		this.diagramPath = diagramPath;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getVersion() {
		return version;
	}

	public void setVersion(long version) {
		this.version = version;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Document [id=" + id + ", name=" + name + ", type=" + type + ", diagramPath=" + diagramPath
				+ ", description=" + description + ", version=" + version + "]";
	}

}
