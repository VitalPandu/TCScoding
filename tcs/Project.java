package com.tcs;

public class Project {
    private int projectID;
    private String projName;
    private double projCost;
    private String technology1;
    private String technology2;
    private String technology3;

    public Project(int projectID, String projName, double projCost, String technology1, String technology2, String technology3) {
        this.projectID = projectID;
        this.projName = projName;
        this.projCost = projCost;
        this.technology1 = technology1;
        this.technology2 = technology2;
        this.technology3 = technology3;
    }

    public int getProjectID() {
        return projectID;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public double getProjCost() {
        return projCost;
    }

    public void setProjCost(double projCost) {
        this.projCost = projCost;
    }

    public String getTechnology1() {
        return technology1;
    }

    public void setTechnology1(String technology1) {
        this.technology1 = technology1;
    }

    public String getTechnology2() {
        return technology2;
    }

    public void setTechnology2(String technology2) {
        this.technology2 = technology2;
    }

    public String getTechnology3() {
        return technology3;
    }

    public void setTechnology3(String technology3) {
        this.technology3 = technology3;
    }
}
