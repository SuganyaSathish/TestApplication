package com.veriato.testapplication;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/**
 * Created by suganyar on 02-05-2016.
 */
public class callobserver extends ContentObserver {
    public callobserver(Handler handler) {
        super(handler);
    }

    @Override
    public boolean deliverSelfNotifications() {
        return super.deliverSelfNotifications();
    }

    @Override
    public void onChange(boolean selfChange) {
        super.onChange(selfChange);
    }

    @Override
    public void onChange(boolean selfChange, Uri uri) {
        super.onChange(selfChange, uri);
    }
}
