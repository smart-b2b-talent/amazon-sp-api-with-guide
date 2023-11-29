
# GetSellingPartnerMetricsResponseMetric

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**notDeliveredDueToOOS** | **Double** | The percentage of items that were not shipped out of the total shipped units over a period of time due to being out of stock. Applicable only for the PERFORMANCE timePeriodType. |  [optional]
**totalSubscriptionsRevenue** | **Double** | The revenue generated from subscriptions over a period of time. Applicable for both the PERFORMANCE and FORECAST timePeriodType. |  [optional]
**shippedSubscriptionUnits** | [**BigDecimal**](BigDecimal.md) | The number of units shipped to the subscribers over a period of time. Applicable for both the PERFORMANCE and FORECAST timePeriodType. |  [optional]
**activeSubscriptions** | [**BigDecimal**](BigDecimal.md) | The number of active subscriptions present at the end of the period. Applicable only for the PERFORMANCE timePeriodType. |  [optional]
**subscriberAverageRevenue** | **Double** | The average revenue per subscriber of the program over a period of past 12 months for sellers and 6 months for vendors. Applicable only for the PERFORMANCE timePeriodType. |  [optional]
**nonSubscriberAverageRevenue** | **Double** | The average revenue per non-subscriber of the program over a period of past 12 months for sellers and 6 months for vendors. Applicable only for the PERFORMANCE timePeriodType. |  [optional]
**timeInterval** | [**TimeInterval**](TimeInterval.md) | A time interval used to compute metrics. |  [optional]
**currencyCode** | **String** | The currency code in ISO 4217 format. |  [optional]



