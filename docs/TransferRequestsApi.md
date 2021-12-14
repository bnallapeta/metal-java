# TransferRequestsApi

All URIs are relative to *https://api.equinix.com/metal/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptTransferRequest**](TransferRequestsApi.md#acceptTransferRequest) | **PUT** /transfers/{id} | Accept a transfer request
[**createTransferRequest**](TransferRequestsApi.md#createTransferRequest) | **POST** /projects/{id}/transfers | Create a transfer request
[**declineTransferRequest**](TransferRequestsApi.md#declineTransferRequest) | **DELETE** /transfers/{id} | Decline a transfer request
[**findOrganizationTransfers**](TransferRequestsApi.md#findOrganizationTransfers) | **GET** /organizations/{id}/transfers | Retrieve all project transfer requests from or to an organization
[**findTransferRequestById**](TransferRequestsApi.md#findTransferRequestById) | **GET** /transfers/{id} | View a transfer request


<a name="acceptTransferRequest"></a>
# **acceptTransferRequest**
> acceptTransferRequest(id)

Accept a transfer request

Accept a transfer request.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.TransferRequestsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

TransferRequestsApi apiInstance = new TransferRequestsApi();
UUID id = new UUID(); // UUID | Transfer request UUID
try {
    apiInstance.acceptTransferRequest(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferRequestsApi#acceptTransferRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Transfer request UUID |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTransferRequest"></a>
# **createTransferRequest**
> TransferRequest createTransferRequest(id, transferRequest)

Create a transfer request

Organization owners can transfer their projects to other organizations.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.TransferRequestsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

TransferRequestsApi apiInstance = new TransferRequestsApi();
UUID id = new UUID(); // UUID | UUID of the project to be transferred
TransferRequestInput transferRequest = new TransferRequestInput(); // TransferRequestInput | Transfer Request to create
try {
    TransferRequest result = apiInstance.createTransferRequest(id, transferRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferRequestsApi#createTransferRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| UUID of the project to be transferred |
 **transferRequest** | [**TransferRequestInput**](TransferRequestInput.md)| Transfer Request to create |

### Return type

[**TransferRequest**](TransferRequest.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="declineTransferRequest"></a>
# **declineTransferRequest**
> declineTransferRequest(id)

Decline a transfer request

Decline a transfer request.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.TransferRequestsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

TransferRequestsApi apiInstance = new TransferRequestsApi();
UUID id = new UUID(); // UUID | Transfer request UUID
try {
    apiInstance.declineTransferRequest(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferRequestsApi#declineTransferRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Transfer request UUID |

### Return type

null (empty response body)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findOrganizationTransfers"></a>
# **findOrganizationTransfers**
> TransferRequestList findOrganizationTransfers(id, include, exclude)

Retrieve all project transfer requests from or to an organization

Provides a collection of project transfer requests from or to the organization.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.TransferRequestsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

TransferRequestsApi apiInstance = new TransferRequestsApi();
UUID id = new UUID(); // UUID | Organization UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    TransferRequestList result = apiInstance.findOrganizationTransfers(id, include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferRequestsApi#findOrganizationTransfers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Organization UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]

### Return type

[**TransferRequestList**](TransferRequestList.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findTransferRequestById"></a>
# **findTransferRequestById**
> TransferRequest findTransferRequestById(id, include, exclude)

View a transfer request

Returns a single transfer request.

### Example
```java
// Import classes:
//import net.packet.client.ApiClient;
//import net.packet.client.ApiException;
//import net.packet.client.Configuration;
//import net.packet.client.auth.*;
//import net.packet.client.api.TransferRequestsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: x_auth_token
ApiKeyAuth x_auth_token = (ApiKeyAuth) defaultClient.getAuthentication("x_auth_token");
x_auth_token.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//x_auth_token.setApiKeyPrefix("Token");

TransferRequestsApi apiInstance = new TransferRequestsApi();
UUID id = new UUID(); // UUID | Transfer request UUID
List<String> include = Arrays.asList("include_example"); // List<String> | Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects.
try {
    TransferRequest result = apiInstance.findTransferRequestById(id, include, exclude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransferRequestsApi#findTransferRequestById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| Transfer request UUID |
 **include** | [**List&lt;String&gt;**](String.md)| Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. | [optional]
 **exclude** | [**List&lt;String&gt;**](String.md)| Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. | [optional]

### Return type

[**TransferRequest**](TransferRequest.md)

### Authorization

[x_auth_token](../README.md#x_auth_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
