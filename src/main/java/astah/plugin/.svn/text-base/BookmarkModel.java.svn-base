package astah.plugin;

import java.io.Serializable;

/**
 * BookmarkModel
 * 
 * @author K.Fujimoto
 * 
 */
public class BookmarkModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5928547284382141464L;

	private String description;
	private String diagramName;
	private String presentationsName;
	private String[] classIdList;

	public BookmarkModel() {
	}

	public BookmarkModel(String description, String diagramName,
			String presentationName, String[] classIdList) {
		this.description = description;
		this.diagramName = diagramName;
		this.presentationsName = presentationName;
		this.classIdList = classIdList;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDiagramName() {
		return diagramName;
	}

	public void setDiagramName(String diagramName) {
		this.diagramName = diagramName;
	}

	public String getPresentationsName() {
		return presentationsName;
	}

	public void setPresentationsName(String presentationsName) {
		this.presentationsName = presentationsName;
	}

	public String[] getClassIdList() {
		return classIdList.clone();
	}

	public void setClassIdList(String[] classIdList) {
		this.classIdList = classIdList;
	}

}
