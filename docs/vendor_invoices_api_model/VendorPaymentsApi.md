# VendorPaymentsApi

All URIs are relative to *https://sellingpartnerapi-na.amazon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**submitInvoices**](VendorPaymentsApi.md#submitInvoices) | **POST** /vendor/payments/v1/invoices | 


<a name="submitInvoices"></a>
# **submitInvoices**
> SubmitInvoicesResponse submitInvoices(body)



Submit new invoices to Amazon.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 10 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api_client.VendorPaymentsApi;


VendorPaymentsApi apiInstance = new VendorPaymentsApi();
SubmitInvoicesRequest body = new SubmitInvoicesRequest(); // SubmitInvoicesRequest | 
try {
    SubmitInvoicesResponse result = apiInstance.submitInvoices(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorPaymentsApi#submitInvoices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubmitInvoicesRequest**](SubmitInvoicesRequest.md)|  |

### Return type

[**SubmitInvoicesResponse**](SubmitInvoicesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

