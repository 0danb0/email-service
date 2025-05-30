package com.homelab.studio.email_service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.homelab.studio.email_service.model.components.PurchasedDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class UserDTO {
    @JsonProperty("pk")
    private String pk;
    @JsonProperty("sk")
    private String sk;
    @JsonProperty("username")
    private String username;
    @JsonProperty("password")
    private String password;
    @JsonProperty("creation_date")
    private String creationDate;
    @JsonProperty("userUuid")
    private String userUuid;
    @JsonProperty("email")
    private String email;
    @JsonProperty("application_id")
    private String applicationId;
    @JsonProperty("role")
    private String role;
    @JsonProperty("purchased")
    private List<PurchasedDTO> purchased;
    @JsonProperty("course_id")
    private String courseId;
}
