package com.google.android.settings.intelligence.modules.suggestions;

import android.content.Context;
import android.service.settings.suggestions.Suggestion;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
public class SuggestionService extends android.service.settings.suggestions.SuggestionService {
    /* JADX WARNING: type inference failed for: r7v0, types: [android.content.Context, com.google.android.settings.intelligence.modules.suggestions.SuggestionService] */
    public final List onGetSuggestions() {
        List<Suggestion> a;
        try {
            cyz a2 = cyz.a();
            cze.a().a(daa.class);
            dad dad = new dad(this);
            dai dai = new dai();
            Iterator it = daj.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    a = dai.a();
                    break;
                }
                dah dah = (dah) it.next();
                if (!daj.a(dad.a, dah)) {
                    List a3 = dad.a(dah);
                    if (!a3.isEmpty()) {
                        dai.a(dah, a3);
                        a = dai.a();
                        break;
                    }
                } else {
                    dai.a(dah, dad.a(dah));
                }
            }
            ArrayList arrayList = new ArrayList(a.size());
            for (Suggestion id : a) {
                arrayList.add(id.getId());
            }
            long b = a2.b();
            epb g = anf.k.g();
            g.m(2);
            g.a(b);
            g.b();
            anf anf = (anf) g.a;
            anf.a();
            enh.a(arrayList, anf.c);
            ((czj) cze.a().a(czj.class)).a((anf) ((eoy) g.f()));
            return a;
        } catch (Exception e) {
            Log.e("SuggestionService", "Error getting suggestions", e);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.content.Context, com.google.android.settings.intelligence.modules.suggestions.SuggestionService] */
    public final void onSuggestionDismissed(Suggestion suggestion) {
        cyz a = cyz.a();
        String id = suggestion.getId();
        String valueOf = String.valueOf(id);
        if (valueOf.length() != 0) {
            "dismissing suggestion ".concat(valueOf);
        } else {
            new String("dismissing suggestion ");
        }
        cze.a().a(daa.class);
        daa.a((Context) this).edit().putBoolean(daa.a(id), true).apply();
        czj czj = (czj) cze.a().a(czj.class);
        long b = a.b();
        epb g = anf.k.g();
        g.m(3);
        g.a(b);
        if (!TextUtils.isEmpty(id)) {
            g.g(id);
        }
        czj.a((anf) ((eoy) g.f()));
    }

    public final void onSuggestionLaunched(Suggestion suggestion) {
        cyz a = cyz.a();
        String id = suggestion.getId();
        String valueOf = String.valueOf(id);
        if (valueOf.length() != 0) {
            "Suggestion is launched".concat(valueOf);
        } else {
            new String("Suggestion is launched");
        }
        czj czj = (czj) cze.a().a(czj.class);
        long b = a.b();
        epb g = anf.k.g();
        g.m(4);
        g.a(b);
        if (!TextUtils.isEmpty(id)) {
            g.g(id);
        }
        czj.a((anf) ((eoy) g.f()));
    }
}
