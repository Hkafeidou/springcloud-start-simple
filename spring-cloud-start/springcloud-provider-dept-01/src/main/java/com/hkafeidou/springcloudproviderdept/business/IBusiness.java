package com.hkafeidou.springcloudproviderdept.business;

import java.util.List;

import com.hkafeidou.springcloudsimple.infrastructure.entity.IEntity;

public interface IBusiness<T extends IEntity> {
	
	public boolean create(T entity);
	public T getByCode(int code);
	public List<T> getList();
}
