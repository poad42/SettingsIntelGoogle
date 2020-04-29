package com.google.android.settings.intelligence.modules.contextualcards.impl;

import android.content.BroadcastReceiver;

/* compiled from: PG */
public class JobBootBroadcastReceiver extends BroadcastReceiver {
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004c A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            java.lang.String r0 = "JobBootBroadcastReceiver"
            if (r7 == 0) goto L_0x0075
            java.lang.String r7 = r7.getAction()
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 == 0) goto L_0x0014
            java.lang.String r6 = "Invalid action."
            android.util.Log.w(r0, r6)
            return
        L_0x0014:
            int r1 = r7.hashCode()
            r2 = 279601975(0x10aa6337, float:6.720604E-29)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x003f
            r2 = 798292259(0x2f94f923, float:2.7098065E-10)
            if (r1 == r2) goto L_0x0035
            r2 = 1737074039(0x6789a577, float:1.300033E24)
            if (r1 == r2) goto L_0x002a
            goto L_0x0049
        L_0x002a:
            java.lang.String r1 = "android.intent.action.MY_PACKAGE_REPLACED"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0049
            r1 = 1
            goto L_0x004a
        L_0x0035:
            java.lang.String r1 = "android.intent.action.BOOT_COMPLETED"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0049
            r1 = 0
            goto L_0x004a
        L_0x003f:
            java.lang.String r1 = "com.google.android.setupwizard.SETUP_WIZARD_FINISHED"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0049
            r1 = 2
            goto L_0x004a
        L_0x0049:
            r1 = -1
        L_0x004a:
            if (r1 == 0) goto L_0x006e
            if (r1 == r4) goto L_0x006e
            if (r1 == r3) goto L_0x006a
            java.lang.String r6 = java.lang.String.valueOf(r7)
            java.lang.String r7 = "Unsupported action: "
            int r1 = r6.length()
            if (r1 != 0) goto L_0x0062
            java.lang.String r6 = new java.lang.String
            r6.<init>(r7)
            goto L_0x0066
        L_0x0062:
            java.lang.String r6 = r7.concat(r6)
        L_0x0066:
            android.util.Log.w(r0, r6)
            return
        L_0x006a:
            com.google.android.settings.intelligence.modules.contextualcards.impl.CardCollectorJobService.b(r6)
            return
        L_0x006e:
            com.google.android.settings.intelligence.modules.contextualcards.impl.CardCollectorJobService.a(r6)
            com.google.android.settings.intelligence.modules.contextualcards.impl.db.CardDatabaseCleaningJobService.a(r6)
            return
        L_0x0075:
            java.lang.String r6 = "Invalid intent."
            android.util.Log.w(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.settings.intelligence.modules.contextualcards.impl.JobBootBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
