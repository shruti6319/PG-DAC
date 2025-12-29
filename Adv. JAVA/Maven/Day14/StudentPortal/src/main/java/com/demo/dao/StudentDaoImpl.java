package com.demo.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Student;
@Repository
public class StudentDaoImpl implements StudentDao{
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public List<Student> findAllStudents() {
		List<Student> plist=jdbcTemplate.query("select * from student", (rs,numrows)->{
			Student s=new Student();
			s.setSid(rs.getInt(1));
			s.setSname(rs.getString(2));
			s.setEmail(rs.getString(3));
			if(rs.getDate(4)==null) {
				s.setDob(null);
			}else {
			    s.setDob(rs.getDate(4).toLocalDate());
			}
			s.setAddr(rs.getString(5));
			return s;
		});
		return plist;
	}
	@Override
	public Student update(int sid) {
		try
		{
			Student s=jdbcTemplate.queryForObject("select * from Student where sid=?", 
					new Object[] {sid},BeanPropertyRowMapper.newInstance(Student.class));
			return s;
		}
		catch(EmptyResultDataAccessException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	@Override
	public boolean updateStud(Student s) {
		int n=jdbcTemplate.update("update student set sname=?,email=?,dob=?,addr=? where sid=?",
				new Object[] {
						s.getSname(),s.getEmail(),s.getDob(),s.getAddr(),s.getSid()
				});
		
		return n>0;
	}
	@Override
	public boolean addStud(Student s) {
		
		int n =jdbcTemplate.update("insert into student values(?,?,?,?,?)" ,new Object[]
				{
					s.getSid(),s.getSname(),s.getEmail(),s.getDob(),s.getAddr()	
				});
		return n>0;
	}
	@Override
	public boolean remove(int sid) {
		int n  =jdbcTemplate.update("delete from student where sid=?", new Object []{sid});
		return n>0;
	}

}
