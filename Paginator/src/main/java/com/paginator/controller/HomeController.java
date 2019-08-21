package com.paginator.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.paginator.mediators.PagesLength;
import com.paginator.repository.EmployeeRepository;
import com.paginator.services.EmployeeSevice;

@RestController
@CrossOrigin
public class HomeController {
	
	@Autowired
	EmployeeSevice empService;
	
	@Autowired
	EmployeeRepository empResp;
	
	@GetMapping("/")
	public String home()
	{
		System.out.println("/ request...");
		return "/ request...";
	}
	
	@GetMapping("/getEmployeeData")
	public ResponseEntity<?> getEmployeeData()
	{
		System.out.println("/getEmployeeData request...");
//		return ResponseEntity.ok(empService.getEmployeeData("atul pisal"));
		return null;
	}
	
	@PostMapping("/postEmployeeData")
//	public ResponseEntity<?> postEmployeeData(@RequestBody PagesLength obj)
	public ResponseEntity<?> postEmployeeData(@RequestBody PagesLength obj)
	{
		System.out.println("/postEmployeeData request..."+obj+" : "+obj.getStartPage()+" : "+obj.getPageSize());
//		return ResponseEntity.ok(empService.getEmployeeData("atul pisal"));
		return ResponseEntity.ok(empService.getEmployeeData(obj.getStartPage(),obj.getPageSize()));
	}
	
	@GetMapping("/getEmployeeDataCount")
	public ResponseEntity<?> getEmployeeDataCount()
	{
		System.out.println("/getEmployeeDataCount request...");
//		return ResponseEntity.ok(empService.getEmployeeData("atul pisal"));
		
		JSONObject json=new JSONObject();
		json.put("request","/getEMployeeDataCount");
		json.put("result","success");
		json.put("status",true);
		json.put("data",empService.getEmployeeDataCount());
		return ResponseEntity.ok(json.toString());
		
//		return ResponseEntity.ok(empService.getEmployeeDataCount());
	}
}
