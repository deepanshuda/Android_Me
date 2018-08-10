package com.example.android.android_me.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MasterListFragment extends Fragment {

    GridView listGridView;
    MasterListAdapter listAdapter;

    public MasterListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_master_list, container, false);

        listGridView = (GridView) rootView.findViewById(R.id.master_list_gridview);
        listAdapter = new MasterListAdapter(getContext(), AndroidImageAssets.getAll());

        listGridView.setAdapter(listAdapter);

        return rootView;
    }


}
