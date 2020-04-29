package com.google.android.settings.intelligence.modules.suggestions;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;

/* compiled from: PG */
public class SuggestionStateProvider extends ContentProvider {
    public final boolean onCreate() {
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException("Query operation is not supported currently.");
    }

    public final String getType(Uri uri) {
        throw new UnsupportedOperationException("GetType operation is not supported currently.");
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Insert operation is not supported currently.");
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("Delete operation not supported currently.");
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Update operation is not supported currently.");
    }

    public final Bundle call(String str, String str2, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if ("getSuggestionState".equals(str)) {
            Context applicationContext = getContext().getApplicationContext();
            bundle.getString("candidate_id");
            ComponentName componentName = (ComponentName) bundle.getParcelable("android.intent.extra.COMPONENT_NAME");
            boolean z = true;
            if (componentName != null && componentName.getPackageName().equals(applicationContext.getPackageName()) && componentName.getClassName().equals(NightlightTrampolineActivity.class.getName()) && Settings.Secure.getInt(applicationContext.getContentResolver(), "night_display_auto_mode", -1) == -1) {
                z = false;
            }
            bundle2.putBoolean("candidate_is_complete", z);
        }
        return bundle2;
    }
}
