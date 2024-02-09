package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: rd  reason: default package */
/* loaded from: classes.dex */
public class rd extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = null;
    private static final String SAVED_CANCELABLE = null;
    private static final String SAVED_DIALOG_STATE_TAG = null;
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = null;
    private static final String SAVED_SHOWS_DIALOG = null;
    private static final String SAVED_STYLE = null;
    private static final String SAVED_THEME = null;
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 0;
    public static final int STYLE_NO_INPUT = 0;
    public static final int STYLE_NO_TITLE = 0;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;
    private Dialog mDialog;
    private boolean mDialogCreated;
    private Runnable mDismissRunnable;
    private boolean mDismissed;
    private Handler mHandler;
    private kf<ef> mObserver;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;

    /* compiled from: AxisPay */
    /* renamed from: rd$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            rd.this.mOnDismissListener.onDismiss(rd.this.mDialog);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rd$b */
    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (rd.this.mDialog != null) {
                rd rdVar = rd.this;
                rdVar.onCancel(rdVar.mDialog);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rd$c */
    /* loaded from: classes.dex */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (rd.this.mDialog != null) {
                rd rdVar = rd.this;
                rdVar.onDismiss(rdVar.mDialog);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rd$d */
    /* loaded from: classes.dex */
    public class d implements kf<ef> {
        public d() {
        }

        @Override // defpackage.kf
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void a(ef efVar) {
            if (efVar == null || !rd.this.mShowsDialog) {
                return;
            }
            View requireView = rd.this.requireView();
            if (requireView.getParent() == null) {
                if (rd.this.mDialog != null) {
                    if (FragmentManager.I0(3)) {
                        String str = C0059ao.a(1448) + this + C0059ao.a(1449) + rd.this.mDialog;
                    }
                    rd.this.mDialog.setContentView(requireView);
                    return;
                }
                return;
            }
            throw new IllegalStateException(C0059ao.a(1450));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: rd$e */
    /* loaded from: classes.dex */
    public class e extends ud {
        public final /* synthetic */ ud a;

        public e(ud udVar) {
            this.a = udVar;
        }

        @Override // defpackage.ud
        public View d(int i) {
            if (this.a.e()) {
                return this.a.d(i);
            }
            return rd.this.onFindViewById(i);
        }

        @Override // defpackage.ud
        public boolean e() {
            return this.a.e() || rd.this.onHasView();
        }
    }

    static {
        C0059ao.a(rd.class, 145);
    }

    public rd() {
        this.mDismissRunnable = new a();
        this.mOnCancelListener = new b();
        this.mOnDismissListener = new c();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new d();
        this.mDialogCreated = false;
    }

    private void dismissInternal(boolean z, boolean z2) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            getParentFragmentManager().a1(this.mBackStackId, 1);
            this.mBackStackId = -1;
            return;
        }
        je n = getParentFragmentManager().n();
        n.q(this);
        if (z) {
            n.k();
        } else {
            n.j();
        }
    }

    private void prepareDialog(Bundle bundle) {
        if (this.mShowsDialog && !this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                Dialog onCreateDialog = onCreateDialog(bundle);
                this.mDialog = onCreateDialog;
                if (this.mShowsDialog) {
                    setupDialog(onCreateDialog, this.mStyle);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.mDialog.setOwnerActivity((Activity) context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
            } finally {
                this.mCreatingDialog = false;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public ud createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    public void dismiss() {
        dismissInternal(false, false);
    }

    public void dismissAllowingStateLoss() {
        dismissInternal(true, false);
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().f(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(C0059ao.a(907), 0);
            this.mTheme = bundle.getInt(C0059ao.a(908), 0);
            this.mCancelable = bundle.getBoolean(C0059ao.a(909), true);
            this.mShowsDialog = bundle.getBoolean(C0059ao.a(910), this.mShowsDialog);
            this.mBackStackId = bundle.getInt(C0059ao.a(911), -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (FragmentManager.I0(3)) {
            String str = C0059ao.a(912) + this;
        }
        return new Dialog(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().i(this.mObserver);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (FragmentManager.I0(3)) {
            String str = C0059ao.a(913) + this;
        }
        dismissInternal(true, true);
    }

    public View onFindViewById(int i) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.mShowsDialog && !this.mCreatingDialog) {
            prepareDialog(bundle);
            if (FragmentManager.I0(2)) {
                String str = C0059ao.a(914) + this + C0059ao.a(915);
            }
            Dialog dialog = this.mDialog;
            return dialog != null ? onGetLayoutInflater.cloneInContext(dialog.getContext()) : onGetLayoutInflater;
        }
        if (FragmentManager.I0(2)) {
            String str2 = C0059ao.a(916) + this;
            if (!this.mShowsDialog) {
                String str3 = C0059ao.a(917) + str2;
            } else {
                String str4 = C0059ao.a(918) + str2;
            }
        }
        return onGetLayoutInflater;
    }

    public boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean(C0059ao.a(919), false);
            bundle.putBundle(C0059ao.a(920), onSaveInstanceState);
        }
        int i = this.mStyle;
        if (i != 0) {
            bundle.putInt(C0059ao.a(921), i);
        }
        int i2 = this.mTheme;
        if (i2 != 0) {
            bundle.putInt(C0059ao.a(922), i2);
        }
        boolean z = this.mCancelable;
        if (!z) {
            bundle.putBoolean(C0059ao.a(923), z);
        }
        boolean z2 = this.mShowsDialog;
        if (!z2) {
            bundle.putBoolean(C0059ao.a(924), z2);
        }
        int i3 = this.mBackStackId;
        if (i3 != -1) {
            bundle.putInt(C0059ao.a(925), i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            tf.a(decorView, this);
            uf.a(decorView, this);
            ul.a(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(C0059ao.a(926))) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(C0059ao.a(927))) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException(C0059ao.a(928) + this + C0059ao.a(929));
    }

    public void setCancelable(boolean z) {
        this.mCancelable = z;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void setShowsDialog(boolean z) {
        this.mShowsDialog = z;
    }

    public void setStyle(int i, int i2) {
        if (FragmentManager.I0(2)) {
            String str = C0059ao.a(930) + this + C0059ao.a(931) + i + C0059ao.a(932) + i2;
        }
        this.mStyle = i;
        if (i == 2 || i == 3) {
            this.mTheme = 16973913;
        }
        if (i2 != 0) {
            this.mTheme = i2;
        }
    }

    public void setupDialog(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(FragmentManager fragmentManager, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        je n = fragmentManager.n();
        n.f(this, str);
        n.j();
    }

    public void showNow(FragmentManager fragmentManager, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        je n = fragmentManager.n();
        n.f(this, str);
        n.l();
    }

    public int show(je jeVar, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        jeVar.f(this, str);
        this.mViewDestroyed = false;
        int j = jeVar.j();
        this.mBackStackId = j;
        return j;
    }

    public rd(int i) {
        super(i);
        this.mDismissRunnable = new a();
        this.mOnCancelListener = new b();
        this.mOnDismissListener = new c();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new d();
        this.mDialogCreated = false;
    }
}
