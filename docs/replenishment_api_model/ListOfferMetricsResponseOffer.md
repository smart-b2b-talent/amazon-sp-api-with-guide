
# ListOfferMetricsResponseOffer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asin** | **String** | The Amazon Standard Identification Number (ASIN). |  [optional]
**notDeliveredDueToOOS** | **Double** | The percentage of items that were not shipped out of the total shipped units over a period of time due to being out of stock. Applicable only for the PERFORMANCE timePeriodType. |  [optional]
**totalSubscriptionsRevenue** | **Double** | The revenue generated from subscriptions over a period of time. Applicable only for the PERFORMANCE timePeriodType. |  [optional]
**shippedSubscriptionUnits** | [**BigDecimal**](BigDecimal.md) | The number of units shipped to the subscribers over a period of time. Applicable only for the PERFORMANCE timePeriodType. |  [optional]
**activeSubscriptions** | [**BigDecimal**](BigDecimal.md) | The number of active subscriptions present at the end of the period. Applicable only for the PERFORMANCE timePeriodType. |  [optional]
**revenuePenetration** | **Double** | The percentage of total program revenue out of total product revenue. Applicable only for the PERFORMANCE timePeriodType. |  [optional]
**next30DayTotalSubscriptionsRevenue** | **Double** | The forecasted total subscription revenue for the next 30 days. Applicable only for the FORECAST timePeriodType. |  [optional]
**next60DayTotalSubscriptionsRevenue** | **Double** | The forecasted total subscription revenue for the next 60 days. Applicable only for the FORECAST timePeriodType. |  [optional]
**next90DayTotalSubscriptionsRevenue** | **Double** | The forecasted total subscription revenue for the next 90 days. Applicable only for the FORECAST timePeriodType. |  [optional]
**next30DayShippedSubscriptionUnits** | [**BigDecimal**](BigDecimal.md) | The forecasted shipped subscription units for the next 30 days. Applicable only for the FORECAST timePeriodType. |  [optional]
**next60DayShippedSubscriptionUnits** | [**BigDecimal**](BigDecimal.md) | The forecasted shipped subscription units for the next 60 days. Applicable only for the FORECAST timePeriodType. |  [optional]
**next90DayShippedSubscriptionUnits** | [**BigDecimal**](BigDecimal.md) | The forecasted shipped subscription units for the next 90 days. Applicable only for the FORECAST timePeriodType. |  [optional]
**timeInterval** | [**TimeInterval**](TimeInterval.md) | A time interval used to compute metrics. |  [optional]
**currencyCode** | **String** | The currency code in ISO 4217 format. |  [optional]



