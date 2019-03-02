package com.atguigu.ssm.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.ssm.beans.Department;
import com.atguigu.ssm.mapper.DepartmentMapper;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
	private DepartmentMapper departmentMapper;
	
	public List<Department> listAllDepartments(){
		return departmentMapper.selectAllDepartments();
	}
}
