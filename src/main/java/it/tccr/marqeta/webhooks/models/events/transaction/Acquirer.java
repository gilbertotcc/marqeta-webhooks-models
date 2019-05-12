package it.tccr.marqeta.webhooks.models.events.transaction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Acquirer {

  @JsonProperty("institution_country")
  private String institutionCountry;

  @JsonProperty("institution_id_code")
  private String institutionIdCode;

  @JsonProperty("retrieval_reference_number")
  private String retrievalReferenceNumber;

  @JsonProperty("system_trace_audit_number")
  private String systemTraceAuditNumber;
}
