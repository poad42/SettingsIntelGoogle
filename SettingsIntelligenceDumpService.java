package com.google.android.settings.intelligence;

import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.IBinder;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* compiled from: PG */
public class SettingsIntelligenceDumpService extends Service {
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(getString(R.string.app_name_settings_intelligence));
        sb.append(10);
        StringBuilder sb2 = new StringBuilder();
        PackageManager packageManager = getPackageManager();
        sb2.append(" suggestion dump\n");
        for (dah dah : daj.a) {
            sb2.append("suggestion_category: ");
            sb2.append(dah.a);
            sb2.append(10);
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory(dah.a);
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 640);
            if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                for (ResolveInfo next : queryIntentActivities) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("\t\t");
                    sb3.append(next.activityInfo.packageName);
                    sb3.append('/');
                    sb3.append(next.activityInfo.name);
                    sb3.append(10);
                    if (next.activityInfo.metaData != null) {
                        sb3.append("\t\t\tEnabled: ");
                        sb3.append(next.activityInfo.enabled);
                        sb3.append(10);
                        try {
                            Resources resourcesForApplication = packageManager.getResourcesForApplication(next.activityInfo.packageName);
                            sb3.append("\t\t\tTitle: ");
                            sb3.append(resourcesForApplication.getString(next.activityInfo.metaData.getInt("com.android.settings.title")));
                            sb3.append(10);
                        } catch (PackageManager.NameNotFoundException e) {
                            String valueOf = String.valueOf(next.activityInfo.packageName);
                            Log.e("SettingsIntelligenceDump", valueOf.length() == 0 ? new String("Error finding resource for ") : "Error finding resource for ".concat(valueOf));
                        }
                    }
                    sb2.append(sb3.toString());
                }
            }
        }
        sb.append(sb2.toString());
        printWriter.println(sb.toString());
    }
}
