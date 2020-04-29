package com.google.android.settings.intelligence.modules.contextualcards.impl.db;

import android.content.Context;

/* compiled from: PG */
public abstract class ContextualCardsDatabase extends cg {
    public static final czp h = dbk.a;
    private static ContextualCardsDatabase i;
    private static final ct j = new dbl();

    public abstract dbf i();

    public static synchronized ContextualCardsDatabase a(Context context) {
        ContextualCardsDatabase contextualCardsDatabase;
        Class<ContextualCardsDatabase> cls = ContextualCardsDatabase.class;
        synchronized (cls) {
            if (i == null) {
                cj a = lh.a(context, (Class) cls, "contextual-cards-db");
                a.a(j);
                a.a = false;
                a.b = true;
                i = (ContextualCardsDatabase) a.b();
            }
            contextualCardsDatabase = i;
        }
        return contextualCardsDatabase;
    }
}
