package com.hkafeidou.springcloudproviderdept.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hkafeidou.springcloudproviderdept.repository.DepartmentMapper;
import com.hkafeidou.springcloudsimple.infrastructure.entity.Department;

@Service
public class DepartmentBusiness  implements IBusiness<Department>{
	
	@Autowired
	DepartmentMapper departmentMapper;
	
	@Override
	public boolean create(Department entity) {
		System.out.println("create exec by 02");
		// TODO Auto-generated method stub
		if(entity!=null) {
			return departmentMapper.insert(entity)>0;
		}
		return false;
	}

	@Override
	public Department getByCode(int code) {
		// TODO Auto-generated method stub
		System.out.println("getByCode exec by 02");
		return departmentMapper.selectByPrimaryKey(code);
	}

	@Override
	public List<Department> getList() {
		System.out.println("getList exec by 02");
		// TODO Auto-generated method stub
		return departmentMapper.selectAll();
	}

}
