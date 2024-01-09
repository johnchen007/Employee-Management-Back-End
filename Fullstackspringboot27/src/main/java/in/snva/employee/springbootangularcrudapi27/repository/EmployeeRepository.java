package in.snva.employee.springbootangularcrudapi27.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.snva.employee.springbootangularcrudapi27.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
