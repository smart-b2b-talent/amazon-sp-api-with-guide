/*
 * Selling Partner API for Finances
 * The Selling Partner API for Finances helps you obtain financial information relevant to a seller's business. You can obtain financial events for a given order, financial event group, or date range without having to wait until a statement period closes. You can also obtain financial event groups for a given date range.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.finances_api_model;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.finances_api_model.AdhocDisbursementEventList;
import com.amazon.spapi.model.finances_api_model.AdjustmentEventList;
import com.amazon.spapi.model.finances_api_model.AffordabilityExpenseEventList;
import com.amazon.spapi.model.finances_api_model.CapacityReservationBillingEventList;
import com.amazon.spapi.model.finances_api_model.ChargeRefundEventList;
import com.amazon.spapi.model.finances_api_model.CouponPaymentEventList;
import com.amazon.spapi.model.finances_api_model.DebtRecoveryEventList;
import com.amazon.spapi.model.finances_api_model.FBALiquidationEventList;
import com.amazon.spapi.model.finances_api_model.FailedAdhocDisbursementEventList;
import com.amazon.spapi.model.finances_api_model.ImagingServicesFeeEventList;
import com.amazon.spapi.model.finances_api_model.LoanServicingEventList;
import com.amazon.spapi.model.finances_api_model.NetworkComminglingTransactionEventList;
import com.amazon.spapi.model.finances_api_model.PayWithAmazonEventList;
import com.amazon.spapi.model.finances_api_model.ProductAdsPaymentEventList;
import com.amazon.spapi.model.finances_api_model.RemovalShipmentAdjustmentEventList;
import com.amazon.spapi.model.finances_api_model.RemovalShipmentEventList;
import com.amazon.spapi.model.finances_api_model.RentalTransactionEventList;
import com.amazon.spapi.model.finances_api_model.RetrochargeEventList;
import com.amazon.spapi.model.finances_api_model.SAFETReimbursementEventList;
import com.amazon.spapi.model.finances_api_model.SellerDealPaymentEventList;
import com.amazon.spapi.model.finances_api_model.SellerReviewEnrollmentPaymentEventList;
import com.amazon.spapi.model.finances_api_model.ServiceFeeEventList;
import com.amazon.spapi.model.finances_api_model.ShipmentEventList;
import com.amazon.spapi.model.finances_api_model.ShipmentSettleEventList;
import com.amazon.spapi.model.finances_api_model.SolutionProviderCreditEventList;
import com.amazon.spapi.model.finances_api_model.TDSReimbursementEventList;
import com.amazon.spapi.model.finances_api_model.TaxWithholdingEventList;
import com.amazon.spapi.model.finances_api_model.TrialShipmentEventList;
import com.amazon.spapi.model.finances_api_model.ValueAddedServiceChargeEventList;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Contains all information related to a financial event.
 */
@ApiModel(description = "Contains all information related to a financial event.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-29T16:11:09.317+08:00")
public class FinancialEvents {
  @SerializedName("ShipmentEventList")
  private ShipmentEventList shipmentEventList = null;

  @SerializedName("ShipmentSettleEventList")
  private ShipmentSettleEventList shipmentSettleEventList = null;

  @SerializedName("RefundEventList")
  private ShipmentEventList refundEventList = null;

  @SerializedName("GuaranteeClaimEventList")
  private ShipmentEventList guaranteeClaimEventList = null;

  @SerializedName("ChargebackEventList")
  private ShipmentEventList chargebackEventList = null;

  @SerializedName("PayWithAmazonEventList")
  private PayWithAmazonEventList payWithAmazonEventList = null;

  @SerializedName("ServiceProviderCreditEventList")
  private SolutionProviderCreditEventList serviceProviderCreditEventList = null;

  @SerializedName("RetrochargeEventList")
  private RetrochargeEventList retrochargeEventList = null;

  @SerializedName("RentalTransactionEventList")
  private RentalTransactionEventList rentalTransactionEventList = null;

  @SerializedName("ProductAdsPaymentEventList")
  private ProductAdsPaymentEventList productAdsPaymentEventList = null;

  @SerializedName("ServiceFeeEventList")
  private ServiceFeeEventList serviceFeeEventList = null;

  @SerializedName("SellerDealPaymentEventList")
  private SellerDealPaymentEventList sellerDealPaymentEventList = null;

  @SerializedName("DebtRecoveryEventList")
  private DebtRecoveryEventList debtRecoveryEventList = null;

  @SerializedName("LoanServicingEventList")
  private LoanServicingEventList loanServicingEventList = null;

  @SerializedName("AdjustmentEventList")
  private AdjustmentEventList adjustmentEventList = null;

  @SerializedName("SAFETReimbursementEventList")
  private SAFETReimbursementEventList saFETReimbursementEventList = null;

  @SerializedName("SellerReviewEnrollmentPaymentEventList")
  private SellerReviewEnrollmentPaymentEventList sellerReviewEnrollmentPaymentEventList = null;

  @SerializedName("FBALiquidationEventList")
  private FBALiquidationEventList fbALiquidationEventList = null;

  @SerializedName("CouponPaymentEventList")
  private CouponPaymentEventList couponPaymentEventList = null;

  @SerializedName("ImagingServicesFeeEventList")
  private ImagingServicesFeeEventList imagingServicesFeeEventList = null;

  @SerializedName("NetworkComminglingTransactionEventList")
  private NetworkComminglingTransactionEventList networkComminglingTransactionEventList = null;

  @SerializedName("AffordabilityExpenseEventList")
  private AffordabilityExpenseEventList affordabilityExpenseEventList = null;

  @SerializedName("AffordabilityExpenseReversalEventList")
  private AffordabilityExpenseEventList affordabilityExpenseReversalEventList = null;

  @SerializedName("RemovalShipmentEventList")
  private RemovalShipmentEventList removalShipmentEventList = null;

  @SerializedName("RemovalShipmentAdjustmentEventList")
  private RemovalShipmentAdjustmentEventList removalShipmentAdjustmentEventList = null;

  @SerializedName("TrialShipmentEventList")
  private TrialShipmentEventList trialShipmentEventList = null;

  @SerializedName("TDSReimbursementEventList")
  private TDSReimbursementEventList tdSReimbursementEventList = null;

  @SerializedName("AdhocDisbursementEventList")
  private AdhocDisbursementEventList adhocDisbursementEventList = null;

  @SerializedName("TaxWithholdingEventList")
  private TaxWithholdingEventList taxWithholdingEventList = null;

  @SerializedName("ChargeRefundEventList")
  private ChargeRefundEventList chargeRefundEventList = null;

  @SerializedName("FailedAdhocDisbursementEventList")
  private FailedAdhocDisbursementEventList failedAdhocDisbursementEventList = null;

  @SerializedName("ValueAddedServiceChargeEventList")
  private ValueAddedServiceChargeEventList valueAddedServiceChargeEventList = null;

  @SerializedName("CapacityReservationBillingEventList")
  private CapacityReservationBillingEventList capacityReservationBillingEventList = null;

  public FinancialEvents shipmentEventList(ShipmentEventList shipmentEventList) {
    this.shipmentEventList = shipmentEventList;
    return this;
  }

   /**
   * A list of shipment events.
   * @return shipmentEventList
  **/
  @ApiModelProperty(value = "A list of shipment events.")
  public ShipmentEventList getShipmentEventList() {
    return shipmentEventList;
  }

  public void setShipmentEventList(ShipmentEventList shipmentEventList) {
    this.shipmentEventList = shipmentEventList;
  }

  public FinancialEvents shipmentSettleEventList(ShipmentSettleEventList shipmentSettleEventList) {
    this.shipmentSettleEventList = shipmentSettleEventList;
    return this;
  }

   /**
   * A list of Shipment Settle events.
   * @return shipmentSettleEventList
  **/
  @ApiModelProperty(value = "A list of Shipment Settle events.")
  public ShipmentSettleEventList getShipmentSettleEventList() {
    return shipmentSettleEventList;
  }

  public void setShipmentSettleEventList(ShipmentSettleEventList shipmentSettleEventList) {
    this.shipmentSettleEventList = shipmentSettleEventList;
  }

  public FinancialEvents refundEventList(ShipmentEventList refundEventList) {
    this.refundEventList = refundEventList;
    return this;
  }

   /**
   * A list of refund events.
   * @return refundEventList
  **/
  @ApiModelProperty(value = "A list of refund events.")
  public ShipmentEventList getRefundEventList() {
    return refundEventList;
  }

  public void setRefundEventList(ShipmentEventList refundEventList) {
    this.refundEventList = refundEventList;
  }

  public FinancialEvents guaranteeClaimEventList(ShipmentEventList guaranteeClaimEventList) {
    this.guaranteeClaimEventList = guaranteeClaimEventList;
    return this;
  }

   /**
   * A list of guarantee claim events.
   * @return guaranteeClaimEventList
  **/
  @ApiModelProperty(value = "A list of guarantee claim events.")
  public ShipmentEventList getGuaranteeClaimEventList() {
    return guaranteeClaimEventList;
  }

  public void setGuaranteeClaimEventList(ShipmentEventList guaranteeClaimEventList) {
    this.guaranteeClaimEventList = guaranteeClaimEventList;
  }

  public FinancialEvents chargebackEventList(ShipmentEventList chargebackEventList) {
    this.chargebackEventList = chargebackEventList;
    return this;
  }

   /**
   * A list of chargeback events.
   * @return chargebackEventList
  **/
  @ApiModelProperty(value = "A list of chargeback events.")
  public ShipmentEventList getChargebackEventList() {
    return chargebackEventList;
  }

  public void setChargebackEventList(ShipmentEventList chargebackEventList) {
    this.chargebackEventList = chargebackEventList;
  }

  public FinancialEvents payWithAmazonEventList(PayWithAmazonEventList payWithAmazonEventList) {
    this.payWithAmazonEventList = payWithAmazonEventList;
    return this;
  }

   /**
   * Get payWithAmazonEventList
   * @return payWithAmazonEventList
  **/
  @ApiModelProperty(value = "")
  public PayWithAmazonEventList getPayWithAmazonEventList() {
    return payWithAmazonEventList;
  }

  public void setPayWithAmazonEventList(PayWithAmazonEventList payWithAmazonEventList) {
    this.payWithAmazonEventList = payWithAmazonEventList;
  }

  public FinancialEvents serviceProviderCreditEventList(SolutionProviderCreditEventList serviceProviderCreditEventList) {
    this.serviceProviderCreditEventList = serviceProviderCreditEventList;
    return this;
  }

   /**
   * Get serviceProviderCreditEventList
   * @return serviceProviderCreditEventList
  **/
  @ApiModelProperty(value = "")
  public SolutionProviderCreditEventList getServiceProviderCreditEventList() {
    return serviceProviderCreditEventList;
  }

  public void setServiceProviderCreditEventList(SolutionProviderCreditEventList serviceProviderCreditEventList) {
    this.serviceProviderCreditEventList = serviceProviderCreditEventList;
  }

  public FinancialEvents retrochargeEventList(RetrochargeEventList retrochargeEventList) {
    this.retrochargeEventList = retrochargeEventList;
    return this;
  }

   /**
   * Get retrochargeEventList
   * @return retrochargeEventList
  **/
  @ApiModelProperty(value = "")
  public RetrochargeEventList getRetrochargeEventList() {
    return retrochargeEventList;
  }

  public void setRetrochargeEventList(RetrochargeEventList retrochargeEventList) {
    this.retrochargeEventList = retrochargeEventList;
  }

  public FinancialEvents rentalTransactionEventList(RentalTransactionEventList rentalTransactionEventList) {
    this.rentalTransactionEventList = rentalTransactionEventList;
    return this;
  }

   /**
   * Get rentalTransactionEventList
   * @return rentalTransactionEventList
  **/
  @ApiModelProperty(value = "")
  public RentalTransactionEventList getRentalTransactionEventList() {
    return rentalTransactionEventList;
  }

  public void setRentalTransactionEventList(RentalTransactionEventList rentalTransactionEventList) {
    this.rentalTransactionEventList = rentalTransactionEventList;
  }

  public FinancialEvents productAdsPaymentEventList(ProductAdsPaymentEventList productAdsPaymentEventList) {
    this.productAdsPaymentEventList = productAdsPaymentEventList;
    return this;
  }

   /**
   * Get productAdsPaymentEventList
   * @return productAdsPaymentEventList
  **/
  @ApiModelProperty(value = "")
  public ProductAdsPaymentEventList getProductAdsPaymentEventList() {
    return productAdsPaymentEventList;
  }

  public void setProductAdsPaymentEventList(ProductAdsPaymentEventList productAdsPaymentEventList) {
    this.productAdsPaymentEventList = productAdsPaymentEventList;
  }

  public FinancialEvents serviceFeeEventList(ServiceFeeEventList serviceFeeEventList) {
    this.serviceFeeEventList = serviceFeeEventList;
    return this;
  }

   /**
   * Get serviceFeeEventList
   * @return serviceFeeEventList
  **/
  @ApiModelProperty(value = "")
  public ServiceFeeEventList getServiceFeeEventList() {
    return serviceFeeEventList;
  }

  public void setServiceFeeEventList(ServiceFeeEventList serviceFeeEventList) {
    this.serviceFeeEventList = serviceFeeEventList;
  }

  public FinancialEvents sellerDealPaymentEventList(SellerDealPaymentEventList sellerDealPaymentEventList) {
    this.sellerDealPaymentEventList = sellerDealPaymentEventList;
    return this;
  }

   /**
   * Get sellerDealPaymentEventList
   * @return sellerDealPaymentEventList
  **/
  @ApiModelProperty(value = "")
  public SellerDealPaymentEventList getSellerDealPaymentEventList() {
    return sellerDealPaymentEventList;
  }

  public void setSellerDealPaymentEventList(SellerDealPaymentEventList sellerDealPaymentEventList) {
    this.sellerDealPaymentEventList = sellerDealPaymentEventList;
  }

  public FinancialEvents debtRecoveryEventList(DebtRecoveryEventList debtRecoveryEventList) {
    this.debtRecoveryEventList = debtRecoveryEventList;
    return this;
  }

   /**
   * Get debtRecoveryEventList
   * @return debtRecoveryEventList
  **/
  @ApiModelProperty(value = "")
  public DebtRecoveryEventList getDebtRecoveryEventList() {
    return debtRecoveryEventList;
  }

  public void setDebtRecoveryEventList(DebtRecoveryEventList debtRecoveryEventList) {
    this.debtRecoveryEventList = debtRecoveryEventList;
  }

  public FinancialEvents loanServicingEventList(LoanServicingEventList loanServicingEventList) {
    this.loanServicingEventList = loanServicingEventList;
    return this;
  }

   /**
   * Get loanServicingEventList
   * @return loanServicingEventList
  **/
  @ApiModelProperty(value = "")
  public LoanServicingEventList getLoanServicingEventList() {
    return loanServicingEventList;
  }

  public void setLoanServicingEventList(LoanServicingEventList loanServicingEventList) {
    this.loanServicingEventList = loanServicingEventList;
  }

  public FinancialEvents adjustmentEventList(AdjustmentEventList adjustmentEventList) {
    this.adjustmentEventList = adjustmentEventList;
    return this;
  }

   /**
   * Get adjustmentEventList
   * @return adjustmentEventList
  **/
  @ApiModelProperty(value = "")
  public AdjustmentEventList getAdjustmentEventList() {
    return adjustmentEventList;
  }

  public void setAdjustmentEventList(AdjustmentEventList adjustmentEventList) {
    this.adjustmentEventList = adjustmentEventList;
  }

  public FinancialEvents saFETReimbursementEventList(SAFETReimbursementEventList saFETReimbursementEventList) {
    this.saFETReimbursementEventList = saFETReimbursementEventList;
    return this;
  }

   /**
   * Get saFETReimbursementEventList
   * @return saFETReimbursementEventList
  **/
  @ApiModelProperty(value = "")
  public SAFETReimbursementEventList getSaFETReimbursementEventList() {
    return saFETReimbursementEventList;
  }

  public void setSaFETReimbursementEventList(SAFETReimbursementEventList saFETReimbursementEventList) {
    this.saFETReimbursementEventList = saFETReimbursementEventList;
  }

  public FinancialEvents sellerReviewEnrollmentPaymentEventList(SellerReviewEnrollmentPaymentEventList sellerReviewEnrollmentPaymentEventList) {
    this.sellerReviewEnrollmentPaymentEventList = sellerReviewEnrollmentPaymentEventList;
    return this;
  }

   /**
   * Get sellerReviewEnrollmentPaymentEventList
   * @return sellerReviewEnrollmentPaymentEventList
  **/
  @ApiModelProperty(value = "")
  public SellerReviewEnrollmentPaymentEventList getSellerReviewEnrollmentPaymentEventList() {
    return sellerReviewEnrollmentPaymentEventList;
  }

  public void setSellerReviewEnrollmentPaymentEventList(SellerReviewEnrollmentPaymentEventList sellerReviewEnrollmentPaymentEventList) {
    this.sellerReviewEnrollmentPaymentEventList = sellerReviewEnrollmentPaymentEventList;
  }

  public FinancialEvents fbALiquidationEventList(FBALiquidationEventList fbALiquidationEventList) {
    this.fbALiquidationEventList = fbALiquidationEventList;
    return this;
  }

   /**
   * Get fbALiquidationEventList
   * @return fbALiquidationEventList
  **/
  @ApiModelProperty(value = "")
  public FBALiquidationEventList getFbALiquidationEventList() {
    return fbALiquidationEventList;
  }

  public void setFbALiquidationEventList(FBALiquidationEventList fbALiquidationEventList) {
    this.fbALiquidationEventList = fbALiquidationEventList;
  }

  public FinancialEvents couponPaymentEventList(CouponPaymentEventList couponPaymentEventList) {
    this.couponPaymentEventList = couponPaymentEventList;
    return this;
  }

   /**
   * Get couponPaymentEventList
   * @return couponPaymentEventList
  **/
  @ApiModelProperty(value = "")
  public CouponPaymentEventList getCouponPaymentEventList() {
    return couponPaymentEventList;
  }

  public void setCouponPaymentEventList(CouponPaymentEventList couponPaymentEventList) {
    this.couponPaymentEventList = couponPaymentEventList;
  }

  public FinancialEvents imagingServicesFeeEventList(ImagingServicesFeeEventList imagingServicesFeeEventList) {
    this.imagingServicesFeeEventList = imagingServicesFeeEventList;
    return this;
  }

   /**
   * Get imagingServicesFeeEventList
   * @return imagingServicesFeeEventList
  **/
  @ApiModelProperty(value = "")
  public ImagingServicesFeeEventList getImagingServicesFeeEventList() {
    return imagingServicesFeeEventList;
  }

  public void setImagingServicesFeeEventList(ImagingServicesFeeEventList imagingServicesFeeEventList) {
    this.imagingServicesFeeEventList = imagingServicesFeeEventList;
  }

  public FinancialEvents networkComminglingTransactionEventList(NetworkComminglingTransactionEventList networkComminglingTransactionEventList) {
    this.networkComminglingTransactionEventList = networkComminglingTransactionEventList;
    return this;
  }

   /**
   * Get networkComminglingTransactionEventList
   * @return networkComminglingTransactionEventList
  **/
  @ApiModelProperty(value = "")
  public NetworkComminglingTransactionEventList getNetworkComminglingTransactionEventList() {
    return networkComminglingTransactionEventList;
  }

  public void setNetworkComminglingTransactionEventList(NetworkComminglingTransactionEventList networkComminglingTransactionEventList) {
    this.networkComminglingTransactionEventList = networkComminglingTransactionEventList;
  }

  public FinancialEvents affordabilityExpenseEventList(AffordabilityExpenseEventList affordabilityExpenseEventList) {
    this.affordabilityExpenseEventList = affordabilityExpenseEventList;
    return this;
  }

   /**
   * Get affordabilityExpenseEventList
   * @return affordabilityExpenseEventList
  **/
  @ApiModelProperty(value = "")
  public AffordabilityExpenseEventList getAffordabilityExpenseEventList() {
    return affordabilityExpenseEventList;
  }

  public void setAffordabilityExpenseEventList(AffordabilityExpenseEventList affordabilityExpenseEventList) {
    this.affordabilityExpenseEventList = affordabilityExpenseEventList;
  }

  public FinancialEvents affordabilityExpenseReversalEventList(AffordabilityExpenseEventList affordabilityExpenseReversalEventList) {
    this.affordabilityExpenseReversalEventList = affordabilityExpenseReversalEventList;
    return this;
  }

   /**
   * Get affordabilityExpenseReversalEventList
   * @return affordabilityExpenseReversalEventList
  **/
  @ApiModelProperty(value = "")
  public AffordabilityExpenseEventList getAffordabilityExpenseReversalEventList() {
    return affordabilityExpenseReversalEventList;
  }

  public void setAffordabilityExpenseReversalEventList(AffordabilityExpenseEventList affordabilityExpenseReversalEventList) {
    this.affordabilityExpenseReversalEventList = affordabilityExpenseReversalEventList;
  }

  public FinancialEvents removalShipmentEventList(RemovalShipmentEventList removalShipmentEventList) {
    this.removalShipmentEventList = removalShipmentEventList;
    return this;
  }

   /**
   * Get removalShipmentEventList
   * @return removalShipmentEventList
  **/
  @ApiModelProperty(value = "")
  public RemovalShipmentEventList getRemovalShipmentEventList() {
    return removalShipmentEventList;
  }

  public void setRemovalShipmentEventList(RemovalShipmentEventList removalShipmentEventList) {
    this.removalShipmentEventList = removalShipmentEventList;
  }

  public FinancialEvents removalShipmentAdjustmentEventList(RemovalShipmentAdjustmentEventList removalShipmentAdjustmentEventList) {
    this.removalShipmentAdjustmentEventList = removalShipmentAdjustmentEventList;
    return this;
  }

   /**
   * Get removalShipmentAdjustmentEventList
   * @return removalShipmentAdjustmentEventList
  **/
  @ApiModelProperty(value = "")
  public RemovalShipmentAdjustmentEventList getRemovalShipmentAdjustmentEventList() {
    return removalShipmentAdjustmentEventList;
  }

  public void setRemovalShipmentAdjustmentEventList(RemovalShipmentAdjustmentEventList removalShipmentAdjustmentEventList) {
    this.removalShipmentAdjustmentEventList = removalShipmentAdjustmentEventList;
  }

  public FinancialEvents trialShipmentEventList(TrialShipmentEventList trialShipmentEventList) {
    this.trialShipmentEventList = trialShipmentEventList;
    return this;
  }

   /**
   * Get trialShipmentEventList
   * @return trialShipmentEventList
  **/
  @ApiModelProperty(value = "")
  public TrialShipmentEventList getTrialShipmentEventList() {
    return trialShipmentEventList;
  }

  public void setTrialShipmentEventList(TrialShipmentEventList trialShipmentEventList) {
    this.trialShipmentEventList = trialShipmentEventList;
  }

  public FinancialEvents tdSReimbursementEventList(TDSReimbursementEventList tdSReimbursementEventList) {
    this.tdSReimbursementEventList = tdSReimbursementEventList;
    return this;
  }

   /**
   * Get tdSReimbursementEventList
   * @return tdSReimbursementEventList
  **/
  @ApiModelProperty(value = "")
  public TDSReimbursementEventList getTdSReimbursementEventList() {
    return tdSReimbursementEventList;
  }

  public void setTdSReimbursementEventList(TDSReimbursementEventList tdSReimbursementEventList) {
    this.tdSReimbursementEventList = tdSReimbursementEventList;
  }

  public FinancialEvents adhocDisbursementEventList(AdhocDisbursementEventList adhocDisbursementEventList) {
    this.adhocDisbursementEventList = adhocDisbursementEventList;
    return this;
  }

   /**
   * Get adhocDisbursementEventList
   * @return adhocDisbursementEventList
  **/
  @ApiModelProperty(value = "")
  public AdhocDisbursementEventList getAdhocDisbursementEventList() {
    return adhocDisbursementEventList;
  }

  public void setAdhocDisbursementEventList(AdhocDisbursementEventList adhocDisbursementEventList) {
    this.adhocDisbursementEventList = adhocDisbursementEventList;
  }

  public FinancialEvents taxWithholdingEventList(TaxWithholdingEventList taxWithholdingEventList) {
    this.taxWithholdingEventList = taxWithholdingEventList;
    return this;
  }

   /**
   * Get taxWithholdingEventList
   * @return taxWithholdingEventList
  **/
  @ApiModelProperty(value = "")
  public TaxWithholdingEventList getTaxWithholdingEventList() {
    return taxWithholdingEventList;
  }

  public void setTaxWithholdingEventList(TaxWithholdingEventList taxWithholdingEventList) {
    this.taxWithholdingEventList = taxWithholdingEventList;
  }

  public FinancialEvents chargeRefundEventList(ChargeRefundEventList chargeRefundEventList) {
    this.chargeRefundEventList = chargeRefundEventList;
    return this;
  }

   /**
   * Get chargeRefundEventList
   * @return chargeRefundEventList
  **/
  @ApiModelProperty(value = "")
  public ChargeRefundEventList getChargeRefundEventList() {
    return chargeRefundEventList;
  }

  public void setChargeRefundEventList(ChargeRefundEventList chargeRefundEventList) {
    this.chargeRefundEventList = chargeRefundEventList;
  }

  public FinancialEvents failedAdhocDisbursementEventList(FailedAdhocDisbursementEventList failedAdhocDisbursementEventList) {
    this.failedAdhocDisbursementEventList = failedAdhocDisbursementEventList;
    return this;
  }

   /**
   * Get failedAdhocDisbursementEventList
   * @return failedAdhocDisbursementEventList
  **/
  @ApiModelProperty(value = "")
  public FailedAdhocDisbursementEventList getFailedAdhocDisbursementEventList() {
    return failedAdhocDisbursementEventList;
  }

  public void setFailedAdhocDisbursementEventList(FailedAdhocDisbursementEventList failedAdhocDisbursementEventList) {
    this.failedAdhocDisbursementEventList = failedAdhocDisbursementEventList;
  }

  public FinancialEvents valueAddedServiceChargeEventList(ValueAddedServiceChargeEventList valueAddedServiceChargeEventList) {
    this.valueAddedServiceChargeEventList = valueAddedServiceChargeEventList;
    return this;
  }

   /**
   * Get valueAddedServiceChargeEventList
   * @return valueAddedServiceChargeEventList
  **/
  @ApiModelProperty(value = "")
  public ValueAddedServiceChargeEventList getValueAddedServiceChargeEventList() {
    return valueAddedServiceChargeEventList;
  }

  public void setValueAddedServiceChargeEventList(ValueAddedServiceChargeEventList valueAddedServiceChargeEventList) {
    this.valueAddedServiceChargeEventList = valueAddedServiceChargeEventList;
  }

  public FinancialEvents capacityReservationBillingEventList(CapacityReservationBillingEventList capacityReservationBillingEventList) {
    this.capacityReservationBillingEventList = capacityReservationBillingEventList;
    return this;
  }

   /**
   * Get capacityReservationBillingEventList
   * @return capacityReservationBillingEventList
  **/
  @ApiModelProperty(value = "")
  public CapacityReservationBillingEventList getCapacityReservationBillingEventList() {
    return capacityReservationBillingEventList;
  }

  public void setCapacityReservationBillingEventList(CapacityReservationBillingEventList capacityReservationBillingEventList) {
    this.capacityReservationBillingEventList = capacityReservationBillingEventList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialEvents financialEvents = (FinancialEvents) o;
    return Objects.equals(this.shipmentEventList, financialEvents.shipmentEventList) &&
        Objects.equals(this.shipmentSettleEventList, financialEvents.shipmentSettleEventList) &&
        Objects.equals(this.refundEventList, financialEvents.refundEventList) &&
        Objects.equals(this.guaranteeClaimEventList, financialEvents.guaranteeClaimEventList) &&
        Objects.equals(this.chargebackEventList, financialEvents.chargebackEventList) &&
        Objects.equals(this.payWithAmazonEventList, financialEvents.payWithAmazonEventList) &&
        Objects.equals(this.serviceProviderCreditEventList, financialEvents.serviceProviderCreditEventList) &&
        Objects.equals(this.retrochargeEventList, financialEvents.retrochargeEventList) &&
        Objects.equals(this.rentalTransactionEventList, financialEvents.rentalTransactionEventList) &&
        Objects.equals(this.productAdsPaymentEventList, financialEvents.productAdsPaymentEventList) &&
        Objects.equals(this.serviceFeeEventList, financialEvents.serviceFeeEventList) &&
        Objects.equals(this.sellerDealPaymentEventList, financialEvents.sellerDealPaymentEventList) &&
        Objects.equals(this.debtRecoveryEventList, financialEvents.debtRecoveryEventList) &&
        Objects.equals(this.loanServicingEventList, financialEvents.loanServicingEventList) &&
        Objects.equals(this.adjustmentEventList, financialEvents.adjustmentEventList) &&
        Objects.equals(this.saFETReimbursementEventList, financialEvents.saFETReimbursementEventList) &&
        Objects.equals(this.sellerReviewEnrollmentPaymentEventList, financialEvents.sellerReviewEnrollmentPaymentEventList) &&
        Objects.equals(this.fbALiquidationEventList, financialEvents.fbALiquidationEventList) &&
        Objects.equals(this.couponPaymentEventList, financialEvents.couponPaymentEventList) &&
        Objects.equals(this.imagingServicesFeeEventList, financialEvents.imagingServicesFeeEventList) &&
        Objects.equals(this.networkComminglingTransactionEventList, financialEvents.networkComminglingTransactionEventList) &&
        Objects.equals(this.affordabilityExpenseEventList, financialEvents.affordabilityExpenseEventList) &&
        Objects.equals(this.affordabilityExpenseReversalEventList, financialEvents.affordabilityExpenseReversalEventList) &&
        Objects.equals(this.removalShipmentEventList, financialEvents.removalShipmentEventList) &&
        Objects.equals(this.removalShipmentAdjustmentEventList, financialEvents.removalShipmentAdjustmentEventList) &&
        Objects.equals(this.trialShipmentEventList, financialEvents.trialShipmentEventList) &&
        Objects.equals(this.tdSReimbursementEventList, financialEvents.tdSReimbursementEventList) &&
        Objects.equals(this.adhocDisbursementEventList, financialEvents.adhocDisbursementEventList) &&
        Objects.equals(this.taxWithholdingEventList, financialEvents.taxWithholdingEventList) &&
        Objects.equals(this.chargeRefundEventList, financialEvents.chargeRefundEventList) &&
        Objects.equals(this.failedAdhocDisbursementEventList, financialEvents.failedAdhocDisbursementEventList) &&
        Objects.equals(this.valueAddedServiceChargeEventList, financialEvents.valueAddedServiceChargeEventList) &&
        Objects.equals(this.capacityReservationBillingEventList, financialEvents.capacityReservationBillingEventList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentEventList, shipmentSettleEventList, refundEventList, guaranteeClaimEventList, chargebackEventList, payWithAmazonEventList, serviceProviderCreditEventList, retrochargeEventList, rentalTransactionEventList, productAdsPaymentEventList, serviceFeeEventList, sellerDealPaymentEventList, debtRecoveryEventList, loanServicingEventList, adjustmentEventList, saFETReimbursementEventList, sellerReviewEnrollmentPaymentEventList, fbALiquidationEventList, couponPaymentEventList, imagingServicesFeeEventList, networkComminglingTransactionEventList, affordabilityExpenseEventList, affordabilityExpenseReversalEventList, removalShipmentEventList, removalShipmentAdjustmentEventList, trialShipmentEventList, tdSReimbursementEventList, adhocDisbursementEventList, taxWithholdingEventList, chargeRefundEventList, failedAdhocDisbursementEventList, valueAddedServiceChargeEventList, capacityReservationBillingEventList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialEvents {\n");
    
    sb.append("    shipmentEventList: ").append(toIndentedString(shipmentEventList)).append("\n");
    sb.append("    shipmentSettleEventList: ").append(toIndentedString(shipmentSettleEventList)).append("\n");
    sb.append("    refundEventList: ").append(toIndentedString(refundEventList)).append("\n");
    sb.append("    guaranteeClaimEventList: ").append(toIndentedString(guaranteeClaimEventList)).append("\n");
    sb.append("    chargebackEventList: ").append(toIndentedString(chargebackEventList)).append("\n");
    sb.append("    payWithAmazonEventList: ").append(toIndentedString(payWithAmazonEventList)).append("\n");
    sb.append("    serviceProviderCreditEventList: ").append(toIndentedString(serviceProviderCreditEventList)).append("\n");
    sb.append("    retrochargeEventList: ").append(toIndentedString(retrochargeEventList)).append("\n");
    sb.append("    rentalTransactionEventList: ").append(toIndentedString(rentalTransactionEventList)).append("\n");
    sb.append("    productAdsPaymentEventList: ").append(toIndentedString(productAdsPaymentEventList)).append("\n");
    sb.append("    serviceFeeEventList: ").append(toIndentedString(serviceFeeEventList)).append("\n");
    sb.append("    sellerDealPaymentEventList: ").append(toIndentedString(sellerDealPaymentEventList)).append("\n");
    sb.append("    debtRecoveryEventList: ").append(toIndentedString(debtRecoveryEventList)).append("\n");
    sb.append("    loanServicingEventList: ").append(toIndentedString(loanServicingEventList)).append("\n");
    sb.append("    adjustmentEventList: ").append(toIndentedString(adjustmentEventList)).append("\n");
    sb.append("    saFETReimbursementEventList: ").append(toIndentedString(saFETReimbursementEventList)).append("\n");
    sb.append("    sellerReviewEnrollmentPaymentEventList: ").append(toIndentedString(sellerReviewEnrollmentPaymentEventList)).append("\n");
    sb.append("    fbALiquidationEventList: ").append(toIndentedString(fbALiquidationEventList)).append("\n");
    sb.append("    couponPaymentEventList: ").append(toIndentedString(couponPaymentEventList)).append("\n");
    sb.append("    imagingServicesFeeEventList: ").append(toIndentedString(imagingServicesFeeEventList)).append("\n");
    sb.append("    networkComminglingTransactionEventList: ").append(toIndentedString(networkComminglingTransactionEventList)).append("\n");
    sb.append("    affordabilityExpenseEventList: ").append(toIndentedString(affordabilityExpenseEventList)).append("\n");
    sb.append("    affordabilityExpenseReversalEventList: ").append(toIndentedString(affordabilityExpenseReversalEventList)).append("\n");
    sb.append("    removalShipmentEventList: ").append(toIndentedString(removalShipmentEventList)).append("\n");
    sb.append("    removalShipmentAdjustmentEventList: ").append(toIndentedString(removalShipmentAdjustmentEventList)).append("\n");
    sb.append("    trialShipmentEventList: ").append(toIndentedString(trialShipmentEventList)).append("\n");
    sb.append("    tdSReimbursementEventList: ").append(toIndentedString(tdSReimbursementEventList)).append("\n");
    sb.append("    adhocDisbursementEventList: ").append(toIndentedString(adhocDisbursementEventList)).append("\n");
    sb.append("    taxWithholdingEventList: ").append(toIndentedString(taxWithholdingEventList)).append("\n");
    sb.append("    chargeRefundEventList: ").append(toIndentedString(chargeRefundEventList)).append("\n");
    sb.append("    failedAdhocDisbursementEventList: ").append(toIndentedString(failedAdhocDisbursementEventList)).append("\n");
    sb.append("    valueAddedServiceChargeEventList: ").append(toIndentedString(valueAddedServiceChargeEventList)).append("\n");
    sb.append("    capacityReservationBillingEventList: ").append(toIndentedString(capacityReservationBillingEventList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

