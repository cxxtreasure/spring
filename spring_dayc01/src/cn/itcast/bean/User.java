package cn.itcast.bean;

public class User {
	public User() {
		System.out.println("User对象空参构造方法!!!!");
	}
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
