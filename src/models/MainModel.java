/*
* File: MainModel.java
* Author: Sánta Renáta Diána
* Copyright: 2022, Sánta Renáta Diána
* Group: Szoft I N
* Date: 2022-05-31
* Github: https://github.com/SantaRenata/
* Licenc: GNU GPL
*/

package models;

import java.util.Arrays;
import java.util.Vector;

public class MainModel {
    Job[] jobArray = {
            new Job(1, "takarító"),
            new Job(2, "kovács"),
            new Job(3, "sebész"),
            new Job(4, "programozó"),
            new Job(5, "rendszergazda"),
            new Job(6, "logisztikus"),
            new Job(7, "könyvelő"),
            new Job(8, "tanár"),
            new Job(9, "pénztáros"),
            new Job(10, "pék")
    };
    public Vector<Job> jobList = new Vector<>(Arrays.asList(jobArray));
}    
