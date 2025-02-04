// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.automation.fluent.models.SourceControlSyncJobInner;
import com.azure.resourcemanager.automation.models.ProvisioningState;
import com.azure.resourcemanager.automation.models.SourceControlSyncJobListResult;
import com.azure.resourcemanager.automation.models.SyncType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SourceControlSyncJobListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SourceControlSyncJobListResult model = BinaryData.fromString(
            "{\"value\":[{\"name\":\"phsdyhto\",\"type\":\"ikdowwquuvx\",\"id\":\"clvit\",\"properties\":{\"sourceControlSyncJobId\":\"zonosgg\",\"creationTime\":\"2021-07-06T22:10:43Z\",\"provisioningState\":\"Failed\",\"startTime\":\"2021-09-10T06:03:01Z\",\"endTime\":\"2021-01-27T23:27:37Z\",\"syncType\":\"PartialSync\"}},{\"name\":\"aljutiiswac\",\"type\":\"gdkz\",\"id\":\"wkfvhqcrailvp\",\"properties\":{\"sourceControlSyncJobId\":\"fuflrwdmhdlx\",\"creationTime\":\"2021-07-29T23:40:21Z\",\"provisioningState\":\"Running\",\"startTime\":\"2021-10-04T04:25:34Z\",\"endTime\":\"2021-06-03T10:11:42Z\",\"syncType\":\"FullSync\"}},{\"name\":\"hgw\",\"type\":\"pnedgf\",\"id\":\"vkcvqvpkeqd\",\"properties\":{\"sourceControlSyncJobId\":\"rhvoods\",\"creationTime\":\"2021-11-02T01:53:07Z\",\"provisioningState\":\"Failed\",\"startTime\":\"2021-02-17T19:25:45Z\",\"endTime\":\"2021-05-25T15:51:06Z\",\"syncType\":\"PartialSync\"}},{\"name\":\"vnhdldwmgxcxr\",\"type\":\"pmutwuo\",\"id\":\"rpkhjwn\",\"properties\":{\"sourceControlSyncJobId\":\"sluicpdggkzz\",\"creationTime\":\"2021-06-06T06:21:57Z\",\"provisioningState\":\"Running\",\"startTime\":\"2021-02-19T08:51:29Z\",\"endTime\":\"2021-04-28T10:55:20Z\",\"syncType\":\"PartialSync\"}}],\"nextLink\":\"uefywsbpfvmwy\"}")
            .toObject(SourceControlSyncJobListResult.class);
        Assertions.assertEquals("zonosgg", model.value().get(0).sourceControlSyncJobId());
        Assertions.assertEquals(ProvisioningState.FAILED, model.value().get(0).provisioningState());
        Assertions.assertEquals(SyncType.PARTIAL_SYNC, model.value().get(0).syncType());
        Assertions.assertEquals("uefywsbpfvmwy", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SourceControlSyncJobListResult model = new SourceControlSyncJobListResult().withValue(Arrays.asList(
            new SourceControlSyncJobInner().withSourceControlSyncJobId("zonosgg")
                .withProvisioningState(ProvisioningState.FAILED)
                .withSyncType(SyncType.PARTIAL_SYNC),
            new SourceControlSyncJobInner().withSourceControlSyncJobId("fuflrwdmhdlx")
                .withProvisioningState(ProvisioningState.RUNNING)
                .withSyncType(SyncType.FULL_SYNC),
            new SourceControlSyncJobInner().withSourceControlSyncJobId("rhvoods")
                .withProvisioningState(ProvisioningState.FAILED)
                .withSyncType(SyncType.PARTIAL_SYNC),
            new SourceControlSyncJobInner().withSourceControlSyncJobId("sluicpdggkzz")
                .withProvisioningState(ProvisioningState.RUNNING)
                .withSyncType(SyncType.PARTIAL_SYNC)))
            .withNextLink("uefywsbpfvmwy");
        model = BinaryData.fromObject(model).toObject(SourceControlSyncJobListResult.class);
        Assertions.assertEquals("zonosgg", model.value().get(0).sourceControlSyncJobId());
        Assertions.assertEquals(ProvisioningState.FAILED, model.value().get(0).provisioningState());
        Assertions.assertEquals(SyncType.PARTIAL_SYNC, model.value().get(0).syncType());
        Assertions.assertEquals("uefywsbpfvmwy", model.nextLink());
    }
}
