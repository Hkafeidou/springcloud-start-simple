package com.hkafeidou.springcloudconsumerdept.business;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hkafeidou.springcloudconsumerdept.dto.DeptHomeDto;
import com.hkafeidou.springcloudsimple.infrastructure.entity.Department;
import com.hkafeidou.springcloudsimple.infrastructure.service.DeptClientService;

@Service
public class Home_DeptClientBusiness {
	@Autowired
	private DeptClientService deptClientService;
	
	//private static final String Provider_URL_PreFix="http://springcloud-provider-dept";
	
	public DeptHomeDto getDeptHomeData() {
		
		DeptHomeDto model=new DeptHomeDto();
		model.setUuid(UUID.randomUUID().toString().replaceAll("-", ""));
		model.setRemark("服务消费!!!!");
		Department department  = deptClientService.getById(1);
		//Department department = restTemplate.getForObject(Provider_URL_PreFix+"/dept/getById/1", Department.class);
		model.setDepartment(department); 
		
		return model;
	} 
	
	public boolean createDept(Department entity) {
		boolean result =false;
		if(entity!=null) {
			//result = restTemplate.postForObject(Provider_URL_PreFix+"/dept/create", entity, Boolean.class);
			result=deptClientService.createDept(entity);
		}
		
		
		return result;
	}
	
	@SuppressWarnings({ "unchecked"})
	public List<Department> getList(){
		//return restTemplate.getForObject(Provider_URL_PreFix+"/dept/list", List.class);
		return deptClientService.getList();
	}
	
}
