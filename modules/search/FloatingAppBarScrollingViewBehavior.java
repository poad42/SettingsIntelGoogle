package com.google.android.settings.intelligence.modules.search;

import android.content.Context;
import android.support.design.appbar.AppBarLayout;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
public class FloatingAppBarScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
    private boolean d;

    public FloatingAppBarScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        return true;
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean a = super.a(coordinatorLayout, view, view2);
        if (!this.d && (view2 instanceof AppBarLayout)) {
            this.d = true;
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            appBarLayout.setBackgroundColor(0);
            dn.a(appBarLayout, 0.0f);
        }
        return a;
    }
}
