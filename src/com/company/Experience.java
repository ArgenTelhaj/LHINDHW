package com.company;

import java.util.ArrayList;
import java.util.List;

public class Experience {

    int experienceCounter = 0;
    List <PreviousJob> list= new ArrayList<>();

    public void getList() {
        for (PreviousJob pj:this.list
             ) {
            System.out.println(pj.toString());

        }

    }

    public void addExp(PreviousJob job) {

        this.list.add(job);
        this.experienceCounter = this.list.size();

    }

    public int getExperienceCounter() {
        return experienceCounter;
    }


    @Override
    public String toString() {
        return "Experience{" +
                "\nexperienceCounter=" + experienceCounter +
                ",\nlist=" + list+///getList() +
                "\n}";
    }
}
