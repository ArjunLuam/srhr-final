package com.naya.mainapk;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.naya.mainapk.adapter.QuesAnsAdapter;
import com.naya.mainapk.model.QuesAns;

import java.util.ArrayList;
import java.util.List;


public class Menstruation extends Fragment {
    View rootView;
    //PDFView pdfView;
    RecyclerView recyclerView;
    QuesAnsAdapter quesAnsAdapter;
    List<QuesAns> quesAnsList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_menstruation, container, false);
        recyclerView = rootView.findViewById(R.id.rv_mens);
        quesAnsList = new ArrayList<>();

        quesAnsList.add(new QuesAns(getString(R.string.ques1Mens),getString(R.string.ans1Mens),"Q1"));

        quesAnsList.add(new QuesAns(getString(R.string.ques2Mens),getString(R.string.ans2Mens),"Q2"));

        quesAnsList.add(new QuesAns(getString(R.string.ques3Mens),getString(R.string.ans3Mens),"Q3"));
        quesAnsList.add(new QuesAns(getString(R.string.ques4Mens),getString(R.string.ans4Mens),"Q4"));
        quesAnsList.add(new QuesAns(getString(R.string.ques5Mens),getString(R.string.ans5Mens),"Q5"));
        quesAnsList.add(new QuesAns(getString(R.string.ques6Mens),getString(R.string.ans6Mens),"Q6"));
        quesAnsList.add(new QuesAns(getString(R.string.ques7Mens),getString(R.string.ans7Mens),"Q7"));
        quesAnsList.add(new QuesAns(getString(R.string.ques8Mens),getString(R.string.ans8Mens),"Q8"));
        quesAnsList.add(new QuesAns(getString(R.string.ques9Mens),getString(R.string.ans9Mens),"Q9"));
        quesAnsList.add(new QuesAns(getString(R.string.ques10Mens),getString(R.string.ans10Mens),"Q10"));
        quesAnsList.add(new QuesAns(getString(R.string.ques11Mens),getString(R.string.ans11Mens),"Q11"));



        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        quesAnsAdapter = new QuesAnsAdapter(quesAnsList);
        recyclerView.setAdapter(quesAnsAdapter);


        return rootView;
    }
}