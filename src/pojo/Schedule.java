package pojo;

/**
 * Schedule entity. @author MyEclipse Persistence Tools
 */

public class Schedule implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer userId;
	private String date;
	private String thing;

	// Constructors

	/** default constructor */
	public Schedule() {
	}

	/** full constructor */
	public Schedule(Integer userId, String date, String thing) {
		this.userId = userId;
		this.date = date;
		this.thing = thing;
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

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getThing() {
		return this.thing;
	}

	public void setThing(String thing) {
		this.thing = thing;
	}

}