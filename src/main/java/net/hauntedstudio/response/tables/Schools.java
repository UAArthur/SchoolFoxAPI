package net.hauntedstudio.response.tables;

import java.util.List;

public class Schools {
    public List<School> schools;

    public Schools(List<School> schools) {
        this.schools = schools;
    }

    public List<School> getSchools() {
        return schools;
    }

    public void setSchools(List<School> schools) {
        this.schools = schools;
    }
}
