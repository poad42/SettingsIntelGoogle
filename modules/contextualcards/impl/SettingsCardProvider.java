package com.google.android.settings.intelligence.modules.contextualcards.impl;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import j$.util.Collection$$Dispatch;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class SettingsCardProvider extends cyy {
    public final and a() {
        Context context = getContext();
        epb g = and.b.g();
        dad dad = new dad(context);
        ArrayList arrayList = new ArrayList();
        for (dah dah : daj.a) {
            boolean a = daj.a(dad.a, dah);
            boolean z = !a;
            ArrayList arrayList2 = new ArrayList();
            for (dae dae : dad.a(dah, true, a)) {
                epb g2 = anb.f.g();
                ComponentName componentName = dae.b;
                String uri = new Uri.Builder().scheme("content").authority("com.google.android.settings.intelligence.modules.contextualcards.slices").appendPath("suggestion").appendPath(componentName.getPackageName()).appendPath(componentName.getClassName()).build().toString();
                g2.b();
                anb anb = (anb) g2.a;
                if (uri != null) {
                    anb.a |= 1;
                    anb.b = uri;
                    String flattenToString = dae.b.flattenToString();
                    g2.b();
                    anb anb2 = (anb) g2.a;
                    if (flattenToString != null) {
                        int i = 2;
                        anb2.a |= 2;
                        anb2.c = flattenToString;
                        if (dah.b) {
                            i = 6;
                        }
                        g2.b();
                        anb anb3 = (anb) g2.a;
                        anb3.a |= 4;
                        anb3.d = i - 1;
                        arrayList2.add((anb) ((eoy) g2.f()));
                    } else {
                        throw new NullPointerException();
                    }
                } else {
                    throw new NullPointerException();
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.addAll(arrayList2);
                if (z) {
                    break;
                }
            }
        }
        g.b();
        and and = (and) g.a;
        and.a();
        enh.a((List) Collection$$Dispatch.stream(arrayList).distinct().collect(Collectors.toList()), and.a);
        return (and) ((eoy) g.f());
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.os.ParcelFileDescriptor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0154, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015d, code lost:
        throw r5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle call(java.lang.String r13, java.lang.String r14, android.os.Bundle r15) {
        /*
            r12 = this;
            java.lang.String r14 = "first_account"
            int r15 = r13.hashCode()
            r0 = 0
            r1 = 1794367024(0x6af3de30, float:1.4740911E26)
            if (r15 == r1) goto L_0x000d
            goto L_0x0017
        L_0x000d:
            java.lang.String r15 = "getAccountAvatar"
            boolean r15 = r13.equals(r15)
            if (r15 == 0) goto L_0x0017
            r15 = 0
            goto L_0x0018
        L_0x0017:
            r15 = -1
        L_0x0018:
            if (r15 == 0) goto L_0x0037
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>()
            java.lang.String r15 = "getCardList"
            boolean r13 = r15.equals(r13)
            if (r13 == 0) goto L_0x0036
            and r13 = r12.a()
            if (r13 == 0) goto L_0x0036
            byte[] r13 = r13.c()
            java.lang.String r15 = "cardList"
            r14.putByteArray(r15, r13)
        L_0x0036:
            return r14
        L_0x0037:
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            cze r15 = defpackage.cze.a()
            java.lang.Class<cyt> r1 = defpackage.cyt.class
            r15.a(r1)
            android.content.Context r15 = r12.getContext()
            android.accounts.Account[] r1 = defpackage.cyt.a(r15)
            r2 = 0
            if (r1 == 0) goto L_0x00a4
            int r3 = r1.length
            if (r3 == 0) goto L_0x00a3
            android.os.StrictMode$ThreadPolicy r4 = android.os.StrictMode.getThreadPolicy()
            android.os.StrictMode$ThreadPolicy$Builder r5 = new android.os.StrictMode$ThreadPolicy$Builder     // Catch:{ all -> 0x009e }
            r5.<init>()     // Catch:{ all -> 0x009e }
            android.os.StrictMode$ThreadPolicy$Builder r5 = r5.permitAll()     // Catch:{ all -> 0x009e }
            android.os.StrictMode$ThreadPolicy r5 = r5.build()     // Catch:{ all -> 0x009e }
            android.os.StrictMode.setThreadPolicy(r5)     // Catch:{ all -> 0x009e }
            java.lang.String r5 = "account_feature_provider"
            android.content.SharedPreferences r15 = r15.getSharedPreferences(r5, r0)     // Catch:{ all -> 0x009e }
            java.lang.String r5 = ""
            java.lang.String r5 = r15.getString(r14, r5)     // Catch:{ all -> 0x009e }
            android.os.StrictMode.setThreadPolicy(r4)
            r4 = 0
        L_0x0077:
            if (r4 >= r3) goto L_0x0086
            r6 = r1[r4]
            java.lang.String r7 = r6.name
            boolean r7 = android.text.TextUtils.equals(r5, r7)
            if (r7 != 0) goto L_0x0088
            int r4 = r4 + 1
            goto L_0x0077
        L_0x0086:
            r6 = r2
        L_0x0088:
            if (r6 != 0) goto L_0x008d
            r6 = r1[r0]
            goto L_0x008e
        L_0x008d:
        L_0x008e:
            android.content.SharedPreferences$Editor r15 = r15.edit()
            java.lang.String r1 = r6.name
            android.content.SharedPreferences$Editor r14 = r15.putString(r14, r1)
            r14.apply()
            java.lang.String r14 = r6.name
            goto L_0x00a5
        L_0x009e:
            r13 = move-exception
            android.os.StrictMode.setThreadPolicy(r4)
            throw r13
        L_0x00a3:
        L_0x00a4:
            r14 = r2
        L_0x00a5:
            android.content.Context r15 = r12.getContext()
            bua r1 = defpackage.bub.a()
            r1.a()
            bub r1 = r1.b()
            ayj r1 = defpackage.btw.a(r15, r1)
            btu r3 = defpackage.btw.c
            aym r1 = r1.g
            ayq r1 = r3.a(r1, r14)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r4 = 3000(0xbb8, double:1.482E-320)
            ayt r1 = r1.a(r4, r3)
            btx r1 = (defpackage.btx) r1
            com.google.android.gms.common.api.Status r3 = r1.b()     // Catch:{ all -> 0x02c6 }
            boolean r3 = r3.a()     // Catch:{ all -> 0x02c6 }
            java.lang.String r6 = " status code="
            java.lang.String r7 = "AccountFeatureProvider"
            if (r3 != 0) goto L_0x0110
            com.google.android.gms.common.api.Status r15 = r1.b()     // Catch:{ all -> 0x02c6 }
            java.lang.String r15 = r15.g     // Catch:{ all -> 0x02c6 }
            com.google.android.gms.common.api.Status r0 = r1.b()     // Catch:{ all -> 0x02c6 }
            int r0 = r0.f     // Catch:{ all -> 0x02c6 }
            java.lang.String r3 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x02c6 }
            int r3 = r3.length()     // Catch:{ all -> 0x02c6 }
            int r3 = r3 + 49
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x02c6 }
            r4.<init>(r3)     // Catch:{ all -> 0x02c6 }
            java.lang.String r3 = "loadAccountAvatar failed:"
            r4.append(r3)     // Catch:{ all -> 0x02c6 }
            r4.append(r15)     // Catch:{ all -> 0x02c6 }
            r4.append(r6)     // Catch:{ all -> 0x02c6 }
            r4.append(r0)     // Catch:{ all -> 0x02c6 }
            java.lang.String r15 = r4.toString()     // Catch:{ all -> 0x02c6 }
            android.util.Log.w(r7, r15)     // Catch:{ all -> 0x02c6 }
            defpackage.fpg.a((android.os.ParcelFileDescriptor) r2)
            r1.a()
            goto L_0x02b6
        L_0x0110:
            android.os.ParcelFileDescriptor r3 = r1.c()     // Catch:{ all -> 0x02c6 }
            r8 = 2131165289(0x7f070069, float:1.794479E38)
            if (r3 == 0) goto L_0x018e
            int r0 = r1.e()     // Catch:{ all -> 0x02c2 }
            int r4 = r1.d()     // Catch:{ all -> 0x02c2 }
            int r0 = java.lang.Math.max(r0, r4)     // Catch:{ all -> 0x02c2 }
            android.content.res.Resources r15 = r15.getResources()     // Catch:{ all -> 0x02c2 }
            int r15 = r15.getDimensionPixelSize(r8)     // Catch:{ all -> 0x02c2 }
            java.io.FileDescriptor r4 = r3.getFileDescriptor()     // Catch:{ all -> 0x02c2 }
            if (r4 == 0) goto L_0x0180
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x02c2 }
            r4.<init>()     // Catch:{ all -> 0x02c2 }
            int r0 = r0 / r15
            r5 = 1
            int r0 = java.lang.Math.max(r5, r0)     // Catch:{ all -> 0x02c2 }
            r4.inSampleSize = r0     // Catch:{ all -> 0x02c2 }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x015e }
            java.io.FileDescriptor r5 = r3.getFileDescriptor()     // Catch:{ IOException -> 0x015e }
            r0.<init>(r5)     // Catch:{ IOException -> 0x015e }
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r0, r2, r4)     // Catch:{ all -> 0x0152 }
            r0.close()     // Catch:{ IOException -> 0x015e }
            r2 = r4
            goto L_0x0182
        L_0x0152:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0154 }
        L_0x0154:
            r5 = move-exception
            r0.close()     // Catch:{ all -> 0x0159 }
            goto L_0x015d
        L_0x0159:
            r0 = move-exception
            defpackage.eac.a((java.lang.Throwable) r4, (java.lang.Throwable) r0)     // Catch:{ IOException -> 0x015e }
        L_0x015d:
            throw r5     // Catch:{ IOException -> 0x015e }
        L_0x015e:
            r0 = move-exception
            java.lang.String r4 = "AvatarUtils"
            java.lang.String r5 = "decodeFileDescriptor IOException: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x02c2 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02c2 }
            int r6 = r0.length()     // Catch:{ all -> 0x02c2 }
            if (r6 == 0) goto L_0x0176
            java.lang.String r0 = r5.concat(r0)     // Catch:{ all -> 0x02c2 }
            goto L_0x017b
        L_0x0176:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x02c2 }
            r0.<init>(r5)     // Catch:{ all -> 0x02c2 }
        L_0x017b:
            android.util.Log.w(r4, r0)     // Catch:{ all -> 0x02c2 }
            goto L_0x0182
        L_0x0180:
        L_0x0182:
            android.graphics.Bitmap r2 = defpackage.cyv.a(r2, r15)     // Catch:{ all -> 0x02c2 }
            defpackage.fpg.a((android.os.ParcelFileDescriptor) r3)
            r1.a()
            goto L_0x02b6
        L_0x018e:
            bua r9 = defpackage.bub.a()     // Catch:{ all -> 0x02c2 }
            r9.a()     // Catch:{ all -> 0x02c2 }
            bub r9 = r9.b()     // Catch:{ all -> 0x02c2 }
            ayj r9 = defpackage.btw.b(r15, r9)     // Catch:{ all -> 0x02c2 }
            bts r10 = new bts     // Catch:{ all -> 0x02c2 }
            r10.<init>()     // Catch:{ all -> 0x02c2 }
            btt r11 = defpackage.btw.b     // Catch:{ all -> 0x02c2 }
            aym r9 = r9.g     // Catch:{ all -> 0x02c2 }
            ayq r9 = r11.a(r9, r10)     // Catch:{ all -> 0x02c2 }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x02c2 }
            ayt r4 = r9.a(r4, r10)     // Catch:{ all -> 0x02c2 }
            btv r4 = (defpackage.btv) r4     // Catch:{ all -> 0x02c2 }
            com.google.android.gms.common.api.Status r5 = r4.b()     // Catch:{ all -> 0x02c2 }
            boolean r5 = r5.a()     // Catch:{ all -> 0x02c2 }
            if (r5 != 0) goto L_0x01ee
            com.google.android.gms.common.api.Status r5 = r4.b()     // Catch:{ all -> 0x02c2 }
            java.lang.String r5 = r5.g     // Catch:{ all -> 0x02c2 }
            com.google.android.gms.common.api.Status r4 = r4.b()     // Catch:{ all -> 0x02c2 }
            int r4 = r4.f     // Catch:{ all -> 0x02c2 }
            java.lang.String r9 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x02c2 }
            int r9 = r9.length()     // Catch:{ all -> 0x02c2 }
            int r9 = r9 + 46
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x02c2 }
            r10.<init>(r9)     // Catch:{ all -> 0x02c2 }
            java.lang.String r9 = "getDisplayName failed:"
            r10.append(r9)     // Catch:{ all -> 0x02c2 }
            r10.append(r5)     // Catch:{ all -> 0x02c2 }
            r10.append(r6)     // Catch:{ all -> 0x02c2 }
            r10.append(r4)     // Catch:{ all -> 0x02c2 }
            java.lang.String r4 = r10.toString()     // Catch:{ all -> 0x02c2 }
            android.util.Log.w(r7, r4)     // Catch:{ all -> 0x02c2 }
            r5 = r2
            goto L_0x023d
        L_0x01ee:
            bdd r4 = r4.c()     // Catch:{ all -> 0x02c2 }
            if (r4 == 0) goto L_0x0235
            int r5 = r4.b()     // Catch:{ all -> 0x02c2 }
            if (r5 > 0) goto L_0x01fb
            goto L_0x0235
        L_0x01fb:
            java.util.Iterator r5 = r4.iterator()     // Catch:{ all -> 0x02c2 }
        L_0x01ff:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x02c2 }
            if (r6 == 0) goto L_0x0232
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x02c2 }
            buz r6 = (defpackage.buz) r6     // Catch:{ all -> 0x02c2 }
            java.lang.String r7 = r6.a()     // Catch:{ all -> 0x02c2 }
            boolean r7 = android.text.TextUtils.equals(r7, r14)     // Catch:{ all -> 0x02c2 }
            if (r7 == 0) goto L_0x01ff
            java.lang.String r5 = r6.b()     // Catch:{ all -> 0x02c2 }
            java.lang.String r6 = "dispalyName:"
            java.lang.String r7 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x02c2 }
            int r9 = r7.length()     // Catch:{ all -> 0x02c2 }
            if (r9 == 0) goto L_0x0229
            r6.concat(r7)     // Catch:{ all -> 0x02c2 }
            goto L_0x022e
        L_0x0229:
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x02c2 }
            r7.<init>(r6)     // Catch:{ all -> 0x02c2 }
        L_0x022e:
            r4.a()     // Catch:{ all -> 0x02c2 }
            goto L_0x023d
        L_0x0232:
            r5 = r2
            goto L_0x023d
        L_0x0235:
            java.lang.String r4 = "getDisplayName failed:getOwners return null or no owner"
            android.util.Log.w(r7, r4)     // Catch:{ all -> 0x02c2 }
            r5 = r2
        L_0x023d:
            cyu r4 = new cyu     // Catch:{ all -> 0x02c2 }
            android.content.Context r6 = r15.getApplicationContext()     // Catch:{ all -> 0x02c2 }
            java.util.concurrent.ExecutorService r7 = defpackage.cys.a     // Catch:{ all -> 0x02c2 }
            dzl r7 = defpackage.dzo.a((java.util.concurrent.ExecutorService) r7)     // Catch:{ all -> 0x02c2 }
            cyi r9 = new cyi     // Catch:{ all -> 0x02c2 }
            r9.<init>(r6, r7)     // Catch:{ all -> 0x02c2 }
            cyd r6 = new cyd     // Catch:{ all -> 0x02c2 }
            r6.<init>(r9)     // Catch:{ all -> 0x02c2 }
            cyg r7 = new cyg     // Catch:{ all -> 0x02c2 }
            r7.<init>()     // Catch:{ all -> 0x02c2 }
            cyf r9 = new cyf     // Catch:{ all -> 0x02c2 }
            r9.<init>(r6, r7)     // Catch:{ all -> 0x02c2 }
            cyb r6 = new cyb     // Catch:{ all -> 0x02c2 }
            r6.<init>(r9)     // Catch:{ all -> 0x02c2 }
            r4.<init>(r6, r5, r14)     // Catch:{ all -> 0x02c2 }
            android.content.res.Resources r15 = r15.getResources()     // Catch:{ all -> 0x02c2 }
            int r15 = r15.getDimensionPixelSize(r8)     // Catch:{ all -> 0x02c2 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x02c2 }
            r5.<init>()     // Catch:{ all -> 0x02c2 }
            java.lang.String r6 = r4.b     // Catch:{ all -> 0x02c2 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x02c2 }
            if (r6 != 0) goto L_0x027f
            java.lang.String r6 = r4.b     // Catch:{ all -> 0x02c2 }
            r5.add(r6)     // Catch:{ all -> 0x02c2 }
        L_0x027f:
            java.lang.String r6 = r4.c     // Catch:{ all -> 0x02c2 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x02c2 }
            if (r6 != 0) goto L_0x028c
            java.lang.String r6 = r4.c     // Catch:{ all -> 0x02c2 }
            r5.add(r6)     // Catch:{ all -> 0x02c2 }
        L_0x028c:
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x02c2 }
            java.lang.Object[] r0 = r5.toArray(r0)     // Catch:{ all -> 0x02c2 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x02c2 }
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x02c2 }
            android.graphics.Bitmap r15 = android.graphics.Bitmap.createBitmap(r15, r15, r5)     // Catch:{ all -> 0x02c2 }
            cxz r5 = r4.a     // Catch:{ all -> 0x02c2 }
            java.lang.String r4 = r4.c     // Catch:{ all -> 0x02c2 }
            cxz r4 = r5.a((java.lang.String) r4)     // Catch:{ all -> 0x02c2 }
            cyx r5 = new cyx     // Catch:{ all -> 0x02c2 }
            r5.<init>(r0)     // Catch:{ all -> 0x02c2 }
            cxz r0 = r4.a((defpackage.cyc) r5)     // Catch:{ all -> 0x02c2 }
            r0.a((android.graphics.Bitmap) r15)     // Catch:{ all -> 0x02c2 }
            defpackage.fpg.a((android.os.ParcelFileDescriptor) r2)
            r1.a()
            r2 = r15
        L_0x02b6:
            java.lang.String r15 = "account_avatar"
            r13.putParcelable(r15, r2)
            java.lang.String r15 = "account_name"
            r13.putString(r15, r14)
            return r13
        L_0x02c2:
            r13 = move-exception
            r2 = r3
            goto L_0x02c7
        L_0x02c6:
            r13 = move-exception
        L_0x02c7:
            defpackage.fpg.a((android.os.ParcelFileDescriptor) r2)
            r1.a()
            goto L_0x02cf
        L_0x02ce:
            throw r13
        L_0x02cf:
            goto L_0x02ce
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.settings.intelligence.modules.contextualcards.impl.SettingsCardProvider.call(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }
}
