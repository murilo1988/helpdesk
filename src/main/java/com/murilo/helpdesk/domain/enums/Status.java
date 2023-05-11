package com.murilo.helpdesk.domain.enums;

public enum Status {
	
	OPEN(0, "OPEN"), PROGRESS(2,"PROGRESS"), CLOSED(2,"CLOSED");

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
