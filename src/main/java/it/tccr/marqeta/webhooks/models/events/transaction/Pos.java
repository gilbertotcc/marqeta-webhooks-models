package it.tccr.marqeta.webhooks.models.events.transaction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pos {

  @JsonProperty("pan_entry_mode")
  private String panEntryMode;

  @JsonProperty("pin_entry_mode")
  private String pinEntryMode;

  @JsonProperty("terminal_id")
  private String terminalId;

  @JsonProperty("terminal_attendance")
  private String terminalAttendance;

  @JsonProperty("card_holder_presence")
  private boolean cardholderPresence;

  @JsonProperty("card_presence")
  private boolean cardPresence;

  @JsonProperty("partial_approval_capable")
  private boolean partialApprovalCapable;

  @JsonProperty("purchase_amount_only")
  private boolean purchaseAmountOnly;

  @JsonProperty("is_recurring")
  private boolean recurring;
}
