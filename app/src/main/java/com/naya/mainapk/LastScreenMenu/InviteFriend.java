package com.naya.mainapk.LastScreenMenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.naya.mainapk.R;

public class InviteFriend extends Fragment {

    View rootView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      rootView = inflater.inflate(R.layout.fragment_invite,container,false);
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        String share = "Share with friends: https://play.google.com/store/apps/details?id=com.social.actionindia&hl=en";
        String sub = "Action India App";
        i.putExtra(Intent.EXTRA_SUBJECT,sub);
        i.putExtra(Intent.EXTRA_TEXT,share);
        startActivity(Intent.createChooser(i,"Share using"));
      return rootView;
    }
}
