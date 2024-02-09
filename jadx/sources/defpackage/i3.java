package defpackage;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.google.android.gms.vision.barcode.Barcode;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: i3  reason: default package */
/* loaded from: classes.dex */
public class i3 extends hd implements View.OnClickListener {
    public final SearchView m;
    public final SearchableInfo n;
    public final Context o;
    public final WeakHashMap<String, Drawable.ConstantState> p;
    public final int q;
    public boolean r;
    public int s;
    public ColorStateList t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* compiled from: AxisPay */
    /* renamed from: i3$a */
    /* loaded from: classes.dex */
    public static final class a {
        public final TextView a;
        public final TextView b;
        public final ImageView c;
        public final ImageView d;
        public final ImageView e;

        public a(View view) {
            this.a = (TextView) view.findViewById(16908308);
            this.b = (TextView) view.findViewById(16908309);
            this.c = (ImageView) view.findViewById(16908295);
            this.d = (ImageView) view.findViewById(16908296);
            this.e = (ImageView) view.findViewById(q.edit_query);
        }
    }

    public i3(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.r = false;
        this.s = 1;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.m = searchView;
        this.n = searchableInfo;
        this.q = searchView.getSuggestionCommitIconResId();
        this.o = context;
        this.p = weakHashMap;
    }

    public static String o(Cursor cursor, String str) {
        return w(cursor, cursor.getColumnIndex(str));
    }

    public static String w(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e(C0059ao.a(6792), C0059ao.a(6793), e);
            return null;
        }
    }

    public final void A(String str, Drawable drawable) {
        if (drawable != null) {
            this.p.put(str, drawable.getConstantState());
        }
    }

    public final void B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean(C0059ao.a(6794))) {
        }
    }

    @Override // defpackage.fd, defpackage.gd.a
    public void a(Cursor cursor) {
        boolean z = this.r;
        String a2 = C0059ao.a(6795);
        if (z) {
            Log.w(a2, C0059ao.a(6796));
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.u = cursor.getColumnIndex(C0059ao.a(6797));
                this.v = cursor.getColumnIndex(C0059ao.a(6798));
                this.w = cursor.getColumnIndex(C0059ao.a(6799));
                this.x = cursor.getColumnIndex(C0059ao.a(6800));
                this.y = cursor.getColumnIndex(C0059ao.a(6801));
                this.z = cursor.getColumnIndex(C0059ao.a(6802));
            }
        } catch (Exception e) {
            Log.e(a2, C0059ao.a(6803), e);
        }
    }

    @Override // defpackage.fd, defpackage.gd.a
    public CharSequence c(Cursor cursor) {
        String o;
        String o2;
        if (cursor == null) {
            return null;
        }
        String o3 = o(cursor, C0059ao.a(6804));
        if (o3 != null) {
            return o3;
        }
        if (!this.n.shouldRewriteQueryFromData() || (o2 = o(cursor, C0059ao.a(6805))) == null) {
            if (!this.n.shouldRewriteQueryFromText() || (o = o(cursor, C0059ao.a(6806))) == null) {
                return null;
            }
            return o;
        }
        return o2;
    }

    @Override // defpackage.gd.a
    public Cursor d(CharSequence charSequence) {
        String a2 = charSequence == null ? C0059ao.a(6807) : charSequence.toString();
        if (this.m.getVisibility() == 0 && this.m.getWindowVisibility() == 0) {
            try {
                Cursor v = v(this.n, a2, 50);
                if (v != null) {
                    v.getCount();
                    return v;
                }
            } catch (RuntimeException e) {
                Log.w(C0059ao.a(6808), C0059ao.a(6809), e);
            }
        }
        return null;
    }

    @Override // defpackage.fd
    public void e(View view, Context context, Cursor cursor) {
        CharSequence w;
        a aVar = (a) view.getTag();
        int i = this.z;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (aVar.a != null) {
            z(aVar.a, w(cursor, this.u));
        }
        if (aVar.b != null) {
            String w2 = w(cursor, this.w);
            if (w2 != null) {
                w = l(w2);
            } else {
                w = w(cursor, this.v);
            }
            if (TextUtils.isEmpty(w)) {
                TextView textView = aVar.a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.a.setMaxLines(1);
                }
            }
            z(aVar.b, w);
        }
        ImageView imageView = aVar.c;
        if (imageView != null) {
            y(imageView, t(cursor), 4);
        }
        ImageView imageView2 = aVar.d;
        if (imageView2 != null) {
            y(imageView2, u(cursor), 8);
        }
        int i3 = this.s;
        if (i3 != 2 && (i3 != 1 || (i2 & 1) == 0)) {
            aVar.e.setVisibility(8);
            return;
        }
        aVar.e.setVisibility(0);
        aVar.e.setTag(aVar.a.getText());
        aVar.e.setOnClickListener(this);
    }

    @Override // defpackage.fd, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w(C0059ao.a(6810), C0059ao.a(6811), e);
            View g = g(this.o, b(), viewGroup);
            if (g != null) {
                ((a) g.getTag()).a.setText(e.toString());
            }
            return g;
        }
    }

    @Override // defpackage.fd, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w(C0059ao.a(6812), C0059ao.a(6813), e);
            View h = h(this.o, b(), viewGroup);
            if (h != null) {
                ((a) h.getTag()).a.setText(e.toString());
            }
            return h;
        }
    }

    @Override // defpackage.hd, defpackage.fd
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View h = super.h(context, cursor, viewGroup);
        h.setTag(new a(h));
        ((ImageView) h.findViewById(q.edit_query)).setImageResource(this.q);
        return h;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    public final Drawable k(String str) {
        Drawable.ConstantState constantState = this.p.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    public final CharSequence l(CharSequence charSequence) {
        if (this.t == null) {
            TypedValue typedValue = new TypedValue();
            this.o.getTheme().resolveAttribute(l.textColorSearchUrl, typedValue, true);
            this.t = this.o.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.t, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    public final Drawable m(ComponentName componentName) {
        String a2 = C0059ao.a(6814);
        PackageManager packageManager = this.o.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, Barcode.ITF);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable == null) {
                Log.w(a2, C0059ao.a(6815) + iconResource + C0059ao.a(6816) + componentName.flattenToShortString());
                return null;
            }
            return drawable;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w(a2, e.toString());
            return null;
        }
    }

    public final Drawable n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (this.p.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState = this.p.get(flattenToShortString);
            if (constantState == null) {
                return null;
            }
            return constantState.newDrawable(this.o.getResources());
        }
        Drawable m = m(componentName);
        this.p.put(flattenToShortString, m != null ? m.getConstantState() : null);
        return m;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        B(b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        B(b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.m.U((CharSequence) tag);
        }
    }

    public final Drawable p() {
        Drawable n = n(this.n.getSearchActivity());
        return n != null ? n : this.o.getPackageManager().getDefaultActivityIcon();
    }

    public final Drawable q(Uri uri) {
        String a2 = C0059ao.a(6817);
        String a3 = C0059ao.a(6818);
        try {
            if (C0059ao.a(6819).equals(uri.getScheme())) {
                try {
                    return r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException(C0059ao.a(6820) + uri);
                }
            }
            InputStream openInputStream = this.o.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                try {
                    openInputStream.close();
                } catch (IOException e) {
                    Log.e(a3, a2 + uri, e);
                }
                return createFromStream;
            }
            throw new FileNotFoundException(C0059ao.a(6821) + uri);
        } catch (FileNotFoundException e2) {
            Log.w(a3, C0059ao.a(6822) + uri + C0059ao.a(6823) + e2.getMessage());
            return null;
        }
        Log.w(a3, C0059ao.a(6822) + uri + C0059ao.a(6823) + e2.getMessage());
        return null;
    }

    public Drawable r(Uri uri) throws FileNotFoundException {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.o.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException(C0059ao.a(6824) + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException(C0059ao.a(6826) + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException(C0059ao.a(6825) + uri);
                }
                throw new FileNotFoundException(C0059ao.a(6827) + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException(C0059ao.a(6828) + uri);
            }
        }
        throw new FileNotFoundException(C0059ao.a(6829) + uri);
    }

    public final Drawable s(String str) {
        if (str == null || str.isEmpty() || C0059ao.a(6830).equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = C0059ao.a(6831) + this.o.getPackageName() + C0059ao.a(6832) + parseInt;
            Drawable k = k(str2);
            if (k != null) {
                return k;
            }
            Drawable f = t8.f(this.o, parseInt);
            A(str2, f);
            return f;
        } catch (Resources.NotFoundException unused) {
            Log.w(C0059ao.a(6834), C0059ao.a(6833) + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable k2 = k(str);
            if (k2 != null) {
                return k2;
            }
            Drawable q = q(Uri.parse(str));
            A(str, q);
            return q;
        }
    }

    public final Drawable t(Cursor cursor) {
        int i = this.x;
        if (i == -1) {
            return null;
        }
        Drawable s = s(cursor.getString(i));
        return s != null ? s : p();
    }

    public final Drawable u(Cursor cursor) {
        int i = this.y;
        if (i == -1) {
            return null;
        }
        return s(cursor.getString(i));
    }

    public Cursor v(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder authority = new Uri.Builder().scheme(C0059ao.a(6835)).authority(suggestAuthority);
        String a2 = C0059ao.a(6836);
        Uri.Builder fragment = authority.query(a2).fragment(a2);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath(C0059ao.a(6837));
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter(C0059ao.a(6838), String.valueOf(i));
        }
        return this.o.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    public void x(int i) {
        this.s = i;
    }

    public final void y(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    public final void z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }
}
