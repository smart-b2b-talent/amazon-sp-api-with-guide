# DefaultApi

All URIs are relative to *https://sellingpartnerapi-na.amazon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listFinancialEventGroups**](DefaultApi.md#listFinancialEventGroups) | **GET** /finances/v0/financialEventGroups | 
[**listFinancialEvents**](DefaultApi.md#listFinancialEvents) | **GET** /finances/v0/financialEvents | 
[**listFinancialEventsByGroupId**](DefaultApi.md#listFinancialEventsByGroupId) | **GET** /finances/v0/financialEventGroups/{eventGroupId}/financialEvents | 
[**listFinancialEventsByOrderId**](DefaultApi.md#listFinancialEventsByOrderId) | **GET** /finances/v0/orders/{orderId}/financialEvents | 


<a name="listFinancialEventGroups"></a>
# **listFinancialEventGroups**
> ListFinancialEventGroupsResponse listFinancialEventGroups(maxResultsPerPage, financialEventGroupStartedBefore, financialEventGroupStartedAfter, nextToken)



Returns financial event groups for a given date range. It may take up to 48 hours for orders to appear in your financial events.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api_client.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer maxResultsPerPage = 100; // Integer | The maximum number of results to return per page. If the response exceeds the maximum number of transactions or 10 MB, the API responds with 'InvalidInput'.
OffsetDateTime financialEventGroupStartedBefore = OffsetDateTime.now(); // OffsetDateTime | A date used for selecting financial event groups that opened before (but not at) a specified date and time, in ISO 8601 format. The date-time  must be later than FinancialEventGroupStartedAfter and no later than two minutes before the request was submitted. If FinancialEventGroupStartedAfter and FinancialEventGroupStartedBefore are more than 180 days apart, no financial event groups are returned.
OffsetDateTime financialEventGroupStartedAfter = OffsetDateTime.now(); // OffsetDateTime | A date used for selecting financial event groups that opened after (or at) a specified date and time, in ISO 8601 format. The date-time must be no later than two minutes before the request was submitted.
String nextToken = "nextToken_example"; // String | A string token returned in the response of your previous request.
try {
    ListFinancialEventGroupsResponse result = apiInstance.listFinancialEventGroups(maxResultsPerPage, financialEventGroupStartedBefore, financialEventGroupStartedAfter, nextToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listFinancialEventGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **maxResultsPerPage** | **Integer**| The maximum number of results to return per page. If the response exceeds the maximum number of transactions or 10 MB, the API responds with &#39;InvalidInput&#39;. | [optional] [default to 100]
 **financialEventGroupStartedBefore** | **OffsetDateTime**| A date used for selecting financial event groups that opened before (but not at) a specified date and time, in ISO 8601 format. The date-time  must be later than FinancialEventGroupStartedAfter and no later than two minutes before the request was submitted. If FinancialEventGroupStartedAfter and FinancialEventGroupStartedBefore are more than 180 days apart, no financial event groups are returned. | [optional]
 **financialEventGroupStartedAfter** | **OffsetDateTime**| A date used for selecting financial event groups that opened after (or at) a specified date and time, in ISO 8601 format. The date-time must be no later than two minutes before the request was submitted. | [optional]
 **nextToken** | **String**| A string token returned in the response of your previous request. | [optional]

### Return type

[**ListFinancialEventGroupsResponse**](ListFinancialEventGroupsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listFinancialEvents"></a>
# **listFinancialEvents**
> ListFinancialEventsResponse listFinancialEvents(maxResultsPerPage, postedAfter, postedBefore, nextToken)



Returns financial events for the specified data range. It may take up to 48 hours for orders to appear in your financial events. **Note:** in &#x60;ListFinancialEvents&#x60;, deferred events don&#39;t show up in responses until in they are released.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api_client.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer maxResultsPerPage = 100; // Integer | The maximum number of results to return per page. If the response exceeds the maximum number of transactions or 10 MB, the API responds with 'InvalidInput'.
OffsetDateTime postedAfter = OffsetDateTime.now(); // OffsetDateTime | A date used for selecting financial events posted after (or at) a specified time. The date-time must be no later than two minutes before the request was submitted, in ISO 8601 date time format.
OffsetDateTime postedBefore = OffsetDateTime.now(); // OffsetDateTime | A date used for selecting financial events posted before (but not at) a specified time. The date-time must be later than PostedAfter and no later than two minutes before the request was submitted, in ISO 8601 date time format. If PostedAfter and PostedBefore are more than 180 days apart, no financial events are returned. You must specify the PostedAfter parameter if you specify the PostedBefore parameter. Default: Now minus two minutes.
String nextToken = "nextToken_example"; // String | A string token returned in the response of your previous request.
try {
    ListFinancialEventsResponse result = apiInstance.listFinancialEvents(maxResultsPerPage, postedAfter, postedBefore, nextToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listFinancialEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **maxResultsPerPage** | **Integer**| The maximum number of results to return per page. If the response exceeds the maximum number of transactions or 10 MB, the API responds with &#39;InvalidInput&#39;. | [optional] [default to 100]
 **postedAfter** | **OffsetDateTime**| A date used for selecting financial events posted after (or at) a specified time. The date-time must be no later than two minutes before the request was submitted, in ISO 8601 date time format. | [optional]
 **postedBefore** | **OffsetDateTime**| A date used for selecting financial events posted before (but not at) a specified time. The date-time must be later than PostedAfter and no later than two minutes before the request was submitted, in ISO 8601 date time format. If PostedAfter and PostedBefore are more than 180 days apart, no financial events are returned. You must specify the PostedAfter parameter if you specify the PostedBefore parameter. Default: Now minus two minutes. | [optional]
 **nextToken** | **String**| A string token returned in the response of your previous request. | [optional]

### Return type

[**ListFinancialEventsResponse**](ListFinancialEventsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listFinancialEventsByGroupId"></a>
# **listFinancialEventsByGroupId**
> ListFinancialEventsResponse listFinancialEventsByGroupId(eventGroupId, maxResultsPerPage, postedAfter, postedBefore, nextToken)



Returns all financial events for the specified financial event group. It may take up to 48 hours for orders to appear in your financial events.  **Note:** This operation will only retrieve group&#39;s data for the past two years. If a request is submitted for data spanning more than two years, an empty response is returned.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api_client.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String eventGroupId = "eventGroupId_example"; // String | The identifier of the financial event group to which the events belong.
Integer maxResultsPerPage = 100; // Integer | The maximum number of results to return per page. If the response exceeds the maximum number of transactions or 10 MB, the API responds with 'InvalidInput'.
OffsetDateTime postedAfter = OffsetDateTime.now(); // OffsetDateTime | A date used for selecting financial events posted after (or at) a specified time. The date-time **must** be more than two minutes before the time of the request, in ISO 8601 date time format.
OffsetDateTime postedBefore = OffsetDateTime.now(); // OffsetDateTime | A date used for selecting financial events posted before (but not at) a specified time. The date-time must be later than `PostedAfter` and no later than two minutes before the request was submitted, in ISO 8601 date time format. If `PostedAfter` and `PostedBefore` are more than 180 days apart, no financial events are returned. You must specify the `PostedAfter` parameter if you specify the `PostedBefore` parameter. Default: Now minus two minutes.
String nextToken = "nextToken_example"; // String | A string token returned in the response of your previous request.
try {
    ListFinancialEventsResponse result = apiInstance.listFinancialEventsByGroupId(eventGroupId, maxResultsPerPage, postedAfter, postedBefore, nextToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listFinancialEventsByGroupId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventGroupId** | **String**| The identifier of the financial event group to which the events belong. |
 **maxResultsPerPage** | **Integer**| The maximum number of results to return per page. If the response exceeds the maximum number of transactions or 10 MB, the API responds with &#39;InvalidInput&#39;. | [optional] [default to 100]
 **postedAfter** | **OffsetDateTime**| A date used for selecting financial events posted after (or at) a specified time. The date-time **must** be more than two minutes before the time of the request, in ISO 8601 date time format. | [optional]
 **postedBefore** | **OffsetDateTime**| A date used for selecting financial events posted before (but not at) a specified time. The date-time must be later than &#x60;PostedAfter&#x60; and no later than two minutes before the request was submitted, in ISO 8601 date time format. If &#x60;PostedAfter&#x60; and &#x60;PostedBefore&#x60; are more than 180 days apart, no financial events are returned. You must specify the &#x60;PostedAfter&#x60; parameter if you specify the &#x60;PostedBefore&#x60; parameter. Default: Now minus two minutes. | [optional]
 **nextToken** | **String**| A string token returned in the response of your previous request. | [optional]

### Return type

[**ListFinancialEventsResponse**](ListFinancialEventsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listFinancialEventsByOrderId"></a>
# **listFinancialEventsByOrderId**
> ListFinancialEventsResponse listFinancialEventsByOrderId(orderId, maxResultsPerPage, nextToken)



Returns all financial events for the specified order. It may take up to 48 hours for orders to appear in your financial events.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.5 | 30 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api_client.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String orderId = "orderId_example"; // String | An Amazon-defined order identifier, in 3-7-7 format.
Integer maxResultsPerPage = 100; // Integer | The maximum number of results to return per page. If the response exceeds the maximum number of transactions or 10 MB, the API responds with 'InvalidInput'.
String nextToken = "nextToken_example"; // String | A string token returned in the response of your previous request.
try {
    ListFinancialEventsResponse result = apiInstance.listFinancialEventsByOrderId(orderId, maxResultsPerPage, nextToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listFinancialEventsByOrderId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| An Amazon-defined order identifier, in 3-7-7 format. |
 **maxResultsPerPage** | **Integer**| The maximum number of results to return per page. If the response exceeds the maximum number of transactions or 10 MB, the API responds with &#39;InvalidInput&#39;. | [optional] [default to 100]
 **nextToken** | **String**| A string token returned in the response of your previous request. | [optional]

### Return type

[**ListFinancialEventsResponse**](ListFinancialEventsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

