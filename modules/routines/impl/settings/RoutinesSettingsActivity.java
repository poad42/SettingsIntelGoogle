package com.google.android.settings.intelligence.modules.routines.impl.settings;

import android.app.ActionBar;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toolbar;
import com.google.android.settings.intelligence.R;
import com.google.android.settings.intelligence.modules.routines.impl.debug.FeedbackActivity;
import com.google.android.settings.intelligence.modules.routines.impl.debug.RoutinesDebugActivity;

/* compiled from: PG */
public class RoutinesSettingsActivity extends C0001if {
    public LinearLayout f;
    public Button g;
    public CheckBox h;
    public der i;
    public dhv j;
    public RecyclerView k;
    public dkd l;
    public djc m;
    private LocationManager n;

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_routines_settings);
        setActionBar((Toolbar) findViewById(R.id.routines_settings_toolbar));
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
        }
        this.h = (CheckBox) findViewById(R.id.enable_routine_inference);
        this.i = new der(this);
        this.f = (LinearLayout) findViewById(R.id.request_dnd_permission);
        this.g = (Button) findViewById(R.id.turn_on_dnd);
        this.j = new dhv(this);
        this.n = (LocationManager) getSystemService("location");
        if (!etn.l()) {
            findViewById(R.id.routine_inference_group).setVisibility(8);
        } else {
            this.h.setChecked(this.i.e());
            this.h.setOnClickListener(new djn(this));
            CheckBox checkBox = this.h;
            if (checkBox != null) {
                checkBox.post(new djx(checkBox));
            }
        }
        this.l = new dkd(new djm(this), new djs(this), getColor(R.color.preference_highlight_color));
        this.m = new djc(getApplicationContext());
        if (bundle == null && getIntent().getExtras() != null) {
            if (getIntent().hasExtra("rules.RtnEditActivity.EXTRA_SSID")) {
                a(getIntent());
            }
            if (getIntent().hasExtra("rules.SettingsActivity.EXTRA_HIGHLIGHT_KEY")) {
                a(getIntent().getLongExtra("rules.SettingsActivity.EXTRA_HIGHLIGHT_KEY", -1));
            }
        }
        yq yqVar = new yq();
        this.k = (RecyclerView) findViewById(R.id.routines_recycler_view);
        this.k.setLayoutManager(yqVar);
        this.k.setAdapter(this.l);
        ((dgz) nk.a((C0001if) this).a(dgz.class)).c().a(this, new djv(this));
        ((LinearLayout) findViewById(R.id.add_routine)).setOnClickListener(new dju(this));
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        String string;
        super.onActivityResult(i2, i3, intent);
        if (i2 == 100 && i3 == -1 && intent != null && intent.getExtras() != null && (string = intent.getExtras().getString("rules.RtnEditActivity.EXTRA_DND_NAME_REMOVED")) != null) {
            this.j.b(string);
        }
    }

    public final void onNewIntent(Intent intent) {
        if (intent.hasExtra("rules.RtnEditActivity.EXTRA_SSID")) {
            a(intent);
        }
        if (intent.hasExtra("rules.SettingsActivity.EXTRA_HIGHLIGHT_KEY")) {
            a(intent.getLongExtra("rules.SettingsActivity.EXTRA_HIGHLIGHT_KEY", -1));
        }
        super.onNewIntent(intent);
    }

    private final void a(Intent intent) {
        if (intent != null && intent.getExtras() != null) {
            Intent intent2 = new Intent(this, RoutineEditActivity.class);
            intent2.putExtras(intent.getExtras());
            intent2.setFlags(65536);
            startActivity(intent2);
        }
    }

    private final void a(long j2) {
        dkd dkd = this.l;
        dkd.c = j2;
        new Handler().postDelayed(new dkc(dkd), 1000);
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.l.b();
        boolean isLocationEnabled = this.n.isLocationEnabled();
        if (!isLocationEnabled) {
            findViewById(R.id.request_enable_location).setVisibility(0);
            findViewById(R.id.turn_on_location).setOnClickListener(new djw(this));
        } else {
            findViewById(R.id.request_enable_location).setVisibility(8);
        }
        a(isLocationEnabled);
    }

    public final void e() {
        this.f.setVisibility(8);
        a(true);
    }

    public final void a(boolean z) {
        if (!z || (this.j.a() && this.n.isLocationEnabled())) {
            this.k.getViewTreeObserver().addOnGlobalLayoutListener(new dka(this, z));
        }
    }

    public final void a(ViewGroup viewGroup, boolean z) {
        viewGroup.setEnabled(z);
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z);
            if ((childAt instanceof ImageView) && !z) {
                ((ImageView) childAt).getDrawable().mutate().setColorFilter(-3355444, PorterDuff.Mode.SRC_IN);
            }
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, z);
            }
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.dnd_activity_menu, menu);
        try {
            String str = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
            if (!TextUtils.isEmpty(str)) {
                if (str.endsWith(".debug") || str.endsWith(".fishfood")) {
                    menu.findItem(R.id.open_debug_activity).setVisible(true);
                    menu.findItem(R.id.send_feedback).setVisible(true);
                } else if (!str.endsWith(".dogfood") && !str.endsWith(".storeRelease")) {
                    str.endsWith(".platformRelease");
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
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
        super.onCreateOptionsMenu(menu);
        return true;
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
            intent.putExtra("FEEDBACK_SENDER_KEY", "RoutinesSettingsActivity");
            startActivity(intent);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }
}
