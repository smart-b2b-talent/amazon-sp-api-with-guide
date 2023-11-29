
# OrderStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**purchaseOrderNumber** | **String** | The buyer&#39;s purchase order number for this order. Formatting Notes: 8-character alpha-numeric code. | 
**purchaseOrderStatus** | [**PurchaseOrderStatusEnum**](#PurchaseOrderStatusEnum) | The status of the buyer&#39;s purchase order for this order. | 
**purchaseOrderDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the purchase order was placed. Must be in ISO-8601 date/time format. | 
**lastUpdatedDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date when the purchase order was last updated. Must be in ISO-8601 date/time format. |  [optional]
**sellingParty** | [**PartyIdentification**](PartyIdentification.md) | Name/Address and tax details of the selling party. | 
**shipToParty** | [**PartyIdentification**](PartyIdentification.md) | Name/Address and tax details of the ship to party. Find a list of fulfillment center addresses for a region on the [Resources page of Amazon Vendor Central](https://vendorcentral.amazon.com/hz/vendor/members/support/help/node/GPZ88XH8HQM97ZV6). | 
**itemStatus** | [**ItemStatus**](ItemStatus.md) | Detailed order status. | 


<a name="PurchaseOrderStatusEnum"></a>
## Enum: PurchaseOrderStatusEnum
Name | Value
---- | -----
OPEN | &quot;OPEN&quot;
CLOSED | &quot;CLOSED&quot;



