package com.google.android.settings.intelligence.modules.sliceindexing.impl;

import android.app.job.JobParameters;
import android.content.Context;

/* compiled from: PG */
public class SliceIndexUpdateJobService extends dam {
    public final boolean onStartJob(JobParameters jobParameters) {
        new dpg(this, this, jobParameters).execute(new Void[0]);
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        a((Context) this, 10);
        return false;
    }
}
