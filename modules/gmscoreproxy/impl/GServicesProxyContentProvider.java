package com.google.android.settings.intelligence.modules.gmscoreproxy.impl;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* compiled from: PG */
public class GServicesProxyContentProvider extends ContentProvider {
    public final boolean onCreate() {
        new dgw();
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

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle call(java.lang.String r9, java.lang.String r10, android.os.Bundle r11) {
        /*
            r8 = this;
            java.lang.String r10 = r8.getCallingPackage()
            java.lang.String r0 = "com.android.settings"
            boolean r10 = android.text.TextUtils.equals(r0, r10)
            java.lang.String r0 = "GServicesProxy"
            r1 = 0
            if (r10 != 0) goto L_0x0015
            java.lang.String r9 = "Unauthorized access to GServicesProxyContentProvider, exiting!"
            android.util.Log.w(r0, r9)
            return r1
        L_0x0015:
            java.lang.String r10 = "key"
            java.lang.String r10 = r11.getString(r10)
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            if (r2 == 0) goto L_0x0028
            java.lang.String r9 = "key is empty, exiting!"
            android.util.Log.w(r0, r9)
            return r1
        L_0x0028:
            android.content.Context r2 = r8.getContext()
            java.lang.String r3 = "com.google.android.providers.gsf.permission.READ_GSERVICES"
            int r2 = defpackage.lh.a((android.content.Context) r2, (java.lang.String) r3)
            if (r2 == 0) goto L_0x003a
            java.lang.String r9 = "No permission to query Gservice flags, exiting!"
            android.util.Log.w(r0, r9)
            return r1
        L_0x003a:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            int r2 = r9.hashCode()
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            switch(r2) {
                case -1341122968: goto L_0x006a;
                case 330813288: goto L_0x0060;
                case 789578805: goto L_0x0056;
                case 1330529981: goto L_0x004b;
                default: goto L_0x004a;
            }
        L_0x004a:
            goto L_0x0074
        L_0x004b:
            java.lang.String r2 = "getStringForKey"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0074
            r9 = 0
            goto L_0x0075
        L_0x0056:
            java.lang.String r2 = "getStringsByPrefix"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0074
            r9 = 3
            goto L_0x0075
        L_0x0060:
            java.lang.String r2 = "getBooleanForKey"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0074
            r9 = 1
            goto L_0x0075
        L_0x006a:
            java.lang.String r2 = "getLongForKey"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0074
            r9 = 2
            goto L_0x0075
        L_0x0074:
            r9 = -1
        L_0x0075:
            java.lang.String r2 = "default"
            java.lang.String r7 = "value"
            if (r9 == 0) goto L_0x0144
            if (r9 == r6) goto L_0x00bb
            if (r9 == r4) goto L_0x00a5
            if (r9 == r3) goto L_0x0082
            return r1
        L_0x0082:
            java.lang.String r9 = "prefixes"
            java.lang.String[] r9 = r11.getStringArray(r9)
            if (r9 == 0) goto L_0x00a4
            int r10 = r9.length
            if (r10 == 0) goto L_0x00a4
            java.util.TreeMap r10 = new java.util.TreeMap
            android.content.Context r11 = r8.getContext()
            android.content.ContentResolver r11 = r11.getContentResolver()
            java.util.Map r9 = defpackage.can.a((android.content.ContentResolver) r11, (java.lang.String[]) r9)
            r10.<init>(r9)
            r0.putSerializable(r7, r10)
            goto L_0x0158
        L_0x00a4:
            return r1
        L_0x00a5:
            long r1 = r11.getLong(r2)
            android.content.Context r9 = r8.getContext()
            android.content.ContentResolver r9 = r9.getContentResolver()
            long r9 = defpackage.can.a((android.content.ContentResolver) r9, (java.lang.String) r10, (long) r1)
            r0.putLong(r7, r9)
            goto L_0x0158
        L_0x00bb:
            boolean r9 = r11.getBoolean(r2)
            android.content.Context r11 = r8.getContext()
            android.content.ContentResolver r11 = r11.getContentResolver()
            java.lang.Object r1 = defpackage.can.a(r11)
            java.util.HashMap r2 = defpackage.can.e
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r9)
            java.lang.Object r2 = defpackage.can.a((java.util.HashMap) r2, (java.lang.String) r10, (java.lang.Object) r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x00de
            boolean r9 = r2.booleanValue()
            goto L_0x013f
        L_0x00de:
            java.lang.String r11 = defpackage.can.a((android.content.ContentResolver) r11, (java.lang.String) r10)
            if (r11 == 0) goto L_0x0136
            java.lang.String r3 = ""
            boolean r3 = r11.equals(r3)
            if (r3 != 0) goto L_0x0136
            java.util.regex.Pattern r3 = defpackage.can.b
            java.util.regex.Matcher r3 = r3.matcher(r11)
            boolean r3 = r3.matches()
            if (r3 != 0) goto L_0x012f
            java.util.regex.Pattern r3 = defpackage.can.c
            java.util.regex.Matcher r3 = r3.matcher(r11)
            boolean r3 = r3.matches()
            if (r3 == 0) goto L_0x010a
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            r9 = 0
            goto L_0x0137
        L_0x010a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "attempt to read gservices key "
            r3.append(r4)
            r3.append(r10)
            java.lang.String r4 = " (value \""
            r3.append(r4)
            r3.append(r11)
            java.lang.String r11 = "\") as boolean"
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            java.lang.String r3 = "Gservices"
            android.util.Log.w(r3, r11)
            goto L_0x0137
        L_0x012f:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            r9 = 1
            goto L_0x0137
        L_0x0136:
        L_0x0137:
            java.util.HashMap r11 = defpackage.can.e
            defpackage.can.a(r1, r11, r10, r2)
        L_0x013f:
            r0.putBoolean(r7, r9)
            goto L_0x0158
        L_0x0144:
            java.lang.String r9 = r11.getString(r2)
            android.content.Context r11 = r8.getContext()
            android.content.ContentResolver r11 = r11.getContentResolver()
            java.lang.String r9 = defpackage.can.a((android.content.ContentResolver) r11, (java.lang.String) r10, (java.lang.String) r9)
            r0.putString(r7, r9)
        L_0x0158:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.settings.intelligence.modules.gmscoreproxy.impl.GServicesProxyContentProvider.call(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }
}
