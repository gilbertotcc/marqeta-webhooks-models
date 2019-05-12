package it.tccr.marqeta.webhooks.models.events.transaction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CardholderAuthenticationData {

  @JsonProperty("electronic_commerce_indicator")
  private String electronicCommerceIndicator;

  @JsonProperty("verification_result")
  private String verificationResult;

  @JsonProperty("verification_value_created_by")
  private String verificationValueCreator;
}
