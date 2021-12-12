package MySerial;

import java.io.Serializable;

//for using serialization mechanism , we must implements Serializable
public class MyClass implements Serializable {
    public String name;
    public String address;
    public int number;
    //indicates a unique number for the seralization
    //private static final long serialVersionUID =System.currentTimeMillis();במידה ואני רוצה ערך יייחודי לפי זמן יצירה
    //setting a unique value for the file
    private static final long serialVersionUID =  9_06_2021_10_00L;

    public void mailCheck(){
        System.out.println("mailing a check to " + this.name + " "+this.address);
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                '}';
    }
}
