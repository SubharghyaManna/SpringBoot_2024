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

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) {

		static {
			// Create a table if not available
			// set the default value as 0 or 1
		}

		String prefix = "OD";
		String suffix = null;

		// Get the next seq value
		try {

			String query1 = "SELECT NEXTVAL FROM ENQ_SEQ";
			String query2 = "UPDATE ENQ_SEQ SET NEXTVAL=NEXTVAL+1";

			Connection con = session.getJdbcConnectionAccess().obtainConnection();
			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery(query1);
			if (rs.next()) {
				suffix = rs.getString(1);
			}

			st.executeUpdate(query2);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return prefix + suffix;
	}

}
