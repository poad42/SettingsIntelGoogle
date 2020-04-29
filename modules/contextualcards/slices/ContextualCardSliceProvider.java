package com.google.android.settings.intelligence.modules.contextualcards.slices;

import android.content.UriMatcher;

/* compiled from: PG */
public class ContextualCardSliceProvider extends ago {
    private static final UriMatcher b;

    public ContextualCardSliceProvider() {
        super("android.permission.WRITE_SETTINGS_HOMEPAGE_DATA");
    }

    public final boolean b() {
        if (cze.a().a(daa.class) != null) {
            return true;
        }
        cze.a().a(daa.class, new daa());
        cze.a().a(cyw.class, new cyw());
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: agi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: me} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.agi a(android.net.Uri r10) {
        /*
            r9 = this;
            java.lang.String r0 = java.lang.String.valueOf(r10)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r0.length()
            android.content.UriMatcher r0 = b
            int r0 = r0.match(r10)
            r1 = 0
            r2 = 100
            if (r0 == r2) goto L_0x003b
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r0 = java.lang.String.valueOf(r10)
            int r0 = r0.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r0 = r0 + 37
            r2.<init>(r0)
            java.lang.String r0 = "Did not match anything, skipping uri "
            r2.append(r0)
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            java.lang.String r0 = "ContextualCardSliceProvider"
            android.util.Log.w(r0, r10)
            return r1
        L_0x003b:
            android.content.Context r0 = r9.getContext()
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.getThreadPolicy()
            android.os.StrictMode$ThreadPolicy$Builder r3 = new android.os.StrictMode$ThreadPolicy$Builder     // Catch:{ all -> 0x0155 }
            r3.<init>()     // Catch:{ all -> 0x0155 }
            android.os.StrictMode$ThreadPolicy$Builder r3 = r3.permitAll()     // Catch:{ all -> 0x0155 }
            android.os.StrictMode$ThreadPolicy r3 = r3.build()     // Catch:{ all -> 0x0155 }
            android.os.StrictMode.setThreadPolicy(r3)     // Catch:{ all -> 0x0155 }
            android.content.pm.PackageManager r3 = r0.getPackageManager()     // Catch:{ all -> 0x0155 }
            java.util.List r4 = r10.getPathSegments()     // Catch:{ all -> 0x0155 }
            r5 = 1
            java.lang.Object r6 = r4.get(r5)     // Catch:{ all -> 0x0155 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0155 }
            r7 = 2
            java.lang.Object r4 = r4.get(r7)     // Catch:{ all -> 0x0155 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0155 }
            android.content.Intent r7 = new android.content.Intent     // Catch:{ all -> 0x0155 }
            r7.<init>()     // Catch:{ all -> 0x0155 }
            android.content.Intent r4 = r7.setClassName(r6, r4)     // Catch:{ all -> 0x0155 }
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.ResolveInfo r3 = r3.resolveActivity(r4, r6)     // Catch:{ all -> 0x0155 }
            if (r3 == 0) goto L_0x0151
            dae r4 = new dae     // Catch:{ all -> 0x0155 }
            r6 = 0
            r4.<init>(r0, r3, r6)     // Catch:{ all -> 0x0155 }
            boolean r3 = r4.c     // Catch:{ all -> 0x0155 }
            java.lang.String r6 = "SuggestionSliceBuilder"
            if (r3 != 0) goto L_0x0088
            r4 = r1
            goto L_0x00bd
        L_0x0088:
            dac r3 = new dac     // Catch:{ all -> 0x0155 }
            r3.<init>(r0, r4)     // Catch:{ all -> 0x0155 }
            java.util.concurrent.ExecutorService r4 = java.util.concurrent.Executors.newCachedThreadPool()     // Catch:{ all -> 0x0155 }
            r4.execute(r3)     // Catch:{ all -> 0x0155 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x009f }
            r7 = 200(0xc8, double:9.9E-322)
            java.lang.Object r4 = r3.get(r7, r4)     // Catch:{ Exception -> 0x009f }
            dae r4 = (defpackage.dae) r4     // Catch:{ Exception -> 0x009f }
            goto L_0x00bd
        L_0x009f:
            r4 = move-exception
            java.lang.String r7 = "Error checking completion state for "
            java.lang.String r3 = r3.a     // Catch:{ all -> 0x0155 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0155 }
            int r8 = r3.length()     // Catch:{ all -> 0x0155 }
            if (r8 == 0) goto L_0x00b3
            java.lang.String r3 = r7.concat(r3)     // Catch:{ all -> 0x0155 }
            goto L_0x00b8
        L_0x00b3:
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x0155 }
            r3.<init>(r7)     // Catch:{ all -> 0x0155 }
        L_0x00b8:
            android.util.Log.w(r6, r3, r4)     // Catch:{ all -> 0x0155 }
            r4 = r1
        L_0x00bd:
            if (r4 == 0) goto L_0x014d
            java.lang.Class<android.app.slice.SliceManager> r3 = android.app.slice.SliceManager.class
            java.lang.Object r3 = r0.getSystemService(r3)     // Catch:{ all -> 0x0155 }
            android.app.slice.SliceManager r3 = (android.app.slice.SliceManager) r3     // Catch:{ all -> 0x0155 }
            java.util.List r3 = r3.getPinnedSlices()     // Catch:{ all -> 0x0155 }
            boolean r3 = r3.contains(r10)     // Catch:{ all -> 0x0155 }
            if (r3 != 0) goto L_0x00f7
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0155 }
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0155 }
            int r0 = r0.length()     // Catch:{ all -> 0x0155 }
            int r0 = r0 + 20
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0155 }
            r3.<init>(r0)     // Catch:{ all -> 0x0155 }
            java.lang.String r0 = "slice is not pinned "
            r3.append(r0)     // Catch:{ all -> 0x0155 }
            r3.append(r10)     // Catch:{ all -> 0x0155 }
            java.lang.String r10 = r3.toString()     // Catch:{ all -> 0x0155 }
            android.util.Log.w(r6, r10)     // Catch:{ all -> 0x0155 }
            android.os.StrictMode.setThreadPolicy(r2)
            goto L_0x0154
        L_0x00f7:
            ahd r3 = new ahd     // Catch:{ all -> 0x0155 }
            r3.<init>(r0, r10)     // Catch:{ all -> 0x0155 }
            android.service.settings.suggestions.Suggestion r10 = r4.a()     // Catch:{ all -> 0x0155 }
            android.graphics.drawable.Icon r4 = r10.getIcon()     // Catch:{ all -> 0x0155 }
            if (r4 == 0) goto L_0x010f
            android.graphics.drawable.Icon r1 = r10.getIcon()     // Catch:{ all -> 0x0155 }
            me r1 = defpackage.me.a((android.content.Context) r0, (android.graphics.drawable.Icon) r1)     // Catch:{ all -> 0x0155 }
            goto L_0x0111
        L_0x010f:
        L_0x0111:
            android.app.PendingIntent r0 = r10.getPendingIntent()     // Catch:{ all -> 0x0155 }
            java.lang.CharSequence r4 = r10.getTitle()     // Catch:{ all -> 0x0155 }
            ahf r6 = new ahf     // Catch:{ all -> 0x0155 }
            r6.<init>(r0, r1, r4)     // Catch:{ all -> 0x0155 }
            ahm r0 = r6.a     // Catch:{ all -> 0x0155 }
            r0.k = r5     // Catch:{ all -> 0x0155 }
            ahc r0 = new ahc     // Catch:{ all -> 0x0155 }
            r0.<init>()     // Catch:{ all -> 0x0155 }
            r0.b = r1     // Catch:{ all -> 0x0155 }
            java.lang.CharSequence r1 = r10.getTitle()     // Catch:{ all -> 0x0155 }
            r0.d = r1     // Catch:{ all -> 0x0155 }
            java.lang.CharSequence r10 = r10.getSummary()     // Catch:{ all -> 0x0155 }
            r0.e = r10     // Catch:{ all -> 0x0155 }
            r0.c = r6     // Catch:{ all -> 0x0155 }
            ahh r10 = r3.a     // Catch:{ all -> 0x0155 }
            r10.a(r0)     // Catch:{ all -> 0x0155 }
            ahh r10 = r3.a     // Catch:{ all -> 0x0155 }
            r10.a()     // Catch:{ all -> 0x0155 }
            ahh r10 = r3.a     // Catch:{ all -> 0x0155 }
            ahl r10 = (defpackage.ahl) r10     // Catch:{ all -> 0x0155 }
            agi r1 = r10.c()     // Catch:{ all -> 0x0155 }
            android.os.StrictMode.setThreadPolicy(r2)
            goto L_0x0154
        L_0x014d:
            android.os.StrictMode.setThreadPolicy(r2)
            goto L_0x0154
        L_0x0151:
            android.os.StrictMode.setThreadPolicy(r2)
        L_0x0154:
            return r1
        L_0x0155:
            r10 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.settings.intelligence.modules.contextualcards.slices.ContextualCardSliceProvider.a(android.net.Uri):agi");
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        b = uriMatcher;
        uriMatcher.addURI("com.google.android.settings.intelligence.modules.contextualcards.slices", "suggestion/*/*", 100);
    }
}
