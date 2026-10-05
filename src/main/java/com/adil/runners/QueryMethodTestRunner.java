package com.adil.runners;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.adil.repository.IEmployeeRepository;

@Component
public class QueryMethodTestRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeRepository empRepo;

	@Override
	public void run(String... args) throws Exception {

		// empRepo.showAllEmployees().forEach(System.out::println);
		// empRepo.showEmployeesBySalaryRange(50000,
		// 60000).forEach(System.out::println);

		// empRepo.fetchEmpBySalaryRange(50000, 60000).forEach(System.out::println);

		// empRepo.loadEmpBySalaryRange(50000, 60000).forEach(System.out::println);

		/*
		 * empRepo.showEmpsByDesg("Developer", "Tester",
		 * "Manager").forEach(System.out::println);
		 * System.out.println("---------------------------------------------------");
		 * empRepo.showEmpsDataByDesg("Developer", "Tester", "HR").forEach(row->{
		 * System.out.println(row[0]+" "+row[1]+" "+row[2]); });
		 * System.out.println("---------------------------------------------------");
		 * 
		 * empRepo.showEmpNamesByChars("A%").forEach(System.out::println);
		 */

		/*System.out.println("single record entity query result:: " + empRepo.fetchByName("Adil"));
		System.out.println("-----------------------------------------------");
		Object data = empRepo.fetchDataByName("Adil");
		Object[] row = (Object[]) data;
		System.out.println("single record scalar query result giving multiple columns value from the entity:: "+Arrays.toString(row));
		System.out.println("-----------------------------------------------");
		System.out.println("single record scalar query result giving single column value from the entity:: "+ empRepo.fetchEmpSalByName("Adil"));*/
		
		/*System.out.println("unique emp names count:: "+empRepo.showEmpsUniqueCount());
		System.out.println("-----------------------------------------------");
		Object data = empRepo.showAggregateData();
		Object[] row = (Object[]) data;
		System.out.println("single record scalar query result giving multiple columns value from the entity using aggregate functions:: "+Arrays.toString(row));
		System.out.println("-----------------------------------------------");*/
		
		//********************************************Non-select queries (DML)********************************************
		
		 /*int count = empRepo.hikeSalaryByDesg("Developer", 5.0);
		 System.out.println("No of records affected:: "+count);*/
		
		/*int count = empRepo.removeEmpsBySalaryRange(50000, 80000);
		System.out.println("No of records affected:: "+count);*/
		
		LocalDateTime ldt = empRepo.showSysDateTime();
		System.out.println("System date and time:: "+ldt);
		
		

	}

}
