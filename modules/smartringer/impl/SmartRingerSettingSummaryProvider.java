package com.google.android.settings.intelligence.modules.smartringer.impl;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.settings.intelligence.R;
import java.util.List;

/* compiled from: PG */
public final class SmartRingerSettingSummaryProvider extends ContentProvider {
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public final Bundle call(String str, String str2, Bundle bundle) {
        Uri parse;
        List<String> pathSegments;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (parse = Uri.parse(str2)) != null && "content".equals(parse.getScheme()) && "com.google.android.settings.intelligence.modules.smartringer".equals(parse.getAuthority()) && parse.getPort() == -1 && (pathSegments = parse.getPathSegments()) != null && pathSegments.size() == 2 && str.equals(pathSegments.get(0))) {
            String str3 = pathSegments.get(1);
            if ("getText".equals(str) && "Summary".equals(str3)) {
                Bundle bundle2 = new Bundle();
                int i = Settings.System.getInt(getContext().getContentResolver(), "vibrate_when_ringing", 0);
                if (Settings.Global.getInt(getContext().getContentResolver(), "apply_ramping_ringer", 0) == 1) {
                    bundle2.putString("com.android.settings.summary", getContext().getString(R.string.ramping_ringer));
                } else if (i != 1) {
                    bundle2.putString("com.android.settings.summary", getContext().getString(R.string.no_vibration));
                } else {
                    bundle2.putString("com.android.settings.summary", getContext().getString(R.string.always_vibration));
                }
                if (!bundle2.isEmpty()) {
                    return bundle2;
                }
            }
        }
        return null;
    }
}
