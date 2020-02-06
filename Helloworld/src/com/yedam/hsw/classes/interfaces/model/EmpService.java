package com.yedam.hsw.classes.interfaces.model;

import java.util.List;

public interface EmpService {
	// 저장기능
	public void addEmp(Employee emp, Employee[] emps);

	// 조회기능
	public void searchEmp(int empNo, Employee[] emps);

	// 리스트
	public void empList(Employee[] emp);

	// 삭제
	public void delEmp(int empNo, Employee[] emps);

	//디비 연결 죄회 기능
	public void searchEmployees();
	
	//디비 입력 기능
	public void insertEmployees(Employees emp);
	
	//==>collection 디비 처리
	//1. 전체 데이타 조회
	public List<Employees> getDBEmployees();
	
	//2. 한건만 조회
	public Employees getDBEmployee(int empId);
	
	//3.입력
	public void insertDBEmp(Employees emp);
	
	//4.수정
	public void updateDBEmp(Employees emp);
	
}
