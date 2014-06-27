package org.exoplatform.task;

import java.util.List;

/**
 * Created by nagui on 27/06/14.
 */
public class Project {

    private String idProject;

    private String nameProject;

    private String owner;

    private String desc;

    private List<Task> listTasks;

    public String getIdProject() {
        return idProject;
    }

    public void setIdProject(String idProject) {
        this.idProject = idProject;
    }

    public String getNameProject() {
        return nameProject;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
