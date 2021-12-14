/*
 * Metal API
 * This is the API for Equinix Metal. The API allows you to programmatically interact with all of your Equinix Metal resources, including devices, networks, addresses, organizations, projects, and your user account.  The official API docs are hosted at <https://metal.equinix.com/developers/api>. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@equinixmetal.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.packet.client.api;

import net.packet.client.ApiCallback;
import net.packet.client.ApiClient;
import net.packet.client.ApiException;
import net.packet.client.ApiResponse;
import net.packet.client.Configuration;
import net.packet.client.Pair;
import net.packet.client.ProgressRequestBody;
import net.packet.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import net.packet.client.model.Error;
import net.packet.client.model.GlobalBgpRangeList;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GlobalBgpRangesApi {
    private ApiClient apiClient;

    public GlobalBgpRangesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GlobalBgpRangesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for findGlobalBgpRanges
     * @param id Project UUID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call findGlobalBgpRangesCall(UUID id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/projects/{id}/global-bgp-ranges"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "x_auth_token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call findGlobalBgpRangesValidateBeforeCall(UUID id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling findGlobalBgpRanges(Async)");
        }
        

        com.squareup.okhttp.Call call = findGlobalBgpRangesCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieve all global bgp ranges
     * Returns all global bgp ranges for a project
     * @param id Project UUID (required)
     * @return GlobalBgpRangeList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GlobalBgpRangeList findGlobalBgpRanges(UUID id) throws ApiException {
        ApiResponse<GlobalBgpRangeList> resp = findGlobalBgpRangesWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Retrieve all global bgp ranges
     * Returns all global bgp ranges for a project
     * @param id Project UUID (required)
     * @return ApiResponse&lt;GlobalBgpRangeList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GlobalBgpRangeList> findGlobalBgpRangesWithHttpInfo(UUID id) throws ApiException {
        com.squareup.okhttp.Call call = findGlobalBgpRangesValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<GlobalBgpRangeList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve all global bgp ranges (asynchronously)
     * Returns all global bgp ranges for a project
     * @param id Project UUID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call findGlobalBgpRangesAsync(UUID id, final ApiCallback<GlobalBgpRangeList> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = findGlobalBgpRangesValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GlobalBgpRangeList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
