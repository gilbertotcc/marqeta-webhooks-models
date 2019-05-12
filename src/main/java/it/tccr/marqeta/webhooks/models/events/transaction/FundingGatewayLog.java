package it.tccr.marqeta.webhooks.models.events.transaction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class FundingGatewayLog {

  @JsonProperty("order_number")
  private String orderNumber;

  @JsonProperty("transaction_id")
  private String transactionId;

  @JsonProperty("message")
  private String message;

  @JsonProperty("duration")
  private Long duration;

  @JsonProperty("timed_out")
  private boolean timedOut;

  @JsonProperty("response")
  private FundingGatewayLogResponse response;
}
