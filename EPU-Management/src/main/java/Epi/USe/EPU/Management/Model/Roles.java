package Epi.USe.EPU.Management.Model;

public class Roles
{
    private int RoleID;
    private String RoleName;
    private Double BaseSalary;
    private Double OvertimeRate;
    private String Department;


    public Roles(int roleID, String roleName, Double baseSalary, Double overtimeRate, String department) {
        RoleID = roleID;
        RoleName = roleName;
        BaseSalary = baseSalary;
        OvertimeRate = overtimeRate;
        Department = department;
    }

    public int getRoleID() {
        return RoleID;
    }

    public void setRoleID(int roleID) {
        RoleID = roleID;
    }

    public Double getOvertimeRate() {
        return OvertimeRate;
    }

    public void setOvertimeRate(Double overtimeRate) {
        OvertimeRate = overtimeRate;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getRoleName() {
        return RoleName;
    }

    public void setRoleName(String roleName) {
        RoleName = roleName;
    }

    public Double getBaseSalary() {
        return BaseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        BaseSalary = baseSalary;
    }



}
