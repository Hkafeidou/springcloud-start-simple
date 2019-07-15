package com.hkafeidou.springcloudproviderdept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hkafeidou.springcloudproviderdept.business.DepartmentBusiness;
import com.hkafeidou.springcloudsimple.infrastructure.entity.Department;



@RestController
@RequestMapping("/dept")
public class DepartmentController {
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Autowired
	private DepartmentBusiness departmentBusiness;
	
	@RequestMapping(value = "/getById/{id}",method = RequestMethod.GET)
	public Department getById(@PathVariable("id") int id) {
		return departmentBusiness.getByCode(id);
	}
	
	@RequestMapping(value = "/create",method = RequestMethod.POST)
	public boolean createDept(@RequestBody Department dept) {
		return departmentBusiness.create(dept);
	}
	
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public List<Department> getList() {
		return departmentBusiness.getList();
	}
	
	@RequestMapping(value="/discovery",method=RequestMethod.GET)
	public Object discovery() {
		List<String> list=discoveryClient.getServices();
		System.out.println("*************>"+list);
		List<ServiceInstance> serviceList=discoveryClient.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
		for(ServiceInstance serviceEle : serviceList) {
			System.out.println(serviceEle.getServiceId()+"\t"+serviceEle.getHost()+"\t"+serviceEle.getPort()+"\t"+serviceEle.getUri());
		}
		return this.discoveryClient;
	}
	
}
