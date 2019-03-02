package com.atguigu.ssm.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.ssm.beans.Customer;
import com.atguigu.ssm.mapper.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerMapper customerMapper;
	@Override
	public List<Customer> listAllCustomers() {
		return customerMapper.selectAllCusts();
	}
	@Override
	public Integer addNewCust(Customer customer) {
		return customerMapper.addNewCust(customer);
	}
	@Override
	public Customer selectCustomerById(Integer id) {
		return customerMapper.selectById(id);
	}
	@Override
	public Integer updateCustById(Customer customer) {
		return customerMapper.updateCustById(customer);
	}
	@Override
	public Boolean deleteCustById(Integer id) {
		return customerMapper.deleteCustById(id);
	}

}
