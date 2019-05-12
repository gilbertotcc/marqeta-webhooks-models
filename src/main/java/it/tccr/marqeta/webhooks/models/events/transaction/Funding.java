package it.tccr.marqeta.webhooks.models.events.transaction;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Funding {

  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("source")
  private FundingSource source;

  @JsonProperty("gateway_log")
  private FundingGatewayLog gatewayLog;
}
