package com.upi.axispay.custom;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.olive.upi.transport.OliveRequest;
import com.olive.upi.transport.api.Result;
import com.olive.upi.transport.model.Authenticate;
import com.upi.axispay.R;
import com.upi.axispay.activity.LoginActivity;
import com.upi.axispay.activity.MainActivity;
import com.upi.axispay.custom.LoginPopupFragment;
import defpackage.ua0;
import defpackage.y;
import java.util.HashMap;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class LoginPopupFragment extends DialogFragment implements ua0.e {
    public static LoginPopupFragment fragment;
    public static int sourceID;
    public Activity activity;
    public ImageView imageView;
    public OnLoginCompletionListener loginCompletionListener;
    private mg0 mListener;
    public String message;
    public FloatingInputLayout pinFieldLayout;
    public String TAG = C0059ao.a(8552);
    public View.OnClickListener okListner = new View.OnClickListener() { // from class: com.upi.axispay.custom.LoginPopupFragment.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (LoginPopupFragment.this.pinFieldLayout.getText().length() == 6) {
                LoginPopupFragment loginPopupFragment = LoginPopupFragment.this;
                jg0.C(loginPopupFragment.pinFieldLayout, loginPopupFragment.getActivity());
                eg0.i(LoginPopupFragment.this.getActivity());
                ua0.e(LoginPopupFragment.this.getActivity()).u(LoginPopupFragment.this);
                Authenticate authenticate = new Authenticate(LoginPopupFragment.this.pinFieldLayout.getText());
                authenticate.setAppVersion(C0059ao.a(7875));
                ua0.e(LoginPopupFragment.this.getActivity()).q(new OliveRequest(4, 23, authenticate));
                ua0.e(LoginPopupFragment.this.getActivity()).v(null);
                return;
            }
            LoginPopupFragment loginPopupFragment2 = LoginPopupFragment.this;
            loginPopupFragment2.pinFieldLayout.showError(loginPopupFragment2.getString(R.string.please_enter_6_digit_passcode));
        }
    };
    public View.OnClickListener cancelListner = new View.OnClickListener() { // from class: com.upi.axispay.custom.LoginPopupFragment.2
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LoginPopupFragment.this.dismiss();
            jg0.C(view, LoginPopupFragment.this.getActivity());
            if (LoginPopupFragment.sourceID == 67) {
                ua0.e(LoginPopupFragment.this.getActivity()).v(null);
                qa0.v().c();
                Intent intent = new Intent(LoginPopupFragment.this.getActivity(), LoginActivity.class);
                intent.setFlags(67108864);
                LoginPopupFragment.this.startActivity(intent);
                LoginPopupFragment.this.getActivity().finish();
            }
        }
    };

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public interface OnLoginCompletionListener {
        void onLoginComplete(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void b(DialogInterface dialogInterface, int i) {
        getActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void d(DialogInterface dialogInterface, int i) {
        getActivity().finish();
    }

    private void goNext() {
        Intent intent = new Intent(getActivity(), MainActivity.class);
        intent.putExtra(C0059ao.a(8553), sourceID);
        startActivity(intent);
        getActivity().finish();
    }

    public static LoginPopupFragment newInstance(int i) {
        if (fragment == null) {
            fragment = new LoginPopupFragment();
        }
        sourceID = i;
        return fragment;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof mg0) {
            this.mListener = (mg0) context;
            return;
        }
        throw new RuntimeException(context.toString() + C0059ao.a(8554));
    }

    @Override // defpackage.ua0.e
    public void onCommonLibResponse(int i, Object obj) {
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        this.activity = getActivity();
        y.a aVar = new y.a(getActivity(), R.style.Button_Dialog);
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(getActivity()).inflate(R.layout.fragment_login_popup, (ViewGroup) null);
        Button button = (Button) relativeLayout.findViewById(R.id.button_ok);
        Button button2 = (Button) relativeLayout.findViewById(R.id.button_cancel);
        TextView textView = (TextView) relativeLayout.findViewById(R.id.login_message);
        ((TextView) relativeLayout.findViewById(R.id.dialog_title)).setTypeface(null, 1);
        this.imageView = (ImageView) relativeLayout.findViewById(R.id.dialog_icon);
        aVar.k(relativeLayout);
        ImageView imageView = (ImageView) relativeLayout.findViewById(R.id.dialog_close);
        this.imageView.setColorFilter(t8.d(getActivity(), R.color.colorPrimaryDark));
        FloatingInputLayout floatingInputLayout = (FloatingInputLayout) relativeLayout.findViewById(R.id.login_pin_field);
        this.pinFieldLayout = floatingInputLayout;
        floatingInputLayout.setInputType(4);
        this.pinFieldLayout.setMaxLength(6);
        this.pinFieldLayout.setEditTextImeOptions(C0059ao.a(8555));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.upi.axispay.custom.LoginPopupFragment.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LoginPopupFragment.this.dismiss();
            }
        });
        y a = aVar.a();
        String str = this.message;
        if (str != null) {
            textView.setText(str);
        }
        button.setOnClickListener(this.okListner);
        button2.setOnClickListener(this.cancelListner);
        imageView.setOnClickListener(this.cancelListner);
        a.setCancelable(false);
        imageView.setOnClickListener(this.cancelListner);
        return a;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.mListener = null;
    }

    @Override // defpackage.ua0.e
    public void onFailureResponse(OliveRequest oliveRequest, Result result) {
        eg0.B();
        dismiss();
        if (result == null) {
            eg0.m(getActivity(), getString(R.string.unable_to_process));
            OnLoginCompletionListener onLoginCompletionListener = this.loginCompletionListener;
            if (onLoginCompletionListener != null) {
                onLoginCompletionListener.onLoginComplete(false);
                return;
            }
            return;
        }
        String code = result.getCode();
        if (oliveRequest.getRequestType() == 23) {
            OnLoginCompletionListener onLoginCompletionListener2 = this.loginCompletionListener;
            if (onLoginCompletionListener2 != null) {
                onLoginCompletionListener2.onLoginComplete(false);
            }
            if (code.equals(C0059ao.a(8556))) {
                Toast.makeText(getActivity(), result.getResult(), 0).show();
                if (sourceID == 65) {
                    getActivity().onBackPressed();
                }
            } else if (code.equals(C0059ao.a(8557))) {
                eg0.z(getActivity(), R.string.unable_to_process_your_req);
            } else if (code.equals(C0059ao.a(8558))) {
                eg0.c();
                eg0.x(getView(), R.string.no_internet);
            } else {
                boolean equals = code.equals(C0059ao.a(8559));
                String a = C0059ao.a(8560);
                if (equals) {
                    eg0.c();
                    eg0.f(getActivity(), a, getString(R.string.device_block), getString(R.string.exit), new DialogInterface.OnClickListener() { // from class: ta0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            LoginPopupFragment.this.b(dialogInterface, i);
                        }
                    });
                } else if (code.equals(C0059ao.a(8561))) {
                    eg0.c();
                    jg0.W(getActivity());
                } else if (code.equals(C0059ao.a(8562))) {
                    eg0.c();
                    eg0.f(getActivity(), a, getString(R.string.customer_block), getString(R.string.exit), new DialogInterface.OnClickListener() { // from class: sa0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            LoginPopupFragment.this.d(dialogInterface, i);
                        }
                    });
                }
            }
        } else if (oliveRequest.getRequestType() == 39) {
            eg0.B();
            eg0.o(getActivity(), getString(R.string.alert), result.getResult(), getString(R.string.okay), new View.OnClickListener() { // from class: com.upi.axispay.custom.LoginPopupFragment.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    eg0.c();
                    LoginPopupFragment.this.dismiss();
                }
            });
        }
    }

    @Override // defpackage.ua0.e
    public void onSuccessResponse(OliveRequest oliveRequest, Result result) {
        String code = result.getCode();
        if (!isDetached() && getActivity() != null) {
            int requestType = oliveRequest.getRequestType();
            String a = C0059ao.a(8563);
            String a2 = C0059ao.a(8564);
            String a3 = C0059ao.a(8565);
            if (requestType == 23) {
                if (code.equals(C0059ao.a(8566))) {
                    OnLoginCompletionListener onLoginCompletionListener = this.loginCompletionListener;
                    if (onLoginCompletionListener != null) {
                        onLoginCompletionListener.onLoginComplete(true);
                    }
                    int i = sourceID;
                    if (i == 54) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(a3, getString(R.string.scan_pay));
                        ah0.c(getActivity(), a2, hashMap);
                        n70.f.a().A(a, true);
                        eg0.B();
                        goNext();
                        dismissAllowingStateLoss();
                    } else if (i == 30) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put(a3, getString(R.string.deregister));
                        ah0.c(getActivity(), a2, hashMap2);
                        ua0.e(getActivity()).w();
                    } else if (i == 65) {
                        eg0.B();
                        dismissAllowingStateLoss();
                    } else if (i == 67) {
                        eg0.B();
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put(a3, getString(R.string.session_timeout));
                        ah0.c(getActivity(), a2, hashMap3);
                        n70.f.a().A(a, true);
                        dismissAllowingStateLoss();
                    } else if (i == 132 || i == 131) {
                        HashMap hashMap4 = new HashMap();
                        hashMap4.put(a3, getString(R.string.scan_pay));
                        ah0.c(getActivity(), a2, hashMap4);
                        n70.f.a().A(a, true);
                        eg0.B();
                        goNext();
                        dismissAllowingStateLoss();
                    }
                } else {
                    this.pinFieldLayout.hideError();
                }
                eg0.B();
                return;
            } else if (oliveRequest.getRequestType() == 4) {
                OnLoginCompletionListener onLoginCompletionListener2 = this.loginCompletionListener;
                if (onLoginCompletionListener2 != null) {
                    onLoginCompletionListener2.onLoginComplete(true);
                }
                int i2 = sourceID;
                if (i2 == 54) {
                    HashMap hashMap5 = new HashMap();
                    hashMap5.put(a3, getString(R.string.scan_pay));
                    ah0.c(getActivity(), a2, hashMap5);
                    n70.f.a().A(a, true);
                    goNext();
                    dismissAllowingStateLoss();
                } else if (i2 == 30) {
                    HashMap hashMap6 = new HashMap();
                    hashMap6.put(a3, getString(R.string.deregister));
                    ah0.c(getActivity(), a2, hashMap6);
                    ua0.e(getActivity()).w();
                } else if (i2 == 65) {
                    eg0.B();
                    dismissAllowingStateLoss();
                } else if (i2 == 67) {
                    HashMap hashMap7 = new HashMap();
                    hashMap7.put(a3, getString(R.string.session_timeout));
                    ah0.c(getActivity(), a2, hashMap7);
                    n70.f.a().A(a, true);
                    dismissAllowingStateLoss();
                } else if (i2 == 132 || i2 == 131) {
                    HashMap hashMap8 = new HashMap();
                    hashMap8.put(a3, getString(R.string.scan_pay));
                    ah0.c(getActivity(), a2, hashMap8);
                    d70.e(getActivity());
                    n70.f.a().A(a, true);
                    eg0.B();
                    goNext();
                    dismissAllowingStateLoss();
                }
                eg0.B();
                return;
            } else if (oliveRequest.getRequestType() == 39) {
                qa0.v().c();
                eg0.B();
                eg0.p(getActivity(), getString(R.string.alert), getString(R.string.successfully_deregistered), getString(R.string.okay), new View.OnClickListener() { // from class: com.upi.axispay.custom.LoginPopupFragment.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        n70.f.a().c(C0059ao.a(7871));
                        eg0.c();
                        LoginPopupFragment.this.activity.finish();
                    }
                }, new View.OnClickListener() { // from class: com.upi.axispay.custom.LoginPopupFragment.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        n70.f.a().c(C0059ao.a(7849));
                        eg0.c();
                        LoginPopupFragment.this.activity.finish();
                    }
                });
                return;
            } else {
                return;
            }
        }
        eg0.B();
        OnLoginCompletionListener onLoginCompletionListener3 = this.loginCompletionListener;
        if (onLoginCompletionListener3 != null) {
            onLoginCompletionListener3.onLoginComplete(false);
        }
    }

    public void setCancelListner(View.OnClickListener onClickListener) {
        this.cancelListner = onClickListener;
    }

    public void setLoginCompletionListener(OnLoginCompletionListener onLoginCompletionListener) {
        this.loginCompletionListener = onLoginCompletionListener;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}
