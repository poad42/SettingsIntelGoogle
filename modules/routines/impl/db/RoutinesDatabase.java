package com.google.android.settings.intelligence.modules.routines.impl.db;

import android.content.Context;

/* compiled from: PG */
public abstract class RoutinesDatabase extends cg {
    private static volatile RoutinesDatabase h;
    private static final ct i = new dev();
    private static final ct j = new dex();

    public abstract dfy i();

    public static synchronized RoutinesDatabase a(Context context) {
        RoutinesDatabase routinesDatabase;
        Class<RoutinesDatabase> cls = RoutinesDatabase.class;
        synchronized (cls) {
            if (h == null) {
                cj a = lh.a(context.getApplicationContext(), (Class) cls, "prototype");
                a.a(1, 2, 3, 4);
                a.b();
                cj a2 = lh.a(context.getApplicationContext(), (Class) cls, "routines");
                a2.a(1, 2, 3, 4);
                a2.a();
                a2.a(i, j);
                a2.a((lh) new deu(context));
                h = (RoutinesDatabase) a2.b();
            }
            routinesDatabase = h;
        }
        return routinesDatabase;
    }
}
