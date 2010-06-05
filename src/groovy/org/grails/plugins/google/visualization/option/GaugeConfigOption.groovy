/* Copyright 2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.grails.plugins.google.visualization.option

import org.grails.plugins.google.visualization.data.DataType

/**
 * Gauge configuration options
 *
 * @author <a href='mailto:benjamin.muschko@gmail.com'>Benjamin Muschko</a>
 */
enum GaugeConfigOption {
    GREEN_FROM("greenFrom", [DataType.NUMBER]),
    GREEN_TO("greenTo", [DataType.NUMBER]),
    HEIGHT("height", [DataType.NUMBER]),
    MAJOR_TICKS("majorTicks", [DataType.ARRAY]),
    MAX("max", [DataType.NUMBER]),
    MIN("min", [DataType.NUMBER]),
    MINOR_TICKS("minorTicks", [DataType.NUMBER]),
    RED_FROM("redFrom", [DataType.NUMBER]),
    RED_TO("redTo", [DataType.NUMBER]),
    WIDTH("width", [DataType.NUMBER]),
    YELLOW_FROM("yellowFrom", [DataType.NUMBER]),
    YELLOW_TO("yellowTo", [DataType.NUMBER])

    static final Map configOptions

    static {
        configOptions = [:]

        values().each { configOption ->
            configOptions.put(configOption.name, configOption)
        }
    }

    private final name
    private final types

    GaugeConfigOption(name, types) {
        this.name = name
        this.types = types
    }

    @Override
    public String toString() {
        "GaugeConfigOption{name='${name}', types='${types}'}"
    }
}