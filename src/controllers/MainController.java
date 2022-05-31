/*
* File: MainController.java
* Author: Sánta Renáta Diána
* Copyright: 2022, Sánta Renáta Diána
* Group: Szoft I N
* Date: 2022-05-31
* Github: https://github.com/SantaRenata/
* Licenc: GNU GPL
*/

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
