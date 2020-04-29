package com.google.android.settings.intelligence.modules.contextualcards.impl.db;

import java.util.HashMap;

/* compiled from: PG */
public final class ContextualCardsDatabase_Impl extends ContextualCardsDatabase {
    private volatile dbf i;

    /* access modifiers changed from: protected */
    public final bj a(bz bzVar) {
        cl clVar = new cl(bzVar, new dbn(this), "b20bb50841ac6526c80fb967224a715b", "c7ed58c03e39867ba6a5678aa7b35e50");
        bk a = bl.a(bzVar.b);
        a.a = bzVar.c;
        a.b = clVar;
        return bzVar.a.a(a.a());
    }

    /* access modifiers changed from: protected */
    public final ca b() {
        return new ca(this, new HashMap(0), new HashMap(0), "CardInteractionEntity", "CardEntity");
    }

    public final dbf i() {
        dbf dbf;
        if (this.i != null) {
            return this.i;
        }
        synchronized (this) {
            if (this.i == null) {
                this.i = new dbh(this);
            }
            dbf = this.i;
        }
        return dbf;
    }
}
