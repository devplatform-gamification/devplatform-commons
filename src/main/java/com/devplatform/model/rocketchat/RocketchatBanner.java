package com.devplatform.model.rocketchat;

import java.math.BigInteger;
import java.util.List;
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
public class RocketchatBanner {
	/**
	 * Gets or Sets type
	 */
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("title")
	private String title = null;
	
	@JsonProperty("text")
	private String text = null;

	@JsonProperty("textArguments")
	private List<String> textArguments = null;

	@JsonProperty("priority")
	private BigInteger priority = null;

	@JsonProperty("link")
	private String link = null;

	@JsonProperty("read")
	private Boolean read = null;

	public RocketchatBanner id(String id) {
		this.id = id;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public RocketchatBanner title(String title) {
		this.title = title;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public RocketchatBanner text(String text) {
		this.text = text;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public RocketchatBanner textArguments(List<String> textArguments) {
		this.textArguments = textArguments;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public List<String> getTextArguments() {
		return textArguments;
	}

	public void setTextArguments(List<String> textArguments) {
		this.textArguments = textArguments;
	}

	public RocketchatBanner priority(BigInteger priority) {
		this.priority = priority;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public BigInteger getPriority() {
		return priority;
	}

	public void setPriority(BigInteger priority) {
		this.priority = priority;
	}

	public RocketchatBanner link(String link) {
		this.link = link;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public RocketchatBanner read(Boolean read) {
		this.read = read;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public Boolean getRead() {
		return read;
	}

	public void setRead(Boolean read) {
		this.read = read;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RocketchatBanner slackChannelMessage = (RocketchatBanner) o;
		return Objects.equals(this.id, slackChannelMessage.id)
				&& Objects.equals(this.title, slackChannelMessage.title)
				&& Objects.equals(this.text, slackChannelMessage.text)
				&& Objects.equals(this.textArguments, slackChannelMessage.textArguments)
				&& Objects.equals(this.priority, slackChannelMessage.priority)
				&& Objects.equals(this.link, slackChannelMessage.link)
				&& Objects.equals(this.read, slackChannelMessage.read);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, title, text, textArguments, priority, link, read);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RocketchatBanner {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
		sb.append("    textArguments: ").append(toIndentedString(textArguments)).append("\n");
		sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
		sb.append("    link: ").append(toIndentedString(link)).append("\n");
		sb.append("    read: ").append(toIndentedString(read)).append("\n");
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
