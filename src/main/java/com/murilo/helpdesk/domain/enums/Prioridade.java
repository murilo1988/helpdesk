package com.murilo.helpdesk.domain.enums;

public enum Prioridade {
	
		HIGH(0, "HIGH_PRIORITY"), MEDIUM(1, "MEDIUM_PRIOITY"), LOW(2, "LOW_PRIORITY");

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
	
	private Prioridade(Integer code, String description) {
		this.code = code;
		this.description = description;
	}
	public  static Prioridade toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for(Prioridade perfilValues : Prioridade.values()) {
			if(cod.equals(perfilValues.getCode())){
				return perfilValues;
			}
		}
		throw new IllegalArgumentException("Invalid priority");
	}
	
}
