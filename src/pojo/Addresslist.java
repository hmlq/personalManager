package pojo;

/**
 * Addresslist entity. @author MyEclipse Persistence Tools
 */

public class Addresslist implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer userId;
	private String name;
	private String phone;
	private String email;
	private String workplace;
	private String place;
	private String qq;

	// Constructors

	/** default constructor */
	public Addresslist() {
	}

	/** minimal constructor */
	public Addresslist(Integer userId, String name, String phone) {
		this.userId = userId;
		this.name = name;
		this.phone = phone;
	}

	/** full constructor */
	public Addresslist(Integer userId, String name, String phone,
			String email, String workplace, String place, String qq) {
		this.userId = userId;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.workplace = workplace;
		this.place = place;
		this.qq = qq;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWorkplace() {
		return this.workplace;
	}

	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}

	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

}