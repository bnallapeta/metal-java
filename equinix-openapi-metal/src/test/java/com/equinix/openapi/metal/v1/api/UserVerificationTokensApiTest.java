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
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserVerificationTokensApi
 */
@Disabled
public class UserVerificationTokensApiTest {

    private final UserVerificationTokensApi api = new UserVerificationTokensApi();

    /**
     * Verify a user using an email verification token
     *
     * Consumes an email verification token and verifies the user associated with it.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void consumeVerificationRequestTest() throws ApiException {
        String token = null;
        api.consumeVerificationRequest(token);
        // TODO: test validations
    }

    /**
     * Create an email verification request
     *
     * Creates an email verification request
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createValidationRequestTest() throws ApiException {
        String login = null;
        api.createValidationRequest(login);
        // TODO: test validations
    }

}