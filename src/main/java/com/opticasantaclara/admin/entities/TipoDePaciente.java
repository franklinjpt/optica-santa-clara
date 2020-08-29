package com.opticasantaclara.admin.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum TipoDePaciente {
    BRIGADA("Brigada"),
    OPTICA("Optica"),
    EMPRESARIAL("Empresarial");

    private String displayName;

    TipoDePaciente(String displayName) {
        this.displayName = displayName;
    }

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
}