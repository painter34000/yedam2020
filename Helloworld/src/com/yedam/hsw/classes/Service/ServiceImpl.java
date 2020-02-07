package com.yedam.hsw.classes.Service;

import java.util.ArrayList;
import java.util.List;

import com.yedam.hsw.classes.interfaces.model.Employees;

public class ServiceImpl implements Service {

	@Override
	public void addMember(Employees emp, List<Employees> list) {
		list.add(emp);

	}

	@Override
	public Employees getMember(int memberId, List<Employees> list) {
		return null;
	}

	@Override
	public List<Employees> getMemberList(List<Employees> list) {
		List<Employees> destList = new ArrayList<>();
		for (Employees emp : list) {
			destList.add(emp);
		}
		return destList;
	}

	@Override
	public void updateMember(Employees emp, List<Employees> list) {
	
	}

}