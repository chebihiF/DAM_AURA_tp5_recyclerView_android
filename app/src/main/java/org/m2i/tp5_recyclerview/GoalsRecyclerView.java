package org.m2i.tp5_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GoalsRecyclerView extends RecyclerView.Adapter<GoalsRecyclerView.GoalViewHolder> {

    List<String> goalsList;

    public GoalsRecyclerView(List<String> goalsList) {
        this.goalsList = goalsList;
    }

    @NonNull
    @Override
    public GoalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        return new GoalViewHolder(viewItem);
    }

    @Override
    public void onBindViewHolder(@NonNull GoalViewHolder holder, int position) {
        holder.goal_txt.setText(goalsList.get(position));
    }

    @Override
    public int getItemCount() {
        return goalsList.size();
    }

    public static class GoalViewHolder extends RecyclerView.ViewHolder {
        TextView goal_txt ;
        public GoalViewHolder(@NonNull View itemView) {
            super(itemView);
            goal_txt = itemView.findViewById(R.id.goal_title_txt);
        }
    }

}
