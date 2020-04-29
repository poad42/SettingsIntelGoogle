package com.google.android.settings.intelligence.modules.contextualcards.impl;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.Executors;

/* compiled from: PG */
public class CardCollectorJobService extends dam {
    private static final JobInfo a = new JobInfo.Builder(9, new ComponentName("com.google.android.settings.intelligence", CardCollectorJobService.class.getName())).setPeriodic(((ete) etf.a.a()).a()).build();

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        Executors.newSingleThreadExecutor().execute(new das(getApplicationContext(), this, jobParameters));
        return true;
    }

    public static void a(Context context) {
        if (!etf.c()) {
            a(context, 9);
            Log.w("CardCollectorJobService", "refreshJob, cancel job.");
        } else if (lh.a(context, "android.permission.WRITE_SETTINGS_HOMEPAGE_DATA") != 0) {
            a(context, 9);
            Log.w("CardCollectorJobService", "Doesn't have android.permission.WRITE_SETTINGS_HOMEPAGE_DATA, cancel job");
        } else {
            a(context, a);
        }
    }

    public static void b(Context context) {
        if (Build.VERSION.SDK_INT >= 29 && lh.a(context, "android.permission.WRITE_SETTINGS_HOMEPAGE_DATA") == 0) {
            Executors.newSingleThreadExecutor().execute(new das(context, (JobService) null, (JobParameters) null));
        }
    }

    static {
        new dgw();
    }
}
