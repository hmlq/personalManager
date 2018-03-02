package pojo;

/**
 * Filemanage entity. @author MyEclipse Persistence Tools
 */

public class Filemanage implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer userId;
	private String title;
	private String name;
	private String contentType;
	private String size;
	private String filepath;

	// Constructors

	/** default constructor */
	public Filemanage() {
	}

	/** minimal constructor */
	public Filemanage(Integer userId, String title) {
		this.userId = userId;
		this.title = title;
	}

	/** full constructor */
	public Filemanage(Integer userId, String title, String name,
			String contentType, String size, String filepath) {
		this.userId = userId;
		this.title = title;
		this.name = name;
		this.contentType = contentType;
		this.size = size;
		this.filepath = filepath;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContentType() {
		return this.contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getFilepath() {
		return this.filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

}