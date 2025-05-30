package com.homelab.studio.email_service.model.components;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class UserGuiDTO {
    @JsonProperty("username")
    private String username;
    @JsonProperty("creation_date")
    private String creationDate;
    @JsonProperty("email")
    private String email;
    @JsonProperty("password")
    private String password;
    @JsonProperty("role")
    private String role;
    @JsonProperty("purchased")
    private List<PurchasedDTO> purchased;
}
