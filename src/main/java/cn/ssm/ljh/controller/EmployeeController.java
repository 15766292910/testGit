package cn.ssm.ljh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import cn.ssm.ljh.entity.Employee;
import cn.ssm.ljh.service.EmployeeService;

//<!--run as== Maven builder ==mybatis-generator:generate-->
@Controller
@RestControllerAdvice
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@GetMapping("/getemp")
	@ResponseBody
	public Employee getEmp(@RequestParam(name = "id") Integer id) {
		Employee emp = employeeService.selEmpById(id);
		return emp;
	
	
	
	
	}
	
}
