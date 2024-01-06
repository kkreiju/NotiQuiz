import java.io.*;
import java.util.ArrayList;

public class Data {
    String file = "data.txt";
    String given = "givenquestions.txt";
    ArrayList<String> data = new ArrayList<String>();
    ArrayList<String> renderQuestions = new ArrayList<String>();
    ArrayList<String> questions = new ArrayList<String>();
    ArrayList<String> a = new ArrayList<String>();
    ArrayList<String> b = new ArrayList<String>();
    ArrayList<String> c = new ArrayList<String>();
    ArrayList<String> d = new ArrayList<String>();
    ArrayList<String> correctAnswer = new ArrayList<String>();
    
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
    
    public void renderGivenQuestions(){
        try {
            FileInputStream fis = new FileInputStream("resources\\" + given);
            ObjectInputStream ois = new ObjectInputStream(fis);
            renderQuestions = (ArrayList<String>) ois.readObject();
            ois.close();
            fis.close();
            for(int i = 0; i < renderQuestions.size() ; i += 6){
                questions.add(renderQuestions.get(i));
            }
            for(int i = 1; i < renderQuestions.size() ; i += 6){
                a.add(renderQuestions.get(i));
            }
            for(int i = 2; i < renderQuestions.size() ; i += 6){
                b.add(renderQuestions.get(i));
            }
            for(int i = 3; i < renderQuestions.size() ; i += 6){
                c.add(renderQuestions.get(i));
            }
            for(int i = 4; i < renderQuestions.size() ; i += 6){
                d.add(renderQuestions.get(i));
            }
            for(int i = 5; i < renderQuestions.size() ; i += 6){
                correctAnswer.add(renderQuestions.get(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
