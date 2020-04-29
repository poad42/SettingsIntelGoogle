package com.google.android.settings.intelligence.modules.search;

import android.os.Bundle;
import com.google.android.settings.intelligence.R;

/* compiled from: PG */
public class SearchActivity extends C0001if {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String callingPackage = getCallingPackage();
        String valueOf = String.valueOf(getReferrer());
        String.valueOf(callingPackage).length();
        String.valueOf(valueOf).length();
        setContentView(R.layout.search_main);
        getWindow().setSoftInputMode(32);
        il d = d();
        if (d.a((int) R.id.main_content) == null) {
            dlh dlh = new dlh();
            Bundle bundle2 = new Bundle();
            bundle2.putString("query", getIntent().getStringExtra("query"));
            dlh.d(bundle2);
            jf a = d.a();
            a.a(R.id.main_content, dlh, (String) null, 1);
            a.a();
        }
    }

    public final boolean onNavigateUp() {
        finish();
        return true;
    }
}
