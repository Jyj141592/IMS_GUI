package GUIElement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.util.ArrayList;

public class Frame extends JFrame {
    private final Container contentPane;
    private ArrayList<Container> pages;
    private int currentPage = -1;
    public Frame(){
        setTitle("Issue Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 600);
        setVisible(true);
        pages = new ArrayList<>();
        contentPane = getContentPane();
        signIn();
    }

    private void signIn(){
        Container container = newPage();

    }
    private void signUp(){

    }
    private void home(){
        contentPane.removeAll();

    }
    private void allProjects(){
        contentPane.removeAll();

    }
    private void allIssues(){

    }
    private void comments(){

    }
    private Container newPage(){
        if(currentPage >= 0){
            pages.get(currentPage).setVisible(false);
        }
        Container container = new Container();
        contentPane.add(container);
        container.setVisible(true);
        currentPage++;
        return container;
    }
    private void next(){
        if(currentPage < pages.size() - 1){
            pages.get(currentPage).setVisible(false);
            currentPage++;
            pages.get(currentPage).setVisible(true);
        }
    }
    private void prev(){
        if(currentPage > 0){
            pages.get(currentPage).setVisible(false);
            currentPage--;
            pages.get(currentPage).setVisible(true);
        }
    }
}
