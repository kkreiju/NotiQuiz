import java.io.*;
import java.util.ArrayList;

public class Data {
    String file = "data.txt";
    ArrayList<String> data = new ArrayList<String>();
    
    public void renderData(){
        try {
            FileInputStream fis = new FileInputStream("resources\\" + file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            data = (ArrayList<String>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void saveData(){
        try {
            FileOutputStream fos = new FileOutputStream("resources\\" + file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(data);
            oos.close();
            fos.close();
         } catch (Exception e) {
            e.printStackTrace();
         }
    }
}
