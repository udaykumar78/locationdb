package com.google.android.gms.location.sample.locationupdates;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class updateDB extends MainActivity {

    public String timestamp;


    public updateDB(double x,double y,int i){
        //Time stamp
        Date date = new Date();
        long time = date.getTime();
        Timestamp ts= new Timestamp(time);
        String UID="7446465acb7d444ff";
        StringBuffer n= new StringBuffer(ts.toString());


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("User");
        myRef.child(UID);
        n.delete(19,26);
        String some = String.valueOf(n);
        System.out.println(n);
        myRef.child(UID).child(String.valueOf(n)).child("latitude").setValue(10.879456);
        myRef.child(UID).child(String.valueOf(n)).child("longitude").setValue(78.322288);
        myRef.child(UID).child(String.valueOf(n)).child("UID").setValue(UID);
        myRef.child(UID).child(String.valueOf(n)).child("TIMESTAMP").setValue(ts);

    }
}
