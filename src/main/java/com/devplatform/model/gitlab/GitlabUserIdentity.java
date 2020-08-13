package com.devplatform.model.gitlab;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitlabUserIdentity
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabUserIdentity   {
	@JsonProperty("provider")
	private String provider = null;

	@JsonProperty("extern_uid")
	private String externUid = null;

	public GitlabUserIdentity provider(String provider) {
		this.provider = provider;
		return this;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public GitlabUserIdentity externUid(String externUid) {
		this.externUid = externUid;
		return this;
	}

	public String getExternUid() {
		return externUid;
	}

	public void setExternUid(String externUid) {
		this.externUid = externUid;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabUserIdentity gitlabUser = (GitlabUserIdentity) o;
		return Objects.equals(this.provider, gitlabUser.provider) &&
				Objects.equals(this.externUid, gitlabUser.externUid);
	}

	@Override
	public int hashCode() {
		return Objects.hash(provider, externUid);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabUserIdentity {\n");
		sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
		sb.append("    externUid: ").append(toIndentedString(externUid)).append("\n");
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
