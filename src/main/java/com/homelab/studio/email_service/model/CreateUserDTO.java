package com.homelab.studio.email_service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateUserDTO {
    @NotBlank(message = "username is mandatory")
    @JsonProperty("username")
    private String username;

}
