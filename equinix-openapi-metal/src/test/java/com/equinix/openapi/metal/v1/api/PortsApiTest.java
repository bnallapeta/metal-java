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
import com.equinix.openapi.metal.v1.model.Port;
import com.equinix.openapi.metal.v1.model.PortAssignInput;
import com.equinix.openapi.metal.v1.model.PortConvertLayer3Input;
import com.equinix.openapi.metal.v1.model.PortVlanAssignment;
import com.equinix.openapi.metal.v1.model.PortVlanAssignmentBatch;
import com.equinix.openapi.metal.v1.model.PortVlanAssignmentBatchCreateInput;
import com.equinix.openapi.metal.v1.model.PortVlanAssignmentBatchList;
import com.equinix.openapi.metal.v1.model.PortVlanAssignmentList;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PortsApi
 */
@Disabled
public class PortsApiTest {

    private final PortsApi api = new PortsApi();

    /**
     * Assign a native VLAN
     *
     * Sets a virtual network on this port as a \&quot;native VLAN\&quot;. The VLAN must have already been assigned using the using the \&quot;Assign a port to a virtual network\&quot; operation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assignNativeVlanTest() throws ApiException {
        UUID id = null;
        String vnid = null;
        Port response = api.assignNativeVlan(id, vnid);
        // TODO: test validations
    }

    /**
     * Assign a port to virtual network
     *
     * Assign a hardware port to a virtual network.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assignPortTest() throws ApiException {
        UUID id = null;
        PortAssignInput portAssignInput = null;
        Port response = api.assignPort(id, portAssignInput);
        // TODO: test validations
    }

    /**
     * Enabling bonding
     *
     * Enabling bonding for one or all ports
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void bondPortTest() throws ApiException {
        UUID id = null;
        Boolean bulkEnable = null;
        Port response = api.bondPort(id, bulkEnable);
        // TODO: test validations
    }

    /**
     * Convert to Layer 2
     *
     * Converts a bond port to Layer 2. IP assignments of the port will be removed.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void convertLayer2Test() throws ApiException {
        UUID id = null;
        PortAssignInput portAssignInput = null;
        Port response = api.convertLayer2(id, portAssignInput);
        // TODO: test validations
    }

    /**
     * Convert to Layer 3
     *
     * Converts a bond port to Layer 3. VLANs must first be unassigned.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void convertLayer3Test() throws ApiException {
        UUID id = null;
        PortConvertLayer3Input portConvertLayer3Input = null;
        Port response = api.convertLayer3(id, portConvertLayer3Input);
        // TODO: test validations
    }

    /**
     * Create a new Port-VLAN Assignment management batch
     *
     * Create a new asynchronous batch request which handles adding and/or removing the VLANs to which the port is assigned.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createPortVlanAssignmentBatchTest() throws ApiException {
        UUID id = null;
        PortVlanAssignmentBatchCreateInput portVlanAssignmentBatchCreateInput = null;
        PortVlanAssignmentBatch response = api.createPortVlanAssignmentBatch(id, portVlanAssignmentBatchCreateInput);
        // TODO: test validations
    }

    /**
     * Remove native VLAN
     *
     * Removes the native VLAN from this port
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteNativeVlanTest() throws ApiException {
        UUID id = null;
        Port response = api.deleteNativeVlan(id);
        // TODO: test validations
    }

    /**
     * Disabling bonding
     *
     * Disabling bonding for one or all ports
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void disbondPortTest() throws ApiException {
        UUID id = null;
        Boolean bulkDisable = null;
        Port response = api.disbondPort(id, bulkDisable);
        // TODO: test validations
    }

    /**
     * Retrieve a port
     *
     * Returns a port
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findPortByIdTest() throws ApiException {
        UUID id = null;
        List<String> include = null;
        List<String> exclude = null;
        Port response = api.findPortById(id, include, exclude);
        // TODO: test validations
    }

    /**
     * Retrieve a VLAN Assignment Batch&#39;s details
     *
     * Returns the details of an existing Port-VLAN Assignment batch, including the list of VLANs to assign or unassign, and the current state of the batch.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findPortVlanAssignmentBatchByPortIdAndBatchIdTest() throws ApiException {
        UUID id = null;
        UUID batchId = null;
        PortVlanAssignmentBatch response = api.findPortVlanAssignmentBatchByPortIdAndBatchId(id, batchId);
        // TODO: test validations
    }

    /**
     * List the VLAN Assignment Batches for a port
     *
     * Show all the VLAN assignment batches that have been created for managing this port&#39;s VLAN assignments
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findPortVlanAssignmentBatchesTest() throws ApiException {
        UUID id = null;
        PortVlanAssignmentBatchList response = api.findPortVlanAssignmentBatches(id);
        // TODO: test validations
    }

    /**
     * Show a particular Port VLAN assignment&#39;s details
     *
     * Show the details of a specific Port-VLAN assignment, including the current state and if the VLAN is set as native.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findPortVlanAssignmentByPortIdAndAssignmentIdTest() throws ApiException {
        UUID id = null;
        UUID assignmentId = null;
        List<String> include = null;
        List<String> exclude = null;
        PortVlanAssignment response = api.findPortVlanAssignmentByPortIdAndAssignmentId(id, assignmentId, include, exclude);
        // TODO: test validations
    }

    /**
     * List Current VLAN assignments for a port
     *
     * Show the port&#39;s current VLAN assignments, including if this VLAN is set as native, and the current state of the assignment (ex. &#39;assigned&#39; or &#39;unassigning&#39;)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findPortVlanAssignmentsTest() throws ApiException {
        UUID id = null;
        List<String> include = null;
        List<String> exclude = null;
        PortVlanAssignmentList response = api.findPortVlanAssignments(id, include, exclude);
        // TODO: test validations
    }

    /**
     * Unassign a port
     *
     * Unassign a port for a hardware.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unassignPortTest() throws ApiException {
        UUID id = null;
        PortAssignInput portAssignInput = null;
        Port response = api.unassignPort(id, portAssignInput);
        // TODO: test validations
    }

}