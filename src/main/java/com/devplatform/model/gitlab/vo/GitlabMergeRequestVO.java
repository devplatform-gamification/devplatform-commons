package com.devplatform.model.gitlab.vo;

import java.math.BigDecimal;

import org.apache.commons.lang3.StringUtils;

public class GitlabMergeRequestVO{
	String projectNamespace;
	BigDecimal mrIId;

	public GitlabMergeRequestVO(String projectNamespace, String mrIID) {
		super();
		this.projectNamespace = projectNamespace;
		if(StringUtils.isNotBlank(mrIID)) {
			this.mrIId = new BigDecimal(mrIID);
		}
	}

	public String getProjectNamespace() {
		return projectNamespace;
	}

	public void setProjectNamespace(String projectNamespace) {
		this.projectNamespace = projectNamespace;
	}

	public BigDecimal getMrIId() {
		return mrIId;
	}

	public void setMrIId(BigDecimal mrIId) {
		this.mrIId = mrIId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("class GitlabMergeRequestVO{\n    projectNamespace:     ");
		builder.append(projectNamespace);
		builder.append("\n    mrIId:     ");
		builder.append(mrIId);
		builder.append("\n}");
		return builder.toString();
	}
}