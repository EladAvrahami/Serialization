package MySerial;

import java.io.*;

public class Tester {
    public static void main(String[] args) {
      // writeExample();//תפעיל מתודה עמ ליצור ולכתוב לקובץ חדש
       readExample();
        //createDevelepmentConfiguration();
    }

    private static void createDevelepmentConfiguration() {
        DevelopmentEnv myEnv = new DevelopmentEnv("jdbc://127.0.0.1/createSchemaIfNotExists=true","root","12345678","Coupon");
        //DevelopmentEnv myEnv = new DevelopmentEnv();

        try {
            FileOutputStream fileOut = new FileOutputStream("Development.env");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(myEnv);
            out.close();
            fileOut.close();
            System.out.println("New configuration file was created :)");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readExample() {
        //create an empty object so we can insert the information inside
        MyClass testing = null;

        try {
            //indicates which file will be open/created
            FileInputStream fileIn = new FileInputStream("myFile.ser");
            //use stream to read data from the file
            ObjectInputStream inData = new ObjectInputStream(fileIn);
            //read the object and casting to our class
            testing = (MyClass) inData.readObject();
            //close the stream
            inData.close();
            //close the file
            fileIn.close();
            //print the results
            System.out.println(testing);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void writeExample(){
        //create an instance to the class
        MyClass zeev = new MyClass();
        zeev.name="Elad";
        zeev.address="Tel Aviv";
        zeev.number=101;

        try {
            //indicates which file will be created or opened
            FileOutputStream fileOut = new FileOutputStream("myFile.ser");
            //open the stream to the class for getting the data
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            //write the object to the class
            out.writeObject(zeev);
            //close the streamer
            out.close();
            //close the file
            fileOut.close();
            //send a message when all is done :)
            System.out.println("New configuration file was created :)");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
