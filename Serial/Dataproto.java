package Serial;

import java.io.Serializable;

public class Dataproto implements Serializable{
    public String name;
    public String Address;
    public String PhoneNumber;
    public  transient String Courses;
}