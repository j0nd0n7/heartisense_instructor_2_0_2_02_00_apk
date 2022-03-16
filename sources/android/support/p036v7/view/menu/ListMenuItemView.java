package android.support.p036v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0011ag;
import android.support.p010v4.view.C1040ar;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.view.menu.C1569q;
import android.support.p036v7.widget.C1807bp;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.view.menu.ListMenuItemView */
public class ListMenuItemView extends LinearLayout implements C1569q.C1570a {

    /* renamed from: a */
    private static final String f4839a = "ListMenuItemView";

    /* renamed from: b */
    private C1555k f4840b;

    /* renamed from: c */
    private ImageView f4841c;

    /* renamed from: d */
    private RadioButton f4842d;

    /* renamed from: e */
    private TextView f4843e;

    /* renamed from: f */
    private CheckBox f4844f;

    /* renamed from: g */
    private TextView f4845g;

    /* renamed from: h */
    private ImageView f4846h;

    /* renamed from: i */
    private Drawable f4847i;

    /* renamed from: j */
    private int f4848j;

    /* renamed from: k */
    private Context f4849k;

    /* renamed from: l */
    private boolean f4850l;

    /* renamed from: m */
    private Drawable f4851m;

    /* renamed from: n */
    private int f4852n;

    /* renamed from: o */
    private LayoutInflater f4853o;

    /* renamed from: p */
    private boolean f4854p;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1359b.C1361b.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C1807bp a = C1807bp.m10923a(getContext(), attributeSet, C1359b.C1371l.MenuView, i, 0);
        this.f4847i = a.mo7293a(C1359b.C1371l.MenuView_android_itemBackground);
        this.f4848j = a.mo7312g(C1359b.C1371l.MenuView_android_itemTextAppearance, -1);
        this.f4850l = a.mo7295a(C1359b.C1371l.MenuView_preserveIconSpacing, false);
        this.f4849k = context;
        this.f4851m = a.mo7293a(C1359b.C1371l.MenuView_subMenuArrow);
        a.mo7308e();
    }

    /* renamed from: b */
    private void m8968b() {
        this.f4841c = (ImageView) getInflater().inflate(C1359b.C1368i.abc_list_menu_item_icon, this, false);
        addView(this.f4841c, 0);
    }

    /* renamed from: d */
    private void m8969d() {
        this.f4842d = (RadioButton) getInflater().inflate(C1359b.C1368i.abc_list_menu_item_radio, this, false);
        addView(this.f4842d);
    }

    /* renamed from: e */
    private void m8970e() {
        this.f4844f = (CheckBox) getInflater().inflate(C1359b.C1368i.abc_list_menu_item_checkbox, this, false);
        addView(this.f4844f);
    }

    private LayoutInflater getInflater() {
        if (this.f4853o == null) {
            this.f4853o = LayoutInflater.from(getContext());
        }
        return this.f4853o;
    }

    private void setSubMenuArrowVisible(boolean z) {
        if (this.f4846h != null) {
            this.f4846h.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public void mo5184a(C1555k kVar, int i) {
        this.f4840b = kVar;
        this.f4852n = i;
        setVisibility(kVar.isVisible() ? 0 : 8);
        setTitle(kVar.mo5415a((C1569q.C1570a) this));
        setCheckable(kVar.isCheckable());
        mo5185a(kVar.mo5429g(), kVar.mo5426e());
        setIcon(kVar.getIcon());
        setEnabled(kVar.isEnabled());
        setSubMenuArrowVisible(kVar.hasSubMenu());
    }

    /* renamed from: a */
    public void mo5185a(boolean z, char c) {
        int i = (!z || !this.f4840b.mo5429g()) ? 8 : 0;
        if (i == 0) {
            this.f4845g.setText(this.f4840b.mo5428f());
        }
        if (this.f4845g.getVisibility() != i) {
            this.f4845g.setVisibility(i);
        }
    }

    /* renamed from: a */
    public boolean mo5186a() {
        return false;
    }

    /* renamed from: c */
    public boolean mo5188c() {
        return this.f4854p;
    }

    public C1555k getItemData() {
        return this.f4840b;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        C1040ar.m5889a((View) this, this.f4847i);
        this.f4843e = (TextView) findViewById(C1359b.C1366g.title);
        if (this.f4848j != -1) {
            this.f4843e.setTextAppearance(this.f4849k, this.f4848j);
        }
        this.f4845g = (TextView) findViewById(C1359b.C1366g.shortcut);
        this.f4846h = (ImageView) findViewById(C1359b.C1366g.submenuarrow);
        if (this.f4846h != null) {
            this.f4846h.setImageDrawable(this.f4851m);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f4841c != null && this.f4850l) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f4841c.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f4842d != null || this.f4844f != null) {
            if (this.f4840b.mo5442h()) {
                if (this.f4842d == null) {
                    m8969d();
                }
                compoundButton = this.f4842d;
                compoundButton2 = this.f4844f;
            } else {
                if (this.f4844f == null) {
                    m8970e();
                }
                compoundButton = this.f4844f;
                compoundButton2 = this.f4842d;
            }
            if (z) {
                compoundButton.setChecked(this.f4840b.isChecked());
                int i = z ? 0 : 8;
                if (compoundButton.getVisibility() != i) {
                    compoundButton.setVisibility(i);
                }
                if (compoundButton2 != null && compoundButton2.getVisibility() != 8) {
                    compoundButton2.setVisibility(8);
                    return;
                }
                return;
            }
            if (this.f4844f != null) {
                this.f4844f.setVisibility(8);
            }
            if (this.f4842d != null) {
                this.f4842d.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f4840b.mo5442h()) {
            if (this.f4842d == null) {
                m8969d();
            }
            compoundButton = this.f4842d;
        } else {
            if (this.f4844f == null) {
                m8970e();
            }
            compoundButton = this.f4844f;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f4854p = z;
        this.f4850l = z;
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f4840b.mo5449j() || this.f4854p;
        if (!z && !this.f4850l) {
            return;
        }
        if (this.f4841c != null || drawable != null || this.f4850l) {
            if (this.f4841c == null) {
                m8968b();
            }
            if (drawable != null || this.f4850l) {
                ImageView imageView = this.f4841c;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f4841c.getVisibility() != 0) {
                    this.f4841c.setVisibility(0);
                    return;
                }
                return;
            }
            this.f4841c.setVisibility(8);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f4843e.setText(charSequence);
            if (this.f4843e.getVisibility() != 0) {
                this.f4843e.setVisibility(0);
            }
        } else if (this.f4843e.getVisibility() != 8) {
            this.f4843e.setVisibility(8);
        }
    }
}
