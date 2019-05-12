package it.tccr.marqeta.webhooks.models.events.transaction;

import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionsEvent {

  @JsonProperty("transactions")
  private List<Transaction> transactions = Collections.emptyList();
}
