package com.google.android.settings.intelligence.modules.routines.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: PG */
public class WifiBroadcastReceiver extends BroadcastReceiver {
    private den a;

    public final void onReceive(Context context, Intent intent) {
        ArrayList arrayList;
        if (intent != null) {
            int intExtra = intent.getIntExtra("context_fence_current_state", 0);
            long longExtra = intent.getLongExtra("context_fence_last_updated_time", 0);
            String stringExtra = intent.getStringExtra("context_fence_key");
            int intExtra2 = intent.getIntExtra("context_fence_previous_state", 0);
            Parcelable.Creator creator = bha.CREATOR;
            ArrayList arrayList2 = (ArrayList) intent.getSerializableExtra("context_data_list");
            if (arrayList2 != null) {
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    arrayList3.add(aac.a((byte[]) arrayList2.get(i), creator));
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            bhi bhi = new bhi(intExtra, longExtra, stringExtra, intExtra2, arrayList);
            if (bhi.a == 2) {
                String str = bhi.b;
                if (str != null) {
                    if (this.a == null) {
                        this.a = deq.a();
                    }
                    cze.a().a(cyw.class);
                    if (Objects.equals(str, "extra_wifi_connected")) {
                        String a2 = dkr.a(context);
                        if (!dkr.a(a2).endsWith("_nomap")) {
                            String valueOf = String.valueOf(a2);
                            if (valueOf.length() != 0) {
                                "Connected to ".concat(valueOf);
                            } else {
                                new String("Connected to ");
                            }
                            this.a.a(context, a2, System.currentTimeMillis());
                        }
                    }
                    if (Objects.equals(str, "extra_wifi_disconnected")) {
                        this.a.a(context, System.currentTimeMillis());
                        return;
                    }
                    return;
                }
                Log.e("rules.WifiRx", "FenceState fenceKey is null");
            }
        }
    }
}
