package com.springproject.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springproject.model.Customer;

@Repository
public class MySQLCustomerDAOImpl implements ICustomerDAO {

	private static final String CUSTOMER_INSERT_QUERY = "INSERT INTO customer (cname, caddr, pamt, intramt) VALUES(?,?,?,?)";

	@Autowired
	private DataSource ds;

	@Override
	public int insert(Customer customer) throws Exception {

		int count = 0;

		// get pooled JDBC Connection

		try (Connection con = ds.getConnection()) {

			PreparedStatement statement = con.prepareStatement(CUSTOMER_INSERT_QUERY);

			if (statement != null) {
				statement.setString(1, customer.getCname());
				statement.setString(2, customer.getCaddr());
				statement.setDouble(3, customer.getPamt());
				statement.setDouble(4, customer.getIntramt());

				count = statement.executeUpdate();
			}

		} catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return count;
	}

}
