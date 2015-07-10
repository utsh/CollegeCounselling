package com.example.utkarsh.collegecounselling;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class CollegeListLlbFragment extends Fragment {

    public CollegeListLlbFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String []collegesllb ={"Amiiity Law School Noida ","Chander Prabhu Jain College of Higher Studies","Delhi Institute of Rural Development","Delhi Metropolitan Education",
                "Fairfield Institute of Management and Technology","JIMS Engineering Management Technical Campus School of Law"};

        List<String> collegelistllb = new ArrayList<String>(Arrays.asList(collegesllb));
        ArrayAdapter<String> collegellbAdapter = new ArrayAdapter<String>(getActivity(),R.layout.list_item_colleges_llb,R.id.list_item_colleges_llb_textview,collegelistllb);
        View rootView = inflater.inflate(R.layout.fragment_college_list_llb, container, false);
        ListView listView=(ListView)rootView.findViewById( R.id.listview_colleges_llb);
        listView.setAdapter(collegellbAdapter);
        return rootView;

    }
}
