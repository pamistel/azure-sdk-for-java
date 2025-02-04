// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.resources.fluentcore.arm.models.HasParent;
import com.azure.resourcemanager.resources.fluentcore.model.Attachable;
import com.azure.resourcemanager.resources.fluentcore.model.HasInnerModel;
import com.azure.resourcemanager.resources.fluentcore.model.Indexable;
import java.util.List;

/** Client-side representation of packet capture filter. */
@Fluent
public interface PCFilter extends Indexable, HasParent<PacketCapture>, HasInnerModel<PacketCaptureFilter> {
    /**
     * Gets protocol to be filtered on.
     *
     * @return protocol to be filtered on.
     */
    PcProtocol protocol();

    /**
     * Gets local IP Address to be filtered on.
     *
     * @return local IP Address to be filtered on. Notation: "127.0.0.1" for single address entry.
     *     "127.0.0.1-127.0.0.255" for range. "127.0.0.1;127.0.0.5"? for multiple entries. Multiple ranges not currently
     *     supported. Mixing ranges with multiple entries not currently supported. Default = null.
     */
    String localIpAddress();

    /**
     * Gets remote IP Address to be filtered on.
     *
     * @return remote IP Address to be filtered on. Notation: "127.0.0.1" for single address entry.
     *     "127.0.0.1-127.0.0.255" for range. "127.0.0.1;127.0.0.5;" for multiple entries. Multiple ranges not currently
     *     supported. Mixing ranges with multiple entries not currently supported. Default = null.
     */
    String remoteIpAddress();

    /**
     * Gets local port to be filtered on.
     *
     * @return local port to be filtered on. Notation: "80" for single port entry."80-85" for range. "80;443;" for
     *     multiple entries. Multiple ranges not currently supported. Mixing ranges with multiple entries not currently
     *     supported. Default = null.
     */
    String localPort();

    /**
     * Gets remote port to be filtered on.
     *
     * @return remote port to be filtered on. Notation: "80" for single port entry."80-85" for range. "80;443;" for
     *     multiple entries. Multiple ranges not currently supported. Mixing ranges with multiple entries not currently
     *     supported. Default = null.
     */
    String remotePort();

    /**
     * Definition of packet capture filter.
     *
     * @param <ParentT> the stage of the parent definition to return to after attaching this definition
     */
    interface Definition<ParentT> extends PCFilter.DefinitionStages.WithAttach<ParentT> {
    }

    /** Definition stages for packet capture filter. */
    interface DefinitionStages {

        /**
         * The first stage of a packet capture filter definition.
         *
         * @param <ParentT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithAttach<ParentT> extends Attachable.InDefinition<ParentT>, Blank<ParentT> {
        }

        /**
         * The first stage of a packet capture filter definition.
         *
         * @param <ParentT> the stage of the parent definition to return to after attaching this definition
         */
        interface Blank<ParentT> extends
            HasProtocol.DefinitionStages.WithProtocol<WithAttach<PacketCapture.DefinitionStages.WithCreate>, PcProtocol>,
            WithLocalIP<ParentT>, WithRemoteIpAddress<ParentT>, WithLocalPort<ParentT>, WithRemotePort<ParentT> {
        }

        /**
         * Set local IP Address to be filtered on. Notation: "127.0.0.1" for single address entry.
         * "127.0.0.1-127.0.0.255" for range. "127.0.0.1;127.0.0.5" for multiple entries. Multiple ranges not currently
         * supported. Mixing ranges with multiple entries not currently supported. Default = null.
         *
         * @param <ParentT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithLocalIP<ParentT> {
            /**
             * Set local IP address to be filtered on.
             *
             * @param ipAddress local IP address
             * @return the next stage
             */
            Definition<ParentT> withLocalIpAddress(String ipAddress);

            /**
             * Set local IP addresses range to be filtered on.
             *
             * @param startIpAddress range start IP address
             * @param endIpAddress range end IP address
             * @return the next stage
             */
            Definition<ParentT> withLocalIpAddressesRange(String startIpAddress, String endIpAddress);

            /**
             * Set list of local IP addresses to be filtered on.
             *
             * @param ipAddresses list of IP address
             * @return the next stage
             */
            Definition<ParentT> withLocalIpAddresses(List<String> ipAddresses);
        }

        /**
         * Set remote IP Address to be filtered on. Notation: "127.0.0.1" for single address entry.
         * "127.0.0.1-127.0.0.255" for range. "127.0.0.1;127.0.0.5" for multiple entries. Multiple ranges not currently
         * supported. Mixing ranges with multiple entries not currently supported. Default = null.
         *
         * @param <ParentT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithRemoteIpAddress<ParentT> {
            /**
             * Set remote IP address to be filtered on.
             *
             * @param ipAddress remote IP address
             * @return the next stage
             */
            Definition<ParentT> withRemoteIpAddress(String ipAddress);

            /**
             * Set remote IP addresses range to be filtered on.
             *
             * @param startIpAddress range start IP address
             * @param endIpAddress range end IP address
             * @return the next stage
             */
            Definition<ParentT> withRemoteIpAddressesRange(String startIpAddress, String endIpAddress);

            /**
             * Set list of remote IP addresses to be filtered on.
             *
             * @param ipAddresses list of IP addresses
             * @return the next stage
             */
            Definition<ParentT> withRemoteIpAddresses(List<String> ipAddresses);
        }

        /**
         * Set local port to be filtered on. Notation: "80" for single port entry."80-85" for range. "80;443;" for
         * multiple entries. Multiple ranges not currently supported. Mixing ranges with multiple entries not currently
         * supported. Default = null.
         *
         * @param <ParentT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithLocalPort<ParentT> {
            /**
             * Set the local port to be filtered on.
             *
             * @param port port number
             * @return the next stage
             */
            Definition<ParentT> withLocalPort(int port);

            /**
             * Set the local port range to be filtered on.
             *
             * @param startPort range start port number
             * @param endPort range end port number
             * @return the next stage
             */
            Definition<ParentT> withLocalPortRange(int startPort, int endPort);

            /**
             * Set the list of local ports to be filtered on.
             *
             * @param ports list of local ports
             * @return the next stage
             */
            Definition<ParentT> withLocalPorts(List<Integer> ports);
        }

        /**
         * Set local port to be filtered on. Notation: "80" for single port entry."80-85" for range. "80;443;" for
         * multiple entries. Multiple ranges not currently supported. Mixing ranges with multiple entries not currently
         * supported. Default = null.
         *
         * @param <ParentT> the stage of the parent definition to return to after attaching this definition
         */
        interface WithRemotePort<ParentT> {
            /**
             * Set the remote port to be filtered on.
             *
             * @param port port number
             * @return the next stage
             */
            Definition<ParentT> withRemotePort(int port);

            /**
             * Set the remote port range to be filtered on.
             *
             * @param startPort range start port number
             * @param endPort range end port number
             * @return the next stage
             */
            Definition<ParentT> withRemotePortRange(int startPort, int endPort);

            /**
             * Set the list of remote ports to be filtered on.
             *
             * @param ports list of remote ports
             * @return the next stage
             */
            Definition<ParentT> withRemotePorts(List<Integer> ports);
        }
    }
}
