import java.util.Date;
import java.util.UUID;

public class User{
    private  String user_id;
    private  String user_name;
    private  String user_age;
    private  String user_job;
    private  String id= UUID.randomUUID().toString().replace("-", "").toLowerCase();


}
