package com.google.android.settings.intelligence.libs.radiopreference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.CheckBoxPreference;
import com.google.android.settings.intelligence.R;

/* compiled from: PG */
public class RadioButtonPreference extends CheckBoxPreference {
    public czl c;
    private View d;
    private int e;

    public RadioButtonPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = null;
        this.e = -1;
        this.A = R.layout.preference_widget_radiobutton;
        this.z = R.layout.preference_radio;
        l();
    }

    public RadioButtonPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = null;
        this.e = -1;
        this.A = R.layout.preference_widget_radiobutton;
        this.z = R.layout.preference_radio;
        l();
    }

    public RadioButtonPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void a() {
        czl czl = this.c;
        if (czl != null) {
            czl.a(this);
        }
    }

    public final void a(afp afp) {
        int i;
        int i2;
        super.a(afp);
        View c2 = afp.c(R.id.summary_container);
        if (c2 != null) {
            if (!TextUtils.isEmpty(f())) {
                i = 0;
            } else {
                i = 8;
            }
            c2.setVisibility(i);
            this.d = afp.c(R.id.appendix);
            View view = this.d;
            if (!(view == null || (i2 = this.e) == -1)) {
                view.setVisibility(i2);
            }
        }
        TextView textView = (TextView) afp.c(16908310);
        if (textView != null) {
            textView.setSingleLine(false);
            textView.setMaxLines(3);
        }
    }
}
