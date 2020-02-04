package com.yedam.hsw.classes.extendPkg;

public class ComFriend extends Friend{

	private String commpany;
	
	public ComFriend(String name, String phone,String company) {
		super(name, phone);
		this.commpany=commpany;
		
		// TODO Auto-generated constructor stub
	}


	

	public String getCommpany() {
		return commpany;
	}

	public void setCommpany(String company) {
		this.commpany = commpany;
	}
	
	@Override
	public void showInf() {
		// TODO Auto-generated method stub
		super.showInf();
		System.out.println("회사친구 이름은 :"+super.getName());
		System.out.println("회사친구 전화번호는 :"+super.getPhone());
		System.out.println("회사는:"+commpany);
	

}
}
