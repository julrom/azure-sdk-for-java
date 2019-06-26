/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.operationsmanagement.v2015_11_01_preview.implementation;

import com.microsoft.azure.management.operationsmanagement.v2015_11_01_preview.ManagementAssociation;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.operationsmanagement.v2015_11_01_preview.ManagementAssociationProperties;

class ManagementAssociationImpl extends CreatableUpdatableImpl<ManagementAssociation, ManagementAssociationInner, ManagementAssociationImpl> implements ManagementAssociation, ManagementAssociation.Definition, ManagementAssociation.Update {
    private final OperationsManagementManager manager;
    private String resourceGroupName;
    private String managementAssociationName;

    ManagementAssociationImpl(String name, OperationsManagementManager manager) {
        super(name, new ManagementAssociationInner());
        this.manager = manager;
        // Set resource name
        this.managementAssociationName = name;
        //
    }

    ManagementAssociationImpl(ManagementAssociationInner inner, OperationsManagementManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.managementAssociationName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourcegroups");
        this.managementAssociationName = IdParsingUtils.getValueFromIdByName(inner.id(), "ManagementAssociations");
        //
    }

    @Override
    public OperationsManagementManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ManagementAssociation> createResourceAsync() {
        ManagementAssociationsInner client = this.manager().inner().managementAssociations();
        return client.createOrUpdateAsync(this.resourceGroupName, this.managementAssociationName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ManagementAssociation> updateResourceAsync() {
        ManagementAssociationsInner client = this.manager().inner().managementAssociations();
        return client.createOrUpdateAsync(this.resourceGroupName, this.managementAssociationName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ManagementAssociationInner> getInnerAsync() {
        ManagementAssociationsInner client = this.manager().inner().managementAssociations();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ManagementAssociationProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ManagementAssociationImpl withExistingProvider(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    @Override
    public ManagementAssociationImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public ManagementAssociationImpl withProperties(ManagementAssociationProperties properties) {
        this.inner().withProperties(properties);
        return this;
    }

}
