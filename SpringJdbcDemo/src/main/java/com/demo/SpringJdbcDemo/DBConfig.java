package com.demo.SpringJdbcDemo;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DBConfig {

	public DBConfig() {
		System.out.println("Db Config constructor");
	}
	/*
	 * Requires connection parameters
	 * Create object of type DataSource
	 */
	@Bean
	public DataSource dataSource()
	{
		System.out.println("creating data source object");
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:8889/synechron");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	// Use JdbcTemplate providing the reference for DataSource
	@Bean
	public JdbcTemplate jdbcTemplate()
	{
		return new JdbcTemplate(dataSource());
	}
}
