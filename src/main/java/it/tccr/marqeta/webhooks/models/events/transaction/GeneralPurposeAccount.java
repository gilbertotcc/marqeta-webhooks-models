package it.tccr.marqeta.webhooks.models.events.transaction;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeneralPurposeAccount {

  @JsonProperty("currency_code")
  private String currencyCode;

  @JsonProperty("ledger_balance")
  private BigDecimal ledgerBalance;

  @JsonProperty("available_balance")
  private BigDecimal availableBalance;

  @JsonProperty("credit_balance")
  private BigDecimal creditBalance;

  @JsonProperty("pending_credits")
  private BigDecimal pendingCredits;

  @JsonProperty("impacted_amount")
  private BigDecimal impactedAmount;

  @JsonProperty("balances")
  private JsonNode balances;
}
