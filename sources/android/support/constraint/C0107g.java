package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.constraint.C0108h;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: android.support.constraint.g */
public class C0107g extends View {

    /* renamed from: a */
    private int f826a = -1;

    /* renamed from: b */
    private View f827b = null;

    /* renamed from: c */
    private int f828c = 4;

    public C0107g(Context context) {
        super(context);
        m627a((AttributeSet) null);
    }

    public C0107g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m627a(attributeSet);
    }

    public C0107g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m627a(attributeSet);
    }

    public C0107g(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        m627a(attributeSet);
    }

    /* renamed from: a */
    private void m627a(AttributeSet attributeSet) {
        super.setVisibility(this.f828c);
        this.f826a = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0108h.C0111c.ConstraintLayout_placeholder);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0108h.C0111c.ConstraintLayout_placeholder_content) {
                    this.f826a = obtainStyledAttributes.getResourceId(index, this.f826a);
                } else if (index == C0108h.C0111c.ConstraintLayout_placeholder_emptyVisibility) {
                    this.f828c = obtainStyledAttributes.getInt(index, this.f828c);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo547a(ConstraintLayout constraintLayout) {
        if (this.f826a == -1 && !isInEditMode()) {
            setVisibility(this.f828c);
        }
        this.f827b = constraintLayout.findViewById(this.f826a);
        if (this.f827b != null) {
            ((ConstraintLayout.C0052a) this.f827b.getLayoutParams()).f125as = true;
            this.f827b.setVisibility(0);
            setVisibility(0);
        }
    }

    /* renamed from: b */
    public void mo548b(ConstraintLayout constraintLayout) {
        if (this.f827b != null) {
            ConstraintLayout.C0052a aVar = (ConstraintLayout.C0052a) getLayoutParams();
            ConstraintLayout.C0052a aVar2 = (ConstraintLayout.C0052a) this.f827b.getLayoutParams();
            aVar2.f105aD.mo258i(0);
            aVar.f105aD.mo271r(aVar2.f105aD.mo171M());
            aVar.f105aD.mo274s(aVar2.f105aD.mo175Q());
            aVar2.f105aD.mo258i(8);
        }
    }

    public View getContent() {
        return this.f827b;
    }

    public int getEmptyVisibility() {
        return this.f828c;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, "?".length(), rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f826a != i) {
            if (this.f827b != null) {
                this.f827b.setVisibility(0);
                ((ConstraintLayout.C0052a) this.f827b.getLayoutParams()).f125as = false;
                this.f827b = null;
            }
            this.f826a = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f828c = i;
    }
}
