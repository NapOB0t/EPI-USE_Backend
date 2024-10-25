package Epi.USe.EPU.Management.Controller;

import Epi.USe.EPU.Management.Model.Employee;
import Epi.USe.EPU.Management.Model.EmployeeNode;
import Epi.USe.EPU.Management.Model.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeService {

    private final EmployeeRepository empRepository;


    public EmployeeService(EmployeeRepository empRepository ) //Initializes the a instance of the database repository
    {
        this.empRepository = empRepository;

    }


    public List<Employee> getAllEmp() // funtion fetches all employee data from the database and stores in list
    {
        return empRepository.findAll();

    }

    public Employee getEmpByID(String id)
    {

        return empRepository.findById(id).orElse(null);

    }

    public Employee createEmp(Employee employee)
    {
        return empRepository.save(employee);
    }

    public Employee UpdateEmp(String id, Employee empDetails)
    {
        Employee emp = empRepository.findById(id).orElse(null);

        if(emp != null)
        {
            emp.setFirst_name(empDetails.getFirst_name());
            emp.setLast_name(empDetails.getLast_name());
            emp.setDob(empDetails.getDob());
            emp.setPhone_number(empDetails.getEmp_number());
            emp.setEmail(empDetails.getEmail());
            emp.setRole_id(empDetails.getRole_id());
            emp.setManager_id(empDetails.getManager_id());
            emp.setHire_date(empDetails.getHire_date());
            emp.setStatus(empDetails.getStatus());

            return empRepository.save(emp);
        }

        return null;

    }

    public void deleteEmp(String id)
    {
        empRepository.deleteById(id);

    }


}
