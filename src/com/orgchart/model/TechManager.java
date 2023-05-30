package com.orgchart.model;

import java.util.ArrayList;
import java.util.List;

public class TechManager extends Developer implements Employee {

	public TechManager(String firstName, String lastName, String position) {
		super(firstName, lastName, position);
	}
	
	private List<Employee> developers = new ArrayList<Employee>();
	

	public void addEmployee(Employee developer) {
		this.developers.add(developer);
	}
	
	@Override
	public String getOrganizationInformation() {
		StringBuilder organizationInformation = new StringBuilder(super.getOrganizationInformation());
		for(Employee employee: this.developers) {
			organizationInformation.append("\n\t").append(employee.getOrganizationInformation());
		}
		return organizationInformation.toString();
	}
	
	
}
