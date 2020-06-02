package com.devplatform.model.jira;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraIssueOptionFieldWithChild
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraIssueFieldOptionWithChild extends JiraIssueFieldOption  {
  @JsonProperty("child")
  private JiraIssueFieldOption child = null;

  public JiraIssueFieldOptionWithChild child(JiraIssueFieldOption child) {
    this.child = child;
    return this;
  }

  /**
   * Get child
   * @return child
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JiraIssueFieldOption getChild() {
    return child;
  }

  public void setChild(JiraIssueFieldOption child) {
    this.child = child;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraIssueFieldOptionWithChild jiraIssueOptionFieldWithChild = (JiraIssueFieldOptionWithChild) o;
    return Objects.equals(this.id, jiraIssueOptionFieldWithChild.id) &&
        Objects.equals(this.value, jiraIssueOptionFieldWithChild.value) &&
        Objects.equals(this.self, jiraIssueOptionFieldWithChild.self) &&
        Objects.equals(this.child, jiraIssueOptionFieldWithChild.child);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, value, self, child);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraIssueFieldOptionWithChild {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    child: ").append(toIndentedString(child)).append("\n");
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
