package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.LeaveDetails;
import com.demo.service.LeaveService;

@Controller
public class LeaveController {
	
	@Autowired
	private LeaveService lservice;
	
	@GetMapping("/")
	public String HomePage()
	{
		return "home";
	}
	
	@GetMapping("/leave")
	public String Leave()
	{
		return "leave";
	}
	
	@PostMapping("/applyleave")
	public ModelAndView ApplyLeave(@RequestParam String leaveId, @RequestParam String startDate,@RequestParam String endDate,
		@RequestParam String leaveType ,@RequestParam String leaveReason,@RequestParam int empno)
	{
	
		System.out.println(leaveId );
		LeaveDetails ld = new LeaveDetails(leaveId,startDate,endDate,leaveType,leaveReason,empno);
		lservice.addLeaveDetails(ld);
		
		return new ModelAndView("home");
		
	}

	

}
