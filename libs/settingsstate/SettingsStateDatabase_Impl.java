package com.google.android.settings.intelligence.libs.settingsstate;

import java.util.HashMap;

/* compiled from: PG */
public final class SettingsStateDatabase_Impl extends SettingsStateDatabase {
    /* access modifiers changed from: protected */
    public final bj a(bz bzVar) {
        cl clVar = new cl(bzVar, new dab(this), "b4d626f349cef13691b3716517795c82", "207cbcd3072c802fe17167b1eb5d09c8");
        bk a = bl.a(bzVar.b);
        a.a = bzVar.c;
        a.b = clVar;
        return bzVar.a.a(a.a());
    }

    /* access modifiers changed from: protected */
    public final ca b() {
        return new ca(this, new HashMap(0), new HashMap(0), "SettingsState", "RotateState", "DisplaySleepTimeState", "DndState");
    }
}
