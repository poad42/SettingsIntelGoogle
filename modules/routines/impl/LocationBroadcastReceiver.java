package com.google.android.settings.intelligence.modules.routines.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: PG */
public class LocationBroadcastReceiver extends BroadcastReceiver {
    private den a;

    public final void onReceive(Context context, Intent intent) {
        ArrayList arrayList;
        String str;
        if (this.a == null) {
            this.a = deq.a();
        }
        String valueOf = String.valueOf(intent.getAction());
        if (valueOf.length() != 0) {
            "LocationBroadcastReceiver onReceive ".concat(valueOf);
        } else {
            new String("LocationBroadcastReceiver onReceive ");
        }
        if ("com.google.android.settings.intelligence.modules.routines.impl.LocationBroadcastReceiver.ACTION".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("gms_error_code", -1);
            int intExtra2 = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
            if (intExtra2 == -1) {
                intExtra2 = -1;
            } else if (!(intExtra2 == 1 || intExtra2 == 2 || intExtra2 == 4)) {
                intExtra2 = -1;
            }
            ArrayList arrayList2 = (ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
            if (arrayList2 != null) {
                arrayList = new ArrayList(arrayList2.size());
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(brv.a((byte[]) arrayList2.get(i)));
                }
            } else {
                arrayList = null;
            }
            bqh bqh = new bqh(intExtra, intExtra2, arrayList, (Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location"));
            int i2 = bqh.a;
            if (i2 != -1) {
                switch (i2) {
                    case 1000:
                        str = "Geofence service is not available now.";
                        break;
                    case 1001:
                        str = "Too many Geofences have been registered";
                        break;
                    case 1002:
                        str = "Too many PendingIntents provided to addGeofences() call";
                        break;
                    default:
                        str = "Unknown error, Geofence service not available";
                        break;
                }
                Log.e("rules.LocatnBrdcstRcvr", str);
            } else if (!bqh.c.isEmpty()) {
                Location location = bqh.d;
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                StringBuilder sb = new StringBuilder(89);
                sb.append("Geofence event triggered at location [");
                sb.append(latitude);
                sb.append(", ");
                sb.append(longitude);
                sb.append("]");
                sb.toString();
                int i3 = bqh.b;
                for (bqc a2 : bqh.c) {
                    epb g = dfz.i.g();
                    g.j(a2.a());
                    dfz dfz = (dfz) ((eoy) g.f());
                    if (i3 == 1) {
                        this.a.a(context, dgw.a(dfz));
                    } else if (i3 != 2) {
                        String.valueOf(String.valueOf(intent)).length();
                    } else {
                        this.a.b(context, dgw.a(dfz));
                    }
                }
            }
        }
    }
}
