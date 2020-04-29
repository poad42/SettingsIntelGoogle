package com.google.android.settings.intelligence.modules.suggestions;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
public class NightlightTrampolineActivity extends Activity {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundle2 = new Bundle();
        bundle2.putString(":settings:fragment_args_key", "night_display_auto_mode");
        startActivity(new Intent("android.settings.NIGHT_DISPLAY_SETTINGS").setPackage("com.android.settings").putExtra(":settings:show_fragment_args", bundle2));
        finish();
    }
}
