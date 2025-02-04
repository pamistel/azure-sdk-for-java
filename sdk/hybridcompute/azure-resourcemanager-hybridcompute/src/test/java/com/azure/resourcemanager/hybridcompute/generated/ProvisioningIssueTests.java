// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.ProvisioningIssue;

public final class ProvisioningIssueTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProvisioningIssue model = BinaryData.fromString(
            "{\"name\":\"efaxvxilc\",\"properties\":{\"issueType\":\"ConfigurationPropagationFailure\",\"severity\":\"Error\",\"description\":\"eyqxtjjfzql\",\"suggestedResourceIds\":[\"cavodggxdbe\",\"smieknlra\",\"iaa\",\"iuagydwqfbylyrfg\"],\"suggestedAccessRules\":[{\"name\":\"cojocqwogfnzjvus\",\"properties\":{\"direction\":\"Inbound\",\"addressPrefixes\":[\"zuxylfsbtkadpyso\",\"nbtgkbugrjqctoj\",\"mi\",\"of\"]}},{\"name\":\"ypefojyqdhcupl\",\"properties\":{\"direction\":\"Inbound\",\"addressPrefixes\":[\"hihihlhzdsqtzbsr\",\"nowc\",\"hfgmvecactxm\"]}},{\"name\":\"teyowclu\",\"properties\":{\"direction\":\"Outbound\",\"addressPrefixes\":[\"vgqouwifzmpj\",\"yivqikfxcvhrfsp\"]}}]}}")
            .toObject(ProvisioningIssue.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProvisioningIssue model = new ProvisioningIssue();
        model = BinaryData.fromObject(model).toObject(ProvisioningIssue.class);
    }
}
