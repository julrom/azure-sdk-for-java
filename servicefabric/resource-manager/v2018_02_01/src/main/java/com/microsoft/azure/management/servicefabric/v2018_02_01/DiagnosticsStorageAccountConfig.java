/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2018_02_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The storage account information for storing Service Fabric diagnostic logs.
 */
public class DiagnosticsStorageAccountConfig {
    /**
     * The Azure storage account name.
     */
    @JsonProperty(value = "storageAccountName", required = true)
    private String storageAccountName;

    /**
     * The protected diagnostics storage key name.
     */
    @JsonProperty(value = "protectedAccountKeyName", required = true)
    private String protectedAccountKeyName;

    /**
     * The blob endpoint of the azure storage account.
     */
    @JsonProperty(value = "blobEndpoint", required = true)
    private String blobEndpoint;

    /**
     * The queue endpoint of the azure storage account.
     */
    @JsonProperty(value = "queueEndpoint", required = true)
    private String queueEndpoint;

    /**
     * The table endpoint of the azure storage account.
     */
    @JsonProperty(value = "tableEndpoint", required = true)
    private String tableEndpoint;

    /**
     * Get the Azure storage account name.
     *
     * @return the storageAccountName value
     */
    public String storageAccountName() {
        return this.storageAccountName;
    }

    /**
     * Set the Azure storage account name.
     *
     * @param storageAccountName the storageAccountName value to set
     * @return the DiagnosticsStorageAccountConfig object itself.
     */
    public DiagnosticsStorageAccountConfig withStorageAccountName(String storageAccountName) {
        this.storageAccountName = storageAccountName;
        return this;
    }

    /**
     * Get the protected diagnostics storage key name.
     *
     * @return the protectedAccountKeyName value
     */
    public String protectedAccountKeyName() {
        return this.protectedAccountKeyName;
    }

    /**
     * Set the protected diagnostics storage key name.
     *
     * @param protectedAccountKeyName the protectedAccountKeyName value to set
     * @return the DiagnosticsStorageAccountConfig object itself.
     */
    public DiagnosticsStorageAccountConfig withProtectedAccountKeyName(String protectedAccountKeyName) {
        this.protectedAccountKeyName = protectedAccountKeyName;
        return this;
    }

    /**
     * Get the blob endpoint of the azure storage account.
     *
     * @return the blobEndpoint value
     */
    public String blobEndpoint() {
        return this.blobEndpoint;
    }

    /**
     * Set the blob endpoint of the azure storage account.
     *
     * @param blobEndpoint the blobEndpoint value to set
     * @return the DiagnosticsStorageAccountConfig object itself.
     */
    public DiagnosticsStorageAccountConfig withBlobEndpoint(String blobEndpoint) {
        this.blobEndpoint = blobEndpoint;
        return this;
    }

    /**
     * Get the queue endpoint of the azure storage account.
     *
     * @return the queueEndpoint value
     */
    public String queueEndpoint() {
        return this.queueEndpoint;
    }

    /**
     * Set the queue endpoint of the azure storage account.
     *
     * @param queueEndpoint the queueEndpoint value to set
     * @return the DiagnosticsStorageAccountConfig object itself.
     */
    public DiagnosticsStorageAccountConfig withQueueEndpoint(String queueEndpoint) {
        this.queueEndpoint = queueEndpoint;
        return this;
    }

    /**
     * Get the table endpoint of the azure storage account.
     *
     * @return the tableEndpoint value
     */
    public String tableEndpoint() {
        return this.tableEndpoint;
    }

    /**
     * Set the table endpoint of the azure storage account.
     *
     * @param tableEndpoint the tableEndpoint value to set
     * @return the DiagnosticsStorageAccountConfig object itself.
     */
    public DiagnosticsStorageAccountConfig withTableEndpoint(String tableEndpoint) {
        this.tableEndpoint = tableEndpoint;
        return this;
    }

}
