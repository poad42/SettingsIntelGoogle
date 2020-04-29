package com.google.android.settings.intelligence.modules.routines.impl.settings;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toolbar;
import com.google.android.settings.intelligence.R;

/* compiled from: PG */
public class ChooseWifiActivity extends C0001if {
    public diq f;
    public String g = null;
    public String h = null;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_choose_wifi);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.g = extras.getString("rules.ChsWifiActivity.EXTRA_CURRENT_CHOSEN_SSID");
            this.h = extras.getString("rules.ChsWifiActivity.EXTRA_ORIGINAL_SSID");
        }
        setActionBar((Toolbar) findViewById(R.id.routines_settings_toolbar));
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
        }
        ((dgz) nk.a((C0001if) this).a(dgz.class)).c().a(this, new dil(this));
        this.f = new diq(new din(this));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.wifi_recycler_view);
        recyclerView.setLayoutManager(new yq());
        recyclerView.setAdapter(this.f);
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.dnd_activity_menu, menu);
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(16842806, typedValue, true);
        int color = obtainStyledAttributes(typedValue.data, new int[]{16842806}).getColor(0, -1);
        for (int i = 0; i < menu.size(); i++) {
            Drawable icon = menu.getItem(i).getIcon();
            if (icon != null) {
                icon.mutate();
                icon.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
            }
        }
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_search) {
            startActivityForResult(new Intent("android.settings.APP_SEARCH_SETTINGS"), 0);
        } else if (menuItem.getItemId() == R.id.action_help) {
            czg.a(this, "pixel_rules");
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    public final void a(String str) {
        findViewById(R.id.choose_wifi_no_available).setVisibility(0);
        findViewById(R.id.wifi_recycler_view).setVisibility(8);
        ((TextView) findViewById(R.id.choose_wifi_no_available_text)).setText(str);
    }
}
