// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.DaprSubscriptionBulkSubscribeOptions;
import org.junit.jupiter.api.Assertions;

public final class DaprSubscriptionBulkSubscribeOptionsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DaprSubscriptionBulkSubscribeOptions model = BinaryData
            .fromString("{\"enabled\":true,\"maxMessagesCount\":1598918980,\"maxAwaitDurationMs\":655056908}")
            .toObject(DaprSubscriptionBulkSubscribeOptions.class);
        Assertions.assertEquals(true, model.enabled());
        Assertions.assertEquals(1598918980, model.maxMessagesCount());
        Assertions.assertEquals(655056908, model.maxAwaitDurationMs());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DaprSubscriptionBulkSubscribeOptions model = new DaprSubscriptionBulkSubscribeOptions().withEnabled(true)
            .withMaxMessagesCount(1598918980)
            .withMaxAwaitDurationMs(655056908);
        model = BinaryData.fromObject(model).toObject(DaprSubscriptionBulkSubscribeOptions.class);
        Assertions.assertEquals(true, model.enabled());
        Assertions.assertEquals(1598918980, model.maxMessagesCount());
        Assertions.assertEquals(655056908, model.maxAwaitDurationMs());
    }
}
