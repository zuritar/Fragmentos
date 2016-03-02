package edu.galileo.fragmentos.fragmentos;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by rzurita on 24/02/2016.
 */
public class FragmentB extends Fragment {

    View rootView;



    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState){

        rootView = inflater.inflate(R.layout.fragmetb,container,false );

        return rootView;
    }



}



