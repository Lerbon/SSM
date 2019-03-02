package com.atguigu.ssm.mapper;

import java.util.List;

import com.atguigu.ssm.beans.Customer;

public interface CustomerMapper {

	/**
	 * 查询所有员工信息
	 * 
	 * @return
	 */
	public List<Customer> selectAllCusts();
	
	/**
	 * 根据id查询员工
	 */
	public Customer selectById(Integer id);

	/**
	 * 添加新员工
	 */
	public Integer addNewCust(Customer customer);

	/**
	 * 根据id删除员工
	 */
	public boolean deleteCustById(Integer id);

	/**
	 * 更新指定id的顾客
	 */
	public Integer updateCustById(Customer customer);
}
