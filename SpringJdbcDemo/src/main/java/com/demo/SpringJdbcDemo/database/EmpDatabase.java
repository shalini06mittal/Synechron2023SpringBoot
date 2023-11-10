package com.demo.SpringJdbcDemo.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.demo.SpringJdbcDemo.entity.Emp;

@Repository // stereotypes => semantic
//@Component
public class EmpDatabase {

	@Autowired
	private JdbcTemplate template;
	
	public int count()
	{
		return this.template.queryForObject("select count(*) from emp", Integer.class);
	}
	
	public boolean insertEmp(Emp emp)
	{
		this.template.update("insert into emp(ename, city) values(?,?)", emp.getEname(), emp.getCity());
		return true;
	}
	public Emp getEmpById(int id) {
		
		return this.template.queryForObject("select * from emp where eid = ?", new EmpMapper(), id);
	}
	class EmpMapper implements RowMapper<Emp>{

		@Override
		public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			Emp e1 = new Emp();
			e1.setEid(rs.getInt(1));
			e1.setEname(rs.getString(2));
			e1.setCity(rs.getString(3));
			return e1;
		}
		
	}
}
