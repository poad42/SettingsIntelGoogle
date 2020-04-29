package com.google.android.settings.intelligence.modules.smartringer.impl;

import android.os.Bundle;
import android.widget.Toolbar;
import com.google.android.settings.intelligence.R;

/* compiled from: PG */
public class SmartRingerSettingsActivity extends C0001if {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.smartringer_settings);
        setActionBar((Toolbar) findViewById(R.id.smartringer_settings_toolbar));
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setDisplayShowHomeEnabled(true);
        d().a().a((int) R.id.content, (ic) new dpr()).a();
    }

    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }
}
