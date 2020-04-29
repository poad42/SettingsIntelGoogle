package com.google.android.settings.intelligence.modules.routines.impl.debug;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toolbar;
import com.google.android.settings.intelligence.R;
import com.google.android.settings.intelligence.modules.routines.impl.RoutinesJobIntentService;
import com.google.android.settings.intelligence.modules.routines.impl.settings.RoutinesSettingsActivity;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class RoutinesDebugActivity extends C0001if {
    public final List f = new ArrayList();
    public final List g = new ArrayList();
    public final List h = new ArrayList();

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_routines_debug);
        setTitle(getString(R.string.debug_app_title));
        setActionBar((Toolbar) findViewById(R.id.routines_settings_toolbar));
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
        }
        ((dgz) nk.a((C0001if) this).a(dgz.class)).b().a(this, new dhj(this));
        ((dfw) nk.a((C0001if) this).a(dfw.class)).b().a(this, new dhl(this));
        ((dfw) nk.a((C0001if) this).a(dfw.class)).c().a(this, new dhn(this));
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.debug_activity_menu, menu);
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.open_routines_activity) {
            startActivity(new Intent(this, RoutinesSettingsActivity.class));
        } else if (menuItem.getItemId() == R.id.prime_demo) {
            String a = dkr.a((Context) this);
            if (a != null && !a.isEmpty() && !a.equals("<unknown ssid>")) {
                Context applicationContext = getApplicationContext();
                Intent intent = new Intent();
                intent.setAction("com.google.android.settings.intelligence.modules.routines.impl.action.PRIME_DEMO");
                intent.putExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.WIFI_SSID", a);
                RoutinesJobIntentService.a(applicationContext, RoutinesJobIntentService.class, intent);
            } else {
                Log.e("rules.RtnsDbgActivity", "Cannot prime demo for unknown state.");
            }
        } else if (menuItem.getItemId() == R.id.populate_db_demo) {
            String a2 = dkr.a((Context) this);
            if (a2 != null && !a2.isEmpty() && !a2.equals("<unknown ssid>")) {
                cze.a().a(dkp.class);
                Context applicationContext2 = getApplicationContext();
                int a3 = dkp.a(this);
                Intent intent2 = new Intent();
                intent2.setAction("com.google.android.settings.intelligence.modules.routines.impl.action.POPULATE_STATE_DB_DEMO");
                intent2.putExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.WIFI_SSID", a2);
                intent2.putExtra("com.google.android.settings.intelligence.modules.routines.impl.extra.RINGER_MODE", a3);
                RoutinesJobIntentService.a(applicationContext2, RoutinesJobIntentService.class, intent2);
            } else {
                Log.e("rules.RtnsDbgActivity", "Cannot populate for unknown state.");
            }
        } else if (menuItem.getItemId() == R.id.delete_state_db) {
            new AlertDialog.Builder(this).setTitle(getString(R.string.delete_state_db)).setCancelable(false).setPositiveButton(17039370, new dhm(this)).setNegativeButton(getString(17039360), dhp.a).create().show();
        } else if (menuItem.getItemId() == R.id.delete_routine_db) {
            new AlertDialog.Builder(this).setTitle(getString(R.string.delete_routine_db)).setCancelable(false).setPositiveButton(17039370, new dho(this)).setNegativeButton(getString(17039360), dhr.a).create().show();
        } else if (menuItem.getItemId() == R.id.download_db) {
            new AlertDialog.Builder(this).setTitle("Download the DB").setMessage("Downloads the database into a file for sharing. Contains WiFi events, ringer events and routine interactions. Only share with trusted parties.").setCancelable(true).setPositiveButton(17039370, new dhq(this)).setNegativeButton(getString(17039360), dht.a).create().show();
        } else if (menuItem.getItemId() == R.id.infer) {
            new AlertDialog.Builder(this).setTitle(getString(R.string.infer)).setCancelable(false).setPositiveButton(17039370, new dhs(this)).setNegativeButton(getString(17039360), dhk.a).create().show();
        } else if (menuItem.getItemId() == R.id.silence) {
            Intent intent3 = new Intent("com.google.android.settings.routines.RoutinesActionBroadcastReceiver.RINGER_MODE_SILENCE_ACTION");
            intent3.setPackage("com.android.settings");
            sendBroadcast(intent3, "com.google.android.settings.routines.ROUTINES_ACTIONS");
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    public final void e() {
        ((TextView) findViewById(R.id.text_view)).setText(dkr.a(this.f, this.h, this.g, false));
    }
}
