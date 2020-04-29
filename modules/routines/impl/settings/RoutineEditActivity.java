package com.google.android.settings.intelligence.modules.routines.impl.settings;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toolbar;
import com.google.android.settings.intelligence.R;
import com.google.android.settings.intelligence.modules.routines.impl.debug.FeedbackActivity;
import com.google.android.settings.intelligence.modules.routines.impl.debug.RoutinesDebugActivity;

/* compiled from: PG */
public class RoutineEditActivity extends C0001if {
    public djc f;
    public String g = null;
    public String h = null;
    public long i = -1;
    public int j = 2;
    public int k = -1;
    public int l = -1;
    public dfz m = null;
    public dfz n = null;
    public int o = -1;
    public int p = -1;
    public boolean q = true;
    public boolean r = true;
    private long s = -1;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_routine_edit);
        if (bundle == null) {
            Bundle extras = getIntent().getExtras();
            cze.a().a(cyw.class);
            long currentTimeMillis = System.currentTimeMillis();
            if (extras != null) {
                this.h = extras.getString("rules.RtnEditActivity.EXTRA_SSID", (String) null);
                this.g = this.h;
                int i2 = extras.getInt("rules.RtnEditActivity.EXTRA_ROUTINE_ACTION", -1);
                this.o = i2;
                this.p = i2;
                this.i = extras.getLong("rules.RtnEditActivity.EXTRA_TIMESTAMP_MS", -1);
                this.j = extras.getInt("rules.RtnEditActivity.EXTRA_SOURCE", 2);
                int i3 = extras.getInt("rules.RtnEditActivity.EXTRA_CONFIDENCE", -1);
                this.l = i3;
                this.k = i3;
                this.s = extras.getLong("rules.RtnEditActivity.EXTRA_ROUTINE_ENTITY_KEY", -1);
                boolean z = extras.getBoolean("rules.RtnEditActivity.EXTRA_FYI", true);
                this.r = z;
                this.q = z;
                this.m = null;
                if (extras.containsKey("rules.RtnEditActivity.EXTRA_LOCATION_METADATA")) {
                    this.n = dgw.a(extras.getByteArray("rules.RtnEditActivity.EXTRA_LOCATION_METADATA"));
                } else {
                    this.n = null;
                }
            }
            if (this.j == 1) {
                int i4 = this.o;
                int i5 = this.l;
                long currentTimeMillis2 = System.currentTimeMillis();
                long j2 = this.i;
                long currentTimeMillis3 = System.currentTimeMillis();
                epb g2 = anr.f.g();
                g2.u(3);
                g2.s(i5);
                g2.t(i4);
                g2.b(currentTimeMillis2 - j2);
                ((czj) cze.a().a(czj.class)).a((anr) ((eoy) g2.f()), currentTimeMillis3 - currentTimeMillis);
            }
        } else {
            this.s = bundle.getLong("rules.RtnEditActivity.STATE_ROUTINE_ENTITY_KEY");
            this.g = bundle.getString("rules.RtnEditActivity.STATE_ORIGINAL_SSID");
            this.h = bundle.getString("rules.RtnEditActivity.STATE_SSID");
            this.i = bundle.getLong("rules.RtnEditActivity.STATE_TIMESTAMP_MS");
            this.j = bundle.getInt("rules.RtnEditActivity.STATE_ROUTINE_SOURCE");
            this.k = bundle.getInt("rules.RtnEditActivity.STATE_ORIGINAL_CONFIDENCE");
            this.l = bundle.getInt("rules.RtnEditActivity.STATE_CONFIDENCE");
            this.m = dgw.a(bundle.getByteArray("rules.RtnEditActivity.STATE_LOCATION_METADATA"));
            this.n = dgw.a(bundle.getByteArray("rules.RtnEditActivity.STATE_ORIGINAL_LOCATION_METADATA"));
            this.o = bundle.getInt("rules.RtnEditActivity.STATE_ROUTINE_ACTION");
            this.p = bundle.getInt("rules.RtnEditActivity.STATE_ORIGINAL_ROUTINE_ACTION");
            this.r = bundle.getBoolean("rules.RtnEditActivity.STATE_FYI");
            this.q = bundle.getBoolean("rules.RtnEditActivity.STATE_ORIGINAL_FYI");
        }
        setActionBar((Toolbar) findViewById(R.id.routines_settings_toolbar));
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
        }
        Button button = (Button) findViewById(R.id.rule_save);
        if (!h()) {
            if (actionBar != null) {
                actionBar.setTitle(getString(R.string.edit_rule_title));
            }
            button.setText(getString(R.string.save_button_save));
        } else {
            if (actionBar != null) {
                actionBar.setTitle(getString(R.string.add_rule_title));
            }
            button.setText(getString(R.string.save_button_add));
        }
        this.f = new djc(getApplicationContext());
        ((LinearLayout) findViewById(R.id.rule)).setOnClickListener(new dje(this));
        findViewById(R.id.rule_cancel).setOnClickListener(new djd(this));
        findViewById(R.id.rule_save).setOnClickListener(new djg(this));
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_actions);
        int i6 = this.o;
        if (i6 == 0) {
            ((RadioButton) radioGroup.findViewById(R.id.radio_silent)).setChecked(true);
        } else if (i6 == 1) {
            ((RadioButton) radioGroup.findViewById(R.id.radio_vibrate)).setChecked(true);
        } else if (i6 == 2) {
            ((RadioButton) radioGroup.findViewById(R.id.radio_normal)).setChecked(true);
        } else if (i6 == 3) {
            ((RadioButton) radioGroup.findViewById(R.id.radio_dnd)).setChecked(true);
        }
        CheckBox checkBox = (CheckBox) findViewById(R.id.should_notify);
        checkBox.setChecked(this.r);
        radioGroup.setOnCheckedChangeListener(new djf(this, checkBox));
        checkBox.setOnCheckedChangeListener(new dji(this));
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        e();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putLong("rules.RtnEditActivity.STATE_ROUTINE_ENTITY_KEY", this.s);
        bundle.putString("rules.RtnEditActivity.STATE_ORIGINAL_SSID", this.g);
        bundle.putString("rules.RtnEditActivity.STATE_SSID", this.h);
        bundle.putLong("rules.RtnEditActivity.STATE_TIMESTAMP_MS", this.i);
        bundle.putInt("rules.RtnEditActivity.STATE_ROUTINE_SOURCE", this.j);
        bundle.putInt("rules.RtnEditActivity.STATE_ORIGINAL_CONFIDENCE", this.k);
        bundle.putInt("rules.RtnEditActivity.STATE_CONFIDENCE", this.l);
        bundle.putByteArray("rules.RtnEditActivity.STATE_LOCATION_METADATA", dgw.a(this.m));
        bundle.putByteArray("rules.RtnEditActivity.STATE_ORIGINAL_LOCATION_METADATA", dgw.a(this.n));
        bundle.putInt("rules.RtnEditActivity.STATE_ROUTINE_ACTION", this.o);
        bundle.putInt("rules.RtnEditActivity.STATE_ORIGINAL_ROUTINE_ACTION", this.p);
        bundle.putBoolean("rules.RtnEditActivity.STATE_FYI", this.r);
        bundle.putBoolean("rules.RtnEditActivity.STATE_ORIGINAL_FYI", this.q);
        super.onSaveInstanceState(bundle);
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.dnd_activity_menu, menu);
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(16842806, typedValue, true);
        int color = obtainStyledAttributes(typedValue.data, new int[]{16842806}).getColor(0, -1);
        for (int i2 = 0; i2 < menu.size(); i2++) {
            Drawable icon = menu.getItem(i2).getIcon();
            if (icon != null) {
                icon.mutate();
                icon.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
            }
        }
        return true;
    }

    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    public final void onBackPressed() {
        String str;
        if (!l()) {
            super.onBackPressed();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if (h()) {
            str = getString(R.string.discard_confirmation_add);
        } else {
            str = getString(R.string.discard_confirmation_edit);
        }
        AlertDialog create = builder.setTitle(str).setCancelable(true).setPositiveButton(getString(R.string.discard_button), new djj(this)).setNegativeButton(getString(17039360), djl.a).create();
        if (create.getWindow() != null) {
            create.getWindow().setBackgroundDrawable(getDrawable(R.drawable.rounded_border));
        }
        create.show();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.open_debug_activity) {
            startActivity(new Intent(this, RoutinesDebugActivity.class));
        } else if (menuItem.getItemId() == R.id.action_search) {
            startActivityForResult(new Intent("android.settings.APP_SEARCH_SETTINGS"), 0);
        } else if (menuItem.getItemId() == R.id.action_help) {
            czg.a(this, "pixel_rules");
        } else if (menuItem.getItemId() == R.id.send_feedback) {
            Intent intent = new Intent(this, FeedbackActivity.class);
            intent.putExtra("FEEDBACK_SENDER_KEY", "RoutineEditActivity");
            startActivity(intent);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void e() {
        TextView textView = (TextView) findViewById(R.id.rule_description);
        View findViewById = findViewById(R.id.rule_icon_add);
        View findViewById2 = findViewById(R.id.rule_icon_wifi);
        View findViewById3 = findViewById(R.id.rule_icon_location);
        TextView textView2 = (TextView) findViewById(R.id.rule_text);
        if (this.h != null) {
            textView.setText(R.string.edit_rule_activity_header_wifi);
            textView.setVisibility(0);
            findViewById.setVisibility(8);
            findViewById2.setVisibility(0);
            findViewById3.setVisibility(8);
            textView2.setText(dkr.a(this.h));
        } else if (this.m != null) {
            textView.setText(R.string.edit_rule_activity_header_location);
            textView.setVisibility(0);
            findViewById.setVisibility(8);
            findViewById2.setVisibility(8);
            findViewById3.setVisibility(0);
            textView2.setText(dkr.a((Context) this, this.m));
        } else if (this.n != null) {
            textView.setText(R.string.edit_rule_activity_header_location);
            textView.setVisibility(0);
            findViewById.setVisibility(8);
            findViewById2.setVisibility(8);
            findViewById3.setVisibility(0);
            textView2.setText(this.n.g);
        } else {
            textView.setVisibility(8);
            findViewById.setVisibility(0);
            findViewById2.setVisibility(8);
            findViewById3.setVisibility(8);
            if (!etn.j()) {
                textView2.setText(R.string.edit_rule_activity_add_only_wifi);
            } else {
                textView2.setText(R.string.edit_rule_activity_add);
            }
        }
        View findViewById4 = findViewById(R.id.rule_save);
        if ((this.h == null && this.m == null && this.n == null) || this.o == -1 || !l()) {
            findViewById4.setEnabled(false);
        } else {
            findViewById4.setEnabled(true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (defpackage.la.a((android.content.Context) r6, "android.permission.INTERNET") == 0) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r6 = this;
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r1 = defpackage.cpz.a()     // Catch:{ Exception -> 0x0046 }
            if (r1 != 0) goto L_0x0012
            r1 = 2131886262(0x7f1200b6, float:1.9407098E38)
            java.lang.String r1 = r6.getString(r1)     // Catch:{ Exception -> 0x0046 }
            defpackage.cpz.a((android.content.Context) r6, (java.lang.String) r1)     // Catch:{ Exception -> 0x0046 }
        L_0x0012:
            int r1 = defpackage.la.a((android.content.Context) r6, (java.lang.String) r0)     // Catch:{ Exception -> 0x0046 }
            r2 = 1
            java.lang.String r3 = "android.permission.INTERNET"
            java.lang.String r4 = "android.permission.ACCESS_WIFI_STATE"
            if (r1 != 0) goto L_0x002a
            int r1 = defpackage.la.a((android.content.Context) r6, (java.lang.String) r4)     // Catch:{ Exception -> 0x0046 }
            if (r1 != 0) goto L_0x002a
            int r1 = defpackage.la.a((android.content.Context) r6, (java.lang.String) r3)     // Catch:{ Exception -> 0x0046 }
            if (r1 == 0) goto L_0x003b
        L_0x002a:
            r1 = 3
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ Exception -> 0x0046 }
            r5 = 0
            r1[r5] = r0     // Catch:{ Exception -> 0x0046 }
            r1[r2] = r4     // Catch:{ Exception -> 0x0046 }
            r0 = 2
            r1[r0] = r3     // Catch:{ Exception -> 0x0046 }
            r6.c_()     // Catch:{ Exception -> 0x0046 }
            r6.requestPermissions(r1, r5)     // Catch:{ Exception -> 0x0046 }
        L_0x003b:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0046 }
            java.lang.Class<com.google.android.libraries.location.placepicker.PlacePickerActivity> r1 = com.google.android.libraries.location.placepicker.PlacePickerActivity.class
            r0.<init>(r6, r1)     // Catch:{ Exception -> 0x0046 }
            r6.startActivityForResult(r0, r2)     // Catch:{ Exception -> 0x0046 }
            return
        L_0x0046:
            r0 = move-exception
            java.lang.String r1 = "rules.RtnEditActivity"
            java.lang.String r2 = "Failed to launch PlacePicker activity."
            android.util.Log.e(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.settings.intelligence.modules.routines.impl.settings.RoutineEditActivity.f():void");
    }

    public final void g() {
        Intent intent = new Intent(getApplicationContext(), ChooseWifiActivity.class);
        intent.putExtra("rules.ChsWifiActivity.EXTRA_ORIGINAL_SSID", this.g);
        intent.putExtra("rules.ChsWifiActivity.EXTRA_CURRENT_CHOSEN_SSID", this.h);
        startActivityForResult(intent, 2);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 1) {
            if (i3 == -1) {
                cue a = ccd.a(intent);
                String a2 = a.a() == null ? "" : a.a();
                String valueOf = String.valueOf(a2);
                if (valueOf.length() != 0) {
                    "Place selected: ".concat(valueOf);
                } else {
                    new String("Place selected: ");
                }
                epb g2 = dfz.i.g();
                String d = a.d();
                g2.b();
                dfz dfz = (dfz) g2.a;
                if (d != null) {
                    dfz.a = 2 | dfz.a;
                    dfz.c = d;
                    String f2 = a.f();
                    g2.b();
                    dfz dfz2 = (dfz) g2.a;
                    if (f2 != null) {
                        dfz2.a |= 32;
                        dfz2.g = f2;
                        g2.b();
                        dfz dfz3 = (dfz) g2.a;
                        if (a2 != null) {
                            dfz3.a |= 4;
                            dfz3.d = a2;
                            int intExtra = intent.getIntExtra("radius", 0);
                            g2.b();
                            dfz dfz4 = (dfz) g2.a;
                            dfz4.a |= 64;
                            dfz4.h = intExtra;
                            if (a.e() != null) {
                                double d2 = a.e().a;
                                g2.b();
                                dfz dfz5 = (dfz) g2.a;
                                dfz5.a |= 8;
                                dfz5.e = d2;
                                double d3 = a.e().b;
                                g2.b();
                                dfz dfz6 = (dfz) g2.a;
                                dfz6.a |= 16;
                                dfz6.f = d3;
                            }
                            dfz dfz7 = (dfz) ((eoy) g2.f());
                            if (dfz7 != null && !dfz7.equals(this.m)) {
                                this.m = dfz7;
                                this.h = null;
                                e();
                            }
                        } else {
                            throw new NullPointerException();
                        }
                    } else {
                        throw new NullPointerException();
                    }
                } else {
                    throw new NullPointerException();
                }
            }
        } else if (i2 == 2 && i3 == -1) {
            String stringExtra = intent.getStringExtra("rules.ChsWifiActivity.RESULT_SSID");
            String valueOf2 = String.valueOf(stringExtra);
            if (valueOf2.length() != 0) {
                "Wifi selected: ".concat(valueOf2);
            } else {
                new String("Wifi selected: ");
            }
            if (stringExtra != null && !TextUtils.equals(stringExtra, this.h)) {
                this.h = stringExtra;
                this.m = null;
                e();
            }
        }
        super.onActivityResult(i2, i3, intent);
    }

    public final boolean h() {
        return this.s == -1;
    }

    public final boolean j() {
        String str = this.h;
        if (str == null || str.equals(this.g)) {
            dfz dfz = this.m;
            dfz dfz2 = this.n;
            if (dfz == null) {
                return false;
            }
            if (dfz2 != null) {
                epb epb = (epb) dfz.b(5);
                epb.a((eoy) dfz);
                epb.j(dfz2.b);
                dfz dfz3 = (dfz) ((eoy) epb.f());
                boolean equals = dfz3.equals(dfz2);
                epb epb2 = (epb) dfz3.b(5);
                epb2.a((eoy) dfz3);
                epb2.b();
                dfz dfz4 = (dfz) epb2.a;
                dfz4.a &= -2;
                dfz4.b = dfz.i.b;
                epb2.f();
                if (!equals) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public final boolean k() {
        return this.p != this.o;
    }

    private final boolean l() {
        if (j() || k() || this.q != this.r || this.j == 1) {
            return true;
        }
        return false;
    }
}
