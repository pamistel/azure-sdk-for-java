// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.IpCommunityInner;
import com.azure.resourcemanager.managednetworkfabric.models.CommunityActionTypes;
import com.azure.resourcemanager.managednetworkfabric.models.IpCommunityRule;
import com.azure.resourcemanager.managednetworkfabric.models.WellKnownCommunities;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class IpCommunityInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IpCommunityInner model = BinaryData.fromString(
            "{\"properties\":{\"configurationState\":\"ErrorDeprovisioning\",\"provisioningState\":\"Deleting\",\"administrativeState\":\"RMA\",\"ipCommunityRules\":[{\"action\":\"Deny\",\"sequenceNumber\":8541029645599018882,\"wellKnownCommunities\":[\"GShut\",\"GShut\"],\"communityMembers\":[\"ufypiv\"]},{\"action\":\"Permit\",\"sequenceNumber\":4020865096407527323,\"wellKnownCommunities\":[\"LocalAS\",\"NoAdvertise\",\"LocalAS\",\"NoExport\"],\"communityMembers\":[\"mifoxxkub\",\"phavpmhbrb\",\"gvgovpbbttefjo\"]},{\"action\":\"Deny\",\"sequenceNumber\":1806621259574631060,\"wellKnownCommunities\":[\"Internet\",\"NoExport\",\"NoExport\"],\"communityMembers\":[\"ik\",\"frdbiqmrjgeihf\",\"lg\"]},{\"action\":\"Deny\",\"sequenceNumber\":5397474834240245211,\"wellKnownCommunities\":[\"NoAdvertise\",\"Internet\",\"LocalAS\"],\"communityMembers\":[\"pbyephmgtvljvrcm\",\"fqip\",\"xhnpo\"]}],\"annotation\":\"qwcabvnui\"},\"location\":\"ey\",\"tags\":{\"jlrxwtoaukhfk\":\"lpaugmrm\",\"oaedsxjwuivedwcg\":\"cisiz\",\"mguaml\":\"eewxeiqbpsmg\",\"lzgaufcshhvnew\":\"dlrgms\"},\"id\":\"nxkympqanxrjk\",\"name\":\"xtwbta\",\"type\":\"ypnyghshxc\"}")
            .toObject(IpCommunityInner.class);
        Assertions.assertEquals("ey", model.location());
        Assertions.assertEquals("lpaugmrm", model.tags().get("jlrxwtoaukhfk"));
        Assertions.assertEquals(CommunityActionTypes.DENY, model.ipCommunityRules().get(0).action());
        Assertions.assertEquals(8541029645599018882L, model.ipCommunityRules().get(0).sequenceNumber());
        Assertions.assertEquals(WellKnownCommunities.GSHUT,
            model.ipCommunityRules().get(0).wellKnownCommunities().get(0));
        Assertions.assertEquals("ufypiv", model.ipCommunityRules().get(0).communityMembers().get(0));
        Assertions.assertEquals("qwcabvnui", model.annotation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IpCommunityInner model
            = new IpCommunityInner().withLocation("ey")
                .withTags(mapOf("jlrxwtoaukhfk", "lpaugmrm", "oaedsxjwuivedwcg", "cisiz", "mguaml", "eewxeiqbpsmg",
                    "lzgaufcshhvnew", "dlrgms"))
                .withIpCommunityRules(
                    Arrays.asList(
                        new IpCommunityRule().withAction(CommunityActionTypes.DENY)
                            .withSequenceNumber(8541029645599018882L)
                            .withWellKnownCommunities(
                                Arrays.asList(WellKnownCommunities.GSHUT, WellKnownCommunities.GSHUT))
                            .withCommunityMembers(Arrays.asList("ufypiv")),
                        new IpCommunityRule().withAction(CommunityActionTypes.PERMIT)
                            .withSequenceNumber(4020865096407527323L)
                            .withWellKnownCommunities(
                                Arrays.asList(WellKnownCommunities.LOCAL_AS, WellKnownCommunities.NO_ADVERTISE,
                                    WellKnownCommunities.LOCAL_AS, WellKnownCommunities.NO_EXPORT))
                            .withCommunityMembers(Arrays.asList("mifoxxkub", "phavpmhbrb", "gvgovpbbttefjo")),
                        new IpCommunityRule().withAction(CommunityActionTypes.DENY)
                            .withSequenceNumber(1806621259574631060L)
                            .withWellKnownCommunities(Arrays.asList(WellKnownCommunities.INTERNET,
                                WellKnownCommunities.NO_EXPORT, WellKnownCommunities.NO_EXPORT))
                            .withCommunityMembers(Arrays.asList("ik", "frdbiqmrjgeihf", "lg")),
                        new IpCommunityRule().withAction(CommunityActionTypes.DENY)
                            .withSequenceNumber(5397474834240245211L)
                            .withWellKnownCommunities(Arrays.asList(WellKnownCommunities.NO_ADVERTISE,
                                WellKnownCommunities.INTERNET, WellKnownCommunities.LOCAL_AS))
                            .withCommunityMembers(Arrays.asList("pbyephmgtvljvrcm", "fqip", "xhnpo"))))
                .withAnnotation("qwcabvnui");
        model = BinaryData.fromObject(model).toObject(IpCommunityInner.class);
        Assertions.assertEquals("ey", model.location());
        Assertions.assertEquals("lpaugmrm", model.tags().get("jlrxwtoaukhfk"));
        Assertions.assertEquals(CommunityActionTypes.DENY, model.ipCommunityRules().get(0).action());
        Assertions.assertEquals(8541029645599018882L, model.ipCommunityRules().get(0).sequenceNumber());
        Assertions.assertEquals(WellKnownCommunities.GSHUT,
            model.ipCommunityRules().get(0).wellKnownCommunities().get(0));
        Assertions.assertEquals("ufypiv", model.ipCommunityRules().get(0).communityMembers().get(0));
        Assertions.assertEquals("qwcabvnui", model.annotation());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
