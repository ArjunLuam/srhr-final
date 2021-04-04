package com.naya.mainapk.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;

import com.naya.mainapk.R;
import com.naya.mainapk.model.QuesAns;

import java.util.List;

public class QuesAnsAdapter extends RecyclerView.Adapter<QuesAnsAdapter.MyViewHolder> {

    private List<QuesAns> quesAnsList;

    public QuesAnsAdapter(List<QuesAns> quesAnsList) {
        this.quesAnsList = quesAnsList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_layout_ques_ans, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.ques.setText(quesAnsList.get(position).getQues());
        holder.ans.setText(quesAnsList.get(position).getAns());

        holder.quesNo.setText(quesAnsList.get(position).getQuesNo());
    //    holder.button.setImageResource(quesAnsList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return quesAnsList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView ques, ans, quesNo;
        ImageView button;
        LinearLayout expandableView;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ques = itemView.findViewById(R.id.textQues);
            ans = itemView.findViewById(R.id.textAns);
            quesNo = itemView.findViewById(R.id.textView8);
            button = itemView.findViewById(R.id.imageView3);
            expandableView = itemView.findViewById(R.id.layoutAns);
            cardView = itemView.findViewById(R.id.quesCard);


            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (expandableView.getVisibility() == View.GONE) {
                        TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                        expandableView.setVisibility(View.VISIBLE);
                        button.setImageResource(R.drawable.ic_baseline_expand_less_24);
                    } else {
                        TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                        expandableView.setVisibility(View.GONE);
                        button.setImageResource(R.drawable.ic_baseline_expand_more_24);
                    }
                }
            });
        }
    }
}
