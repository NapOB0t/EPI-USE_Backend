package Epi.USe.EPU.Management.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="employee")
public class Employee {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String emp_number;
    private String first_name;
    private String last_name;
    private Date dob;
    private String email;
    private String phone_number;
    private String manager_id;
    private int role_id;
    private Date hire_date;
    private String status;

    public Employee(){}
    public Employee(String empNumber, String name, String surname, Date dateOfBirth, String email, String phone, Double salary, String managerID, int roleID, Date hireDate, String status) {
        emp_number = empNumber;
        first_name = name;
        last_name = surname;
        dob = dateOfBirth;
        this.email = email;
        this.phone_number = phone;
        manager_id = managerID;
        role_id = roleID;
        hire_date = hireDate;
        this.status = status;
    }

    public String getEmp_number() {
        return emp_number;
    }

    public void setEmp_number(String emp_number) {
        this.emp_number = emp_number;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getManager_id() {
        return manager_id;
    }

    public void setManager_id(String manager_id) {
        this.manager_id = manager_id;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public Date getHire_date() {
        return hire_date;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }








}
