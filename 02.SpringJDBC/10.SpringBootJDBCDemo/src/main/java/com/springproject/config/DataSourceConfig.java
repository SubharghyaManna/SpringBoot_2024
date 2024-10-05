//package com.springproject.config;
//
//import java.beans.PropertyVetoException;
//
//import javax.sql.DataSource;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.mchange.v2.c3p0.ComboPooledDataSource;
//
//@Configuration
//public class DataSourceConfig {
//
//	@Bean
//	ComboPooledDataSource createC3P0() throws PropertyVetoException {
//		
//		ComboPooledDataSource source = new ComboPooledDataSource();
//		source.setJdbcUrl("jdbc:mysql:///subharghya");
//		source.setDriverClass("com.mysql.cj.jdbc.Driver");
//		source.setUser("root");
//		source.setPassword("admin");
//		
//		return source;
//	}
//	
//}
