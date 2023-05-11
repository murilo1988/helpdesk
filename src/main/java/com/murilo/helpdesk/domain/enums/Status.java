package com.murilo.helpdesk.domain.enums;

public enum Status {
	
		ADMIN(0, "ROLE_ADMIN"), CLIENT(1, "ROLE_CLIENT"), TECHNICIAN(2, "ROLE_TECHNICIAN");

	private Integer code;
	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private String description;
	
	private Status(Integer code, String description) {
		this.code = code;
		this.description = description;
	}
	public  static Status toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for(Status perfilValues : Status.values()) {
			if(cod.equals(perfilValues.getCode())){
				return perfilValues;
			}
		}
		throw new IllegalArgumentException("Invalid perfil");
	}
	
}
