package com.google.android.settings.intelligence.modules.routines.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
public class RoutineBroadcastReceiver extends BroadcastReceiver {
    private den a;

    public final void onReceive(Context context, Intent intent) {
        Intent intent2 = intent;
        if (this.a == null) {
            this.a = deq.a();
        }
        if (intent.getAction().equals("rules.RtnBroadcastRx.ACTION_ADD_WIFI_ROUTINE")) {
            int intExtra = intent2.getIntExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.SOURCE", 0);
            if (intExtra == 2) {
                this.a.a(context, intent2.getStringExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.WIFI_SSID"), intent2.getIntExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.ACTION_TYPE", -1), intent2.getIntExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.ROUTINE_STATUS", 0), intent2.getIntExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.CONFIDENCE", -1), intent2.getBooleanExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.FYI", true));
            } else if (intExtra == 1) {
                cze.a().a(cyw.class);
                long currentTimeMillis = System.currentTimeMillis();
                long longExtra = intent2.getLongExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.TIMESTAMP", currentTimeMillis);
                this.a.a(context, intent2.getStringExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.WIFI_SSID"), intent2.getIntExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.ACTION_TYPE", -1), intent2.getIntExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.ROUTINE_STATUS", 0), currentTimeMillis - longExtra, intent2.getIntExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.CONFIDENCE", -1), intent2.getBooleanExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.FYI", true));
            }
        } else if (intent.getAction().equals("rules.RtnBroadcastRx.ACTION_ADD_LOCATION_ROUTINE")) {
            this.a.a(context, intent2.getByteArrayExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.LOCATION_METADATA"), intent2.getIntExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.ACTION_TYPE", -1), intent2.getIntExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.ROUTINE_STATUS", 0), intent2.getBooleanExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.FYI", true));
        } else if (intent.getAction().equals("rules.RtnBroadcastRx.ACTION_MUTE_ROUTINE")) {
            this.a.b(context, intent2.getLongExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.KEY", -1));
        }
    }

    public static Intent a(String str, int i, int i2, long j, int i3, boolean z) {
        Intent intent = new Intent("rules.RtnBroadcastRx.ACTION_ADD_WIFI_ROUTINE");
        intent.putExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.WIFI_SSID", str);
        intent.putExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.ACTION_TYPE", i);
        intent.putExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.ROUTINE_STATUS", i2);
        intent.putExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.SOURCE", 1);
        intent.putExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.TIMESTAMP", j);
        intent.putExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.CONFIDENCE", i3);
        intent.putExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.FYI", z);
        return intent;
    }
}
