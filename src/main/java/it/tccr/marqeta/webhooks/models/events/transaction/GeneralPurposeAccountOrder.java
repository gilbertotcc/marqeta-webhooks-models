package it.tccr.marqeta.webhooks.models.events.transaction;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeneralPurposeAccountOrder {

  @JsonProperty("token")
  private String token;

  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("created_time")
  private ZonedDateTime creationDateTime;

  @JsonProperty("last_modified_time")
  private ZonedDateTime updateDateTime;

  @JsonProperty("transaction_token")
  private String transactionToken;

  @JsonProperty("state")
  private String state;

  @JsonProperty("response")
  private Response response;

  @JsonProperty("funding")
  private Funding funding;

  @JsonProperty("funding_source_token")
  private String fundingSourceToken;

  @JsonProperty("jit_funding")
  private JitFunding jitFunding;

  @JsonProperty("user_token")
  private String userToken;

  @JsonProperty("currency_code")
  private String currencyCode;
}
