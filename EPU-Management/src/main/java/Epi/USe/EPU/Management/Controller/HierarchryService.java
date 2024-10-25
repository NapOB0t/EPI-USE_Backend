package Epi.USe.EPU.Management.Controller;

import Epi.USe.EPU.Management.Model.Employee;
import Epi.USe.EPU.Management.Model.EmployeeNode;
import Epi.USe.EPU.Management.Model.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HierarchryService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeNode buildHierarchy() {
        List<Employee> allEmployees = employeeRepository.findAll();


        Map<String, EmployeeNode> employeeMap = new HashMap<>();

        // Code creates the root node if there is no ceo
        EmployeeNode rootNode = new EmployeeNode("ROOT", "Organization", "", 0);

        // Initialize all employee nodes
        for (Employee employee : allEmployees) {
            employeeMap.put(employee.getEmp_number(), new EmployeeNode(
                    employee.getEmp_number(),
                    employee.getFirst_name(),
                    employee.getLast_name(),
                    employee.getRole_id()
            ));
        }

        // Build the hierarchy
        for (Employee employee : allEmployees) {
            String empNumber = employee.getEmp_number();
            String managerId = employee.getManager_id();

            EmployeeNode employeeNode = employeeMap.get(empNumber);

            if (managerId == null) {
                // No manager, so add to the rootNode
                rootNode.addSubordinate(employeeNode);
            } else {
                // Find the manager node and add the employee as a subordinate
                EmployeeNode managerNode = employeeMap.get(managerId);
                if (managerNode != null) {
                    managerNode.addSubordinate(employeeNode);
                }
            }
        }

        return rootNode; // Return the hierarchical structure
    }
}
