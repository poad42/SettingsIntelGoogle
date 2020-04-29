package com.google.android.settings.intelligence.modules.gmscoreproxy.impl;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* compiled from: PG */
public class AdsIdClientProxyContentProvider extends ContentProvider {
    public final boolean onCreate() {
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

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:373)
        	at java.base/java.util.ArrayList.get(ArrayList.java:425)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final android.os.Bundle call(java.lang.String r13, java.lang.String r14, android.os.Bundle r15) {
        /*
            r12 = this;
            java.lang.String r14 = r12.getCallingPackage()
            java.lang.String r15 = "com.android.settings"
            boolean r14 = android.text.TextUtils.equals(r15, r14)
            r15 = 0
            if (r14 != 0) goto L_0x0015
            java.lang.String r13 = "AdsIdClientProxyContentProvider"
            java.lang.String r14 = "Unauthorized access to PhenotypeProxyContentProvider, exiting!"
            android.util.Log.w(r13, r14)
            return r15
        L_0x0015:
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>()
            int r0 = r13.hashCode()
            r1 = -2048153120(0xffffffff85eba9e0, float:-2.2161696E-35)
            if (r0 == r1) goto L_0x0024
        L_0x0023:
            goto L_0x002e
        L_0x0024:
            java.lang.String r0 = "getAdsClientId"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L_0x0023
            r13 = 0
            goto L_0x0030
        L_0x002e:
            r13 = -1
        L_0x0030:
            if (r13 == 0) goto L_0x0034
            return r15
        L_0x0034:
            android.content.Context r13 = r12.getContext()     // Catch:{ Exception -> 0x0138 }
            atw r0 = new atw     // Catch:{ Exception -> 0x0138 }
            r0.<init>(r13)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r1 = "gads:ad_id_app_context:enabled"
            boolean r1 = r0.a(r1)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r2 = "gads:ad_id_app_context:ping_ratio"
            r3 = 0
            android.content.SharedPreferences r4 = r0.a     // Catch:{ all -> 0x0053 }
            if (r4 == 0) goto L_0x0050
            float r2 = r4.getFloat(r2, r3)     // Catch:{ all -> 0x0053 }
            r9 = r2
            goto L_0x005d
        L_0x0050:
            r9 = 0
            goto L_0x005d
        L_0x0053:
            r2 = move-exception
            java.lang.String r4 = "GmscoreFlag"
            java.lang.String r5 = "Error while reading from SharedPreferences "
            android.util.Log.w(r4, r5, r2)     // Catch:{ Exception -> 0x0138 }
            r9 = 0
        L_0x005d:
            java.lang.String r2 = "gads:ad_id_use_shared_preference:experiment_id"
            java.lang.String r3 = ""
            android.content.SharedPreferences r4 = r0.a     // Catch:{ all -> 0x006c }
            if (r4 == 0) goto L_0x006b
            java.lang.String r2 = r4.getString(r2, r3)     // Catch:{ all -> 0x006c }
            r10 = r2
            goto L_0x0077
        L_0x006b:
            goto L_0x0076
        L_0x006c:
            r2 = move-exception
            java.lang.String r4 = "GmscoreFlag"
            java.lang.String r5 = "Error while reading from SharedPreferences "
            android.util.Log.w(r4, r5, r2)     // Catch:{ Exception -> 0x0138 }
        L_0x0076:
            r10 = r3
        L_0x0077:
            java.lang.String r2 = "gads:ad_id_use_persistent_service:enabled"
            boolean r0 = r0.a(r2)     // Catch:{ Exception -> 0x0138 }
            ats r11 = new ats     // Catch:{ Exception -> 0x0138 }
            r11.<init>(r13, r1, r0)     // Catch:{ Exception -> 0x0138 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0127 }
            r11.a()     // Catch:{ all -> 0x0127 }
            java.lang.String r13 = "Calling this from your main thread can lead to deadlock"
            defpackage.zw.b((java.lang.String) r13)     // Catch:{ all -> 0x0127 }
            monitor-enter(r11)     // Catch:{ all -> 0x0127 }
            boolean r13 = r11.c     // Catch:{ all -> 0x0124 }
            if (r13 != 0) goto L_0x00c3
            java.lang.Object r13 = r11.d     // Catch:{ all -> 0x0124 }
            monitor-enter(r13)     // Catch:{ all -> 0x0124 }
            atu r0 = r11.e     // Catch:{ all -> 0x00c0 }
            if (r0 == 0) goto L_0x00b8
            boolean r0 = r0.b     // Catch:{ all -> 0x00c0 }
            if (r0 == 0) goto L_0x00b8
            monitor-exit(r13)     // Catch:{ all -> 0x00c0 }
            r11.a()     // Catch:{ Exception -> 0x00af }
            boolean r13 = r11.c     // Catch:{ all -> 0x0124 }
            if (r13 == 0) goto L_0x00a7
            goto L_0x00c3
        L_0x00a7:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ all -> 0x0124 }
            java.lang.String r0 = "AdvertisingIdClient cannot reconnect."
            r13.<init>(r0)     // Catch:{ all -> 0x0124 }
            throw r13     // Catch:{ all -> 0x0124 }
        L_0x00af:
            r13 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0124 }
            java.lang.String r2 = "AdvertisingIdClient cannot reconnect."
            r0.<init>(r2, r13)     // Catch:{ all -> 0x0124 }
            throw r0     // Catch:{ all -> 0x0124 }
        L_0x00b8:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00c0 }
            java.lang.String r2 = "AdvertisingIdClient is not connected."
            r0.<init>(r2)     // Catch:{ all -> 0x00c0 }
            throw r0     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x00c0 }
            throw r0     // Catch:{ all -> 0x0124 }
        L_0x00c3:
            axe r13 = r11.a     // Catch:{ all -> 0x0124 }
            defpackage.zw.a((java.lang.Object) r13)     // Catch:{ all -> 0x0124 }
            atv r13 = r11.b     // Catch:{ all -> 0x0124 }
            defpackage.zw.a((java.lang.Object) r13)     // Catch:{ all -> 0x0124 }
            att r13 = new att     // Catch:{ RemoteException -> 0x011b }
            atv r0 = r11.b     // Catch:{ RemoteException -> 0x011b }
            java.lang.String r0 = r0.a()     // Catch:{ RemoteException -> 0x011b }
            atv r4 = r11.b     // Catch:{ RemoteException -> 0x011b }
            boolean r4 = r4.b()     // Catch:{ RemoteException -> 0x011b }
            r13.<init>(r0, r4)     // Catch:{ RemoteException -> 0x011b }
            monitor-exit(r11)     // Catch:{ all -> 0x0124 }
            java.lang.Object r0 = r11.d     // Catch:{ all -> 0x0127 }
            monitor-enter(r0)     // Catch:{ all -> 0x0127 }
            atu r4 = r11.e     // Catch:{ all -> 0x0118 }
            if (r4 != 0) goto L_0x00e7
            goto L_0x00f3
        L_0x00e7:
            java.util.concurrent.CountDownLatch r4 = r4.a     // Catch:{ all -> 0x0118 }
            r4.countDown()     // Catch:{ all -> 0x0118 }
            atu r4 = r11.e     // Catch:{ InterruptedException -> 0x00f2 }
            r4.join()     // Catch:{ InterruptedException -> 0x00f2 }
            goto L_0x00f3
        L_0x00f2:
            r4 = move-exception
        L_0x00f3:
            long r4 = r11.f     // Catch:{ all -> 0x0118 }
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0102
            atu r6 = new atu     // Catch:{ all -> 0x0118 }
            r6.<init>(r11, r4)     // Catch:{ all -> 0x0118 }
            r11.e = r6     // Catch:{ all -> 0x0118 }
        L_0x0102:
            monitor-exit(r0)     // Catch:{ all -> 0x0118 }
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0127 }
            long r6 = r4 - r2
            r8 = 0
            r2 = r13
            r3 = r1
            r4 = r9
            r5 = r6
            r7 = r10
            defpackage.ats.a(r2, r3, r4, r5, r7, r8)     // Catch:{ all -> 0x0127 }
            r11.b()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r15 = r13.a     // Catch:{ Exception -> 0x0138 }
            goto L_0x0142
        L_0x0118:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0118 }
            throw r13     // Catch:{ all -> 0x0127 }
        L_0x011b:
            r13 = move-exception
            java.io.IOException r13 = new java.io.IOException     // Catch:{ all -> 0x0124 }
            java.lang.String r0 = "Remote exception"
            r13.<init>(r0)     // Catch:{ all -> 0x0124 }
            throw r13     // Catch:{ all -> 0x0124 }
        L_0x0124:
            r13 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0124 }
            throw r13     // Catch:{ all -> 0x0127 }
        L_0x0127:
            r13 = move-exception
            r2 = 0
            r5 = -1
            r3 = r1
            r4 = r9
            r7 = r10
            r8 = r13
            defpackage.ats.a(r2, r3, r4, r5, r7, r8)     // Catch:{ all -> 0x0133 }
            throw r13     // Catch:{ all -> 0x0133 }
        L_0x0133:
            r13 = move-exception
            r11.b()     // Catch:{ Exception -> 0x0138 }
            throw r13     // Catch:{ Exception -> 0x0138 }
        L_0x0138:
            r13 = move-exception
            java.lang.String r0 = "AdsIdClientProxyContentProvider"
            java.lang.String r1 = "Error getting adsid"
            android.util.Log.e(r0, r1, r13)
        L_0x0142:
            java.lang.String r13 = "value"
            r14.putString(r13, r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.settings.intelligence.modules.gmscoreproxy.impl.AdsIdClientProxyContentProvider.call(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }
}
