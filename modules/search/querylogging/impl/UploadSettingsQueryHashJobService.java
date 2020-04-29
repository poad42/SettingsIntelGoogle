package com.google.android.settings.intelligence.modules.search.querylogging.impl;

import android.app.job.JobParameters;
import android.app.job.JobService;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class UploadSettingsQueryHashJobService extends JobService {
    public static final List a = new ArrayList();

    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        new dnr(this, jobParameters).start();
        return true;
    }

    public static List a(List list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        if (size > 2) {
            int i = 1;
            while (true) {
                int i2 = size - 1;
                if (i < i2) {
                    dnn dnn = (dnn) list.get(i);
                    if (!dnn.c) {
                        int length = dnn.b.length();
                        int length2 = ((dnn) list.get(i - 1)).b.length();
                        int length3 = ((dnn) list.get(i + 1)).b.length();
                        if ((length > length2 && length > length3) || (length < length2 && length < length3)) {
                            arrayList.add(dnn);
                        }
                    } else {
                        arrayList.add(dnn);
                    }
                    i++;
                } else {
                    arrayList.add((dnn) list.get(i2));
                    return arrayList;
                }
            }
        } else {
            arrayList.addAll(list);
            return arrayList;
        }
    }
}
