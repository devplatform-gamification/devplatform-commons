package com.devplatform.model.gitlab;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitlabUser
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabTimeStats {

	@JsonProperty("time_estimate")
	private Integer timeEstimate = null;

	@JsonProperty("total_time_spent")
	private Integer totalTimeSpent = null;

	@JsonProperty("human_total_time_spent")
	private Integer humanTotalTimeSpent = null;

	@JsonProperty("human_time_estimate")
	private Integer humanTimeEstimate = null;

	public GitlabTimeStats timeEstimate(Integer timeEstimate) {
		this.timeEstimate = timeEstimate;
		return this;
	}

	public Integer getTimeEstimate() {
		return timeEstimate;
	}

	public void setTimeEstimate(Integer timeEstimate) {
		this.timeEstimate = timeEstimate;
	}

	public GitlabTimeStats totalTimeSpent(Integer totalTimeSpent) {
		this.totalTimeSpent = totalTimeSpent;
		return this;
	}

	public Integer getTotalTimeSpent() {
		return totalTimeSpent;
	}

	public void setTotalTimeSpent(Integer totalTimeSpent) {
		this.totalTimeSpent = totalTimeSpent;
	}

	public GitlabTimeStats humanTotalTimeSpent(Integer humanTotalTimeSpent) {
		this.humanTotalTimeSpent = humanTotalTimeSpent;
		return this;
	}

	public Integer getHumanTotalTimeSpent() {
		return humanTotalTimeSpent;
	}

	public void setHumanTotalTimeSpent(Integer humanTotalTimeSpent) {
		this.humanTotalTimeSpent = humanTotalTimeSpent;
	}

	public GitlabTimeStats humanTimeEstimate(Integer humanTimeEstimate) {
		this.humanTimeEstimate = humanTimeEstimate;
		return this;
	}

	public Integer getHumanTimeEstimate() {
		return humanTimeEstimate;
	}

	public void setHumanTimeEstimate(Integer humanTimeEstimate) {
		this.humanTimeEstimate = humanTimeEstimate;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabTimeStats gitlabCommit = (GitlabTimeStats) o;
		return Objects.equals(this.timeEstimate, gitlabCommit.timeEstimate)
				&& Objects.equals(this.totalTimeSpent, gitlabCommit.totalTimeSpent)
				&& Objects.equals(this.humanTotalTimeSpent, gitlabCommit.humanTotalTimeSpent)
				&& Objects.equals(this.humanTimeEstimate, gitlabCommit.humanTimeEstimate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(timeEstimate, totalTimeSpent, humanTotalTimeSpent, humanTimeEstimate);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabTimeStats {\n");

		sb.append("    timeEstimate: ").append(toIndentedString(timeEstimate)).append("\n");
		sb.append("    totalTimeSpent: ").append(toIndentedString(totalTimeSpent)).append("\n");
		sb.append("    humanTimeEstimate: ").append(toIndentedString(humanTimeEstimate)).append("\n");
		sb.append("    humanTotalTimeSpent: ").append(toIndentedString(humanTotalTimeSpent)).append("\n");
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
