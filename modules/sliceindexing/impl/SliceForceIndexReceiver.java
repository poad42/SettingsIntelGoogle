package com.google.android.settings.intelligence.modules.sliceindexing.impl;

import android.content.BroadcastReceiver;

/* compiled from: PG */
public class SliceForceIndexReceiver extends BroadcastReceiver {
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            if (r7 == 0) goto L_0x0007
            java.lang.String r7 = r7.getAction()
            goto L_0x0009
        L_0x0007:
            r7 = 0
        L_0x0009:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r1 = "SliceForceIndexReceiver"
            if (r0 == 0) goto L_0x0017
            java.lang.String r6 = "No broadcast action, skipping"
            android.util.Log.w(r1, r6)
            return
        L_0x0017:
            cze r0 = defpackage.cze.a()
            java.lang.Class<dpa> r2 = defpackage.dpa.class
            czd r0 = r0.a(r2)
            dpa r0 = (defpackage.dpa) r0
            if (r0 != 0) goto L_0x002b
            java.lang.String r6 = "No SliceIndexFeatureProvider registered, skipping"
            android.util.Log.w(r1, r6)
            return
        L_0x002b:
            int r2 = r7.hashCode()
            r3 = -1480284424(0xffffffffa7c4a6f8, float:-5.4581956E-15)
            r4 = 1
            if (r2 == r3) goto L_0x0046
            r3 = 798292259(0x2f94f923, float:2.7098065E-10)
            if (r2 == r3) goto L_0x003b
            goto L_0x0050
        L_0x003b:
            java.lang.String r2 = "android.intent.action.BOOT_COMPLETED"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0050
            r2 = 1
            goto L_0x0051
        L_0x0046:
            java.lang.String r2 = "com.google.firebase.appindexing.UPDATE_INDEX"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0050
            r2 = 0
            goto L_0x0051
        L_0x0050:
            r2 = -1
        L_0x0051:
            if (r2 == 0) goto L_0x0078
            if (r2 == r4) goto L_0x006f
            java.lang.String r6 = java.lang.String.valueOf(r7)
            java.lang.String r7 = "Invalid broadcast action, skipping: "
            int r0 = r6.length()
            if (r0 != 0) goto L_0x0067
            java.lang.String r6 = new java.lang.String
            r6.<init>(r7)
            goto L_0x006b
        L_0x0067:
            java.lang.String r6 = r7.concat(r6)
        L_0x006b:
            android.util.Log.w(r1, r6)
            return
        L_0x006f:
            dpf r7 = new dpf
            r7.<init>(r0, r6)
            android.os.AsyncTask.execute(r7)
            return
        L_0x0078:
            dpd r7 = new dpd
            r7.<init>(r0, r6)
            android.os.AsyncTask.execute(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.settings.intelligence.modules.sliceindexing.impl.SliceForceIndexReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
