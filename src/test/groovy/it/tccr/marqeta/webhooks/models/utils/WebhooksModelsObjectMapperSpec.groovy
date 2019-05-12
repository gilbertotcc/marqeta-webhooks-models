package it.tccr.marqeta.webhooks.models.utils

import com.fasterxml.jackson.databind.ObjectMapper
import it.tccr.marqeta.webhooks.models.events.transaction.TransactionsEvent
import spock.lang.Specification

import java.time.ZonedDateTime
import java.time.ZoneId

class WebhooksModelsObjectMapperSpec extends Specification {

  def "should parse transactions event JSON"() {
    given:
    def mapper = new WebhooksModelsObjectMapper()
    def json = getClass().getResource("/json/webhook-event-transactions.json").text

    when:
    TransactionsEvent transactionsEvent = mapper.readValue(json, TransactionsEvent.class)

    then:
    transactionsEvent.transactions.size() == 1
    def transaction = transactionsEvent.transactions[0]
    transaction.type == "authorization"
    transaction.state == "PENDING"
    transaction.token == "36d04781-d34f-4e0c-b895-2f1af976b565"
    transaction.userToken == "99f323d4-298f-4b0c-93b1-19b2d9921eb8"
    transaction.actingUserToken == "99f323d4-298f-4b0c-93b1-19b2d9921eb8"
    transaction.cardToken == "02cc766c-24a5-4c3b-adcf-0e5e27b09329"
    def generalPurposeAccount = transaction.generalPurposeAccount
    generalPurposeAccount.currencyCode == "USD"
    generalPurposeAccount.ledgerBalance == new BigDecimal("20")
    generalPurposeAccount.availableBalance == new BigDecimal("0")
    generalPurposeAccount.creditBalance == new BigDecimal("0")
    generalPurposeAccount.pendingCredits == new BigDecimal("0")
    generalPurposeAccount.impactedAmount == new BigDecimal("-10")
    def generalPurposeAccountOrder = transaction.generalPurposeAccountOrder
    generalPurposeAccountOrder.token == "592b8164-a4af-45ee-ab24-13a4bb43e6b2"
    generalPurposeAccountOrder.amount == new BigDecimal("10")
    generalPurposeAccountOrder.creationDateTime == ZonedDateTime.of(2018, 8, 21, 17, 26, 30, 0, ZoneId.of("UTC"))
    generalPurposeAccountOrder.updateDateTime == ZonedDateTime.of(2018, 8, 21, 17, 26, 30, 0, ZoneId.of("UTC"))
    generalPurposeAccountOrder.transactionToken == "e899e39f-5f43-4d0f-857d-75608d949908"
    generalPurposeAccountOrder.state == "PENDING"
    generalPurposeAccountOrder.response.code == "0000"
    generalPurposeAccountOrder.response.memo == "Approved or completed successfully"
    def funding = generalPurposeAccountOrder.funding
    funding.amount == new BigDecimal("10")
    def fundingSource = funding.source
    fundingSource.type == "programgateway"
    fundingSource.token == "**********dd5f"
    fundingSource.active
    fundingSource.name == "PGFS for simulating transactions"
    !fundingSource.defaultAccount
    fundingSource.creationDateTime == ZonedDateTime.of(2018, 8, 21, 17, 25, 43, 0, ZoneId.of("UTC"))
    fundingSource.updateDateTime == ZonedDateTime.of(2018, 8, 21, 17, 25, 43, 0, ZoneId.of("UTC"))
    def fundingGatewayLog = funding.gatewayLog
    fundingGatewayLog.orderNumber == "36d04781-d34f-4e0c-b895-2f1af976b565"
    fundingGatewayLog.message == "Approved or completed successfully"
    fundingGatewayLog.duration == 481
    !fundingGatewayLog.timedOut
    def fundingGatewayLogResponse = fundingGatewayLog.response
    fundingGatewayLogResponse.code == "200"
    // Ignore "data"
    generalPurposeAccountOrder.fundingSourceToken == "**********dd5f"
    def jitFunding = generalPurposeAccountOrder.jitFunding
    jitFunding.token == "251bdc52-588a-4291-8c5d-6ded3a67e1a8"
    jitFunding.method == "pgfs.authorization"
    jitFunding.userToken == "99f323d4-298f-4b0c-93b1-19b2d9921eb8"
    jitFunding.actingUserToken == "99f323d4-298f-4b0c-93b1-19b2d9921eb8"
    jitFunding.amount == new BigDecimal("10")
    generalPurposeAccountOrder.userToken == "99f323d4-298f-4b0c-93b1-19b2d9921eb8"
    generalPurposeAccountOrder.currencyCode == "USD"
    transaction.duration == 622
    transaction.creationDateTime == ZonedDateTime.of(2018, 8, 21, 17, 26, 29, 0, ZoneId.of("UTC"))
    transaction.userTransactionDateTime == ZonedDateTime.of(2018, 8, 21, 17, 26, 29, 0, ZoneId.of("UTC"))
    transaction.settlemententDateTime == ZonedDateTime.of(2018, 8, 21, 0, 0, 0, 0, ZoneId.of("UTC"))
    transaction.requestAmount == new BigDecimal("10")
    transaction.amount == new BigDecimal("10")
    transaction.issuerInterchangeAmount == new BigDecimal("0")
    transaction.currencyCode == "USD"
    transaction.approvalCode == "761515"
    def response = transaction.response
    response.code == "0000"
    response.memo == "Approved or completed successfully"
    transaction.network == "VISA"
    transaction.subnetwork == "VISANET"
    transaction.acquirerFeeAmount == new BigDecimal("0")
    def acquirer = transaction.acquirer
    acquirer.institutionCountry == "840"
    acquirer.institutionIdCode == "428399181"
    acquirer.retrievalReferenceNumber == "528294182583"
    acquirer.systemTraceAuditNumber == "656761"
    // Ignore "user"
    // Ignore "card"
    def cardSecurityCodeVerification = transaction.cardSecurityCodeVerification
    cardSecurityCodeVerification.type == "CVV1"
    cardSecurityCodeVerification.response.code == "0000"
    cardSecurityCodeVerification.response.memo == "Card security code match"
    // Ignore "fraud"
    def cardholderAuthenticationData = transaction.cardholderAuthenticationData
    cardholderAuthenticationData.electronicCommerceIndicator == "authentication_successful"
    cardholderAuthenticationData.verificationResult == "verified"
    cardholderAuthenticationData.verificationValueCreator ==  "issuer_acs"
    def cardAcceptor = transaction.cardAcceptor
    cardAcceptor.mid == "000000000011111"
    cardAcceptor.mcc == "6411"
    cardAcceptor.name == "Chicken Tooth Music"
    cardAcceptor.streetAddress == "111 Main St"
    cardAcceptor.city == "Berkeley"
    cardAcceptor.countryCode == "USA"
    def pos = transaction.pos
    pos.panEntryMode == "MAG_STRIPE"
    pos.pinEntryMode == "TRUE"
    pos.terminalId == "TR100000"
    pos.terminalAttendance == "ATTENDED"
    !pos.cardholderPresence
    !pos.cardPresence
    !pos.partialApprovalCapable
    !pos.purchaseAmountOnly
    !pos.recurring
    // Ignore "transaction_metadata"
  }

  def "should parse event with no transactions when JSON is an empty object"() {
    given:
    def mapper = new ObjectMapper()

    when:
    TransactionsEvent transactionsEvent = mapper.readValue("{}", TransactionsEvent.class)

    then:
    transactionsEvent.transactions.empty
  }
}
