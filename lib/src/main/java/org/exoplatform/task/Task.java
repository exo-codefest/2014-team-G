package org.exoplatform.task;

import java.util.Date;
import java.util.List;

/**
 * Created by nagui on 27/06/14.
 */
public class Task  {

    private String id;

    private String projectId;

    private String reporter;

    private List<String> assignee;

    private String status;

    public String title;

    private Date createdDate;

    private Date startedDate;

    private Date endDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public List<String> getAssignee() {
        return assignee;
    }

    public void setAssignee(List<String> assignee) {
        this.assignee = assignee;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(Date startedDate) {
        this.startedDate = startedDate;
    }
}