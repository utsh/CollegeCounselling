package com.example.utkarsh.collegecounselling;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class HomePage extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);



        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new HomePageFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class HomePageFragment extends Fragment {


        public HomePageFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            String []course ={"                              B.TECH","                              B.B.A","                              L.L.B"};

            List<String> courselist = new ArrayList<String>(Arrays.asList(course));
            ArrayAdapter<String>courseAdapter = new ArrayAdapter<String>(getActivity(),R.layout.list_item_courses,R.id.list_item_courses_textview,courselist);
            View rootView=inflater.inflate(R.layout.fragment_home_page, container, false);

            ListView listView=(ListView)rootView.findViewById(R.id.listview_courses);
            listView.setAdapter(courseAdapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                public void onItemClick(AdapterView<?> adapterView, View v, int position, long id) {
                    switch (position) {
                        case 0:
                            Intent newActivity = new Intent(getActivity(), CollegeListBtech.class);
                            startActivity(newActivity);
                            break;
                        case 1:
                            Intent newActivity1 = new Intent(getActivity(), CollegeListBba.class);
                            startActivity(newActivity1);
                            break;
                        case 2:
                            Intent newActivity2 = new Intent(getActivity(), CollegeListLlb.class);
                            startActivity(newActivity2);


                    }
                }
            });






           /* listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                    String course=courseAdapter.getItem(position);
                    Intent intent = new Intent(getActivity(),CollegeListBtech.class).putExtra(Intent.EXTRA_TEXT,course);
                    startActivity(intent);


                }


            });*/



             return rootView;
        }
    }
}
