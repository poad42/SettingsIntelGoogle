package com.google.android.settings.intelligence.modules.routines.impl.db.engine;

import android.content.Context;

/* compiled from: PG */
public abstract class EngineDatabase extends cg {
    private static volatile EngineDatabase h;
    private static final ct i = new dfv();

    public abstract dff i();

    public abstract dfm j();

    public static synchronized EngineDatabase a(Context context) {
        EngineDatabase engineDatabase;
        Class<EngineDatabase> cls = EngineDatabase.class;
        synchronized (cls) {
            if (h == null) {
                cj a = lh.a(context.getApplicationContext(), (Class) cls, "engine_database_prototype");
                a.a();
                a.a(i);
                a.a((lh) new dfu(context));
                h = (EngineDatabase) a.b();
            }
            engineDatabase = h;
        }
        return engineDatabase;
    }
}
