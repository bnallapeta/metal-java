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

import net.packet.client.model.CreateSelfServiceReservationRequest;
import net.packet.client.model.Error;
import net.packet.client.model.IPAssignment;
import net.packet.client.model.IPAssignmentInput;
import net.packet.client.model.IPAssignmentList;
import net.packet.client.model.IPAvailabilitiesList;
import net.packet.client.model.IPReservation;
import net.packet.client.model.IPReservationList;
import net.packet.client.model.IPReservationRequestInput;
import net.packet.client.model.SelfServiceReservationList;
import net.packet.client.model.SelfServiceReservationResponse;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IpAddressesApi
 */
@Ignore
public class IpAddressesApiTest {

    private final IpAddressesApi api = new IpAddressesApi();

    
    /**
     * Create an ip assignment
     *
     * Creates an ip assignment for a device.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createIPAssignmentTest() throws Exception {
        UUID id = null;
        IPAssignmentInput ipAssignment = null;
        IPAssignment response = api.createIPAssignment(id, ipAssignment);

        // TODO: test validations
    }
    
    /**
     * Create a reservation
     *
     * Creates a reservation.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createSelfServiceReservationTest() throws Exception {
        CreateSelfServiceReservationRequest reservation = null;
        UUID projectId = null;
        SelfServiceReservationResponse response = api.createSelfServiceReservation(reservation, projectId);

        // TODO: test validations
    }
    
    /**
     * Unassign an ip address
     *
     * Note! This call can be used to un-assign an IP assignment or delete an IP reservation. Un-assign an IP address record. Use the assignment UUID you get after attaching the IP. This will remove the relationship between an IP and the device and will make the IP address available to be assigned to another device. Delete and IP reservation. Use the reservation UUID you get after adding the IP to the project. This will permanently delete the IP block reservation from the project.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteIPAddressTest() throws Exception {
        UUID id = null;
        api.deleteIPAddress(id);

        // TODO: test validations
    }
    
    /**
     * Retrieve an ip address
     *
     * Returns a single ip address if the user has access.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findIPAddressByIdTest() throws Exception {
        UUID id = null;
        List<String> include = null;
        List<String> exclude = null;
        IPAssignment response = api.findIPAddressById(id, include, exclude);

        // TODO: test validations
    }
    
    /**
     * Retrieve the custom metadata of an IP Reservation or IP Assignment
     *
     * Provides the custom metadata stored for this IP Reservation or IP Assignment in json format
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findIPAddressCustomdataTest() throws Exception {
        UUID id = null;
        api.findIPAddressCustomdata(id);

        // TODO: test validations
    }
    
    /**
     * Retrieve all ip assignments
     *
     * Returns all ip assignments for a device.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findIPAssignmentsTest() throws Exception {
        UUID id = null;
        List<String> include = null;
        List<String> exclude = null;
        IPAssignmentList response = api.findIPAssignments(id, include, exclude);

        // TODO: test validations
    }
    
    /**
     * Retrieve all available subnets of a particular reservation
     *
     * Provides a list of IP resevations for a single project.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findIPAvailabilitiesTest() throws Exception {
        UUID id = null;
        String cidr = null;
        IPAvailabilitiesList response = api.findIPAvailabilities(id, cidr);

        // TODO: test validations
    }
    
    /**
     * Retrieve all ip reservations
     *
     * Provides a list of IP resevations for a single project.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findIPReservationsTest() throws Exception {
        UUID id = null;
        List<String> include = null;
        List<String> exclude = null;
        IPReservationList response = api.findIPReservations(id, include, exclude);

        // TODO: test validations
    }
    
    /**
     * Retrieve a reservation
     *
     * Returns a reservation
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findSelfServiceReservationTest() throws Exception {
        UUID id = null;
        UUID projectId = null;
        SelfServiceReservationResponse response = api.findSelfServiceReservation(id, projectId);

        // TODO: test validations
    }
    
    /**
     * Retrieve all reservations
     *
     * Returns all reservations.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findSelfServiceReservationsTest() throws Exception {
        UUID projectId = null;
        Integer page = null;
        Integer perPage = null;
        SelfServiceReservationList response = api.findSelfServiceReservations(projectId, page, perPage);

        // TODO: test validations
    }
    
    /**
     * Requesting IP reservations
     *
     * Request more IP space for a project in order to have additional IP addresses to assign to devices.  If the request is within the max quota, an IP reservation will be created. If the project will exceed its IP quota, a request will be submitted for review, and will return an IP Reservation with a &#x60;state&#x60; of &#x60;pending&#x60;. You can automatically have the request fail with HTTP status 422 instead of triggering the review process by providing the &#x60;fail_on_approval_required&#x60; parameter set to &#x60;true&#x60; in the request.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void requestIPReservationTest() throws Exception {
        UUID id = null;
        IPReservationRequestInput ipReservationRequest = null;
        IPReservation response = api.requestIPReservation(id, ipReservationRequest);

        // TODO: test validations
    }
    
    /**
     * Update an ip address
     *
     * Update details about an ip address
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateIPAddressTest() throws Exception {
        UUID id = null;
        String details = null;
        String customdata = null;
        IPAssignment response = api.updateIPAddress(id, details, customdata);

        // TODO: test validations
    }
    
}