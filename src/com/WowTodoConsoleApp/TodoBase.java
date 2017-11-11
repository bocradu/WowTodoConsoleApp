package com.WowTodoConsoleApp;

import java.util.Date;

public abstract class TodoBase{
    private String name;
    private Date completedDate;
    protected TodoTypes type;

    protected TodoBase(){
        setName("base");
        setCompletedDate(new Date());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(Date completedDate) {
        this.completedDate = completedDate;
    }

    @Override
    public String toString() {
        return getName()+" "+getCompletedDate();
    }

    @Override
    public boolean equals(Object obj) {
        TodoBase objToCompare=(TodoBase) obj;
        boolean nameIsEqual=objToCompare.getName().equals(getName());
        boolean dateIsEqual=objToCompare.getCompletedDate().toString().equals(getCompletedDate().toString());
        boolean typeIsEqual=type.equals(objToCompare.type);
        return nameIsEqual && dateIsEqual && typeIsEqual;
    }
}

