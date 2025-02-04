// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Gets or sets the frequency of the schedule.
 */
public final class ScheduleFrequency extends ExpandableStringEnum<ScheduleFrequency> {
    /**
     * Static value OneTime for ScheduleFrequency.
     */
    public static final ScheduleFrequency ONE_TIME = fromString("OneTime");

    /**
     * Static value Day for ScheduleFrequency.
     */
    public static final ScheduleFrequency DAY = fromString("Day");

    /**
     * Static value Hour for ScheduleFrequency.
     */
    public static final ScheduleFrequency HOUR = fromString("Hour");

    /**
     * Static value Week for ScheduleFrequency.
     */
    public static final ScheduleFrequency WEEK = fromString("Week");

    /**
     * Static value Month for ScheduleFrequency.
     */
    public static final ScheduleFrequency MONTH = fromString("Month");

    /**
     * Static value Minute for ScheduleFrequency.
     */
    public static final ScheduleFrequency MINUTE = fromString("Minute");

    /**
     * Creates a new instance of ScheduleFrequency value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ScheduleFrequency() {
    }

    /**
     * Creates or finds a ScheduleFrequency from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ScheduleFrequency.
     */
    public static ScheduleFrequency fromString(String name) {
        return fromString(name, ScheduleFrequency.class);
    }

    /**
     * Gets known ScheduleFrequency values.
     * 
     * @return known ScheduleFrequency values.
     */
    public static Collection<ScheduleFrequency> values() {
        return values(ScheduleFrequency.class);
    }
}
