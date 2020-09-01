package com.devplatform.model.rocketchat;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SlackChannelMessage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class RocketchatEmail {
	/**
	 * Gets or Sets type
	 */
	@JsonProperty("address")
	private String address = null;

	@JsonProperty("verified")
	private Boolean verified = null;
	
	public RocketchatEmail address(String address) {
		this.address = address;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public RocketchatEmail verified(Boolean verified) {
		this.verified = verified;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public Boolean getVerified() {
		return verified;
	}

	public void setVerified(Boolean verified) {
		this.verified = verified;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RocketchatEmail slackChannelMessage = (RocketchatEmail) o;
		return Objects.equals(this.address, slackChannelMessage.address)
				&& Objects.equals(this.verified, slackChannelMessage.verified);
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, verified);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RocketchatEmail {\n");
		sb.append("    address: ").append(toIndentedString(address)).append("\n");
		sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
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
