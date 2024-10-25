package Epi.USe.EPU.Management.Controller;

import Epi.USe.EPU.Management.Model.Employee;
import Epi.USe.EPU.Management.Model.EmployeeNode;
import Epi.USe.EPU.Management.Model.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private HierarchryService hierarchyService;

//    public EmployeeController(EmployeeService empService)
//    {
//        this.employeeService = empService;
//    }

    @GetMapping
    public List<Employee> getAllEmployees()
    {

        return employeeService.getAllEmp();

    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee>  getEmployeeId(@PathVariable String id)
    {
        Employee employee = employeeService.getEmpByID(id);
        return employee != null ? ResponseEntity.ok(employee): ResponseEntity.notFound().build();
    }

    @GetMapping("/hierarchy")
    public ResponseEntity<EmployeeNode> getHierarchy() {
        EmployeeNode hierarchy = hierarchyService.buildHierarchy();
        return ResponseEntity.ok(hierarchy);
    }



    @PostMapping

    public Employee createEmployee(@RequestBody Employee employee)
    {

        return employeeService.createEmp(employee);

    }

    //Updating

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable String id, @RequestBody Employee employeeDetails)
    {
        Employee updateEmp = employeeService.UpdateEmp(id, employeeDetails);
        return updateEmp != null ? ResponseEntity.ok(updateEmp): ResponseEntity.notFound().build();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmp(@PathVariable String id)
    {
        employeeService.deleteEmp(id);
        return ResponseEntity.noContent().build();
    }



}
