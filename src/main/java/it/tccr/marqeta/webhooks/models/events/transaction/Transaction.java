package it.tccr.marqeta.webhooks.models.events.transaction;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Transaction {

  @JsonProperty("type")
  private String type;

  @JsonProperty("state")
  private String state;

  @JsonProperty("token")
  private String token;

  @JsonProperty("user_token")
  private String userToken;

  @JsonProperty("acting_user_token")
  private String actingUserToken;

  @JsonProperty("card_token")
  private String cardToken;

  @JsonProperty("gpa")
  private GeneralPurposeAccount generalPurposeAccount;

  @JsonProperty("gpa_order")
  private GeneralPurposeAccountOrder generalPurposeAccountOrder;

  @JsonProperty("duration")
  private Long duration;

  @JsonProperty("created_time")
  private ZonedDateTime creationDateTime;

  @JsonProperty("user_transaction_time")
  private ZonedDateTime userTransactionDateTime;

  @JsonProperty("settlement_date")
  private ZonedDateTime settlemententDateTime;

  @JsonProperty("request_amount")
  private BigDecimal requestAmount;

  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("issuer_interchange_amount")
  private BigDecimal issuerInterchangeAmount;

  @JsonProperty("currency_code")
  private String currencyCode;

  @JsonProperty("approval_code")
  private String approvalCode;

  @JsonProperty("response")
  private Response response;

  @JsonProperty("network")
  private String network;

  @JsonProperty("subnetwork")
  private String subnetwork;

  @JsonProperty("acquirer_fee_amount")
  private BigDecimal acquirerFeeAmount;

  @JsonProperty("acquirer")
  private Acquirer acquirer;

  @JsonProperty("user")
  private JsonNode user;

  @JsonProperty("card")
  private JsonNode card;

  @JsonProperty("card_security_code_verification")
  private CardSecurityCodeVerification cardSecurityCodeVerification;

  @JsonProperty("fraud")
  private JsonNode fraud;

  @JsonProperty("cardholder_authentication_data")
  private CardholderAuthenticationData cardholderAuthenticationData;

  @JsonProperty("card_acceptor")
  private CardAcceptor cardAcceptor;

  @JsonProperty("pos")
  private Pos pos;

  @JsonProperty("transaction_metadata")
  private  JsonNode transactionMetadata;
}
