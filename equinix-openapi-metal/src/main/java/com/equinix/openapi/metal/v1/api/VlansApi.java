/*
 * Metal API
 * # Introduction Equinix Metal provides a RESTful HTTP API which can be reached at <https://api.equinix.com/metal/v1>. This document describes the API and how to use it.  The API allows you to programmatically interact with all of your Equinix Metal resources, including devices, networks, addresses, organizations, projects, and your user account. Every feature of the Equinix Metal web interface is accessible through the API.  The API docs are generated from the Equinix Metal OpenAPI specification and are officially hosted at <https://metal.equinix.com/developers/api>.  # Common Parameters  The Equinix Metal API uses a few methods to minimize network traffic and improve throughput. These parameters are not used in all API calls, but are used often enough to warrant their own section. Look for these parameters in the documentation for the API calls that support them.  ## Pagination  Pagination is used to limit the number of results returned in a single request. The API will return a maximum of 100 results per page. To retrieve additional results, you can use the `page` and `per_page` query parameters.  The `page` parameter is used to specify the page number. The first page is `1`. The `per_page` parameter is used to specify the number of results per page. The maximum number of results differs by resource type.  ## Sorting  Where offered, the API allows you to sort results by a specific field. To sort results use the `sort_by` query parameter with the root level field name as the value. The `sort_direction` parameter is used to specify the sort direction, either either `asc` (ascending) or `desc` (descending).  ## Filtering  Filtering is used to limit the results returned in a single request. The API supports filtering by certain fields in the response. To filter results, you can use the field as a query parameter.  For example, to filter the IP list to only return public IPv4 addresses, you can filter by the `type` field, as in the following request:  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/projects/id/ips?type=public_ipv4 ```  Only IP addresses with the `type` field set to `public_ipv4` will be returned.  ## Searching  Searching is used to find matching resources using multiple field comparissons. The API supports searching in resources that define this behavior. The fields available for search differ by resource, as does the search strategy.  To search resources you can use the `search` query parameter.  ## Include and Exclude  For resources that contain references to other resources, sucha as a Device that refers to the Project it resides in, the Equinix Metal API will returns `href` values (API links) to the associated resource.  ```json {   ...   \"project\": {     \"href\": \"/metal/v1/projects/f3f131c8-f302-49ef-8c44-9405022dc6dd\"   } } ```  If you're going need the project details, you can avoid a second API request.  Specify the contained `href` resources and collections that you'd like to have included in the response using the `include` query parameter.  For example:    ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=projects ```  The `include` parameter is generally accepted in `GET`, `POST`, `PUT`, and `PATCH` requests where `href` resources are presented.  To have multiple resources include, use a comma-separated list (e.g. `?include=emails,projects,memberships`).  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=emails,projects,memberships ```  You may also include nested associations up to three levels deep using dot notation (`?include=memberships.projects`):  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=memberships.projects ```  To exclude resources, and optimize response delivery, use the `exclude` query parameter. The `exclude` parameter is generally accepted in `GET`, `POST`, `PUT`, and `PATCH` requests for fields with nested object responses. When excluded, these fields will be replaced with an object that contains only an `href` field. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@equinixmetal.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.openapi.metal.v1.api;

import com.equinix.openapi.ApiCallback;
import com.equinix.openapi.ApiClient;
import com.equinix.openapi.ApiException;
import com.equinix.openapi.ApiResponse;
import com.equinix.openapi.Configuration;
import com.equinix.openapi.Pair;
import com.equinix.openapi.ProgressRequestBody;
import com.equinix.openapi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.equinix.openapi.metal.v1.model.Error;
import java.util.UUID;
import com.equinix.openapi.metal.v1.model.VirtualNetwork;
import com.equinix.openapi.metal.v1.model.VirtualNetworkCreateInput;
import com.equinix.openapi.metal.v1.model.VirtualNetworkList;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class VlansApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public VlansApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VlansApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for createVirtualNetwork
     * @param id Project UUID (required)
     * @param virtualNetworkCreateInput Virtual Network to create (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> unprocessable entity </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createVirtualNetworkCall(UUID id, VirtualNetworkCreateInput virtualNetworkCreateInput, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = virtualNetworkCreateInput;

        // create path and map variables
        String localVarPath = "/projects/{id}/virtual-networks"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "x_auth_token" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createVirtualNetworkValidateBeforeCall(UUID id, VirtualNetworkCreateInput virtualNetworkCreateInput, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling createVirtualNetwork(Async)");
        }

        // verify the required parameter 'virtualNetworkCreateInput' is set
        if (virtualNetworkCreateInput == null) {
            throw new ApiException("Missing the required parameter 'virtualNetworkCreateInput' when calling createVirtualNetwork(Async)");
        }

        return createVirtualNetworkCall(id, virtualNetworkCreateInput, _callback);

    }

    /**
     * Create a virtual network
     * Creates an virtual network.
     * @param id Project UUID (required)
     * @param virtualNetworkCreateInput Virtual Network to create (required)
     * @return VirtualNetwork
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> unprocessable entity </td><td>  -  </td></tr>
     </table>
     */
    public VirtualNetwork createVirtualNetwork(UUID id, VirtualNetworkCreateInput virtualNetworkCreateInput) throws ApiException {
        ApiResponse<VirtualNetwork> localVarResp = createVirtualNetworkWithHttpInfo(id, virtualNetworkCreateInput);
        return localVarResp.getData();
    }

    /**
     * Create a virtual network
     * Creates an virtual network.
     * @param id Project UUID (required)
     * @param virtualNetworkCreateInput Virtual Network to create (required)
     * @return ApiResponse&lt;VirtualNetwork&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> unprocessable entity </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VirtualNetwork> createVirtualNetworkWithHttpInfo(UUID id, VirtualNetworkCreateInput virtualNetworkCreateInput) throws ApiException {
        okhttp3.Call localVarCall = createVirtualNetworkValidateBeforeCall(id, virtualNetworkCreateInput, null);
        Type localVarReturnType = new TypeToken<VirtualNetwork>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a virtual network (asynchronously)
     * Creates an virtual network.
     * @param id Project UUID (required)
     * @param virtualNetworkCreateInput Virtual Network to create (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> unprocessable entity </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createVirtualNetworkAsync(UUID id, VirtualNetworkCreateInput virtualNetworkCreateInput, final ApiCallback<VirtualNetwork> _callback) throws ApiException {

        okhttp3.Call localVarCall = createVirtualNetworkValidateBeforeCall(id, virtualNetworkCreateInput, _callback);
        Type localVarReturnType = new TypeToken<VirtualNetwork>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteVirtualNetwork
     * @param id Virtual Network UUID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> unprocessable entity </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteVirtualNetworkCall(UUID id, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/virtual-networks/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "x_auth_token" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteVirtualNetworkValidateBeforeCall(UUID id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteVirtualNetwork(Async)");
        }

        return deleteVirtualNetworkCall(id, _callback);

    }

    /**
     * Delete a virtual network
     * Deletes a virtual network.
     * @param id Virtual Network UUID (required)
     * @return VirtualNetwork
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> unprocessable entity </td><td>  -  </td></tr>
     </table>
     */
    public VirtualNetwork deleteVirtualNetwork(UUID id) throws ApiException {
        ApiResponse<VirtualNetwork> localVarResp = deleteVirtualNetworkWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Delete a virtual network
     * Deletes a virtual network.
     * @param id Virtual Network UUID (required)
     * @return ApiResponse&lt;VirtualNetwork&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> unprocessable entity </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VirtualNetwork> deleteVirtualNetworkWithHttpInfo(UUID id) throws ApiException {
        okhttp3.Call localVarCall = deleteVirtualNetworkValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<VirtualNetwork>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete a virtual network (asynchronously)
     * Deletes a virtual network.
     * @param id Virtual Network UUID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> unprocessable entity </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteVirtualNetworkAsync(UUID id, final ApiCallback<VirtualNetwork> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteVirtualNetworkValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<VirtualNetwork>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for findVirtualNetworks
     * @param id Project UUID (required)
     * @param include Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. (optional)
     * @param exclude Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. (optional)
     * @param facility Filter by Facility ID (uuid) or Facility Code (optional)
     * @param metro Filter by Metro ID (uuid) or Metro Code (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findVirtualNetworksCall(UUID id, List<String> include, List<String> exclude, String facility, String metro, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/projects/{id}/virtual-networks"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (include != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "include", include));
        }

        if (exclude != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "exclude", exclude));
        }

        if (facility != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("facility", facility));
        }

        if (metro != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("metro", metro));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "x_auth_token" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call findVirtualNetworksValidateBeforeCall(UUID id, List<String> include, List<String> exclude, String facility, String metro, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling findVirtualNetworks(Async)");
        }

        return findVirtualNetworksCall(id, include, exclude, facility, metro, _callback);

    }

    /**
     * Retrieve all virtual networks
     * Provides a list of virtual networks for a single project.
     * @param id Project UUID (required)
     * @param include Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. (optional)
     * @param exclude Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. (optional)
     * @param facility Filter by Facility ID (uuid) or Facility Code (optional)
     * @param metro Filter by Metro ID (uuid) or Metro Code (optional)
     * @return VirtualNetworkList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public VirtualNetworkList findVirtualNetworks(UUID id, List<String> include, List<String> exclude, String facility, String metro) throws ApiException {
        ApiResponse<VirtualNetworkList> localVarResp = findVirtualNetworksWithHttpInfo(id, include, exclude, facility, metro);
        return localVarResp.getData();
    }

    /**
     * Retrieve all virtual networks
     * Provides a list of virtual networks for a single project.
     * @param id Project UUID (required)
     * @param include Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. (optional)
     * @param exclude Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. (optional)
     * @param facility Filter by Facility ID (uuid) or Facility Code (optional)
     * @param metro Filter by Metro ID (uuid) or Metro Code (optional)
     * @return ApiResponse&lt;VirtualNetworkList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VirtualNetworkList> findVirtualNetworksWithHttpInfo(UUID id, List<String> include, List<String> exclude, String facility, String metro) throws ApiException {
        okhttp3.Call localVarCall = findVirtualNetworksValidateBeforeCall(id, include, exclude, facility, metro, null);
        Type localVarReturnType = new TypeToken<VirtualNetworkList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve all virtual networks (asynchronously)
     * Provides a list of virtual networks for a single project.
     * @param id Project UUID (required)
     * @param include Nested attributes to include. Included objects will return their full attributes. Attribute names can be dotted (up to 3 levels) to included deeply nested objects. (optional)
     * @param exclude Nested attributes to exclude. Excluded objects will return only the href attribute. Attribute names can be dotted (up to 3 levels) to exclude deeply nested objects. (optional)
     * @param facility Filter by Facility ID (uuid) or Facility Code (optional)
     * @param metro Filter by Metro ID (uuid) or Metro Code (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findVirtualNetworksAsync(UUID id, List<String> include, List<String> exclude, String facility, String metro, final ApiCallback<VirtualNetworkList> _callback) throws ApiException {

        okhttp3.Call localVarCall = findVirtualNetworksValidateBeforeCall(id, include, exclude, facility, metro, _callback);
        Type localVarReturnType = new TypeToken<VirtualNetworkList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVirtualNetwork
     * @param id Virtual Network UUID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> unprocessable entity </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getVirtualNetworkCall(UUID id, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/virtual-networks/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "x_auth_token" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getVirtualNetworkValidateBeforeCall(UUID id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getVirtualNetwork(Async)");
        }

        return getVirtualNetworkCall(id, _callback);

    }

    /**
     * Get a virtual network
     * Get a virtual network.
     * @param id Virtual Network UUID (required)
     * @return VirtualNetwork
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> unprocessable entity </td><td>  -  </td></tr>
     </table>
     */
    public VirtualNetwork getVirtualNetwork(UUID id) throws ApiException {
        ApiResponse<VirtualNetwork> localVarResp = getVirtualNetworkWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Get a virtual network
     * Get a virtual network.
     * @param id Virtual Network UUID (required)
     * @return ApiResponse&lt;VirtualNetwork&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> unprocessable entity </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VirtualNetwork> getVirtualNetworkWithHttpInfo(UUID id) throws ApiException {
        okhttp3.Call localVarCall = getVirtualNetworkValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<VirtualNetwork>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a virtual network (asynchronously)
     * Get a virtual network.
     * @param id Virtual Network UUID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> ok </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> not found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> unprocessable entity </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getVirtualNetworkAsync(UUID id, final ApiCallback<VirtualNetwork> _callback) throws ApiException {

        okhttp3.Call localVarCall = getVirtualNetworkValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<VirtualNetwork>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
