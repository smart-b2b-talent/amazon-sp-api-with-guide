# VendorTransactionApi

All URIs are relative to *https://sellingpartnerapi-na.amazon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTransactionStatus**](VendorTransactionApi.md#getTransactionStatus) | **GET** /vendor/directFulfillment/transactions/2021-12-28/transactions/{transactionId} | 


<a name="getTransactionStatus"></a>
# **getTransactionStatus**
> TransactionStatus getTransactionStatus(transactionId)



Returns the status of the transaction indicated by the specified transactionId.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 10 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values then those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api_client.VendorTransactionApi;


VendorTransactionApi apiInstance = new VendorTransactionApi();
String transactionId = "transactionId_example"; // String | Previously returned in the response to the POST request of a specific transaction.
try {
    TransactionStatus result = apiInstance.getTransactionStatus(transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorTransactionApi#getTransactionStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionId** | **String**| Previously returned in the response to the POST request of a specific transaction. |

### Return type

[**TransactionStatus**](TransactionStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

