package com.google.android.settings.intelligence.modules.routines.impl.db.engine;

import java.util.HashMap;

/* compiled from: PG */
public final class EngineDatabase_Impl extends EngineDatabase {
    private volatile dff h;
    private volatile dfm i;

    /* access modifiers changed from: protected */
    public final bj a(bz bzVar) {
        cl clVar = new cl(bzVar, new dfx(this), "d4e22cbc01c5365ceb7d552f2f5c5ab3", "ad19dfd250e8549898ce1e2ee6df2228");
        bk a = bl.a(bzVar.b);
        a.a = bzVar.c;
        a.b = clVar;
        return bzVar.a.a(a.a());
    }

    /* access modifiers changed from: protected */
    public final ca b() {
        return new ca(this, new HashMap(0), new HashMap(0), "BucketEntity", "CurrentWifiRingerStateEntity");
    }

    /* access modifiers changed from: package-private */
    public final dff i() {
        dff dff;
        if (this.h != null) {
            return this.h;
        }
        synchronized (this) {
            if (this.h == null) {
                this.h = new dfe(this);
            }
            dff = this.h;
        }
        return dff;
    }

    /* access modifiers changed from: package-private */
    public final dfm j() {
        dfm dfm;
        if (this.i != null) {
            return this.i;
        }
        synchronized (this) {
            if (this.i == null) {
                this.i = new dfp(this);
            }
            dfm = this.i;
        }
        return dfm;
    }
}
