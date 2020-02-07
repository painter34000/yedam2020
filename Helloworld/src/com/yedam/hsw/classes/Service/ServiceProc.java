package com.yedam.hsw.classes.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yedam.hsw.classes.interfaces.model.Employees;

public class ServiceProc {
	List<Employees> list = new ArrayList<>();
	ServiceImpl service = new ServiceImpl();
	Scanner scn = new Scanner(System.in);

	public void execute() {
		System.out.println("==============================================");
		System.out.println("1.추가  2.리스트  3.조회  4.수정  5.종료");
		System.out.println("==============================================");
		System.out.println("선택>");
		int menu = scn.nextInt();
		if (menu == 1) {
			System.out.println("id 입력:");
			System.out.println("firstname 입력:");
			Employees emp = new Employees();
			int employeeId = scn.nextInt();
			emp.setEmployeeId(employeeId);
			emp.setFistName(firstName);
			service.addMember(emp, list);
		} else if (menu == 2) {
			List<Employees> list = service.getMemberList(list);
		} else if (menu == 3) {
			service.getMember(memberId, list);
		} else if (menu == 4) {
			service.undateMember(emp, list);
		} else if (menu == 5) {
			break;
		}
	}

}
