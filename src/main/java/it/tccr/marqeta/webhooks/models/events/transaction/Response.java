package it.tccr.marqeta.webhooks.models.events.transaction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {

  @JsonProperty("code")
  private String code;

  @JsonProperty("memo")
  private String memo;
}
