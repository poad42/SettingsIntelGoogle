package com.google.android.settings.intelligence.modules.settingslogbridge.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import j$.util.Collection$$Dispatch;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

/* compiled from: PG */
public class SettingsLogBridgeBroadcastReceiver extends BroadcastReceiver {
    private dap a;
    private Context b;

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01d4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        a(r11, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01d8, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01db, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        a(r10, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01df, code lost:
        throw r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r10, android.content.Intent r11) {
        /*
            r9 = this;
            if (r11 == 0) goto L_0x01e7
            java.lang.String r0 = r11.getAction()
            java.lang.String r1 = "com.google.android.settings.intelligence.contextualcards.CARD_INTERACTION_RECEIVER"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0018
            java.lang.String r1 = "com.google.android.settings.intelligence.SEND_LOG"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            return
        L_0x0018:
            r9.b = r10
            cze r10 = defpackage.cze.a()
            java.lang.Class<dap> r0 = defpackage.dap.class
            czd r10 = r10.a(r0)
            dap r10 = (defpackage.dap) r10
            r9.a = r10
            java.lang.String r10 = "logs"
            byte[] r10 = r11.getByteArrayExtra(r10)
            java.lang.String r0 = "LogBroadcastReceiver"
            r1 = 0
            r2 = 0
            if (r10 != 0) goto L_0x0197
            java.lang.String r10 = "type"
            int r10 = r11.getIntExtra(r10, r1)
            int r10 = defpackage.dnm.a((int) r10)
            java.lang.String r3 = "uri"
            java.lang.String r3 = r11.getStringExtra(r3)
            r4 = 0
            java.lang.String r6 = "score"
            double r4 = r11.getDoubleExtra(r6, r4)
            cze r6 = defpackage.cze.a()
            java.lang.Class<czj> r7 = defpackage.czj.class
            czd r6 = r6.a(r7)
            czj r6 = (defpackage.czj) r6
            j$.time.ZoneId r7 = j$.time.ZoneId.systemDefault()
            j$.time.ZonedDateTime r7 = j$.time.ZonedDateTime.now((j$.time.ZoneId) r7)
            int r8 = r10 + -1
            if (r10 == 0) goto L_0x0195
            switch(r8) {
                case 38: goto L_0x0146;
                case 39: goto L_0x00f6;
                case 40: goto L_0x0067;
                case 41: goto L_0x00c2;
                case 42: goto L_0x006d;
                default: goto L_0x0067;
            }
        L_0x0067:
            if (r10 != 0) goto L_0x0166
            java.lang.String r10 = "null"
            goto L_0x016e
        L_0x006d:
            r0 = -1
            java.lang.String r2 = "row"
            int r2 = r11.getIntExtra(r2, r0)
            java.lang.String r8 = "ui_position"
            int r0 = r11.getIntExtra(r8, r0)
            java.lang.String r8 = "target"
            int r11 = r11.getIntExtra(r8, r1)
            int r11 = defpackage.dkr.a((int) r11)
            anf r1 = defpackage.anf.k
            epb r1 = r1.g()
            r1.m((int) r10)
            ang r10 = defpackage.ang.i
            epb r10 = r10.g()
            r10.h((java.lang.String) r3)
            r10.a((double) r4)
            r10.n((int) r2)
            r10.p((int) r11)
            r10.o((int) r0)
            eqn r10 = r10.f()
            eoy r10 = (defpackage.eoy) r10
            ang r10 = (defpackage.ang) r10
            r1.a((defpackage.ang) r10)
            eqn r10 = r1.f()
            eoy r10 = (defpackage.eoy) r10
            anf r10 = (defpackage.anf) r10
            r6.a((defpackage.anf) r10)
            java.lang.String r10 = r7.toString()
            r11 = 2
            r9.a(r3, r10, r11)
            return
        L_0x00c2:
            anf r11 = defpackage.anf.k
            epb r11 = r11.g()
            r11.m((int) r10)
            ang r10 = defpackage.ang.i
            epb r10 = r10.g()
            r10.h((java.lang.String) r3)
            r10.a((double) r4)
            eqn r10 = r10.f()
            eoy r10 = (defpackage.eoy) r10
            ang r10 = (defpackage.ang) r10
            r11.a((defpackage.ang) r10)
            eqn r10 = r11.f()
            eoy r10 = (defpackage.eoy) r10
            anf r10 = (defpackage.anf) r10
            r6.a((defpackage.anf) r10)
            java.lang.String r10 = r7.toString()
            r11 = 3
            r9.a(r3, r10, r11)
            return
        L_0x00f6:
            java.lang.String r10 = "visible"
            byte[] r10 = r11.getByteArrayExtra(r10)     // Catch:{ Exception -> 0x013f }
            and r1 = defpackage.and.b     // Catch:{ Exception -> 0x013f }
            eoy r10 = defpackage.eoy.a((defpackage.eoy) r1, (byte[]) r10)     // Catch:{ Exception -> 0x013f }
            and r10 = (defpackage.and) r10     // Catch:{ Exception -> 0x013f }
            java.lang.String r1 = "hidden"
            byte[] r11 = r11.getByteArrayExtra(r1)     // Catch:{ Exception -> 0x013f }
            and r1 = defpackage.and.b     // Catch:{ Exception -> 0x013f }
            eoy r11 = defpackage.eoy.a((defpackage.eoy) r1, (byte[]) r11)     // Catch:{ Exception -> 0x013f }
            and r11 = (defpackage.and) r11     // Catch:{ Exception -> 0x013f }
            r1 = 40
            a((defpackage.and) r10, (int) r1)     // Catch:{ Exception -> 0x013f }
            r1 = 41
            a((defpackage.and) r11, (int) r1)     // Catch:{ Exception -> 0x013f }
            epm r10 = r10.a     // Catch:{ Exception -> 0x013f }
            j$.util.stream.Stream r10 = j$.util.Collection$$Dispatch.stream(r10)     // Catch:{ Exception -> 0x013f }
            doz r11 = new doz     // Catch:{ Exception -> 0x013f }
            r11.<init>(r7)     // Catch:{ Exception -> 0x013f }
            j$.util.stream.Stream r10 = r10.map(r11)     // Catch:{ Exception -> 0x013f }
            j$.util.stream.Collector r11 = j$.util.stream.Collectors.toList()     // Catch:{ Exception -> 0x013f }
            java.lang.Object r10 = r10.collect(r11)     // Catch:{ Exception -> 0x013f }
            java.util.List r10 = (java.util.List) r10     // Catch:{ Exception -> 0x013f }
            dap r11 = r9.a     // Catch:{ Exception -> 0x013f }
            android.content.Context r1 = r9.b     // Catch:{ Exception -> 0x013f }
            r11.a((android.content.Context) r1, (java.util.List) r10)     // Catch:{ Exception -> 0x013f }
            return
        L_0x013f:
            r10 = move-exception
            java.lang.String r11 = "Could not parse byte array "
            android.util.Log.w(r0, r11, r10)
            return
        L_0x0146:
            r0 = 0
            java.lang.String r2 = "latency"
            long r0 = r11.getLongExtra(r2, r0)
            anf r11 = defpackage.anf.k
            epb r11 = r11.g()
            r11.m((int) r10)
            r11.a((long) r0)
            eqn r10 = r11.f()
            eoy r10 = (defpackage.eoy) r10
            anf r10 = (defpackage.anf) r10
            r6.a((defpackage.anf) r10)
            return
        L_0x0166:
            if (r10 == 0) goto L_0x0193
            if (r10 == 0) goto L_0x0191
            java.lang.String r10 = java.lang.Integer.toString(r8)
        L_0x016e:
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r11 = java.lang.String.valueOf(r10)
            int r11 = r11.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r11 = r11 + 17
            r1.<init>(r11)
            java.lang.String r11 = "unknown log type "
            r1.append(r11)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            android.util.Log.w(r0, r10)
            return
        L_0x0191:
            throw r2
        L_0x0193:
            throw r2
        L_0x0195:
            throw r2
        L_0x0197:
            cze r11 = defpackage.cze.a()
            java.lang.Class<dov> r3 = defpackage.dov.class
            czd r11 = r11.a(r3)
            dov r11 = (defpackage.dov) r11
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x01e0 }
            r3.<init>(r10)     // Catch:{ IOException -> 0x01e0 }
            java.io.DataInputStream r10 = new java.io.DataInputStream     // Catch:{ all -> 0x01d9 }
            r10.<init>(r3)     // Catch:{ all -> 0x01d9 }
            int r4 = r10.readInt()     // Catch:{ all -> 0x01d2 }
        L_0x01b1:
            if (r1 >= r4) goto L_0x01ca
            int r5 = r10.readInt()     // Catch:{ all -> 0x01d2 }
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x01d2 }
            r10.read(r5)     // Catch:{ all -> 0x01d2 }
            anc r6 = defpackage.anc.h     // Catch:{ all -> 0x01d2 }
            eoy r5 = defpackage.eoy.a((defpackage.eoy) r6, (byte[]) r5)     // Catch:{ all -> 0x01d2 }
            anc r5 = (defpackage.anc) r5     // Catch:{ all -> 0x01d2 }
            r11.a((defpackage.anc) r5)     // Catch:{ all -> 0x01d2 }
            int r1 = r1 + 1
            goto L_0x01b1
        L_0x01ca:
            a((java.lang.Throwable) r2, (java.io.DataInputStream) r10)     // Catch:{ all -> 0x01d9 }
            a((java.lang.Throwable) r2, (java.io.ByteArrayInputStream) r3)     // Catch:{ IOException -> 0x01e0 }
            return
        L_0x01d2:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x01d4 }
        L_0x01d4:
            r1 = move-exception
            a((java.lang.Throwable) r11, (java.io.DataInputStream) r10)     // Catch:{ all -> 0x01d9 }
            throw r1     // Catch:{ all -> 0x01d9 }
        L_0x01d9:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x01db }
        L_0x01db:
            r11 = move-exception
            a((java.lang.Throwable) r10, (java.io.ByteArrayInputStream) r3)     // Catch:{ IOException -> 0x01e0 }
            throw r11     // Catch:{ IOException -> 0x01e0 }
        L_0x01e0:
            r10 = move-exception
            java.lang.String r11 = "parse events error"
            android.util.Log.e(r0, r11, r10)
            return
        L_0x01e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.settings.intelligence.modules.settingslogbridge.impl.SettingsLogBridgeBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    private static /* synthetic */ void a(Throwable th, DataInputStream dataInputStream) {
        if (th != null) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                eac.a(th, th2);
            }
        } else {
            dataInputStream.close();
        }
    }

    private static /* synthetic */ void a(Throwable th, ByteArrayInputStream byteArrayInputStream) {
        if (th != null) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                eac.a(th, th2);
            }
        } else {
            byteArrayInputStream.close();
        }
    }

    private static void a(and and, int i) {
        czj czj = (czj) cze.a().a(czj.class);
        if (and.a.size() != 0) {
            epb g = anf.k.g();
            g.m(i);
            Collection$$Dispatch.stream(and.a).forEach(new doy(g));
            czj.a((anf) ((eoy) g.f()));
        }
    }

    private final void a(String str, String str2, int i) {
        epb g = ams.e.g();
        g.b(str);
        g.k(i);
        g.c(str2);
        this.a.a(this.b, (ams) ((eoy) g.f()));
    }
}
