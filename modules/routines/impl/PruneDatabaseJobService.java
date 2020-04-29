package com.google.android.settings.intelligence.modules.routines.impl;

import android.app.job.JobParameters;
import android.app.job.JobService;

/* compiled from: PG */
public class PruneDatabaseJobService extends JobService {
    private ddz a = null;

    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.a == null) {
            this.a = new dea(this);
        }
        this.a.a();
        jobFinished(jobParameters, false);
        return true;
    }
}
