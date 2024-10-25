package Epi.USe.EPU.Management.Model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeNode {
    private String empNumber;
    private String firstName;
    private String lastName;
    private int roleId;
    private List<EmployeeNode> subordinates;

    public EmployeeNode(String empNumber, String firstName, String lastName, int roleId) {
        this.empNumber = empNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.roleId = roleId;
        this.subordinates = new ArrayList<>();
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }

    public List<EmployeeNode> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<EmployeeNode> subordinates) {
        this.subordinates = subordinates;
    }




    public void addSubordinate(EmployeeNode employeeNode) {
        this.subordinates.add(employeeNode);
    }


}
