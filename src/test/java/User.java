import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class User{
    private  String user_id;
    private  String user_name;
    private  String user_age;
    private  String user_job;
    private  String id= UUID.randomUUID().toString().replace("-", "").toLowerCase();
    private  String zxc;

    public static void main(String[] args){
        System.out.println("6554444444456666777");
    }


    Date day=new Date();
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String date=df.format(day);
}
