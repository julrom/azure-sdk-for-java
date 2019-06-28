/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2018_02_01.implementation;

import com.microsoft.azure.management.servicefabric.v2018_02_01.AvailableOperationDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Available operation list result.
 */
public class OperationResultInner {
    /**
     * The name of the operation.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The object that represents the operation.
     */
    @JsonProperty(value = "display")
    private AvailableOperationDisplay display;

    /**
     * Origin result.
     */
    @JsonProperty(value = "origin")
    private String origin;

    /**
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the name of the operation.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the operation.
     *
     * @param name the name value to set
     * @return the OperationResultInner object itself.
     */
    public OperationResultInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the object that represents the operation.
     *
     * @return the display value
     */
    public AvailableOperationDisplay display() {
        return this.display;
    }

    /**
     * Set the object that represents the operation.
     *
     * @param display the display value to set
     * @return the OperationResultInner object itself.
     */
    public OperationResultInner withDisplay(AvailableOperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get origin result.
     *
     * @return the origin value
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set origin result.
     *
     * @param origin the origin value to set
     * @return the OperationResultInner object itself.
     */
    public OperationResultInner withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the URL to use for getting the next set of results.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the URL to use for getting the next set of results.
     *
     * @param nextLink the nextLink value to set
     * @return the OperationResultInner object itself.
     */
    public OperationResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

}
