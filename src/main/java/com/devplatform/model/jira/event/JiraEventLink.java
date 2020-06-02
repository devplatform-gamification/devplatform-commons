package com.devplatform.model.jira.event;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.devplatform.model.jira.JiraIssueLink;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraEvent
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraEventLink extends JiraEvent{
	@JsonProperty("issueLink")
	private JiraIssueLink issueLink = null;
	
	public JiraEventLink issueLink(JiraIssueLink issueLink) {
		this.issueLink = issueLink;
		return this;
	}

	/**
	 * Get issueEventTypeName
	 * 
	 * @return issueEventTypeName
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull
	public JiraIssueLink getIssueLink() {
		return issueLink;
	}

	public void setsetIssueEventTypeName(JiraIssueLink issueLink) {
		this.issueLink = issueLink;
	}
	
	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JiraEventLink jiraEvent = (JiraEventLink) o;
		return Objects.equals(this.timestamp, jiraEvent.timestamp)
				&& Objects.equals(this.webhookEvent, jiraEvent.webhookEvent)
				&& Objects.equals(this.issueLink, jiraEvent.issueLink)
				&& Objects.equals(this.userName, jiraEvent.userName)
				&& Objects.equals(this.userKey, jiraEvent.userKey);
	}

	@Override
	public int hashCode() {
		return Objects.hash(timestamp, webhookEvent, issueLink, userName, userKey);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraEventLink {\n");

		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    webhookEvent: ").append(toIndentedString(webhookEvent)).append("\n");
		sb.append("    issueLink: ").append(toIndentedString(issueLink)).append("\n");
		sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
		sb.append("    userKey: ").append(toIndentedString(userKey)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
