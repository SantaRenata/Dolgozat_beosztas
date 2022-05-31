/*
* File: MainFrame.java
* Author: Sánta Renáta Diána
* Copyright: 2022, Sánta Renáta Diána
* Group: Szoft I N
* Date: 2022-05-31
* Github: https://github.com/SantaRenata/
* Licenc: GNU GPL
*/

package views;

import java.awt.BorderLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class MainFrame extends JFrame {
    JPanel mainPanel;
    public DefaultComboBoxModel<String> jobModel;
    public JComboBox<String> jobCombo;
    public JList<String> jobList;
    JScrollPane scrollPane;
    JLabel label;


    public MainFrame() {
        setMainComponent();
        setMainPanel();
        setMainFrame();
    }

    private void setMainComponent() {
        jobModel = new DefaultComboBoxModel<>();
        jobCombo = new JComboBox<>(jobModel);
        jobList = new JList<>(jobModel);
        scrollPane = new JScrollPane(jobList);       
        label = new JLabel("Sánta Renáta Diána");
    }
    
    private void setMainPanel() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(jobCombo, BorderLayout.NORTH);
        mainPanel.add(label,BorderLayout.SOUTH);
    }
    
    private void setMainFrame() {
        add(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }
}
