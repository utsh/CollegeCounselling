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
public class CollegeListBtechFragment extends Fragment {

    public CollegeListBtechFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String []collegesbtech ={"Amity School of Engineering and Technology","Maharaja Agrasen Institute of Technology","Maharaja Surajmal Institute of Technology"
        ,"Guru Teg Bahadur Institute of Technology","Bhartiya Vidyapeeth College","Northern India College of Engineering"};

        List<String> collegelistbtech = new ArrayList<String>(Arrays.asList(collegesbtech));
        ArrayAdapter<String>collegeAdapter = new ArrayAdapter<String>(getActivity(),R.layout.list_item_colleges_btech,R.id.list_item_colleges_btech_textview,collegelistbtech);
        View rootView = inflater.inflate(R.layout.fragment_collegelist_btech, container, false);
        ListView listView=(ListView)rootView.findViewById( R.id.listview_colleges_btech);
        listView.setAdapter(collegeAdapter);
        return rootView;

    }
}
