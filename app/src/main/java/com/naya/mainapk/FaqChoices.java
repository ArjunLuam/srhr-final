package com.naya.mainapk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class FaqChoices extends Fragment implements RecyclerViewClick {
    private RecyclerView rv;
    FaqAdapter faqAdapter;
    List<String>categories;
    View rootView;
    private ImageView fb,twitter,insta;
    private Toolbar toolbar;
    private NavController navController;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       rootView = inflater.inflate(R.layout.activity_faq_choices,container,false);
        rv = rootView.findViewById(R.id.rv_faq);
        categories = new ArrayList<>();
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        faqAdapter = new FaqAdapter(categories,this);
        rv.setAdapter(faqAdapter);

        fb = rootView.findViewById(R.id.iv_fb);
        twitter = rootView.findViewById(R.id.iv_twitter);
        insta = rootView.findViewById(R.id.iv_insta);

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://www.facebook.com/40yearsofactionindia/");
            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://twitter.com/ActionIndia4?s=20");
            }
        });
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://instagram.com/actionindia76?igshid=7xup04jevgbd");
            }
        });
        categories.add(getString(R.string.pubertyHeading));
        categories.add(getString(R.string.menstHeading));
        categories.add(getString(R.string.safeSex));
        categories.add(getString(R.string.rapeHeading));
        categories.add(getString(R.string.pcpHeading));
        categories.add(getString(R.string.abortionHeading));
        categories.add(getString(R.string.pwdHeading));
        categories.add(getString(R.string.faqHeading));

        toolbar = rootView.findViewById(R.id.main_toolbar);
        navController = Navigation.findNavController(getActivity(), R.id.fragment);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(getString(R.string.selectCategory));
        setHasOptionsMenu(true);
        return rootView;
    }

    private void gotourl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }


    @Override
    public void onItemClick(int position) {
        NavController navController = Navigation.findNavController(getActivity(), R.id.fragment);
        switch(position){
            case 0:
           navController.navigate(R.id.action_faqChoices3_to_puberty);
            break;
            case 1:
                navController.navigate(R.id.action_faqChoices3_to_menstruation);
                break;
            case 2:
                navController.navigate(R.id.action_faqChoices3_to_safesex);
                break;
            case 3:
                navController.navigate(R.id.action_faqChoices3_to_rape);
                break;
            case 4:
                navController.navigate(R.id.action_faqChoices3_to_PCNPDT);
                break;
            case 5:
                navController.navigate(R.id.action_faqChoices3_to_abortion);
                break;
            case 6:
                navController.navigate(R.id.action_faqChoices3_to_pwdvaact);
                break;
            case 7:
                navController.navigate(R.id.action_faqChoices3_to_appFaq);
                break;

        }
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.options_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.aboutUs:
                navController.navigate(R.id.action_faqChoices3_to_aboutUs);
                return true;
            case R.id.contactUs:
                navController.navigate(R.id.action_faqChoices3_to_contactUs);
                return true;
            case R.id.inviteFriend:
                navController.navigate(R.id.action_faqChoices3_to_inviteFriend);
                return true;
            case R.id.query:
                navController.navigate(R.id.action_faqChoices3_to_email);
                return true;
            case R.id.clinics:
                navController.navigate(R.id.action_faqChoices3_to_clinics2);

        }
        return super.onOptionsItemSelected(item);
    }



}