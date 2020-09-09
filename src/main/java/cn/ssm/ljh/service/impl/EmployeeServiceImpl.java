package cn.ssm.ljh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ssm.ljh.entity.Employee;
import cn.ssm.ljh.mapper.EmployeeMapper;
import cn.ssm.ljh.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeMapper empMapper;
	@Override
	public Employee selEmpById(Integer id) {
		// TODO Auto-generated method stub
		return empMapper.selectByPrimaryKey(id);
	}

}
