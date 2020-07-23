package com.devplatform.model.bot;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class ProcessingMessage {
	@JsonProperty("text")
	private String text = null;
	
	@JsonProperty("type")
	private ProcessingTypeEnum type = null;

	@JsonProperty("date-time")
	private String dateTime = null;

	public ProcessingMessage(String text, ProcessingTypeEnum type) {
		super();
		this.text = text;
		this.type = type;
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZ");
		this.dateTime = df.format(new Date());
	}

	public ProcessingMessage() {
		super();
	}

	public ProcessingMessage text(String text) {
		this.text = text;
		return this;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public ProcessingMessage type(ProcessingTypeEnum type) {
		this.type = type;
		return this;
	}

	public ProcessingTypeEnum getType() {
		return type;
	}

	public void setType(ProcessingTypeEnum type) {
		this.type = type;
	}

	public ProcessingMessage dateTime(String dateTime) {
		this.dateTime = dateTime;
		return this;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ProcessingMessage releaseItem = (ProcessingMessage) o;
		return Objects.equals(this.text, releaseItem.text) && Objects.equals(this.type, releaseItem.type)
			&& Objects.equals(this.dateTime, releaseItem.dateTime);
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(text, type, dateTime);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProcessingMessage {\n");
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
