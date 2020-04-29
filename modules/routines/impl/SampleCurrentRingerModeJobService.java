package com.google.android.settings.intelligence.modules.routines.impl;

import android.app.job.JobParameters;
import android.app.job.JobService;

/* compiled from: PG */
public class SampleCurrentRingerModeJobService extends JobService {
    private deo a = null;

    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        cze.a().a(dkp.class);
        int a2 = dkp.a(this);
        if (this.a == null) {
            this.a = new dem(this, a2);
        }
        this.a.a();
        jobFinished(jobParameters, false);
        return true;
    }
}
