// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager;
import com.azure.resourcemanager.newrelicobservability.fluent.models.MetricRulesInner;
import com.azure.resourcemanager.newrelicobservability.models.FilteringTag;
import com.azure.resourcemanager.newrelicobservability.models.LogRules;
import com.azure.resourcemanager.newrelicobservability.models.SendAadLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendActivityLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendMetricsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendSubscriptionLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.TagAction;
import com.azure.resourcemanager.newrelicobservability.models.TagRule;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class TagRulesCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Succeeded\",\"logRules\":{\"sendAadLogs\":\"Enabled\",\"sendSubscriptionLogs\":\"Disabled\",\"sendActivityLogs\":\"Disabled\",\"filteringTags\":[{\"name\":\"jmoadsuv\",\"value\":\"m\",\"action\":\"Include\"},{\"name\":\"jsjqbjhhyx\",\"value\":\"wlycoduhpkxkg\",\"action\":\"Include\"},{\"name\":\"eqnajxqugjhkycu\",\"value\":\"ddg\",\"action\":\"Include\"},{\"name\":\"wqm\",\"value\":\"alkrmn\",\"action\":\"Include\"}]},\"metricRules\":{\"sendMetrics\":\"Disabled\",\"filteringTags\":[{\"name\":\"udfnbyxba\",\"value\":\"bjyvay\",\"action\":\"Exclude\"}],\"userEmail\":\"rzrtuzqogsex\"}},\"id\":\"vfdnwnwmewzsyyce\",\"name\":\"zsoibjudpfrxtr\",\"type\":\"hzv\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NewRelicObservabilityManager manager = NewRelicObservabilityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        TagRule response = manager.tagRules()
            .define("hfjx")
            .withExistingMonitor("himdbl", "gwimfn")
            .withLogRules(new LogRules().withSendAadLogs(SendAadLogsStatus.DISABLED)
                .withSendSubscriptionLogs(SendSubscriptionLogsStatus.DISABLED)
                .withSendActivityLogs(SendActivityLogsStatus.ENABLED)
                .withFilteringTags(Arrays.asList(
                    new FilteringTag().withName("kzikfjawneaivxwc")
                        .withValue("lpcirelsf")
                        .withAction(TagAction.EXCLUDE),
                    new FilteringTag().withName("wabfatkl")
                        .withValue("xbjhwuaanozjosph")
                        .withAction(TagAction.INCLUDE))))
            .withMetricRules(new MetricRulesInner().withSendMetrics(SendMetricsStatus.DISABLED)
                .withFilteringTags(
                    Arrays.asList(new FilteringTag().withName("ag").withValue("vimjwos").withAction(TagAction.INCLUDE)))
                .withUserEmail("tcs"))
            .create();

        Assertions.assertEquals(SendAadLogsStatus.ENABLED, response.logRules().sendAadLogs());
        Assertions.assertEquals(SendSubscriptionLogsStatus.DISABLED, response.logRules().sendSubscriptionLogs());
        Assertions.assertEquals(SendActivityLogsStatus.DISABLED, response.logRules().sendActivityLogs());
        Assertions.assertEquals("jmoadsuv", response.logRules().filteringTags().get(0).name());
        Assertions.assertEquals("m", response.logRules().filteringTags().get(0).value());
        Assertions.assertEquals(TagAction.INCLUDE, response.logRules().filteringTags().get(0).action());
        Assertions.assertEquals(SendMetricsStatus.DISABLED, response.metricRules().sendMetrics());
        Assertions.assertEquals("udfnbyxba", response.metricRules().filteringTags().get(0).name());
        Assertions.assertEquals("bjyvay", response.metricRules().filteringTags().get(0).value());
        Assertions.assertEquals(TagAction.EXCLUDE, response.metricRules().filteringTags().get(0).action());
        Assertions.assertEquals("rzrtuzqogsex", response.metricRules().userEmail());
    }
}
