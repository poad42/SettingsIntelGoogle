package com.google.android.settings.intelligence;

import android.app.Application;
import android.content.Context;
import android.os.Build;

/* compiled from: PG */
public class IntelligenceApplication extends Application {
    public final void onCreate() {
        super.onCreate();
        synchronized (bmf.a) {
            bmf.b = true;
        }
        if (cob.a || "robolectric".equals(Build.FINGERPRINT)) {
            cze a = cze.a();
            a.a(cyw.class, new cyw());
            a.a(czj.class, new czj(this));
            a.a(cyt.class, new cyt());
            a.a(dld.class, new dlc());
            a.a(daa.class, new daa());
            a.a(czc.class, new czb());
            dqy b = ddo.b();
            if (b.a()) {
                a.a(ddp.class, (czd) b.b());
            }
            dqy b2 = dpo.b();
            if (b2.a()) {
                a.a(dpl.class, (czd) b2.b());
            }
            dqy b3 = dpc.b();
            if (b3.a()) {
                a.a(dpa.class, (czd) b3.b());
            }
            dqy b4 = dao.b();
            if (b4.a()) {
                a.a(dap.class, (czd) b4.b());
            }
            dqy b5 = dox.b();
            if (b5.a()) {
                a.a(dov.class, (czd) b5.b());
            }
            czc czc = (czc) cze.a().a(czc.class);
            czc.a((bxe) new dns(this));
            czc.a((bxe) new ddr(this));
            czc.a((bxe) new dpn(this));
            czc.a((bxe) new daq(this));
            czc.a((Context) this);
            dqy b6 = ddk.b();
            if (b6.a()) {
                ((ddl) b6.b()).a(this);
            }
            dqy b7 = ddi.b();
            if (b7.a()) {
                ((ddh) b7.b()).a(this);
            }
            ddp ddp = (ddp) cze.a().a(ddp.class);
            if (ddp != null) {
                ddp.a(this);
            }
            dpl dpl = (dpl) cze.a().a(dpl.class);
            if (dpl != null) {
                dpl.a(this);
            }
            dov dov = (dov) cze.a().a(dov.class);
            if (dov != null) {
                dov.a((Context) this);
            }
        }
    }
}
