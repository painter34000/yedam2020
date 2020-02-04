package com.yedam.hsw.classes.extendPkg;

public class UnivFriend extends Friend {

	private String university;

	public UnivFriend(String name, String phone,String univ) {
		super(name, phone);
		// TODO Auto-generated constructor stub
		this.university = university;

	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	@Override
	public void showInf() {
		// TODO Auto-generated method stub
		super.showInf();
		System.out.println("학교친구 이름은 :"+super.getName());
		System.out.println("학교친구 전화번호는 :"+super.getPhone());
		System.out.println("학교는:"+university);
	}

	
	
	
}
