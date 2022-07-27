/*
 * Metal API
 * This is the API for Equinix Metal. The API allows you to programmatically interact with all of your Equinix Metal resources, including devices, networks, addresses, organizations, projects, and your user account.  The official API docs are hosted at <https://metal.equinix.com/developers/api>. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@equinixmetal.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.openapi.metal.v1.api;

import com.equinix.openapi.ApiException;
import com.equinix.openapi.metal.v1.model.Error;
import com.equinix.openapi.metal.v1.model.SpotMarketPricesList;
import com.equinix.openapi.metal.v1.model.SpotMarketPricesPerMetroList;
import com.equinix.openapi.metal.v1.model.SpotMarketRequest;
import com.equinix.openapi.metal.v1.model.SpotMarketRequestCreateInput;
import com.equinix.openapi.metal.v1.model.SpotMarketRequestList;
import com.equinix.openapi.metal.v1.model.SpotPricesHistoryReport;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SpotMarketApi
 */
@Disabled
public class SpotMarketApiTest {

    private final SpotMarketApi api = new SpotMarketApi();

    /**
     * Create a spot market request
     *
     * Creates a new spot market request.  Type-specific options (such as operating_system for baremetal devices) should be included in the main data structure alongside hostname and plan.  The features attribute allows you to optionally specify what features your server should have. For example, if you require a server with a TPM chip, you may specify &#x60;{ \&quot;features\&quot;: { \&quot;tpm\&quot;: \&quot;required\&quot; } }&#x60; (or &#x60;{ \&quot;features\&quot;: [\&quot;tpm\&quot;] }&#x60; in shorthand).  The request will fail if there are no available servers matching your criteria. Alternatively, if you do not require a certain feature, but would prefer to be assigned a server with that feature if there are any available, you may specify that feature with a preferred value (see the example request below).  The request will not fail if we have no servers with that feature in our inventory.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSpotMarketRequestTest() throws ApiException {
        UUID id = null;
        SpotMarketRequestCreateInput spotMarketRequestCreateInput = null;
        SpotMarketRequest response = api.createSpotMarketRequest(id, spotMarketRequestCreateInput);
        // TODO: test validations
    }

    /**
     * Delete the spot market request
     *
     * Deletes the spot market request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteSpotMarketRequestTest() throws ApiException {
        UUID id = null;
        Boolean forceTermination = null;
        api.deleteSpotMarketRequest(id, forceTermination);
        // TODO: test validations
    }

    /**
     * Get current spot market prices for metros
     *
     * Get Equinix Metal current spot market prices for all metros.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findMetroSpotMarketPricesTest() throws ApiException {
        String metro = null;
        String plan = null;
        SpotMarketPricesPerMetroList response = api.findMetroSpotMarketPrices(metro, plan);
        // TODO: test validations
    }

    /**
     * Get current spot market prices
     *
     * Get Equinix Metal current spot market prices.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findSpotMarketPricesTest() throws ApiException {
        String facility = null;
        String plan = null;
        SpotMarketPricesList response = api.findSpotMarketPrices(facility, plan);
        // TODO: test validations
    }

    /**
     * Get spot market prices for a given period of time
     *
     * Get spot market prices for a given plan and facility in a fixed period of time  *Note: In the &#x60;200&#x60; response, the property &#x60;datapoints&#x60; contains arrays of &#x60;[float, integer]&#x60;.*
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findSpotMarketPricesHistoryTest() throws ApiException {
        String facility = null;
        String plan = null;
        String from = null;
        String until = null;
        String metro = null;
        SpotPricesHistoryReport response = api.findSpotMarketPricesHistory(facility, plan, from, until, metro);
        // TODO: test validations
    }

    /**
     * Retrieve a spot market request
     *
     * Returns a single spot market request
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findSpotMarketRequestByIdTest() throws ApiException {
        UUID id = null;
        List<String> include = null;
        List<String> exclude = null;
        SpotMarketRequest response = api.findSpotMarketRequestById(id, include, exclude);
        // TODO: test validations
    }

    /**
     * List spot market requests
     *
     * View all spot market requests for a given project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listSpotMarketRequestsTest() throws ApiException {
        UUID id = null;
        SpotMarketRequestList response = api.listSpotMarketRequests(id);
        // TODO: test validations
    }

}