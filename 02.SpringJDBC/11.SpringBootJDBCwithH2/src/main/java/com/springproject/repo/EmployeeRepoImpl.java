package com.springproject.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springproject.entity.Employee;

@Repository
public class EmployeeRepoImpl implements EmployeeRepo {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Employee save(Employee employee) {
		String query = "INSERT INTO employee (empId, empname, empSal) VALUES(?, ?, ?)";
		if (jdbcTemplate.update(query, employee.getEmpId(), employee.getEmpName(), employee.getEmpSal()) == 0) {
			return null;
		}
		return employee;
	}

	@Override
	public List<Employee> getAll() {
		String query = "SELECT * FROM employee";

//		RowMapper<Employee> mapper = new RowMapper<Employee>() {
//
//			@Override
//			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
//				Employee employee = new Employee();
//				employee.setEmpId(rs.getInt("empId"));
//				employee.setEmpName(rs.getString("empName"));
//				employee.setEmpSal(rs.getDouble("empSal"));
//				return employee;
//			}
//		};

		return jdbcTemplate.query(query,
				(rs, rowNum) -> new Employee(rs.getInt("empId"), rs.getString("empName"), rs.getDouble("empSal")));
	}

}
