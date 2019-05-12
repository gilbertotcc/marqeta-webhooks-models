package it.tccr.marqeta.webhooks.models.events.transaction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CardAcceptor {

  @JsonProperty("mid")
  private String mid;

  @JsonProperty("mcc")
  private String mcc;

  @JsonProperty("name")
  private String name;

  @JsonProperty("street_address")
  private String streetAddress;

  @JsonProperty("city")
  private String city;

  @JsonProperty("country_code")
  private String countryCode;
}
