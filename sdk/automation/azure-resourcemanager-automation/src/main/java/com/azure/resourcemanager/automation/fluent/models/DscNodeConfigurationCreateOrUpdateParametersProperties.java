// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.automation.models.ContentSource;
import com.azure.resourcemanager.automation.models.DscConfigurationAssociationProperty;
import java.io.IOException;

/**
 * The parameter properties supplied to the create or update node configuration operation.
 */
@Fluent
public final class DscNodeConfigurationCreateOrUpdateParametersProperties
    implements JsonSerializable<DscNodeConfigurationCreateOrUpdateParametersProperties> {
    /*
     * Gets or sets the source.
     */
    private ContentSource source;

    /*
     * Gets or sets the configuration of the node.
     */
    private DscConfigurationAssociationProperty configuration;

    /*
     * If a new build version of NodeConfiguration is required.
     */
    private Boolean incrementNodeConfigurationBuild;

    /**
     * Creates an instance of DscNodeConfigurationCreateOrUpdateParametersProperties class.
     */
    public DscNodeConfigurationCreateOrUpdateParametersProperties() {
    }

    /**
     * Get the source property: Gets or sets the source.
     * 
     * @return the source value.
     */
    public ContentSource source() {
        return this.source;
    }

    /**
     * Set the source property: Gets or sets the source.
     * 
     * @param source the source value to set.
     * @return the DscNodeConfigurationCreateOrUpdateParametersProperties object itself.
     */
    public DscNodeConfigurationCreateOrUpdateParametersProperties withSource(ContentSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the configuration property: Gets or sets the configuration of the node.
     * 
     * @return the configuration value.
     */
    public DscConfigurationAssociationProperty configuration() {
        return this.configuration;
    }

    /**
     * Set the configuration property: Gets or sets the configuration of the node.
     * 
     * @param configuration the configuration value to set.
     * @return the DscNodeConfigurationCreateOrUpdateParametersProperties object itself.
     */
    public DscNodeConfigurationCreateOrUpdateParametersProperties
        withConfiguration(DscConfigurationAssociationProperty configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Get the incrementNodeConfigurationBuild property: If a new build version of NodeConfiguration is required.
     * 
     * @return the incrementNodeConfigurationBuild value.
     */
    public Boolean incrementNodeConfigurationBuild() {
        return this.incrementNodeConfigurationBuild;
    }

    /**
     * Set the incrementNodeConfigurationBuild property: If a new build version of NodeConfiguration is required.
     * 
     * @param incrementNodeConfigurationBuild the incrementNodeConfigurationBuild value to set.
     * @return the DscNodeConfigurationCreateOrUpdateParametersProperties object itself.
     */
    public DscNodeConfigurationCreateOrUpdateParametersProperties
        withIncrementNodeConfigurationBuild(Boolean incrementNodeConfigurationBuild) {
        this.incrementNodeConfigurationBuild = incrementNodeConfigurationBuild;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (source() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property source in model DscNodeConfigurationCreateOrUpdateParametersProperties"));
        } else {
            source().validate();
        }
        if (configuration() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property configuration in model DscNodeConfigurationCreateOrUpdateParametersProperties"));
        } else {
            configuration().validate();
        }
    }

    private static final ClientLogger LOGGER
        = new ClientLogger(DscNodeConfigurationCreateOrUpdateParametersProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("source", this.source);
        jsonWriter.writeJsonField("configuration", this.configuration);
        jsonWriter.writeBooleanField("incrementNodeConfigurationBuild", this.incrementNodeConfigurationBuild);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DscNodeConfigurationCreateOrUpdateParametersProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DscNodeConfigurationCreateOrUpdateParametersProperties if the JsonReader was pointing to
     * an instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DscNodeConfigurationCreateOrUpdateParametersProperties.
     */
    public static DscNodeConfigurationCreateOrUpdateParametersProperties fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            DscNodeConfigurationCreateOrUpdateParametersProperties deserializedDscNodeConfigurationCreateOrUpdateParametersProperties
                = new DscNodeConfigurationCreateOrUpdateParametersProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("source".equals(fieldName)) {
                    deserializedDscNodeConfigurationCreateOrUpdateParametersProperties.source
                        = ContentSource.fromJson(reader);
                } else if ("configuration".equals(fieldName)) {
                    deserializedDscNodeConfigurationCreateOrUpdateParametersProperties.configuration
                        = DscConfigurationAssociationProperty.fromJson(reader);
                } else if ("incrementNodeConfigurationBuild".equals(fieldName)) {
                    deserializedDscNodeConfigurationCreateOrUpdateParametersProperties.incrementNodeConfigurationBuild
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDscNodeConfigurationCreateOrUpdateParametersProperties;
        });
    }
}
