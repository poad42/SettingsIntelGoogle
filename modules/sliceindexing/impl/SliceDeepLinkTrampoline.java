package com.google.android.settings.intelligence.modules.sliceindexing.impl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
public class SliceDeepLinkTrampoline extends Activity {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity(new Intent("android.intent.action.VIEW").setPackage("com.android.settings").setData(getIntent().getData()));
        finish();
    }
}
