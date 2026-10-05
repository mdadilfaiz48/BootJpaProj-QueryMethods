package com.adil.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.adil.entity.Employee;

import jakarta.transaction.Transactional;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
   
	//@Query("from Employee")
	//@Query(value = "SELECT * FROM EMP", nativeQuery = true)
	/*@Query("FROM Employee")
	public List<Employee> showAllEmployees();
	
	@Query("from Employee where salary>=?1 and salary<=?2")
	public List<Employee> showEmployeesBySalaryRange(double start, double end);
	
	@Query("from Employee where salary >=:min and salary <=:max")
	public List<Employee> fetchEmpBySalaryRange(@Param("min")double start, @Param("max")double end);
	
	@Query("from Employee where salary >=:min and salary <=:max")
	public List<Employee> loadEmpBySalaryRange(double min, double max);*/ // @Param annotation is optional if the parameter names match the named parameters in the query
	
	/*@Query("from Employee where job in(:desg1,:desg2,:desg3)")//Entity Query
	public List<Employee> showEmpsByDesg(String desg1,String desg2,String desg3);
	@Query("select empName,empId,job from Employee where job in(:desg1,:desg2,:desg3)") // Scalar Query getting specific multiple columns value from the entity
	public List<Object[]> showEmpsDataByDesg(String desg1,String desg2,String desg3);
	
	
	@Query("select empName from Employee where empName like :initChars") //Scalar Query getting specific single column value from the entity
	public List<String> showEmpNamesByChars(String initChars);*/
	
	/*@Query("from Employee where empName=:name")
	public  Employee fetchByName(String name); // single record entity query
	
	@Query("select empId,empName,salary from Employee where empName=:name")
	public  Object fetchDataByName(String name); // single record scalar query giving multiple columns value from the entity
	
	@Query("select salary from Employee where empName=:name")
	public  Double fetchEmpSalByName(String name);*/ // single record scalar query giving single column value from the entity
	
	/*@Query("select count(distinct empName) from Employee")
	public long showEmpsUniqueCount();
	
	@Query("select count(*),max(salary),min(salary),avg(salary),sum(salary) from Employee")
	public Object showAggregateData();*/ // single record scalar query giving multiple columns value from the entity using aggregate functions
	
	//********************************************Non-select queries (DML)********************************************
	
	/* @Transactional
	 @Modifying
	 @Query("update Employee set salary=salary+(salary*:percentage/100) where job=:desg")
	 public int hikeSalaryByDesg(String desg, double percentage);*/
	 
	 /*@Transactional
	 @Modifying
	 @Query("delete from Employee where salary>=:start and salary<=:end")
	 public int removeEmpsBySalaryRange(double start, double end);*/ // delete query using method name convention
	 
	 @Query(value="SELECT now()", nativeQuery = true)
	 public LocalDateTime showSysDateTime(); // select query using method name convention
}
