package com.naya.mainapk;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.naya.mainapk.adapter.QuesAnsAdapter;
import com.naya.mainapk.model.QuesAns;

import java.util.ArrayList;
import java.util.List;

public class Abortion extends Fragment {

    View rootView;
    //PDFView pdfView;
    RecyclerView recyclerView;
    QuesAnsAdapter quesAnsAdapter;
    List<QuesAns> quesAnsList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_abortion, container, false);
        recyclerView = rootView.findViewById(R.id.abortionRecyclerView);

        quesAnsList = new ArrayList<>();

        quesAnsList.add(new QuesAns(getString(R.string.ques1Ab), getString(R.string.ans1Ab), "Q1. "));
        quesAnsList.add(new QuesAns(getString(R.string.ques2Ab), getString(R.string.ans2Ab), "Q2. "));
        quesAnsList.add(new QuesAns(getString(R.string.ques3Ab), getString(R.string.ans3Ab), "Q3. "));
        quesAnsList.add(new QuesAns(getString(R.string.ques4Ab), getString(R.string.ans4Ab), "Q4. "));

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        quesAnsAdapter = new QuesAnsAdapter(quesAnsList);
        recyclerView.setAdapter(quesAnsAdapter);

        return rootView;
    }

}
