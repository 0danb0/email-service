package com.homelab.studio.email_service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class NewCourseMailRequest {
    @NotBlank(message = "subject is mandatory")
    @JsonProperty("subject")
    private String subject;
    @NotBlank(message = "body is mandatory")
    @JsonProperty("body")
    private String body;
}
