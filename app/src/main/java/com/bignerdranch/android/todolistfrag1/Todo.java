package com.bignerdranch.android.todolistfrag1;

import java.util.UUID;
/*
Alexzandra Fragment One - TO DO List Assignment
*/



public class Todo {
    public UUID getId() {
        return mId;
    }


    private UUID mId;
    private String mTitle;


    public String getTitle() {
        return mTitle;
    }


    public void setTitle(String title) {
        mTitle = title;
    }


    public Todo(){


        //generate unique identifier
        mId = UUID.randomUUID();
    }








}




