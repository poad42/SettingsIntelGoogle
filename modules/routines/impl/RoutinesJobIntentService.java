package com.google.android.settings.intelligence.modules.routines.impl;

import android.content.Context;
import android.content.Intent;
import com.google.android.settings.intelligence.modules.routines.impl.db.engine.EngineDatabase;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;

/* compiled from: PG */
public class RoutinesJobIntentService extends jx {
    private der e;
    private ded f;
    private die g;
    private ddq h;

    public RoutinesJobIntentService() {
        cze.a().a(cyw.class);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Intent r32) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            java.lang.String r2 = java.lang.String.valueOf(r32)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r2.length()
            java.lang.String r2 = r32.getAction()
            if (r2 == 0) goto L_0x09b2
            int r3 = r2.hashCode()
            r7 = -1
            r10 = 0
            switch(r3) {
                case -2122935243: goto L_0x00b8;
                case -2103071025: goto L_0x00ae;
                case -1771615793: goto L_0x00a4;
                case -1524443127: goto L_0x0099;
                case -1178539080: goto L_0x008e;
                case -536567112: goto L_0x0084;
                case -518334636: goto L_0x007a;
                case -501086033: goto L_0x0070;
                case -42381658: goto L_0x0066;
                case -39593280: goto L_0x005b;
                case 59034737: goto L_0x004f;
                case 410410247: goto L_0x0044;
                case 457303960: goto L_0x0038;
                case 992193990: goto L_0x002d;
                case 1457191226: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x00c3
        L_0x0020:
            java.lang.String r3 = "com.google.android.settings.intelligence.modules.routines.impl.action.PRIME_DEMO"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x00c3
            r3 = 10
            goto L_0x00c4
        L_0x002d:
            java.lang.String r3 = "com.google.android.settings.intelligence.modules.routines.impl.action.UPDATE_RINGER_MODE"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x00c3
            r3 = 0
            goto L_0x00c4
        L_0x0038:
            java.lang.String r3 = "com.google.android.settings.intelligence.modules.routines.impl.action.POPULATE_STATE_DB_DEMO"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x00c3
            r3 = 13
            goto L_0x00c4
        L_0x0044:
            java.lang.String r3 = "com.google.android.settings.intelligence.modules.routines.impl.action.REREGISTER_LOCATION_ROUTINES"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x00c3
            r3 = 5
            goto L_0x00c4
        L_0x004f:
            java.lang.String r3 = "com.google.android.settings.intelligence.modules.routines.impl.action.DELETE_ROUTINES_DB"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x00c3
            r3 = 12
            goto L_0x00c4
        L_0x005b:
            java.lang.String r3 = "com.google.android.settings.intelligence.modules.routines.impl.action.INIT_INFERENCE_ENGINE"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x00c3
            r3 = 9
            goto L_0x00c4
        L_0x0066:
            java.lang.String r3 = "com.google.android.settings.intelligence.modules.routines.impl.action.UPDATE_WIFI_STATE"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x00c3
            r3 = 1
            goto L_0x00c4
        L_0x0070:
            java.lang.String r3 = "com.google.android.settings.intelligence.modules.routines.impl.action.ADD_WIFI_ROUTINE"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x00c3
            r3 = 6
            goto L_0x00c4
        L_0x007a:
            java.lang.String r3 = "com.google.android.settings.intelligence.modules.routines.impl.action.UPDATE_LOCATION"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x00c3
            r3 = 2
            goto L_0x00c4
        L_0x0084:
            java.lang.String r3 = "com.google.android.settings.intelligence.modules.routines.impl.action.REGISTER_NETWORK_FENCES"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x00c3
            r3 = 4
            goto L_0x00c4
        L_0x008e:
            java.lang.String r3 = "com.google.android.settings.intelligence.modules.routines.impl.action.COMPUTE_NEW_INFERENCES"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x00c3
            r3 = 8
            goto L_0x00c4
        L_0x0099:
            java.lang.String r3 = "com.google.android.settings.intelligence.modules.routines.impl.action.DELETE_STATE_DB"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x00c3
            r3 = 11
            goto L_0x00c4
        L_0x00a4:
            java.lang.String r3 = "com.google.android.settings.intelligence.modules.routines.impl.action.PRUNE_STORAGE"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x00c3
            r3 = 7
            goto L_0x00c4
        L_0x00ae:
            java.lang.String r3 = "com.google.android.settings.intelligence.modules.routines.impl.action.ADD_LOCATION_ROUTINE"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x00c3
            r3 = 3
            goto L_0x00c4
        L_0x00b8:
            java.lang.String r3 = "com.google.android.settings.intelligence.modules.routines.impl.action.MUTE_ROUTINE"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x00c3
            r3 = 14
            goto L_0x00c4
        L_0x00c3:
            r3 = -1
        L_0x00c4:
            java.lang.String r12 = "com.google.android.settings.intelligence.modules.routines.impl.extra.FYI"
            java.lang.String r13 = "com.google.android.settings.intelligence.modules.routines.impl.extra.ROUTINE_STATUS"
            java.lang.String r14 = "com.google.android.settings.intelligence.modules.routines.impl.extra.ACTION_TYPE"
            java.lang.String r15 = "com.google.android.settings.intelligence.modules.routines.impl.extra.LOCATION_METADATA"
            java.lang.String r8 = "com.google.android.settings.intelligence.modules.routines.impl.extra.TIMESTAMP"
            java.lang.String r9 = "com.google.android.settings.intelligence.modules.routines.impl.extra.RINGER_MODE"
            r20 = r12
            r11 = -1
            java.lang.String r6 = "com.google.android.settings.intelligence.modules.routines.impl.extra.WIFI_SSID"
            java.lang.String r4 = "rules.RoutineEngine"
            switch(r3) {
                case 0: goto L_0x0975;
                case 1: goto L_0x0930;
                case 2: goto L_0x08f5;
                case 3: goto L_0x07fe;
                case 4: goto L_0x07e9;
                case 5: goto L_0x078e;
                case 6: goto L_0x061d;
                case 7: goto L_0x0521;
                case 8: goto L_0x0218;
                case 9: goto L_0x01e0;
                case 10: goto L_0x01ae;
                case 11: goto L_0x0192;
                case 12: goto L_0x0156;
                case 13: goto L_0x0115;
                case 14: goto L_0x00ee;
                default: goto L_0x00db;
            }
        L_0x00db:
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "Unhandled action: "
            int r3 = r1.length()
            if (r3 != 0) goto L_0x09a8
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
            goto L_0x09ac
        L_0x00ee:
            ded r2 = r31.b()
            java.lang.String r3 = "com.google.android.settings.intelligence.modules.routines.impl.extra.KEY"
            long r3 = r1.getLongExtra(r3, r11)
            def r1 = r2.d
            r1.a()
            dgk r1 = r2.c
            j$.util.Optional r2 = r1.a((long) r3)
            boolean r3 = r2.isPresent()
            if (r3 == 0) goto L_0x09b1
            java.lang.Object r2 = r2.get()
            dgl r2 = (defpackage.dgl) r2
            r2.i = r10
            r1.a((defpackage.dgl) r2)
            return
        L_0x0115:
            java.lang.String r2 = r1.getStringExtra(r6)
            int r1 = r1.getIntExtra(r9, r7)
            com.google.android.settings.intelligence.modules.routines.impl.db.engine.EngineDatabase r3 = com.google.android.settings.intelligence.modules.routines.impl.db.engine.EngineDatabase.a(r31)
            long r4 = defpackage.etn.b()
            dey r6 = new dey
            int r5 = (int) r4
            r6.<init>(r3, r5)
            r3 = 0
        L_0x012e:
            long r7 = (long) r10
            long r13 = defpackage.etn.c()
            int r5 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r5 <= 0) goto L_0x013f
            long r7 = defpackage.etn.g()
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x09b1
        L_0x013f:
            long r7 = defpackage.etn.e()
            long r7 = r7 + r11
            long r3 = r3 + r7
            dik r5 = new dik
            dii r9 = new dii
            r9.<init>(r2, r1)
            r5.<init>(r9, r7)
            r6.a((defpackage.dik) r5)
            int r10 = r10 + 1
            goto L_0x012e
        L_0x0156:
            ded r1 = r31.b()
            dgk r2 = r1.c
            dfy r2 = r2.a
            r2.g()
            der r2 = r1.b
            r2.d()
            dhv r1 = r1.e
            boolean r2 = r1.a()
            if (r2 == 0) goto L_0x09b1
            dko r2 = r1.b
            android.content.Context r3 = r1.a
            java.util.Map r2 = r2.b(r3)
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x017e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x09b1
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            dko r4 = r1.b
            android.content.Context r5 = r1.a
            r4.a(r5, r3)
            goto L_0x017e
        L_0x0192:
            die r1 = r31.c()
            dhx r1 = r1.a
            dic r1 = r1.i
            r1.e()
            ded r1 = r31.b()
            dgk r2 = r1.c
            dfy r2 = r2.a
            r2.f()
            der r1 = r1.b
            r1.d()
            return
        L_0x01ae:
            java.lang.String r3 = r1.getStringExtra(r6)
            ded r1 = r31.b()
            if (r3 != 0) goto L_0x01ba
            goto L_0x01d9
        L_0x01ba:
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x01d9
            java.lang.String r2 = "<unknown ssid>"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x01d9
            dgk r2 = r1.c
            r4 = 1
            long r5 = defpackage.etn.f()
            int r5 = (int) r5
            r6 = 2
            r7 = 1
            r2.a(r3, r4, r5, r6, r7)
            r1.a()
            return
        L_0x01d9:
            java.lang.String r1 = "handlePrimeDemo do nothing: ssid disconnected"
            android.util.Log.e(r4, r1)
            return
        L_0x01e0:
            boolean r1 = r31.a()
            if (r1 == 0) goto L_0x09b1
            die r1 = r31.c()
            long r2 = java.lang.System.currentTimeMillis()
            j$.time.ZonedDateTime r2 = a((long) r2)
            dhu r3 = new dhu
            r3.<init>()
            defpackage.cfc.a(r3)
            dhx r1 = r1.a
            dic r3 = r1.i
            dif r3 = r3.b()
            j$.time.ZonedDateTime r3 = r3.b
            j$.time.Duration r2 = j$.time.Duration.between(r3, r2)
            long r2 = r2.toMinutes()
            long r4 = r1.k
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x09b1
            dic r1 = r1.i
            r1.c()
            return
        L_0x0218:
            long r1 = java.lang.System.currentTimeMillis()
            ded r3 = r31.b()
            dgk r4 = r3.c
            dfy r4 = r4.a
            r4.h()
            die r4 = r31.c()
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            dhx r4 = r4.a
            cfe r7 = defpackage.cfc.a()
            java.lang.String r8 = "Routines inference requested."
            r7.a(r8)
            ces r7 = r4.b
            java.util.Set r7 = r4.a
            int r7 = r4.f
            dic r7 = r4.i
            java.util.List r7 = r7.a()
            j$.util.stream.Stream r7 = j$.util.Collection$$Dispatch.stream(r7)
            j$.util.function.ToLongFunction r8 = defpackage.did.a
            j$.util.stream.LongStream r7 = r7.mapToLong(r8)
            long r7 = r7.sum()
            long r11 = r4.l
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x0260
            java.util.List r7 = java.util.Collections.emptyList()
            goto L_0x0298
        L_0x0260:
            dic r7 = r4.i
            java.util.List r7 = r7.a()
            j$.util.stream.Stream r7 = j$.util.Collection$$Dispatch.stream(r7)
            dhz r8 = new dhz
            r8.<init>(r4)
            j$.util.stream.Stream r7 = r7.filter(r8)
            dhy r8 = new dhy
            r8.<init>(r4)
            j$.util.stream.Stream r7 = r7.filter(r8)
            j$.util.function.Predicate r8 = defpackage.dib.a
            j$.util.stream.Stream r7 = r7.filter(r8)
            j$.util.function.Predicate r8 = defpackage.dia.a
            j$.util.stream.Stream r7 = r7.filter(r8)
            j$.util.function.Function r8 = defpackage.dhw.a
            j$.util.stream.Stream r7 = r7.map(r8)
            j$.util.stream.Collector r8 = j$.util.stream.Collectors.toList()
            java.lang.Object r7 = r7.collect(r8)
            java.util.List r7 = (java.util.List) r7
        L_0x0298:
            cfe r8 = defpackage.cfc.a()
            int r9 = r7.size()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r12 = 31
            r11.<init>(r12)
            java.lang.String r13 = "Computed "
            r11.append(r13)
            r11.append(r9)
            java.lang.String r9 = " intervals."
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r8.a(r9)
            ccy r8 = new ccy
            float r9 = r4.e
            int r11 = r4.d
            r8.<init>(r9, r11)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            r14 = 0
        L_0x02cf:
            int r15 = r7.size()
            if (r14 >= r15) goto L_0x037b
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            boolean r16 = r11.containsKey(r15)
            if (r16 != 0) goto L_0x036e
            java.util.List r10 = r8.a(r15, r7)
            int r5 = r10.size()
            int r12 = r8.a
            if (r5 < r12) goto L_0x0366
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r5.add(r15)
            cdb r12 = defpackage.cdb.PART_OF_CLUSTER
            r11.put(r15, r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r10)
            r10 = 0
        L_0x02fe:
            int r15 = r12.size()
            if (r10 >= r15) goto L_0x0360
            java.lang.Object r15 = r12.get(r10)
            java.lang.Integer r15 = (java.lang.Integer) r15
            java.lang.Object r16 = r11.get(r15)
            r0 = r16
            cdb r0 = (defpackage.cdb) r0
            if (r0 != 0) goto L_0x034b
            java.util.List r16 = r8.a(r15, r7)
            r17 = r1
            int r1 = r16.size()
            int r2 = r8.a
            if (r1 >= r2) goto L_0x0323
            goto L_0x034d
        L_0x0323:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r12)
            java.util.Iterator r2 = r16.iterator()
        L_0x032c:
            boolean r16 = r2.hasNext()
            if (r16 == 0) goto L_0x034d
            java.lang.Object r16 = r2.next()
            r19 = r2
            r2 = r16
            java.lang.Integer r2 = (java.lang.Integer) r2
            boolean r16 = r1.contains(r2)
            if (r16 != 0) goto L_0x0348
            r12.add(r2)
            r2 = r19
            goto L_0x032c
        L_0x0348:
            r2 = r19
            goto L_0x032c
        L_0x034b:
            r17 = r1
        L_0x034d:
            cdb r1 = defpackage.cdb.PART_OF_CLUSTER
            if (r0 == r1) goto L_0x0359
            cdb r0 = defpackage.cdb.PART_OF_CLUSTER
            r11.put(r15, r0)
            r5.add(r15)
        L_0x0359:
            int r10 = r10 + 1
            r0 = r31
            r1 = r17
            goto L_0x02fe
        L_0x0360:
            r17 = r1
            r9.add(r5)
            goto L_0x0370
        L_0x0366:
            r17 = r1
            cdb r0 = defpackage.cdb.NOISE
            r11.put(r15, r0)
            goto L_0x0370
        L_0x036e:
            r17 = r1
        L_0x0370:
            int r14 = r14 + 1
            r10 = 0
            r12 = 31
            r0 = r31
            r1 = r17
            goto L_0x02cf
        L_0x037b:
            r17 = r1
            j$.util.stream.Stream r0 = j$.util.Collection$$Dispatch.stream(r9)
            cct r1 = new cct
            r1.<init>(r7)
            j$.util.stream.Stream r0 = r0.map(r1)
            j$.util.stream.Collector r1 = j$.util.stream.Collectors.toList()
            java.lang.Object r0 = r0.collect(r1)
            java.util.List r0 = (java.util.List) r0
            cfe r1 = defpackage.cfc.a()
            int r2 = r0.size()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r7 = 30
            r5.<init>(r7)
            r5.append(r13)
            r5.append(r2)
            java.lang.String r2 = " clusters."
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r1.a(r2)
            ces r1 = r4.b
            java.util.Map r2 = r4.c
            int r4 = r4.f
            j$.util.stream.Stream r0 = j$.util.Collection$$Dispatch.stream(r0)
            ccs r5 = new ccs
            r5.<init>(r1, r2, r4)
            j$.util.stream.Stream r0 = r0.map(r5)
            j$.util.function.Predicate r1 = defpackage.ccv.a
            j$.util.stream.Stream r0 = r0.filter(r1)
            j$.util.function.Function r1 = defpackage.ccu.a
            j$.util.stream.Stream r0 = r0.map(r1)
            j$.util.stream.Collector r1 = j$.util.stream.Collectors.toList()
            java.lang.Object r0 = r0.collect(r1)
            java.util.List r0 = (java.util.List) r0
            cfe r1 = defpackage.cfc.a()
            int r2 = r0.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 31
            r4.<init>(r5)
            java.lang.String r5 = "Returning "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " routines."
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.a(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0405:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0468
            java.lang.Object r1 = r0.next()
            cfj r1 = (defpackage.cfj) r1
            cfp r2 = defpackage.dhx.g
            java.util.Map r4 = r1.a
            int r2 = r2.b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r4.containsKey(r2)
            if (r2 == 0) goto L_0x0405
            cfn r2 = defpackage.dhx.h
            java.util.Map r4 = r1.b
            int r2 = r2.b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r4.containsKey(r2)
            if (r2 == 0) goto L_0x0405
            cfp r2 = defpackage.dhx.g
            java.util.Map r4 = r1.a
            int r2 = r2.b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r4.get(r2)
            cfg r2 = (defpackage.cfg) r2
            java.lang.Object r2 = r2.a
            java.lang.String r2 = (java.lang.String) r2
            cfn r4 = defpackage.dhx.h
            java.util.Map r1 = r1.b
            int r4 = r4.b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r1 = r1.get(r4)
            cfg r1 = (defpackage.cfg) r1
            dij r4 = new dij
            java.lang.Object r5 = r1.a
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            double r7 = r1.b
            r4.<init>(r2, r5, r7)
            r6.add(r4)
            goto L_0x0405
        L_0x0468:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r6)
            etn r1 = defpackage.etn.a
            java.lang.Object r1 = r1.a()
            etm r1 = (defpackage.etm) r1
            boolean r1 = r1.t()
            if (r1 != 0) goto L_0x047b
            goto L_0x049a
        L_0x047b:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x04ac
            java.util.Iterator r1 = r0.iterator()
            java.lang.Object r1 = r1.next()
            dij r1 = (defpackage.dij) r1
            j$.util.stream.Stream r2 = j$.util.Collection$$Dispatch.stream(r0)
            del r4 = new del
            r4.<init>(r1)
            boolean r1 = r2.allMatch(r4)
            if (r1 != 0) goto L_0x04ac
        L_0x049a:
            j$.util.stream.Stream r1 = j$.util.Collection$$Dispatch.stream(r0)
            j$.util.function.Predicate r2 = defpackage.deh.a
            j$.util.stream.Stream r1 = r1.filter(r2)
            dek r2 = new dek
            r2.<init>(r3)
            r1.forEach(r2)
        L_0x04ac:
            long r1 = java.lang.System.currentTimeMillis()
            cze r3 = defpackage.cze.a()
            java.lang.Class<czj> r4 = defpackage.czj.class
            czd r3 = r3.a(r4)
            czj r3 = (defpackage.czj) r3
            j$.util.stream.Stream r0 = j$.util.Collection$$Dispatch.stream(r0)
            j$.util.function.Function r4 = defpackage.dej.a
            j$.util.stream.Stream r0 = r0.map(r4)
            j$.util.stream.Collector r4 = j$.util.stream.Collectors.toList()
            java.lang.Object r0 = r0.collect(r4)
            java.util.List r0 = (java.util.List) r0
            anl r4 = defpackage.anl.i
            epb r4 = r4.g()
            r5 = 7
            r4.r((int) r5)
            ano r5 = defpackage.ano.b
            epb r5 = r5.g()
            r5.b()
            eoy r6 = r5.a
            ano r6 = (defpackage.ano) r6
            epk r7 = r6.a
            boolean r7 = r7.a()
            if (r7 != 0) goto L_0x04f7
            epk r7 = r6.a
            epk r7 = defpackage.eoy.a((defpackage.epk) r7)
            r6.a = r7
        L_0x04f7:
            epk r6 = r6.a
            defpackage.enh.a(r0, r6)
            r4.b()
            eoy r0 = r4.a
            anl r0 = (defpackage.anl) r0
            eqn r5 = r5.f()
            eoy r5 = (defpackage.eoy) r5
            ano r5 = (defpackage.ano) r5
            r0.h = r5
            int r5 = r0.a
            r5 = r5 | 64
            r0.a = r5
            eqn r0 = r4.f()
            eoy r0 = (defpackage.eoy) r0
            anl r0 = (defpackage.anl) r0
            long r1 = r1 - r17
            r3.a((defpackage.anl) r0, (long) r1)
            return
        L_0x0521:
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r2 = "com.google.android.settings.intelligence.modules.routines.impl.extra.VALID_SSIDS"
            java.util.ArrayList r1 = r1.getStringArrayListExtra(r2)
            r0.<init>(r1)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r1.length()
            die r1 = r31.c()
            dhx r1 = r1.a
            dic r2 = r1.i
            r2.d()
            dic r2 = r1.i
            r2.f()
            dic r1 = r1.i
            java.util.List r1 = r1.a()
            int r1 = r1.size()
            j$.util.stream.Stream r2 = j$.util.Collection$$Dispatch.stream(r0)
            dei r3 = new dei
            java.lang.String r4 = "<disconnected>"
            r3.<init>(r4)
            boolean r2 = r2.allMatch(r3)
            if (r2 != 0) goto L_0x0619
            ded r2 = r31.b()
            long r3 = java.lang.System.currentTimeMillis()
            dgk r5 = r2.c
            java.util.HashSet r6 = new java.util.HashSet
            dfy r5 = r5.a
            java.util.List r5 = r5.c()
            r6.<init>(r5)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r6)
            r5.removeAll(r0)
            r6 = 0
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            java.lang.String[] r5 = (java.lang.String[]) r5
            int r6 = r5.length
            if (r6 <= 0) goto L_0x0592
            dgk r6 = r2.c
            dfy r6 = r6.a
            r6.a((java.lang.String[]) r5)
        L_0x0592:
            der r5 = r2.b
            r5.d()
            dgk r2 = r2.c
            int r2 = r2.b()
            long r5 = java.lang.System.currentTimeMillis()
            cze r8 = defpackage.cze.a()
            java.lang.Class<czj> r9 = defpackage.czj.class
            czd r8 = r8.a(r9)
            czj r8 = (defpackage.czj) r8
            anl r9 = defpackage.anl.i
            epb r9 = r9.g()
            r10 = 6
            r9.r((int) r10)
            ant r10 = defpackage.ant.e
            epb r10 = r10.g()
            r10.b()
            eoy r11 = r10.a
            ant r11 = (defpackage.ant) r11
            int r12 = r11.a
            r13 = 1
            r12 = r12 | r13
            r11.a = r12
            r11.b = r1
            r10.b()
            eoy r1 = r10.a
            ant r1 = (defpackage.ant) r1
            int r11 = r1.a
            r12 = 2
            r11 = r11 | r12
            r1.a = r11
            r1.c = r2
            r10.b()
            eoy r1 = r10.a
            ant r1 = (defpackage.ant) r1
            int r2 = r1.a
            r11 = 4
            r2 = r2 | r11
            r1.a = r2
            r1.d = r7
            r9.b()
            eoy r1 = r9.a
            anl r1 = (defpackage.anl) r1
            eqn r2 = r10.f()
            eoy r2 = (defpackage.eoy) r2
            ant r2 = (defpackage.ant) r2
            r1.g = r2
            int r2 = r1.a
            r2 = r2 | 32
            r1.a = r2
            eqn r1 = r9.f()
            eoy r1 = (defpackage.eoy) r1
            anl r1 = (defpackage.anl) r1
            long r5 = r5 - r3
            r8.a((defpackage.anl) r1, (long) r5)
            die r1 = r31.c()
            dhx r1 = r1.a
            dic r1 = r1.i
            r1.a((java.util.Set) r0)
            return
        L_0x0619:
            r0 = r31
            goto L_0x09b1
        L_0x061d:
            java.lang.String r0 = r1.getStringExtra(r6)
            int r2 = r1.getIntExtra(r14, r7)
            r3 = 0
            int r13 = r1.getIntExtra(r13, r3)
            if (r13 == 0) goto L_0x078a
            java.lang.String r5 = "com.google.android.settings.intelligence.modules.routines.impl.extra.SOURCE"
            int r3 = r1.getIntExtra(r5, r3)
            java.lang.String r5 = "com.google.android.settings.intelligence.modules.routines.impl.extra.AGE_MS"
            long r11 = r1.getLongExtra(r5, r11)
            java.lang.String r5 = "com.google.android.settings.intelligence.modules.routines.impl.extra.CONFIDENCE"
            int r14 = r1.getIntExtra(r5, r7)
            r5 = r20
            r6 = 1
            boolean r10 = r1.getBooleanExtra(r5, r6)
            ded r1 = r31.b()
            long r18 = java.lang.System.currentTimeMillis()
            dgk r5 = r1.c
            r6 = r0
            r7 = r2
            r8 = r14
            r9 = r13
            r5.a(r6, r7, r8, r9, r10)
            r5 = 1
            if (r3 != r5) goto L_0x068e
            if (r13 != r5) goto L_0x068e
            dgk r5 = r1.c
            j$.util.Optional r6 = r5.a(r0, r2)
            boolean r7 = r6.isPresent()
            if (r7 == 0) goto L_0x0677
            java.lang.Object r6 = r6.get()
            dgl r6 = (defpackage.dgl) r6
            int r7 = r6.h
            r8 = 1
            int r7 = r7 + r8
            r6.h = r7
            r5.a((defpackage.dgl) r6)
        L_0x0677:
            der r5 = r1.b
            android.content.SharedPreferences r6 = r5.a
            android.content.SharedPreferences$Editor r6 = r6.edit()
            int r5 = r5.c()
            r7 = 1
            int r5 = r5 + r7
            java.lang.String r7 = "com.google.android.settings.intelligence.modules.routines.impl.util.DAY_INFERENCE_DISMISSAL_COUNT"
            android.content.SharedPreferences$Editor r5 = r6.putInt(r7, r5)
            r5.apply()
        L_0x068e:
            r5 = 3
            if (r2 == r5) goto L_0x0692
            goto L_0x06af
        L_0x0692:
            if (r13 != r5) goto L_0x06a1
            dhv r5 = r1.e
            android.content.Context r6 = r1.a
            java.lang.String r0 = defpackage.dkr.a((android.content.Context) r6, (java.lang.String) r0)
            r5.a(r0)
            goto L_0x06af
        L_0x06a1:
            r5 = 4
            if (r13 != r5) goto L_0x06af
            dhv r5 = r1.e
            android.content.Context r6 = r1.a
            java.lang.String r0 = defpackage.dkr.a((android.content.Context) r6, (java.lang.String) r0)
            r5.b(r0)
        L_0x06af:
            r1.a()
            dgk r0 = r1.c
            int r26 = r0.b()
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r18
            r5 = 1
            if (r3 == r5) goto L_0x0736
            r6 = 2
            if (r3 == r6) goto L_0x06f2
            java.lang.String r0 = "Unknown source"
            if (r3 == 0) goto L_0x06d5
            if (r3 == r5) goto L_0x06d1
            if (r3 == r6) goto L_0x06cd
            goto L_0x06d7
        L_0x06cd:
            java.lang.String r0 = "Manual source"
            goto L_0x06d7
        L_0x06d1:
            java.lang.String r0 = "Notification source"
            goto L_0x06d7
        L_0x06d5:
        L_0x06d7:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Cannot log event for this type of source: "
            int r2 = r0.length()
            if (r2 != 0) goto L_0x06ea
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x06ee
        L_0x06ea:
            java.lang.String r0 = r1.concat(r0)
        L_0x06ee:
            android.util.Log.e(r4, r0)
            return
        L_0x06f2:
            r3 = 3
            if (r13 == r3) goto L_0x071a
            r3 = 4
            if (r13 == r3) goto L_0x06fe
            java.lang.String r0 = "Cannot log this type of manual event for wifi rule."
            android.util.Log.e(r4, r0)
            return
        L_0x06fe:
            cze r3 = defpackage.cze.a()
            java.lang.Class<czj> r4 = defpackage.czj.class
            czd r3 = r3.a(r4)
            r21 = r3
            czj r21 = (defpackage.czj) r21
            r22 = 2
            r23 = r26
            r24 = r2
            r25 = r14
            r26 = r0
            r21.a(r22, r23, r24, r25, r26)
            return
        L_0x071a:
            cze r3 = defpackage.cze.a()
            java.lang.Class<czj> r4 = defpackage.czj.class
            czd r3 = r3.a(r4)
            r21 = r3
            czj r21 = (defpackage.czj) r21
            r22 = 2
            r23 = 3
            r24 = r2
            r25 = r14
            r27 = r0
            r21.a(r22, r23, r24, r25, r26, r27)
            return
        L_0x0736:
            r3 = 3
            if (r13 != r3) goto L_0x0756
            cze r3 = defpackage.cze.a()
            java.lang.Class<czj> r4 = defpackage.czj.class
            czd r3 = r3.a(r4)
            r21 = r3
            czj r21 = (defpackage.czj) r21
            r22 = 2
            r23 = 2
            r24 = r2
            r25 = r14
            r27 = r0
            r21.a(r22, r23, r24, r25, r26, r27)
            return
        L_0x0756:
            r3 = 1
            if (r13 == r3) goto L_0x075f
            java.lang.String r0 = "Cannot log this type of notification event for wifi rule."
            android.util.Log.e(r4, r0)
            return
        L_0x075f:
            cze r3 = defpackage.cze.a()
            java.lang.Class<czj> r4 = defpackage.czj.class
            czd r3 = r3.a(r4)
            czj r3 = (defpackage.czj) r3
            anr r4 = defpackage.anr.f
            epb r4 = r4.g()
            r5 = 4
            r4.u((int) r5)
            r4.s((int) r14)
            r4.b((long) r11)
            r4.t((int) r2)
            eqn r2 = r4.f()
            eoy r2 = (defpackage.eoy) r2
            anr r2 = (defpackage.anr) r2
            r3.a((defpackage.anr) r2, (long) r0)
            return
        L_0x078a:
            r0 = r31
            goto L_0x09b1
        L_0x078e:
            ded r0 = r31.b()
            dgk r1 = r0.c
            java.util.List r1 = r1.a()
            j$.util.stream.Stream r1 = j$.util.Collection$$Dispatch.stream(r1)
            j$.util.function.Predicate r2 = defpackage.dgs.a
            j$.util.stream.Stream r1 = r1.filter(r2)
            j$.util.function.Predicate r2 = defpackage.dgv.a
            j$.util.stream.Stream r1 = r1.filter(r2)
            j$.util.stream.Collector r2 = j$.util.stream.Collectors.toList()
            java.lang.Object r1 = r1.collect(r2)
            java.util.List r1 = (java.util.List) r1
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r1.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "Re-register %d geofences"
            java.lang.String.format(r3, r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x07c9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x07e5
            java.lang.Object r2 = r1.next()
            dgl r2 = (defpackage.dgl) r2
            diw r3 = r0.f
            dfz r2 = r2.c
            double r4 = r2.e
            double r6 = r2.f
            java.lang.String r8 = r2.d
            int r9 = r2.h
            r3.a(r4, r6, r8, r9)
            goto L_0x07c9
        L_0x07e5:
            r0 = r31
            goto L_0x09b1
        L_0x07e9:
            r0 = r31
            ddq r1 = r0.h
            if (r1 != 0) goto L_0x07f6
            ddq r1 = new ddq
            r1.<init>(r0)
            r0.h = r1
        L_0x07f6:
            ddq r1 = r0.h
            ddw r1 = r1.b
            r1.a()
            return
        L_0x07fe:
            r5 = r20
            byte[] r2 = r1.getByteArrayExtra(r15)
            dfz r2 = defpackage.dgw.a((byte[]) r2)
            int r3 = r1.getIntExtra(r14, r7)
            r6 = 0
            int r6 = r1.getIntExtra(r13, r6)
            if (r6 == 0) goto L_0x09b1
            r7 = 1
            boolean r30 = r1.getBooleanExtra(r5, r7)
            ded r1 = r31.b()
            long r7 = java.lang.System.currentTimeMillis()
            dgk r5 = r1.c
            java.util.List r9 = r5.a()
            j$.util.stream.Stream r9 = j$.util.Collection$$Dispatch.stream(r9)
            j$.util.function.Predicate r10 = defpackage.dgr.a
            j$.util.stream.Stream r9 = r9.filter(r10)
            dgq r10 = new dgq
            r10.<init>(r2)
            j$.util.stream.Stream r9 = r9.filter(r10)
            dgt r10 = new dgt
            r10.<init>(r3)
            j$.util.stream.Stream r9 = r9.filter(r10)
            j$.util.Optional r9 = r9.findFirst()
            boolean r10 = r9.isPresent()
            if (r10 == 0) goto L_0x0857
            java.lang.Object r9 = r9.get()
            dgl r9 = (defpackage.dgl) r9
            int r9 = r9.f
            r26 = r9
            goto L_0x0861
        L_0x0857:
            java.util.List r9 = r5.a()
            int r9 = r9.size()
            r26 = r9
        L_0x0861:
            dgl r9 = new dgl
            r22 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r21 = r9
            r23 = r2
            r24 = r3
            r25 = r6
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r5.a((defpackage.dgl) r9)
            r5 = 4
            if (r6 != r5) goto L_0x0883
            der r5 = r1.b
            java.lang.String r9 = r2.b
            r5.a((java.lang.String) r9)
        L_0x0883:
            r5 = 3
            if (r3 == r5) goto L_0x0887
            goto L_0x08a4
        L_0x0887:
            if (r6 != r5) goto L_0x0896
            dhv r5 = r1.e
            android.content.Context r9 = r1.a
            java.lang.String r2 = defpackage.dkr.a((android.content.Context) r9, (defpackage.dfz) r2)
            r5.a(r2)
            goto L_0x08a4
        L_0x0896:
            r5 = 4
            if (r6 != r5) goto L_0x08a4
            dhv r5 = r1.e
            android.content.Context r9 = r1.a
            java.lang.String r2 = defpackage.dkr.a((android.content.Context) r9, (defpackage.dfz) r2)
            r5.b(r2)
        L_0x08a4:
            r1.a()
            long r9 = java.lang.System.currentTimeMillis()
            long r27 = r9 - r7
            dgk r1 = r1.c
            int r26 = r1.b()
            r1 = 3
            if (r6 == r1) goto L_0x08db
            r1 = 4
            if (r6 == r1) goto L_0x08bf
            java.lang.String r1 = "Cannot log this type of event for geofence rule."
            android.util.Log.e(r4, r1)
            return
        L_0x08bf:
            cze r1 = defpackage.cze.a()
            java.lang.Class<czj> r2 = defpackage.czj.class
            czd r1 = r1.a(r2)
            r21 = r1
            czj r21 = (defpackage.czj) r21
            r22 = 3
            r25 = -1
            r23 = r26
            r24 = r3
            r26 = r27
            r21.a(r22, r23, r24, r25, r26)
            return
        L_0x08db:
            cze r1 = defpackage.cze.a()
            java.lang.Class<czj> r2 = defpackage.czj.class
            czd r1 = r1.a(r2)
            r21 = r1
            czj r21 = (defpackage.czj) r21
            r22 = 3
            r23 = 3
            r25 = -1
            r24 = r3
            r21.a(r22, r23, r24, r25, r26, r27)
            return
        L_0x08f5:
            java.lang.String r2 = "com.google.android.settings.intelligence.modules.routines.impl.extra.EVENT_TYPE"
            r3 = 0
            int r2 = r1.getIntExtra(r2, r3)
            byte[] r1 = r1.getByteArrayExtra(r15)
            dfz r1 = defpackage.dgw.a((byte[]) r1)
            ded r3 = r31.b()
            if (r2 != 0) goto L_0x090c
            goto L_0x092c
        L_0x090c:
            if (r1 == 0) goto L_0x092c
            r4 = 1237(0x4d5, float:1.733E-42)
            if (r2 != r4) goto L_0x0921
            der r2 = r3.b
            java.lang.String r1 = r1.b
            java.util.Set r4 = r2.a()
            r4.add(r1)
            r2.a((java.util.Set) r4)
            goto L_0x092c
        L_0x0921:
            r4 = 1238(0x4d6, float:1.735E-42)
            if (r2 != r4) goto L_0x092c
            der r2 = r3.b
            java.lang.String r1 = r1.b
            r2.a((java.lang.String) r1)
        L_0x092c:
            r3.a()
            return
        L_0x0930:
            r2 = -9223372036854775808
            long r2 = r1.getLongExtra(r8, r2)
            java.lang.String r1 = r1.getStringExtra(r6)
            ded r4 = r31.b()
            java.lang.String r5 = java.lang.String.valueOf(r1)
            java.lang.String r6 = "handleWifiStateUpdate:"
            int r7 = r5.length()
            if (r7 == 0) goto L_0x094f
            r6.concat(r5)
            goto L_0x0954
        L_0x094f:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r6)
        L_0x0954:
            r4.a()
            boolean r4 = r31.a()
            if (r4 == 0) goto L_0x09b1
            die r4 = r31.c()
            j$.time.ZonedDateTime r2 = a((long) r2)
            dhx r3 = r4.a
            dih r4 = new dih
            r4.<init>(r1)
            ccn r1 = new ccn
            r1.<init>(r4, r2)
            r3.a(r1)
            return
        L_0x0975:
            int r2 = r1.getIntExtra(r9, r7)
            r3 = -9223372036854775808
            long r3 = r1.getLongExtra(r8, r3)
            ded r1 = r31.b()
            r1.a()
            boolean r1 = r31.a()
            if (r1 == 0) goto L_0x09b1
            r1 = 3
            if (r2 == r1) goto L_0x09b1
            die r1 = r31.c()
            j$.time.ZonedDateTime r3 = a((long) r3)
            dhx r1 = r1.a
            dig r4 = new dig
            r4.<init>(r2)
            cck r2 = new cck
            r2.<init>(r4, r3)
            r1.a(r2)
            return
        L_0x09a8:
            java.lang.String r1 = r2.concat(r1)
        L_0x09ac:
            java.lang.String r2 = "rules.RJobIntentService"
            android.util.Log.e(r2, r1)
        L_0x09b1:
            return
        L_0x09b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.settings.intelligence.modules.routines.impl.RoutinesJobIntentService.a(android.content.Intent):void");
    }

    public static void a(Context context, int i, long j) {
        Intent intent = new Intent();
        intent.setAction("com.google.android.settings.intelligence.modules.routines.impl.action.UPDATE_RINGER_MODE");
        intent.putExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.RINGER_MODE", i);
        intent.putExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.TIMESTAMP", j);
        a(context, RoutinesJobIntentService.class, intent);
    }

    public static void a(Context context, String str, long j) {
        Intent intent = new Intent();
        intent.setAction("com.google.android.settings.intelligence.modules.routines.impl.action.UPDATE_WIFI_STATE");
        intent.putExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.WIFI_SSID", str);
        intent.putExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.TIMESTAMP", j);
        a(context, RoutinesJobIntentService.class, intent);
    }

    public static void a(Context context, int i, byte[] bArr) {
        Intent intent = new Intent();
        intent.setAction("com.google.android.settings.intelligence.modules.routines.impl.action.UPDATE_LOCATION");
        intent.putExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.EVENT_TYPE", i);
        intent.putExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.LOCATION_METADATA", bArr);
        a(context, RoutinesJobIntentService.class, intent);
    }

    public static void a(Context context, String str, int i, int i2, int i3, long j, int i4, boolean z) {
        Intent intent = new Intent();
        intent.setAction("com.google.android.settings.intelligence.modules.routines.impl.action.ADD_WIFI_ROUTINE");
        intent.putExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.WIFI_SSID", str);
        intent.putExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.ACTION_TYPE", i);
        intent.putExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.ROUTINE_STATUS", i2);
        intent.putExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.SOURCE", i3);
        intent.putExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.AGE_MS", j);
        intent.putExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.CONFIDENCE", i4);
        intent.putExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.FYI", z);
        a(context, RoutinesJobIntentService.class, intent);
    }

    public static void a(Context context) {
        a(context, RoutinesJobIntentService.class, new Intent("com.google.android.settings.intelligence.modules.routines.impl.action.COMPUTE_NEW_INFERENCES"));
    }

    public static void b(Context context) {
        Intent intent = new Intent();
        intent.setAction("com.google.android.settings.intelligence.modules.routines.impl.action.DELETE_STATE_DB");
        a(context, RoutinesJobIntentService.class, intent);
    }

    private final boolean a() {
        if (!etn.l()) {
            return false;
        }
        if (this.e == null) {
            this.e = new der(this);
        }
        return this.e.e();
    }

    private final ded b() {
        if (this.f == null) {
            this.f = new ded(this);
        }
        return this.f;
    }

    private final die c() {
        if (this.g == null) {
            this.g = new die(new dey(EngineDatabase.a(this), (int) etn.b()), etn.c(), ((etm) etn.a.a()).c(), ((etm) etn.a.a()).j(), ((etm) etn.a.a()).h(), etn.e(), etn.g());
        }
        return this.g;
    }

    private static ZonedDateTime a(long j) {
        return Instant.ofEpochMilli(j).atZone(ZoneId.systemDefault());
    }
}
