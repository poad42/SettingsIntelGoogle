package com.google.android.settings.intelligence.modules.support.impl;

import android.accounts.Account;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.SparseArray;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
public class HelpActivity extends Activity {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        SparseArray sparseArray;
        dpv dpv;
        String str;
        String str2;
        super.onCreate(bundle);
        ComponentName callingActivity = getCallingActivity();
        if (callingActivity != null && TextUtils.equals(callingActivity.getPackageName(), "com.android.settings")) {
            Intent intent = getIntent();
            Account account = (Account) intent.getParcelableExtra("account");
            String stringExtra = intent.getStringExtra("isYoungDevice");
            boolean booleanExtra = intent.getBooleanExtra("sendPackageName", false);
            bkq bkq = new bkq(this);
            Context applicationContext = getApplicationContext();
            Uri parse = Uri.parse("https://support.google.com/");
            new dpt();
            dpw dpw = new dpw(applicationContext);
            dqa dqa = new dqa(applicationContext);
            String str3 = null;
            if (TextUtils.isEmpty((CharSequence) null)) {
                Map map = dpw.a;
                String language = Locale.getDefault().getLanguage();
                String str4 = dpw.b;
                StringBuilder sb = new StringBuilder(String.valueOf(language).length() + 1 + String.valueOf(str4).length());
                sb.append(language);
                sb.append("_");
                sb.append(str4);
                sparseArray = (SparseArray) map.get(sb.toString());
                if (sparseArray == null) {
                    sparseArray = (SparseArray) dpw.a.get(dpw.b);
                }
            } else {
                sparseArray = (SparseArray) dpw.a.get((Object) null);
            }
            if (sparseArray != null) {
                dpv = (dpv) sparseArray.get(2);
            } else {
                dpv = null;
            }
            if (dpv != null) {
                str = dpv.a;
            } else {
                str = null;
            }
            dpy a = dqa.a(str, true);
            if (a != null) {
                str2 = a.a;
            } else {
                str2 = null;
            }
            dpy a2 = dqa.a(str, false);
            if (a2 != null) {
                str3 = a2.a;
            }
            TypedArray obtainStyledAttributes = applicationContext.obtainStyledAttributes(new int[]{16843829});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            bjs bjs = new bjs();
            bjs.a = 0;
            bjs.b = color;
            GoogleHelp a3 = GoogleHelp.a("android_home");
            a3.d = parse;
            a3.a = account;
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("noe_device_under_thirty", stringExtra);
            if (booleanExtra) {
                arrayMap.put("genie-eng:app_pkg_name", getPackageName());
            }
            a3.b = new Bundle();
            for (Map.Entry entry : arrayMap.entrySet()) {
                a3.b.putString((String) entry.getKey(), (String) entry.getValue());
            }
            a3.n = new dpu(this, stringExtra, booleanExtra);
            a3.e = bjs;
            a3.l = true;
            a(a3, str2);
            a(a3, str3);
            bkq.a(a3.a());
        }
        finish();
    }

    private static void a(GoogleHelp googleHelp, String str) {
        if (!TextUtils.isEmpty(str)) {
            Locale locale = Locale.getDefault();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            PhoneNumberUtils.formatNumber(spannableStringBuilder, PhoneNumberUtils.getFormatTypeForLocale(locale));
            googleHelp.c.add(spannableStringBuilder.toString());
        }
    }
}
