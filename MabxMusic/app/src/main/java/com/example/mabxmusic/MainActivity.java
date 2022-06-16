package com.example.mabxmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

import java.io.File;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        Dexter.withContext(this)
                .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                .withListener(new PermissionListener() {
                    @Override
                    public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                        Toast.makeText(MainActivity.this, "RunTime Permission Given", Toast.LENGTH_SHORT).show();
                        ArrayList<File> mysongs = fetchsongs(Environment.getExternalStorageDirectory());
                        String[] items = new String[mysongs.size()];
                        for (int i=0;i<mysongs.size();i++)
                        {
                            items[i]  = mysongs.get(i).getName().replace(".mp3", "");
                        }
                        ArrayAdapter<String> ad = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, items);
                        listView.setAdapter(ad);

                    }




                    @Override
                    public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {


                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                        permissionToken.continuePermissionRequest();
                    }
                })
                .check();
    }


    public  ArrayList<File> fetchsongs(File file)
    {
        ArrayList arrayList = new ArrayList();
        File[] songs = file.listFiles();
        if (songs!=null)
        {
            for (File myfile: songs)
            {
                if (!myfile.isHidden() && myfile.isDirectory())
                {
                    arrayList.addAll(fetchsongs(myfile));
                }
                else if(myfile.getName().endsWith(".mp3") && !myfile.getName().startsWith("."))
                {
                    arrayList.add(myfile);
                }
            }
        }
        return  arrayList;

    }
}