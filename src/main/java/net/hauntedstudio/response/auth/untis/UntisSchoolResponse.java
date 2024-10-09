package net.hauntedstudio.response.auth.untis;

import java.util.List;

public class UntisSchoolResponse {
    private List<UntisSchool> schools;

    public UntisSchoolResponse(List<UntisSchool> schools) {
        this.schools = schools;
    }

    public List<UntisSchool> getSchools() {
        return schools;
    }

    public void setSchools(List<UntisSchool> schools) {
        this.schools = schools;
    }
}
