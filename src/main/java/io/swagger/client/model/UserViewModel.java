/**
 * Login API
 * API description for Login method in Markdown.
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class UserViewModel {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("token")
  private String token = null;
  @SerializedName("referralCode")
  private String referralCode = null;
  @SerializedName("isResponsive")
  private Boolean isResponsive = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getReferralCode() {
    return referralCode;
  }
  public void setReferralCode(String referralCode) {
    this.referralCode = referralCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIsResponsive() {
    return isResponsive;
  }
  public void setIsResponsive(Boolean isResponsive) {
    this.isResponsive = isResponsive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserViewModel userViewModel = (UserViewModel) o;
    return (this.id == null ? userViewModel.id == null : this.id.equals(userViewModel.id)) &&
        (this.token == null ? userViewModel.token == null : this.token.equals(userViewModel.token)) &&
        (this.referralCode == null ? userViewModel.referralCode == null : this.referralCode.equals(userViewModel.referralCode)) &&
        (this.isResponsive == null ? userViewModel.isResponsive == null : this.isResponsive.equals(userViewModel.isResponsive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.token == null ? 0: this.token.hashCode());
    result = 31 * result + (this.referralCode == null ? 0: this.referralCode.hashCode());
    result = 31 * result + (this.isResponsive == null ? 0: this.isResponsive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserViewModel {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("  referralCode: ").append(referralCode).append("\n");
    sb.append("  isResponsive: ").append(isResponsive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}