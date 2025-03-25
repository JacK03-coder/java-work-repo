
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.Timer;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ToDoApp {

    private JFrame frame;
    private JPanel panel;
    private JTextField taskfField;
    private DefaultListModel<String> taskModel;
    private JList<String> taskList;
    private JButton  addButton , deleteButton , clearButton;

            public ToDoApp(){
                // 1..create frame !!

                frame = new JFrame("TO-Do List");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(350,400);
                frame.setLayout(new FlowLayout());       // simple layout...


                Timer autoSaveTimer = new Timer(5000, e-> saveTaskToFile());
                autoSaveTimer.start();

                //2. Create panel (Single panel Approach)...

                panel = new JPanel();
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                // stack element vartically...

                //3. create Components 
                taskfField = new JTextField(20);
                addButton = new JButton("ADD");
                deleteButton = new JButton("DELETE");
                clearButton = new JButton("CLEAR");

                //4.Task List SetUp...

                taskModel = new DefaultListModel<>();
                taskList = new JList<>(taskModel);
                JScrollPane scrollPane = new JScrollPane(taskList);
                scrollPane.setPreferredSize(new Dimension(300,200));  // Fixed Size

                //5. Add Componenet to panel 

                panel.add(new JLabel("Enter Task"));
                panel.add(taskfField);
                panel.add(addButton);
                panel.add(deleteButton);
                panel.add(clearButton);
                panel.add(scrollPane);

                
                //6. Add panel to Frame...
                frame.add(panel);

                //7. Load Existing task...
                loadTaskFromFile();

                //8. Event handling...
                addButton.addActionListener(e ->  addtask());
                deleteButton.addActionListener(e -> deleteTask());
                clearButton.addActionListener(e -> clearTask());

                //9. Save on Exit...

                frame.addWindowListener(new WindowAdapter() {
                    public void windowclosing(WindowEvent e){
                            saveTaskToFile();
                    }
                });

                

                //10. show frame...

                frame.setVisible(true);    
            }
            // method to add task...
            private void addtask(){
                String task = taskfField.getText().trim();
                if(!task.isEmpty()){
                    taskModel.addElement(task);
                    taskfField.setText("");
                }else{
                    JOptionPane.showMessageDialog(frame, "Task cannot be Empty!" , "Warning",JOptionPane.WARNING_MESSAGE);
                }
               //` saveTaskToFile();
            }

            // method to delete task...

            private void deleteTask(){
                int selectedIndex = taskList.getSelectedIndex();
                if(selectedIndex != -1){
                    taskModel.remove(selectedIndex);
                }else{
                    JOptionPane.showMessageDialog(panel, "Selected Task is deleted!","Warning",JOptionPane.WARNING_MESSAGE);
                }
                
                //saveTaskToFile();
            }

            // method to clear all task...
            private void clearTask(){
                taskModel.clear();
                //saveTaskToFile();     // update the data and save it .. 
            }



            // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<........METHOD'S FOR THE FILE...........>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

            // method to save task to file...

            private void saveTaskToFile(){
                try(PrintWriter writer = new PrintWriter(new FileWriter("tasks.txt"))){
                    for(int i=0 ; i< taskModel.size() ; i++){
                        writer.println(taskModel.getElementAt(i));
                    }
                } catch(IOException e){
                    e.printStackTrace();
                }
            }


            // method to load task from file ...

            private void loadTaskFromFile(){
                try(BufferedReader reader = new BufferedReader(new FileReader("tasks.txt"))) {
                    String line;

                        //  read all the lines...

                    while((line = reader.readLine()) != null){
                        taskModel.addElement(line);
                    }
                } catch (IOException e) {
                    System.out.println("No saved tasks found.");
                }
            }
    public static void main(String[] args){
        ToDoApp app = new ToDoApp(); 
    }
}
