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
    public String getInformation() {
        StringBuilder organizationInfo = new StringBuilder(super.getInformation());
        for(Employee employee : this.developers) {
            organizationInfo.append("\n\t").append(employee.getInformation());
        }
        return organizationInfo.toString();
    }
}
