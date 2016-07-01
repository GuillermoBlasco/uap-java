/**
 * Copyright 2012 Twitter, Inc
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.stilavia.service.uap;

/**
 * Collection of parsed data for a given user agent string consisting of UserAgent, OS, Device
 *
 * @author Steve Jiang (@sjiang) <gh at iamsteve com>
 */
public class Client {
    private final UserAgent userAgent;
    private final OS os;
    private final Device device;

    public Client(UserAgent userAgent, OS os, Device device) {
        this.userAgent = userAgent;
        this.os = os;
        this.device = device;
    }

    public UserAgent getUserAgent() {
        return userAgent;
    }

    public OS getOs() {
        return os;
    }

    public Device getDevice() {
        return device;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (!(other instanceof Client)) return false;

        Client o = (Client) other;
        return ((this.userAgent != null && this.userAgent.equals(o.userAgent)) || this.userAgent == o.userAgent) &&
                ((this.os != null && this.os.equals(o.os)) || this.os == o.os) &&
                ((this.device != null && this.device.equals(o.device)) || this.device == o.device);
    }

    @Override
    public int hashCode() {
        int h = userAgent == null ? 0 : userAgent.hashCode();
        h += os == null ? 0 : os.hashCode();
        h += device == null ? 0 : device.hashCode();
        return h;
    }

    @Override
    public String toString() {
        return String.format("{\"user_agent\": %s, \"os\": %s, \"device\": %s}",
                userAgent, os, device);
    }
}