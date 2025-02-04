// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.ConfigurationForBatchUpdateProperties;
import java.io.IOException;

/**
 * Represents a Configuration.
 */
@Fluent
public final class ConfigurationForBatchUpdate implements JsonSerializable<ConfigurationForBatchUpdate> {
    /*
     * Name of the configuration.
     */
    private String name;

    /*
     * The properties can be updated for a configuration.
     */
    private ConfigurationForBatchUpdateProperties innerProperties;

    /**
     * Creates an instance of ConfigurationForBatchUpdate class.
     */
    public ConfigurationForBatchUpdate() {
    }

    /**
     * Get the name property: Name of the configuration.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the configuration.
     * 
     * @param name the name value to set.
     * @return the ConfigurationForBatchUpdate object itself.
     */
    public ConfigurationForBatchUpdate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the innerProperties property: The properties can be updated for a configuration.
     * 
     * @return the innerProperties value.
     */
    private ConfigurationForBatchUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the value property: Value of the configuration.
     * 
     * @return the value value.
     */
    public String value() {
        return this.innerProperties() == null ? null : this.innerProperties().value();
    }

    /**
     * Set the value property: Value of the configuration.
     * 
     * @param value the value value to set.
     * @return the ConfigurationForBatchUpdate object itself.
     */
    public ConfigurationForBatchUpdate withValue(String value) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConfigurationForBatchUpdateProperties();
        }
        this.innerProperties().withValue(value);
        return this;
    }

    /**
     * Get the source property: Source of the configuration.
     * 
     * @return the source value.
     */
    public String source() {
        return this.innerProperties() == null ? null : this.innerProperties().source();
    }

    /**
     * Set the source property: Source of the configuration.
     * 
     * @param source the source value to set.
     * @return the ConfigurationForBatchUpdate object itself.
     */
    public ConfigurationForBatchUpdate withSource(String source) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConfigurationForBatchUpdateProperties();
        }
        this.innerProperties().withSource(source);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConfigurationForBatchUpdate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConfigurationForBatchUpdate if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ConfigurationForBatchUpdate.
     */
    public static ConfigurationForBatchUpdate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConfigurationForBatchUpdate deserializedConfigurationForBatchUpdate = new ConfigurationForBatchUpdate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedConfigurationForBatchUpdate.name = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedConfigurationForBatchUpdate.innerProperties
                        = ConfigurationForBatchUpdateProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConfigurationForBatchUpdate;
        });
    }
}
