/*
 * Metal API
 * # Introduction Equinix Metal provides a RESTful HTTP API which can be reached at <https://api.equinix.com/metal/v1>. This document describes the API and how to use it.  The API allows you to programmatically interact with all of your Equinix Metal resources, including devices, networks, addresses, organizations, projects, and your user account. Every feature of the Equinix Metal web interface is accessible through the API.  The API docs are generated from the Equinix Metal OpenAPI specification and are officially hosted at <https://metal.equinix.com/developers/api>.  # Common Parameters  The Equinix Metal API uses a few methods to minimize network traffic and improve throughput. These parameters are not used in all API calls, but are used often enough to warrant their own section. Look for these parameters in the documentation for the API calls that support them.  ## Pagination  Pagination is used to limit the number of results returned in a single request. The API will return a maximum of 100 results per page. To retrieve additional results, you can use the `page` and `per_page` query parameters.  The `page` parameter is used to specify the page number. The first page is `1`. The `per_page` parameter is used to specify the number of results per page. The maximum number of results differs by resource type.  ## Sorting  Where offered, the API allows you to sort results by a specific field. To sort results use the `sort_by` query parameter with the root level field name as the value. The `sort_direction` parameter is used to specify the sort direction, either either `asc` (ascending) or `desc` (descending).  ## Filtering  Filtering is used to limit the results returned in a single request. The API supports filtering by certain fields in the response. To filter results, you can use the field as a query parameter.  For example, to filter the IP list to only return public IPv4 addresses, you can filter by the `type` field, as in the following request:  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/projects/id/ips?type=public_ipv4 ```  Only IP addresses with the `type` field set to `public_ipv4` will be returned.  ## Searching  Searching is used to find matching resources using multiple field comparissons. The API supports searching in resources that define this behavior. The fields available for search differ by resource, as does the search strategy.  To search resources you can use the `search` query parameter.  ## Include and Exclude  For resources that contain references to other resources, sucha as a Device that refers to the Project it resides in, the Equinix Metal API will returns `href` values (API links) to the associated resource.  ```json {   ...   \"project\": {     \"href\": \"/metal/v1/projects/f3f131c8-f302-49ef-8c44-9405022dc6dd\"   } } ```  If you're going need the project details, you can avoid a second API request.  Specify the contained `href` resources and collections that you'd like to have included in the response using the `include` query parameter.  For example:  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=projects ```  The `include` parameter is generally accepted in `GET`, `POST`, `PUT`, and `PATCH` requests where `href` resources are presented.  To have multiple resources include, use a comma-separated list (e.g. `?include=emails,projects,memberships`).  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=emails,projects,memberships ```  You may also include nested associations up to three levels deep using dot notation (`?include=memberships.projects`):  ```sh curl -H 'X-Auth-Token: my_authentication_token' \\   https://api.equinix.com/metal/v1/user?include=memberships.projects ```  To exclude resources, and optimize response delivery, use the `exclude` query parameter. The `exclude` parameter is generally accepted in `GET`, `POST`, `PUT`, and `PATCH` requests for fields with nested object responses. When excluded, these fields will be replaced with an object that contains only an `href` field. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@equinixmetal.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.openapi.metal.v1.model;

import com.equinix.openapi.metal.v1.model.Href;
import com.equinix.openapi.metal.v1.model.IPAssignment;
import com.equinix.openapi.metal.v1.model.IPReservation;
import com.equinix.openapi.metal.v1.model.IPReservationFacility;
import com.equinix.openapi.metal.v1.model.IPReservationMetro;
import com.equinix.openapi.metal.v1.model.MetalGatewayLite;
import com.equinix.openapi.metal.v1.model.Project;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for IPReservationOrHref
 */
public class IPReservationOrHrefTest {
    private final IPReservationOrHref model = new IPReservationOrHref();

    /**
     * Model tests for IPReservationOrHref
     */
    @Test
    public void testIPReservationOrHref() {
        // TODO: test IPReservationOrHref
    }

    /**
     * Test the property 'addon'
     */
    @Test
    public void addonTest() {
        // TODO: test addon
    }

    /**
     * Test the property 'address'
     */
    @Test
    public void addressTest() {
        // TODO: test address
    }

    /**
     * Test the property 'addressFamily'
     */
    @Test
    public void addressFamilyTest() {
        // TODO: test addressFamily
    }

    /**
     * Test the property 'assignments'
     */
    @Test
    public void assignmentsTest() {
        // TODO: test assignments
    }

    /**
     * Test the property 'available'
     */
    @Test
    public void availableTest() {
        // TODO: test available
    }

    /**
     * Test the property 'bill'
     */
    @Test
    public void billTest() {
        // TODO: test bill
    }

    /**
     * Test the property 'cidr'
     */
    @Test
    public void cidrTest() {
        // TODO: test cidr
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        // TODO: test createdAt
    }

    /**
     * Test the property 'customdata'
     */
    @Test
    public void customdataTest() {
        // TODO: test customdata
    }

    /**
     * Test the property 'enabled'
     */
    @Test
    public void enabledTest() {
        // TODO: test enabled
    }

    /**
     * Test the property 'details'
     */
    @Test
    public void detailsTest() {
        // TODO: test details
    }

    /**
     * Test the property 'facility'
     */
    @Test
    public void facilityTest() {
        // TODO: test facility
    }

    /**
     * Test the property 'gateway'
     */
    @Test
    public void gatewayTest() {
        // TODO: test gateway
    }

    /**
     * Test the property 'globalIp'
     */
    @Test
    public void globalIpTest() {
        // TODO: test globalIp
    }

    /**
     * Test the property 'href'
     */
    @Test
    public void hrefTest() {
        // TODO: test href
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'manageable'
     */
    @Test
    public void manageableTest() {
        // TODO: test manageable
    }

    /**
     * Test the property 'management'
     */
    @Test
    public void managementTest() {
        // TODO: test management
    }

    /**
     * Test the property 'metalGateway'
     */
    @Test
    public void metalGatewayTest() {
        // TODO: test metalGateway
    }

    /**
     * Test the property 'metro'
     */
    @Test
    public void metroTest() {
        // TODO: test metro
    }

    /**
     * Test the property 'netmask'
     */
    @Test
    public void netmaskTest() {
        // TODO: test netmask
    }

    /**
     * Test the property 'network'
     */
    @Test
    public void networkTest() {
        // TODO: test network
    }

    /**
     * Test the property 'project'
     */
    @Test
    public void projectTest() {
        // TODO: test project
    }

    /**
     * Test the property 'projectLite'
     */
    @Test
    public void projectLiteTest() {
        // TODO: test projectLite
    }

    /**
     * Test the property 'requestedBy'
     */
    @Test
    public void requestedByTest() {
        // TODO: test requestedBy
    }

    /**
     * Test the property '_public'
     */
    @Test
    public void _publicTest() {
        // TODO: test _public
    }

    /**
     * Test the property 'state'
     */
    @Test
    public void stateTest() {
        // TODO: test state
    }

    /**
     * Test the property 'tags'
     */
    @Test
    public void tagsTest() {
        // TODO: test tags
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

}
