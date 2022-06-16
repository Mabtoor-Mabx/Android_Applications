package com.example.mabxplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.AdapterView;
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
                        Toast.makeText(MainActivity.this, "Resource Running Time ", Toast.LENGTH_SHORT).show();
                    ArrayList<File> mysongs = fetchsong(Environment.getExternalStorageDirectory());
                    String [] items = new  String[mysongs.size()];
                    for (int i=0;i<mysongs.size();i++)
                    {
                        items[i] = mysongs.get(i).getName().replace(".mp3", "");
                    }

                        ArrayAdapter<String> ad = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, items);
                    listView.setAdapter(ad);

                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            Intent intent = new Intent(MainActivity.this, Playsong.class );
                            String currentsong = listView.getItemAtPosition(position).toString();
                            intent.putExtra("songlist", mysongs);
                            intent.putExtra("currentsong", currentsong);
                            intent.putExtra("position", position);
                            startActivity(intent);

                        }
                    });

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

    public ArrayList<File> fetchsong(File file)
    {
        ArrayList arrayList = new ArrayList();
        File[] songs = file.listFiles();
        if (songs!=null)
        {
            for ( File mysongs: songs)
            {
                if (!mysongs.isHidden() && mysongs.isDirectory())
                {
                    arrayList.addAll(fetchsong(mysongs));
                }
                else if(mysongs.getName().endsWith(".mp3") && !mysongs.getName().startsWith("."))
                {
                    arrayList.add(mysongs);

                }
                    }
            }
        return  arrayList;
        }
    }

