
# EventFilter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketplaceIds** | [**MarketplaceIds**](MarketplaceIds.md) |  |  [optional]
**orderChangeTypes** | [**OrderChangeTypes**](OrderChangeTypes.md) |  |  [optional]
**eventFilterType** | [**EventFilterTypeEnum**](#EventFilterTypeEnum) | An eventFilterType value that is supported by the specific notificationType. This is used by the subscription service to determine the type of event filter. Refer to the section of the [Notifications Use Case Guide](doc:notifications-api-v1-use-case-guide) that describes the specific notificationType to determine if an eventFilterType is supported. | 


<a name="EventFilterTypeEnum"></a>
## Enum: EventFilterTypeEnum
Name | Value
---- | -----
ANY_OFFER_CHANGED | &quot;ANY_OFFER_CHANGED&quot;
ORDER_CHANGE | &quot;ORDER_CHANGE&quot;



