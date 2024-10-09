import net.hauntedstudio.SchoolFox;
import net.hauntedstudio.SchoolFoxAuthentication;
import net.hauntedstudio.response.auth.schoolfox.UserResponse;
import net.hauntedstudio.response.auth.untis.UntisSchool;
import net.hauntedstudio.response.auth.untis.UntisSchoolResponse;

public class test {
    public static void main(String[] args) {
        SchoolFox schoolFox = new SchoolFox();
        schoolFox.login("username", "password");
    }
}
