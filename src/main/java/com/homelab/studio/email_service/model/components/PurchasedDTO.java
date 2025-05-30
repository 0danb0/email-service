package com.homelab.studio.email_service.model.components;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PurchasedDTO {
    @JsonProperty("created")
    private String created;
    @JsonProperty("receipt")
    private String receipt;
    @JsonProperty("amountCaptured")
    private String amountCaptured;
    @JsonProperty("chargeId")
    private String chargeId;
    @JsonProperty("productId")
    private String productId;
    @JsonProperty("paymentIntent")
    private String paymentIntent;
}
