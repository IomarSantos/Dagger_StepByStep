package com.fanpage.tedliang.simpledagger;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.fanpage.tedliang.simpledagger.Modules.SchoolModules;
import com.fanpage.tedliang.simpledagger.model.Teacher;

import javax.inject.Inject;

import dagger.ObjectGraph;


public class MyActivity extends Activity {
    @Inject
    Teacher teacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        ObjectGraph graph = ObjectGraph.create(new SchoolModules());
        graph.inject(this);

        teacher.name =" Ted ";

        Log.d("Ted","teacher's name "+teacher.name);
    }

}
