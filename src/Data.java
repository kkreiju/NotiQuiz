
import java.io.*;
import java.util.ArrayList;

public class Data {

    String file = "data.txt";
    String given = "givenquestions.txt";
    String notes = "notesquestions.txt";
    String notesAdd = "notesadd.txt";
    ArrayList<String> data = new ArrayList<String>();
    ArrayList<String> renderQuestions = new ArrayList<String>();
    ArrayList<String> notesQuestions = new ArrayList<String>();
    ArrayList<String> questions = new ArrayList<String>();
    ArrayList<String> a = new ArrayList<String>();
    ArrayList<String> b = new ArrayList<String>();
    ArrayList<String> c = new ArrayList<String>();
    ArrayList<String> d = new ArrayList<String>();
    ArrayList<String> correctAnswer = new ArrayList<String>();
    ArrayList<String> notesDB = new ArrayList<String>();

    public void renderData() {
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

    public void saveData() {
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
    
    public void renderNotesDB() {
        try {
            FileInputStream fis = new FileInputStream("resources\\" + notesAdd);
            ObjectInputStream ois = new ObjectInputStream(fis);
            notesDB = (ArrayList<String>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void saveNotesDB() {
        try {
            FileOutputStream fos = new FileOutputStream("resources\\" + notesAdd);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(notesDB);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void renderGivenQuestions() {
        try {
            FileInputStream fis = new FileInputStream("resources\\" + given);
            ObjectInputStream ois = new ObjectInputStream(fis);
            renderQuestions = (ArrayList<String>) ois.readObject();
            ois.close();
            fis.close();
            renderNotes();
            for (int i = 0; i < renderQuestions.size(); i += 6) {
                questions.add(renderQuestions.get(i));
            }
            for (int i = 1; i < renderQuestions.size(); i += 6) {
                a.add(renderQuestions.get(i));
            }
            for (int i = 2; i < renderQuestions.size(); i += 6) {
                b.add(renderQuestions.get(i));
            }
            for (int i = 3; i < renderQuestions.size(); i += 6) {
                c.add(renderQuestions.get(i));
            }
            for (int i = 4; i < renderQuestions.size(); i += 6) {
                d.add(renderQuestions.get(i));
            }
            for (int i = 5; i < renderQuestions.size(); i += 6) {
                correctAnswer.add(renderQuestions.get(i));
            }

            if (!notesQuestions.isEmpty()) {
                for (int i = 0; i < notesQuestions.size(); i += 6) {
                    questions.add(notesQuestions.get(i));
                }
                for (int i = 1; i < notesQuestions.size(); i += 6) {
                    a.add(notesQuestions.get(i));
                }
                for (int i = 2; i < notesQuestions.size(); i += 6) {
                    b.add(notesQuestions.get(i));
                }
                for (int i = 3; i < notesQuestions.size(); i += 6) {
                    c.add(notesQuestions.get(i));
                }
                for (int i = 4; i < notesQuestions.size(); i += 6) {
                    d.add(notesQuestions.get(i));
                }
                for (int i = 5; i < notesQuestions.size(); i += 6) {
                    correctAnswer.add(notesQuestions.get(i));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void renderNotes() {
        try {
            FileInputStream fis = new FileInputStream("resources\\" + notes);
            ObjectInputStream ois = new ObjectInputStream(fis);
            notesQuestions = (ArrayList<String>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveNotes() {
        try {
            FileOutputStream fos = new FileOutputStream("resources\\" + notes);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(notesQuestions);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
