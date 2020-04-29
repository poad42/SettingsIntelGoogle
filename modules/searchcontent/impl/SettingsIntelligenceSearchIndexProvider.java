package com.google.android.settings.intelligence.modules.searchcontent.impl;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.provider.SearchIndexablesContract;
import android.provider.SearchIndexablesProvider;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class SettingsIntelligenceSearchIndexProvider extends SearchIndexablesProvider {
    public final boolean onCreate() {
        return true;
    }

    public final Cursor queryXmlResources(String[] strArr) {
        return new MatrixCursor(SearchIndexablesContract.INDEXABLES_XML_RES_COLUMNS);
    }

    public final Cursor queryRawData(String[] strArr) {
        MatrixCursor matrixCursor = new MatrixCursor(SearchIndexablesContract.INDEXABLES_RAW_COLUMNS);
        for (dot dot : a()) {
            matrixCursor.addRow(dot.b);
        }
        return matrixCursor;
    }

    public final Cursor queryNonIndexableKeys(String[] strArr) {
        MatrixCursor matrixCursor = new MatrixCursor(SearchIndexablesContract.NON_INDEXABLES_KEYS_COLUMNS);
        for (dot dot : a()) {
            if (dot.a()) {
                Object[] objArr = dot.c;
                objArr[0] = dot.b[12];
                matrixCursor.addRow(objArr);
            }
        }
        return matrixCursor;
    }

    private final List a() {
        ArrayList arrayList = new ArrayList();
        Context context = getContext();
        arrayList.add(new dow(context));
        arrayList.add(new dou(context));
        return arrayList;
    }
}
