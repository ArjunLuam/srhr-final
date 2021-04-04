package com.naya.mainapk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.naya.mainapk.adapter.QuesAnsAdapter;
import com.naya.mainapk.model.QuesAns;

import java.util.List;

public class Puberty extends Fragment {


    View rootView;
    TextView text;

    RecyclerView recyclerView;
    QuesAnsAdapter quesAnsAdapter;
    List<QuesAns> quesAnsList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.activity_puberty, container, false);
         text = rootView.findViewById(R.id.textView13);
        text.setMovementMethod(new ScrollingMovementMethod());

        return rootView;
    }

  /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puberty);
    }

   */
}