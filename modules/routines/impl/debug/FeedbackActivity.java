package com.google.android.settings.intelligence.modules.routines.impl.debug;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.settings.intelligence.R;
import java.util.List;

/* compiled from: PG */
public class FeedbackActivity extends C0001if {
    public List f = null;
    public List g = null;
    public List h = null;
    public String i = "";

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_feedback);
        this.i = getIntent().getStringExtra("FEEDBACK_SENDER_KEY");
        ((dgz) nk.a((C0001if) this).a(dgz.class)).b().a(this, new dhe(this));
        ((dfw) nk.a((C0001if) this).a(dfw.class)).b().a(this, new dhd(this));
        ((dfw) nk.a((C0001if) this).a(dfw.class)).c().a(this, new dhg(this));
    }

    public final void e() {
        if (this.f != null && this.g != null && this.h != null) {
            new AlertDialog.Builder(this).setTitle("Internal Feedback Type").setMessage("Feedback can be sent with or without data. With data means the pixel-settings-routines@google.com team will be sent a snapshot of your database which contains information about your routines, wifi and ringer state history.").setPositiveButton("Feedback with data", new dhf(this)).setNegativeButton("Feedback without data", new dhi(this)).setNeutralButton(getString(17039360), new dhh(this)).setCancelable(false).create().show();
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        finish();
    }

    public static String a(Context context, String str, String str2) {
        String str3;
        String str4;
        try {
            str3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            str3 = "Unknown";
        }
        String string = context.getString(R.string.routine_feedback_email);
        String encode = Uri.encode(context.getString(R.string.feedback_default_subject));
        String encode2 = Uri.encode("<Put your feedback here>");
        if (str2.isEmpty()) {
            str4 = "";
        } else {
            String encode3 = Uri.encode("DatabaseDump (remove if you do not want this to be included):");
            String encode4 = Uri.encode(str2);
            StringBuilder sb = new StringBuilder(String.valueOf(encode3).length() + 6 + String.valueOf(encode4).length());
            sb.append(encode3);
            sb.append("%0D%0A");
            sb.append(encode4);
            str4 = sb.toString();
        }
        int length = String.valueOf(string).length();
        int length2 = String.valueOf(encode).length();
        int length3 = String.valueOf(encode2).length();
        int length4 = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 109 + length2 + length3 + length4 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb2.append("mailto:");
        sb2.append(string);
        sb2.append("?subject=");
        sb2.append(encode);
        sb2.append("&body=Feedback:%0D%0A");
        sb2.append(encode2);
        sb2.append("%0D%0A%0D%0AFeedbackFrom:%0D%0A");
        sb2.append(str);
        sb2.append("%0D%0A%0D%0AAppVersion:%0D%0A");
        sb2.append(str3);
        sb2.append("%0D%0A%0D%0A");
        sb2.append(str4);
        return sb2.toString();
    }
}
