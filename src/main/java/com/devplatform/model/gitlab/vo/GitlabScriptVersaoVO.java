package com.devplatform.model.gitlab.vo;

public class GitlabScriptVersaoVO{
	String nameWithPath;
	String name;
	String version;
	Integer order;
	String type; // DDL or DML
	String specificName;
	String newNameWithPath;
	
	public GitlabScriptVersaoVO(String nameWithPath) {
		super();
		this.nameWithPath = nameWithPath;

		String[] scriptPath = nameWithPath.split("/");
		if(scriptPath.length > 0) {
			this.name = scriptPath[scriptPath.length - 1];
			String[] nameParts = name.split("_");
			this.version = nameParts[1];
			this.order = Integer.valueOf(nameParts[2]);
			nameParts = name.split("__");
			this.specificName = nameParts[1];
			if(nameParts[1].contains("DML")) {
				this.type = "DML";
				this.specificName = nameParts[1].replaceFirst("_DML", "");
			}else if(nameParts[1].contains("DDL")) {
				this.type = "DDL";
				this.specificName = nameParts[1].replaceFirst("_DDL", "");
			}
		}
	}
	public String getNameWithPath() {
		return nameWithPath;
	}
	public void setNameWithPath(String nameWithPath) {
		this.nameWithPath = nameWithPath;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Integer getOrder() {
		return order;
	}
	public void setOrder(Integer order) {
		this.order = order;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSpecificName() {
		return specificName;
	}
	public void setSpecificName(String specificName) {
		this.specificName = specificName;
	}
	public String getNewNameWithPath() {
		return newNameWithPath;
	}
	public void setNewNameWithPath(String newNameWithPath) {
		this.newNameWithPath = newNameWithPath;
	}
	@Override
	public String toString() {
		return "GitlabScriptVersaoVO [nameWithPath=" + nameWithPath + ", name=" + name + ", version=" + version
				+ ", order=" + order + ", type=" + type + ", specificName=" + specificName + ", newNameWithPath="
				+ newNameWithPath + "]";
	}
}