package com.atguigu.ssm.beans;

/**
 * 顾客是从上帝
 * @author York
 *
 */
public class Customer {
	private Integer id;
	private String name;
	private String gender;
	private String email;
	private Integer age;
	private Department dept;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Department getDept() {
		return dept;
	}



	public void setDept(Department dept) {
		this.dept = dept;
	}



	public Customer(Integer id, String name, String gender, String email, Integer age, Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.age = age;
		this.dept = dept;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", gender=" + gender + ", email=" + email + ", age=" + age
				+ ", dept=" + dept + "]";
	}


}
