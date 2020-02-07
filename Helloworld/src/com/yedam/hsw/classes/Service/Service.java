package com.yedam.hsw.classes.Service;

import java.util.List;

import com.yedam.hsw.classes.interfaces.model.Employees;

public class Service {
	
	
	public void addMember(Employees emp, List<Employees> list);

	public Employees getMember(int memberId, List<Employees> list);

	public List<Employees> getMemberList(List<Employees> list);

	public void undateMember(Employees emp, List<Employees> list);

}
