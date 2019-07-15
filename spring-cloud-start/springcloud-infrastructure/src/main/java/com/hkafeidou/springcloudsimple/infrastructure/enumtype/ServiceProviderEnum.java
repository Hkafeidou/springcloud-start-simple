package com.hkafeidou.springcloudsimple.infrastructure.enumtype;

public enum ServiceProviderEnum {
	DEPT_PROVIDER("springcloud-provider-dept");
	
	
	
	private ServiceProviderEnum(String value) {
		this.value = value;
	}

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
