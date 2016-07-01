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

import java.util.Map;

/**
 * Operating System parsed data class
 *
 * @author Steve Jiang (@sjiang) <gh at iamsteve com>
 */
public class OS {

    private final String family;
    private final String major;
    private final String minor;
    private final String patch;
    private final String patchMinor;

    public OS(String family, String major, String minor, String patch, String patchMinor) {
        this.family = family;
        this.major = major;
        this.minor = minor;
        this.patch = patch;
        this.patchMinor = patchMinor;
    }

    public static OS fromMap(Map<String, String> m) {
        return new OS(m.get("family"), m.get("major"), m.get("minor"), m.get("patch"), m.get("patch_minor"));
    }

    public String getFamily() {
        return family;
    }

    public String getMajor() {
        return major;
    }

    public String getMinor() {
        return minor;
    }

    public String getPatch() {
        return patch;
    }

    public String getPatchMinor() {
        return patchMinor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OS{");
        sb.append("family='").append(family).append('\'');
        sb.append(", major='").append(major).append('\'');
        sb.append(", minor='").append(minor).append('\'');
        sb.append(", patch='").append(patch).append('\'');
        sb.append(", patchMinor='").append(patchMinor).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OS os = (OS) o;

        if (family != null ? !family.equals(os.family) : os.family != null) return false;
        if (major != null ? !major.equals(os.major) : os.major != null) return false;
        if (minor != null ? !minor.equals(os.minor) : os.minor != null) return false;
        if (patch != null ? !patch.equals(os.patch) : os.patch != null) return false;
        return !(patchMinor != null ? !patchMinor.equals(os.patchMinor) : os.patchMinor != null);

    }

    @Override
    public int hashCode() {
        int result = family != null ? family.hashCode() : 0;
        result = 31 * result + (major != null ? major.hashCode() : 0);
        result = 31 * result + (minor != null ? minor.hashCode() : 0);
        result = 31 * result + (patch != null ? patch.hashCode() : 0);
        result = 31 * result + (patchMinor != null ? patchMinor.hashCode() : 0);
        return result;
    }
}