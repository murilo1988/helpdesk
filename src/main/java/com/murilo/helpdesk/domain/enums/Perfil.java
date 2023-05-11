package com.murilo.helpdesk.domain.enums;

public enum Perfil {
	
		
	ADMIN(0, "ROLE_ADMIN"), CLIENT(1, "ROLE_CLIENT"), TECHNICIAN(2, "ROLE_TECHNICIAN");

	private Integer code;
	private String description;
	
	public Integer getCode() {
		return code;
	}
	private Perfil(Integer code, String description) {
		this.code = code;
		this.description = description;
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
	public  static Perfil toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for(Perfil perfilValues : Perfil.values()) {
			if(cod.equals(perfilValues.getCode())){
				return perfilValues;
			}
		}
		throw new IllegalArgumentException("Invalid Status")
	}
	
}
