package com.hkafeidou.springcloudconsumerdept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hkafeidou.springcloudconsumerdept.business.HomeBusiness;
import com.hkafeidou.springcloudconsumerdept.dto.DeptHomeDto;
import com.hkafeidou.springcloudsimple.infrastructure.entity.Department;
import com.hkafeidou.springcloudsimple.infrastructure.enumtype.ServiceProviderEnum;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	HomeBusiness homeBusiness; 
	
	@RequestMapping("/index")
	public DeptHomeDto index() {
		return homeBusiness.getDeptHomeData();
	}
	
	@RequestMapping("/list")
	public List<Department> getList(){
		return homeBusiness.getList();
	}
	
	@Autowired
	private DiscoveryClient discoveryClient;
	@RequestMapping(value="/discovery",method=RequestMethod.GET)
	public Object discovery() {
		List<String> list=discoveryClient.getServices();
		System.out.println("*************>"+list);
		List<ServiceInstance> serviceList=discoveryClient.getInstances(ServiceProviderEnum.DEPT_PROVIDER.getValue());
		for(ServiceInstance serviceEle : serviceList) {
			System.out.println(serviceEle.getServiceId()+"\t"+serviceEle.getHost()+"\t"+serviceEle.getPort()+"\t"+serviceEle.getUri());
		}
		return this.discoveryClient;
	}
	
	
	
}
