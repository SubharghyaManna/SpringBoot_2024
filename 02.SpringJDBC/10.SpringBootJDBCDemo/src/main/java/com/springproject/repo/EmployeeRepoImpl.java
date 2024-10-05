package com.springproject.repo;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.jdbc.core.simple.JdbcClient.ResultQuerySpec;
import org.springframework.jdbc.core.simple.JdbcClient.StatementSpec;
import org.springframework.stereotype.Repository;

import com.springproject.entity.Employee;


public class EmployeeRepoImpl implements EmployeeRepo {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Autowired
	JdbcClient jdbcClient;

	@Override
	public Employee save(Employee employee) {
		// Case #1: Placeholder (JdbcTemplate)
		/*String query = "INSERT INTO employee (empId, empname, empSal) VALUES(?, ?, ?)";
		if (jdbcTemplate.update(query, employee.getEmpId(), employee.getEmpName(), employee.getEmpSal()) == 0) {
			return null;
		}*/
		
		// Case #2: Named Parameter (NamedParameterJdbcTemplate)
		/*String query = "INSERT INTO employee (empId, empname, empSal) VALUES(:id, :name, :sal)";
		
		if (namedParameterJdbcTemplate.update(query, new MapSqlParameterSource().addValue("id", employee.getEmpId())
				.addValue("name", employee.getEmpName()).addValue("sal", employee.getEmpSal())
		) == 0) {
			return null;
		}*/
		
		// Case #3: Placeholder (JdbcClient)
		/*String query = "INSERT INTO employee (empId, empname, empSal) VALUES(?, ?, ?)";

		StatementSpec spec = jdbcClient.sql(query);
		spec.param(1, employee.getEmpId());
		spec.param(2, employee.getEmpName());
		spec.param(3, employee.getEmpSal());

		if (spec.update() == 0) {
			return null;
		}*/
		
		//Case #4: Named Parameter (JdbcClient)
		String query = "INSERT INTO employee (empId, empname, empSal) VALUES(:id, :name, :sal)";
		StatementSpec spec = jdbcClient.sql(query);
		spec.param("id", employee.getEmpId());
		spec.param("name", employee.getEmpName());
		spec.param("sal", employee.getEmpSal());

		if (spec.update() == 0) {
			return null;
		}
		
		return employee;
	}

	@Override
	public List<Employee> findAll() {
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

	@Override
	public List<Employee> findByEmpName(String name) {
		// Case #1: Placeholder (JdbcTemplate)
		/*String query = "SELECT * FROM employee WHERE empName = ?";

//		List<Map<String, Object>> list = jdbcTemplate.queryForList(query, name);
//
//		List<Employee> employees = new ArrayList<>();
//
//		for (Map<String, Object> row : list) {
//
//			Employee employee = new Employee();
//			employee.setEmpId((int) row.get("EMPID"));
//			employee.setEmpName((String) row.get("EMPNAME"));
//			employee.setEmpSal(Double.valueOf((float) row.get("EMPSAL")));
//
//			employees.add(employee);
//		}

		return jdbcTemplate.queryForList(query, name)
				.stream()
				.map(row -> new Employee((int) row.get("EMPID"), (String) row.get("EMPNAME"), Double.valueOf((float) row.get("EMPSAL"))))
				.collect(Collectors.toList());*/
		
		// Case #2: Named Parameter (NamedParameterJdbcTemplate)
		/*String query = "SELECT * FROM employee WHERE empName = :name";
		
		return namedParameterJdbcTemplate.queryForList(query, new MapSqlParameterSource().addValue("name", name))
				.stream()
				.map(row -> new Employee((int) row.get("EMPID"), (String) row.get("EMPNAME"), Double.valueOf((float) row.get("EMPSAL"))))
				.collect(Collectors.toList());*/
		
		// Case #3: Placeholder (JdbcClient)
		/* String query = "SELECT * FROM employee WHERE empName = ?";

		StatementSpec spec = jdbcClient.sql(query);
		spec.param(1, name);

		return spec.query().listOfRows()
				.stream()
				.map(row -> new Employee((int) row.get("EMPID"), (String) row.get("EMPNAME"), Double.valueOf((float) row.get("EMPSAL"))))
				.collect(Collectors.toList());*/
		
		// Case #4: Named Parameter (JdbcClient)
		String query = "SELECT * FROM employee WHERE empName = :name";
		
		StatementSpec spec = jdbcClient.sql(query);
		spec.param("name", name);

		return spec.query().listOfRows()
				.stream()
				.map(row -> new Employee((int) row.get("EMPID"), (String) row.get("EMPNAME"), Double.valueOf((float) row.get("EMPSAL"))))
				.collect(Collectors.toList());

	}

}
