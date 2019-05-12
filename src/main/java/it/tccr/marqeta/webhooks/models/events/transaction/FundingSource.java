package it.tccr.marqeta.webhooks.models.events.transaction;

import java.time.ZonedDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class FundingSource {

  @JsonProperty("type")
  private String type;

  @JsonProperty("token")
  private String token;

  @JsonProperty("active")
  private boolean active;

  @JsonProperty("name")
  private String name;

  @JsonProperty("is_default_account")
  private boolean defaultAccount;

  @JsonProperty("created_time")
  private ZonedDateTime creationDateTime;

  @JsonProperty("last_modified_time")
  private ZonedDateTime updateDateTime;
}
