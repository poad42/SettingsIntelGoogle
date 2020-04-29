package com.google.android.settings.intelligence.modules.contextualcards.impl.db;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.Context;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public class CardDatabaseCleaningJobService extends dam {
    private static final JobInfo a = new JobInfo.Builder(11, new ComponentName("com.google.android.settings.intelligence", CardDatabaseCleaningJobService.class.getName())).setPeriodic(TimeUnit.DAYS.toMillis(1)).build();

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        new dbd(this, this, jobParameters).execute(new Void[0]);
        return true;
    }

    public static void a(Context context) {
        if (etf.c()) {
            a(context, a);
        } else {
            a(context, 11);
        }
    }
}
