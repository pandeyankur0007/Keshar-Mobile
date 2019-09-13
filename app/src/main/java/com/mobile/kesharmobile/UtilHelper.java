package com.mobile.kesharmobile;

import android.content.Context;
import android.net.ConnectivityManager;

class UtilHelper {
    static boolean isNetworkConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        assert cm != null;
        return cm.getActiveNetworkInfo() != null;
    }
}
