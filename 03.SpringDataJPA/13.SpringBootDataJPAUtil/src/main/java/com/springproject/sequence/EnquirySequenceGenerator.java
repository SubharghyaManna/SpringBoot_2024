package com.springproject.sequence;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class EnquirySequenceGenerator implements IdentifierGenerator {

	private static final long serialVersionUID = 1L;

	private void init(SharedSessionContractImplementor session) {

		// Create a table if not available
		String query1 = "CREATE TABLE ENQ_SEQ(NEXTVAL INT)";

		// set the default value of the NEXTVAL as 0 or 1
		String query2 = "INSERT INTO ENQ_SEQ (NEXTVAL) VALUES (1)";

		Connection con;
		Statement st;
		try {
			con = session.getJdbcConnectionAccess().obtainConnection();
			st = con.createStatement();
			st.executeUpdate(query1);
			st.executeUpdate(query2);
		} catch (SQLException e) {
			// ignore
		}

	}

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) {

		String prefix = "OD";
		String suffix = null;

		// Get the next seq value
		try {

			init(session);

			String query1 = "SELECT NEXTVAL FROM ENQ_SEQ";
			String query2 = "UPDATE ENQ_SEQ SET NEXTVAL=NEXTVAL+1"; // increment the value

			Connection con = session.getJdbcConnectionAccess().obtainConnection();
			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery(query1);
			if (rs.next()) {
				suffix = String.format("%010d", rs.getInt(1));
			}

			st.executeUpdate(query2);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return prefix + suffix;
	}

}
