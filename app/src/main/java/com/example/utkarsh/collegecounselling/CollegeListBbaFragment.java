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
public class CollegeListBbaFragment extends Fragment {

    public CollegeListBbaFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String []collegesbba ={"J.I.MS","Trinity School of Managment ","Maharaja Surajmal Institute of Management","BLS Institute of management New delhi," ,
                "Mount Caramel Business school New delhi","Asian Retail Institute, New delhi","Fairfield Institute of Management and Technology"};

        List<String> collegelistbba = new ArrayList<String>(Arrays.asList(collegesbba));
        ArrayAdapter<String> collegebbaAdapter = new ArrayAdapter<String>(getActivity(),R.layout.list_item_colleges_bba,R.id.list_item_colleges_bba_textview,collegelistbba);
        View rootView = inflater.inflate(R.layout.fragment_college_list_bba, container, false);
        ListView listView=(ListView)rootView.findViewById( R.id.listview_colleges_bba);
        listView.setAdapter(collegebbaAdapter);
        return rootView;


    }
}
