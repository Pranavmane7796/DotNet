package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.LeaveDetails;

@Repository
public class LeaveDaoImpl implements LeaveDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void addDetails(LeaveDetails ld) {
		
		String str="insert into leavedetails values(?,?,?,?,?,?)";
		jdbcTemplate.update(str,new Object[] {ld.getLeaveId() , ld.getApplyDate(), ld.getEndDate() , ld.getLeaveType(),ld.getLeavereason()
				, ld.getEmpNo()});
		
	}
	

}
