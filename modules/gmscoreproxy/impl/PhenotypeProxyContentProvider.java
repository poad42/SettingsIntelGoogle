package com.google.android.settings.intelligence.modules.gmscoreproxy.impl;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: PG */
public class PhenotypeProxyContentProvider extends ContentProvider {
    private czc a;

    public final boolean onCreate() {
        this.a = new czb();
        this.a.a(getContext());
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException("query operation not supported currently.");
    }

    public final String getType(Uri uri) {
        throw new UnsupportedOperationException("getType operation not supported currently.");
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("insert operation not supported currently.");
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("delete operation not supported currently.");
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("update operation not supported currently.");
    }

    public final Bundle call(String str, String str2, Bundle bundle) {
        char c;
        if (!TextUtils.equals("com.android.settings", getCallingPackage())) {
            Log.w("PhenotypeProxyContentProvider", "Unauthorized access to PhenotypeProxyContentProvider, exiting!");
            return null;
        }
        String string = bundle.getString("package_name");
        String string2 = bundle.getString("key");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 39 + String.valueOf(string2).length());
            sb.append("package name or key is null, exiting! ");
            sb.append(string);
            sb.append("/");
            sb.append(string2);
            Log.w("PhenotypeProxyContentProvider", sb.toString());
            return null;
        }
        Bundle bundle2 = new Bundle();
        if (str.hashCode() == -1430169929 && str.equals("getBooleanForPackageAndKey")) {
            c = 0;
        } else {
            c = 65535;
        }
        if (c != 0) {
            return null;
        }
        bundle2.putBoolean("value", ((Boolean) cpm.a(this.a.a(string), string2, false).c()).booleanValue());
        return bundle2;
    }
}
