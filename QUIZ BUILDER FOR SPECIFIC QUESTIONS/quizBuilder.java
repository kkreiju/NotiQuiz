import java.io.*;
import java.util.*;

public class quizBuilder {
   public static void main(String[] args) {
      String filename = "givenquestions.txt";
      ArrayList<String> data = new ArrayList<String>();

      try {
         FileInputStream fis = new FileInputStream(filename);
         ObjectInputStream ois = new ObjectInputStream(fis);
         data = (ArrayList<String>) ois.readObject();
         ois.close();
         fis.close();
      } catch (IOException | ClassNotFoundException e) {
         e.printStackTrace();
      }

      Scanner scanner = new Scanner(System.in);
      boolean running = true;

      // CRUD operations
      while (running) {
         System.out.println("1. Create");
         System.out.println("2. Read");
         System.out.println("3. Update");
         System.out.println("4. Delete");
         System.out.println("5. Exit");
         System.out.print("Enter choice: ");
         int choice = scanner.nextInt();
         scanner.nextLine();
         int question = 0;

         switch (choice) {
            case 1:
               // Create
               System.out.print("Enter data: ");
               System.out.println("-----------------");
               int size = data.size();
               int remaindersize = size % 6;
               System.out.print("Line " + size);
               switch (remaindersize) {
                     case 0:
                        System.out.print("Question : ");
                        break;
                     case 1:
                        System.out.print("   a.");
                        break;
                     case 2:
                        System.out.print("   b.");
                        break;
                     case 3:
                        System.out.print("   c.");
                        break;
                     case 4:
                        System.out.print("   d.");
                        break;
                     case 5:
                        System.out.print("Correct answer: ");
                        break;
                  }
               data.add(scanner.nextLine());
               break;
            case 2:
               // Read
               System.out.println("------------------");
               for (int i = 0; i < data.size(); i++) {
                  int remainder = i % 6;

                  // Map the remainder to the desired output
                  switch (remainder) {
                     case 0:
                        question++;
                        System.out.print("Question " + question + ": ");
                        break;
                     case 1:
                        System.out.print("   a.");
                        break;
                     case 2:
                        System.out.print("   b.");
                        break;
                     case 3:
                        System.out.print("   c.");
                        break;
                     case 4:
                        System.out.print("   d.");
                        break;
                     case 5:
                        System.out.print("Correct answer: ");
                        break;
                  }
                  System.out.println(data.get(i));
                  
               }
               System.out.println("-----------------");
               break;
            case 3:
               // Update
               System.out.print("Enter index to update: ");
               int index = scanner.nextInt();
               scanner.nextLine();
               if (index >= 0 && index < data.size()) {
                  System.out.print("Enter new data: ");
                  String newData = scanner.nextLine();
                  data.set(index, newData);
                  /*
                   * newData will replaced the Existing Data from the
                   * ArrayList
                   */
               } else {
                  System.out.println("Invalid index.");
               }
               break;
            case 4:
               // Delete
               System.out.println("all data deleted");
               int limit = data.size();
               for(int i = 0 ; i < limit ; i++){
                  data.remove(0);
               }
               /* 
               System.out.print("Enter index to delete: ");
               int deleteIndex = scanner.nextInt();
               if (deleteIndex >= 0 && deleteIndex < data.size()) {
                  // Remove an Index of the ArrayList with specific condition
                  data.remove(deleteIndex);
               } else {
                  System.out.println("Invalid index.");
               }
               */
               break;
            case 5:
               running = false;
               break;
            default:
               System.out.println("Invalid choice.");
               break;
         }

         // Write data to file
         try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(data);
            oos.close();
            fos.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
   }
}
