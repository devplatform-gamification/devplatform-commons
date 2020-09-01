package com.devplatform.model.rocketchat.response;

import java.util.List;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.devplatform.model.rocketchat.RocketchatUser;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SlackChannelMessage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class RocketchatUsersResponse {
	@JsonInclude(Include.NON_NULL)
	@JsonProperty("users")
	private List<RocketchatUser> users;

	@JsonProperty("count")
	private Integer count;

	@JsonProperty("offset")
	private Integer offset;

	@JsonProperty("total")
	private Integer total;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("success")
	private Boolean success;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("error")
	private String error;

	public RocketchatUsersResponse users(List<RocketchatUser> users) {
		this.users = users;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public List<RocketchatUser> getUsers() {
		return users;
	}

	public void setUsers(List<RocketchatUser> users) {
		this.users = users;
	}

	public RocketchatUsersResponse count(Integer count) {
		this.count = count;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public RocketchatUsersResponse offset(Integer offset) {
		this.offset = offset;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public RocketchatUsersResponse total(Integer total) {
		this.total = total;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public RocketchatUsersResponse success(Boolean success) {
		this.success = success;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	
	public RocketchatUsersResponse error(String error) {
		this.error = error;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RocketchatUsersResponse slackChannelMessage = (RocketchatUsersResponse) o;
		return Objects.equals(this.users, slackChannelMessage.users)
				&& Objects.equals(this.count, slackChannelMessage.count)
				&& Objects.equals(this.offset, slackChannelMessage.offset)
				&& Objects.equals(this.total, slackChannelMessage.total)
				&& Objects.equals(this.success, slackChannelMessage.success)
				&& Objects.equals(this.error, slackChannelMessage.error);
	}

	@Override
	public int hashCode() {
		return Objects.hash(users, count, offset, total, success, error);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RocketchatUsersResponse {\n");
		sb.append("    users: ").append(toIndentedString(users)).append("\n");
		sb.append("    count: ").append(toIndentedString(count)).append("\n");
		sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
		sb.append("    total: ").append(toIndentedString(total)).append("\n");
		sb.append("    success: ").append(toIndentedString(success)).append("\n");
		sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
