package pojo;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer id;
	private String userName;
	private String password;
	private String name;
	private String sex;
	private String birth;
	private String nation;
	private String edu;
	private String work;
	private String phone;
	private String place;
	private String email;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	/** full constructor */
	public User(String userName, String password, String name, String sex,
			String birth, String nation, String edu, String work, String phone,
			String place, String email) {
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.sex = sex;
		this.birth = birth;
		this.nation = nation;
		this.edu = edu;
		this.work = work;
		this.phone = phone;
		this.place = place;
		this.email = email;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirth() {
		return this.birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getNation() {
		return this.nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getEdu() {
		return this.edu;
	}

	public void setEdu(String edu) {
		this.edu = edu;
	}

	public String getWork() {
		return this.work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}