/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.digitaltwins.v2020_03_01_preview.implementation;

import com.microsoft.azure.management.digitaltwins.v2020_03_01_preview.CheckNameResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.digitaltwins.v2020_03_01_preview.Reason;

class CheckNameResultImpl extends WrapperImpl<CheckNameResultInner> implements CheckNameResult {
    private final DigitalTwinsManager manager;
    CheckNameResultImpl(CheckNameResultInner inner, DigitalTwinsManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DigitalTwinsManager manager() {
        return this.manager;
    }

    @Override
    public String message() {
        return this.inner().message();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Boolean nameAvailable() {
        return this.inner().nameAvailable();
    }

    @Override
    public Reason reason() {
        return this.inner().reason();
    }

}
