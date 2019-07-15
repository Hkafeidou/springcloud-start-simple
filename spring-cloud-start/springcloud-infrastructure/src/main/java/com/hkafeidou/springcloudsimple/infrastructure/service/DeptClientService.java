package com.hkafeidou.springcloudsimple.infrastructure.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hkafeidou.springcloudsimple.infrastructure.entity.Department;

@FeignClient(value="SPRINGCLOUD-PROVIDER-DEPT")
public interface DeptClientService {
//	@RequestMapping(value="/dept/create",method = RequestMethod.POST)
//	public boolean create(Department entity);
//	@RequestMapping(value="/dept/getById/{id}",method = RequestMethod.GET)
//	public Department getByCode(@PathVariable("id") int id);	
//	@RequestMapping(value="/dept/list",method = RequestMethod.GET)
//	public List<Department> getList();
	
	@RequestMapping(value = "/dept/getById/{id}",method = RequestMethod.GET)
	public Department getById(@PathVariable("id") int id) ;
	
	@RequestMapping(value = "/dept/create",method = RequestMethod.POST)
	public boolean createDept(@RequestBody Department dept) ;
	
	@RequestMapping(value = "/dept/list",method = RequestMethod.GET)
	public List<Department> getList();
	
}
