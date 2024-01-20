package com.demo.model;

public class LeaveDetails {
	
	private String leaveId;
	private String applyDate;
	private String endDate;
	private String leaveType;
	private String leavereason;
	private int empNo;
	
	public LeaveDetails() {
		super();
	}

	public LeaveDetails(String leaveId, String applyDate, String endDate, String leaveType, String leavereason,
			int empNo) {
		super();
		this.leaveId = leaveId;
		this.applyDate = applyDate;
		this.endDate = endDate;
		this.leaveType = leaveType;
		this.leavereason = leavereason;
		this.empNo = empNo;
	}

	public String getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(String leaveId) {
		this.leaveId = leaveId;
	}

	public String getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public String getLeavereason() {
		return leavereason;
	}

	public void setLeavereason(String leavereason) {
		this.leavereason = leavereason;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	@Override
	public String toString() {
		return "LeaveDetails [leaveId=" + leaveId + ", applyDate=" + applyDate + ", endDate=" + endDate + ", leaveType="
				+ leaveType + ", leavereason=" + leavereason + ", empNo=" + empNo + "]";
	}
	
	

}
