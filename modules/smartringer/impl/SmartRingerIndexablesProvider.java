package com.google.android.settings.intelligence.modules.smartringer.impl;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.provider.SearchIndexablesContract;
import android.provider.SearchIndexablesProvider;
import com.google.android.settings.intelligence.R;

/* compiled from: PG */
public class SmartRingerIndexablesProvider extends SearchIndexablesProvider {
    public final boolean onCreate() {
        return true;
    }

    public final Cursor queryRawData(String[] strArr) {
        MatrixCursor matrixCursor = new MatrixCursor(SearchIndexablesContract.INDEXABLES_RAW_COLUMNS);
        Context context = getContext();
        if (context != null) {
            Object[] objArr = new Object[SearchIndexablesContract.INDEXABLES_RAW_COLUMNS.length];
            objArr[12] = "smart_ringer_indexing_key";
            objArr[1] = context.getString(R.string.smartringer_settings_title);
            objArr[2] = context.getString(R.string.smartringer_settings_summary);
            objArr[6] = context.getString(R.string.smartringer_settings_title);
            objArr[5] = context.getString(R.string.smartringer_indexing_keywords);
            objArr[9] = "android.intent.action.MAIN";
            objArr[10] = context.getPackageName();
            objArr[11] = SmartRingerSettingsActivity.class.getName();
            matrixCursor.addRow(objArr);
        }
        return matrixCursor;
    }

    public final Cursor queryXmlResources(String[] strArr) {
        return new MatrixCursor(SearchIndexablesContract.INDEXABLES_XML_RES_COLUMNS);
    }

    public final Cursor queryNonIndexableKeys(String[] strArr) {
        MatrixCursor matrixCursor = new MatrixCursor(SearchIndexablesContract.NON_INDEXABLES_KEYS_COLUMNS);
        if (!eux.c()) {
            Object[] objArr = new Object[SearchIndexablesContract.NON_INDEXABLES_KEYS_COLUMNS.length];
            objArr[0] = "smart_ringer_indexing_key";
            matrixCursor.addRow(objArr);
        }
        return matrixCursor;
    }

    public Cursor querySiteMapPairs() {
        MatrixCursor matrixCursor = new MatrixCursor(czn.a);
        matrixCursor.newRow().add("parent_class", "com.android.settings.notification.SoundSettings").add("child_class", SmartRingerSettingsActivity.class.getName());
        return matrixCursor;
    }
}
