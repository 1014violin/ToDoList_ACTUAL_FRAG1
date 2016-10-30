package com.bignerdranch.android.todolistfrag1;

/*
Alexzandra Fragment One - TO DO List Assignment
*/

//alex project 

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by cs374 on 9/25/16.
 */




public class Frag1 extends Fragment {


    private Todo mTodo;


    private EditText mEditText; // enter todo item
    private Button mItemButton; // add the item to the list


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTodo = new Todo(); //fix
    }




    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState){
        View v = inflater.inflate(R.layout.one_frag, container, false);


        mEditText = (EditText) v.findViewById(R.id.myEditText);//******
        mItemButton = (Button) v.findViewById(R.id.addButton);//******














        mEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(
                    CharSequence s, int start, int count, int after) {


            }


            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mTodo.setTitle(s.toString());
                //save text entered


            }


            @Override
            public void afterTextChanged(Editable s) {


            }




        });




           /*
           mItemButton.setOnClickListener(new View.OnClickListener() {//******
               public void onClick(View view) {
                   //instead notify frag 2 to do this
//                     //send saved string to ToDolist.java
                   //call update() method in ToDoList.java


               }
           }); */
        return v;


    }






}
