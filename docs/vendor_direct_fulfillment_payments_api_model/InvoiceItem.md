
# InvoiceItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemSequenceNumber** | **String** | Numbering of the item on the purchase order. The first item will be 1, the second 2, and so on. | 
**buyerProductIdentifier** | **String** | Buyer&#39;s standard identification number (ASIN) of an item. |  [optional]
**vendorProductIdentifier** | **String** | The vendor selected product identification of the item. |  [optional]
**invoicedQuantity** | [**ItemQuantity**](ItemQuantity.md) | Item quantity invoiced. | 
**netCost** | [**Money**](Money.md) | Net price (before tax) to vendor with currency details. | 
**purchaseOrderNumber** | **String** | The purchase order number for this order. Formatting Notes: 8-character alpha-numeric code. | 
**vendorOrderNumber** | **String** | The vendor&#39;s order number for this order. |  [optional]
**hsnCode** | **String** | Harmonized System of Nomenclature (HSN) tax code. The HSN number cannot contain alphabets. |  [optional]
**taxDetails** | [**List&lt;TaxDetail&gt;**](TaxDetail.md) | Individual tax details per line item. |  [optional]
**chargeDetails** | [**List&lt;ChargeDetails&gt;**](ChargeDetails.md) | Individual charge details per line item. |  [optional]



