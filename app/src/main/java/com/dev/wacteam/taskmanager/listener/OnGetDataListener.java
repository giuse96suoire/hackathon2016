package com.dev.wacteam.taskmanager.listener;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;


public interface OnGetDataListener {
    public void onStart();
    public void onSuccess(DataSnapshot data);
    public void onFailed(DatabaseError databaseError);
}