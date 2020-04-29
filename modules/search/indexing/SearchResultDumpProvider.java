package com.google.android.settings.intelligence.modules.search.indexing;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: PG */
public class SearchResultDumpProvider extends ContentProvider {
    private static final String[] a = {"data_title", "data_key_reference"};

    public final boolean onCreate() {
        new czb();
        cpm.a(getContext());
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        if (!((eug) euh.a.a()).a()) {
            return null;
        }
        String callingPackage = getCallingPackage();
        if (!TextUtils.equals(callingPackage, "com.android.settings.ui")) {
            String valueOf = String.valueOf(callingPackage);
            if (valueOf.length() == 0) {
                str3 = new String("Illegal access to test provider from: ");
            } else {
                str3 = "Illegal access to test provider from: ".concat(valueOf);
            }
            throw new IllegalStateException(str3);
        }
        dmj dmj = new dmj(getContext());
        dmo a2 = dmo.a(getContext());
        a2.a(a2.getWritableDatabase());
        dmj.a();
        return a2.getReadableDatabase().query("prefs_index", a, "package=?", new String[]{"com.android.settings"}, (String) null, (String) null, (String) null);
    }

    public final String getType(Uri uri) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Operation not supported");
    }
}
