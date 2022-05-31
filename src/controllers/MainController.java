package controllers;

import models.MainModel;
import views.MainFrame;

public class MainController {
    MainFrame mainFrame;
    MainModel mainModel;
    
    public MainController() {
        mainFrame = new MainFrame();
        mainModel = new MainModel();
        mainFrame.jobModel.addElement("Válasszon beosztást");
        mainModel.jobList.forEach(job->{
             mainFrame.jobModel.addElement(job.name);
        });
    }


}
