package com.google.android.settings.intelligence.modules.routines.impl.db;

import java.util.HashMap;

/* compiled from: PG */
public final class RoutinesDatabase_Impl extends RoutinesDatabase {
    private volatile dfy h;

    /* access modifiers changed from: protected */
    public final bj a(bz bzVar) {
        cl clVar = new cl(bzVar, new dez(this), "9a004db3012099c933752bed1023a53f", "332b6db870f0c3e4cca4973f862cee69");
        bk a = bl.a(bzVar.b);
        a.a = bzVar.c;
        a.b = clVar;
        return bzVar.a.a(a.a());
    }

    /* access modifiers changed from: protected */
    public final ca b() {
        return new ca(this, new HashMap(0), new HashMap(0), "RoutineEntity");
    }

    public final dfy i() {
        dfy dfy;
        if (this.h != null) {
            return this.h;
        }
        synchronized (this) {
            if (this.h == null) {
                this.h = new dgd(this);
            }
            dfy = this.h;
        }
        return dfy;
    }
}
