package com.neoteric.mysqljdbcconnection;

import java.util.Date;
import java.util.List;

public class Project {
    private int id;
    private String pname;
    private Date startdate;
    private Date enddate;
    private List<Employee> EmpAllocation;

    public Project(List<Employee> empAllocation, Date enddate, int id, String pname, Date startdate) {
        EmpAllocation = empAllocation;
        this.enddate = enddate;
        this.id = id;
        this.pname = pname;
        this.startdate = startdate;
    }

    private int getId(){

        return id;
    }


    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public List<Employee> getEmpAllocation() {
        return EmpAllocation;
    }

    public void setEmpAllocation(List<Employee> empAllocation) {
        EmpAllocation = empAllocation;
    }
}
