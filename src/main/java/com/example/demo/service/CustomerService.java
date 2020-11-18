package com.example.demo.service;

import com.example.demo.entity.Customer;
import com.example.demo.mapper.CustomerMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CustomerService implements CustomerMapper{
    @Resource
    private CustomerMapper customerMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Customer record) {
        return 0;
    }

    @Override
    public int insertSelective(Customer record) {
        return 0;
    }

    @Override
    public Customer selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Customer record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Customer record) {
        return 0;
    }
}
