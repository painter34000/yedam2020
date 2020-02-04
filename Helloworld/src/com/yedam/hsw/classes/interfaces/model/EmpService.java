package com.yedam.hsw.classes.interfaces.model;

public interface EmpService {
	// 저장기능
	public void addEmp(Employee emp, Employee[] emps);

	// 조회기능
	public void searchEmp(int empNo, Employee[] emps);

	// 리스트
	public void empList(Employee[] emp);

	// 삭제
	public void delEmp(int empNo, Employee[] emps);

}
