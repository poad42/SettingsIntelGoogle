package com.google.android.settings.intelligence.libs.experiment;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executor;

/* compiled from: PG */
public final class PhenotypeBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if ("com.google.android.settings.intelligence".equals(stringExtra)) {
            cze.a().a(cyt.class);
            Account[] a = cyt.a(context);
            bxd bxd = new bxd(bww.a(context), stringExtra, context.getSharedPreferences("SettingsGoogleIntelligenceSharedPrefFile", 0));
            String str = (a != null && a.length > 0) ? a[0].name : "";
            cza cza = new cza((byte) 0);
            Executor executor = bzg.a;
            zw.a((Object) str);
            bxd.a(str, executor, cza, 3);
        }
    }
}
