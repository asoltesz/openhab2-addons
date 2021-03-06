/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.airvisualnode.internal.json;

import java.util.List;

/**
 * Top level object for AirVisual Node JSON data.
 *
 * @author Victor Antonovich - Initial contribution
 */
public class NodeData {

    private DateAndTime dateAndTime;
    private List<Measurements> measurements;
    private String serialNumber;
    private Settings settings;
    private Status status;

    public NodeData(DateAndTime dateAndTime, List<Measurements> measurements, String serialNumber, Settings settings, Status status) {
        this.dateAndTime = dateAndTime;
        this.measurements = measurements;
        this.serialNumber = serialNumber;
        this.settings = settings;
        this.status = status;
    }

    public DateAndTime getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(DateAndTime dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public List<Measurements> getMeasurements() {
        return measurements;
    }

    public void setMeasurements(List<Measurements> measurements) {
        this.measurements = measurements;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
