package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.settings.PromptSettingsData;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class DialogStringResolver {
    private static final String PROMPT_MESSAGE_RES_NAME = null;
    private static final String PROMPT_TITLE_RES_NAME = null;
    private static final String SUBMISSION_ALWAYS_SEND_RES_NAME = null;
    private static final String SUBMISSION_CANCEL_RES_NAME = null;
    private static final String SUBMISSION_SEND_RES_NAME = null;
    private final Context context;
    private final PromptSettingsData promptData;

    static {
        C0059ao.a(DialogStringResolver.class, 222);
    }

    public DialogStringResolver(Context context, PromptSettingsData promptSettingsData) {
        this.context = context;
        this.promptData = promptSettingsData;
    }

    private boolean isNullOrEmpty(String str) {
        return str == null || str.length() == 0;
    }

    private String resourceOrFallbackValue(String str, String str2) {
        return stringOrFallback(CommonUtils.getStringsFileValue(this.context, str), str2);
    }

    private String stringOrFallback(String str, String str2) {
        return isNullOrEmpty(str) ? str2 : str;
    }

    public String getAlwaysSendButtonTitle() {
        return resourceOrFallbackValue(C0059ao.a(9782), this.promptData.alwaysSendButtonTitle);
    }

    public String getCancelButtonTitle() {
        return resourceOrFallbackValue(C0059ao.a(9783), this.promptData.cancelButtonTitle);
    }

    public String getMessage() {
        return resourceOrFallbackValue(C0059ao.a(9784), this.promptData.message);
    }

    public String getSendButtonTitle() {
        return resourceOrFallbackValue(C0059ao.a(9785), this.promptData.sendButtonTitle);
    }

    public String getTitle() {
        return resourceOrFallbackValue(C0059ao.a(9786), this.promptData.title);
    }
}
