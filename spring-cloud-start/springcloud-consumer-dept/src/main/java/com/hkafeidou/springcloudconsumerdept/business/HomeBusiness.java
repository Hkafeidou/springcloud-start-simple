package com.hkafeidou.springcloudconsumerdept.business;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hkafeidou.springcloudconsumerdept.dto.DeptHomeDto;
import com.hkafeidou.springcloudsimple.infrastructure.entity.Department;

@Service
public class HomeBusiness {
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	//private static final String Provider_URL_PreFix="http://localhost:8000";
	
	private static final String Provider_URL_PreFix="http://springcloud-provider-dept";
	
	public DeptHomeDto getDeptHomeData() {
		
		DeptHomeDto model=new DeptHomeDto();
		model.setUuid(UUID.randomUUID().toString().replaceAll("-", ""));
		model.setRemark("服务消费!!!!");
		
		Department department = restTemplate.getForObject(Provider_URL_PreFix+"/dept/getById/1", Department.class);
		model.setDepartment(department); 
		
		
		
		return model;
	} 
	
	public boolean createDept(Department entity) {
		boolean result =false;
		if(entity!=null) {
			result = restTemplate.postForObject(Provider_URL_PreFix+"/dept/create", entity, Boolean.class);
		}
		
		
		return result;
	}
	
	@SuppressWarnings({ "unchecked"})
	public List<Department> getList(){
		return restTemplate.getForObject(Provider_URL_PreFix+"/dept/list", List.class);
	}
	
	
}
