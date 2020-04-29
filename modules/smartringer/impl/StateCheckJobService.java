package com.google.android.settings.intelligence.modules.smartringer.impl;

import android.app.job.JobParameters;
import android.app.job.JobService;

/* compiled from: PG */
public class StateCheckJobService extends JobService {
    public cyw a;
    private dps b = null;

    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.a == null) {
            this.a = (cyw) cze.a().a(cyw.class);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.b == null) {
            this.b = new dpq(this, currentTimeMillis);
        }
        this.b.a();
        jobFinished(jobParameters, false);
        return true;
    }

    static {
        StateCheckJobService.class.getName();
    }
}
