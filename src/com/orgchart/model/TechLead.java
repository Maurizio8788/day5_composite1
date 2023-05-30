package com.orgchart.model;

import java.util.ArrayList;
import java.util.List;

public class TechLead extends Developer implements Employee
{
    private List<Employee> developers = new ArrayList<Employee>();
    public TechLead(String firstName, String lastName, String position) {
        super(firstName, lastName, position);
    }

    public void addEmployee(Employee developer) {
        this.developers.add(developer);
    }

    @Override
    public String getOrganizationInformation() {
        StringBuilder organizationInfo = new StringBuilder(super.getOrganizationInformation());
        for(Employee employee : this.developers) {
            organizationInfo.append("\n\t").append(employee.getOrganizationInformation());
        }
        return organizationInfo.toString();
    }
}
