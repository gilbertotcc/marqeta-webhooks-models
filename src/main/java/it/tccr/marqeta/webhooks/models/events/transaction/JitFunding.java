package it.tccr.marqeta.webhooks.models.events.transaction;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class JitFunding {

  @JsonProperty("token")
  private String token;

  @JsonProperty("method")
  private String method;

  @JsonProperty("user_token")
  private String userToken;

  @JsonProperty("acting_user_token")
  private String actingUserToken;

  @JsonProperty("amount")
  private BigDecimal amount;
}
