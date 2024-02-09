package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzy;
import com.google.android.gms.measurement.internal.zzby;
import com.google.android.gms.measurement.internal.zzdy;
import com.google.android.gms.measurement.internal.zzq;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.settings.SettingsJsonConstants;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics zzaam;
    private final zzaa zzaan;
    private String zzaao;
    private long zzaap;
    private final Object zzaaq;
    private ExecutorService zzab;
    private final zzby zzl;
    private final boolean zzn;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class Event {
        public static final String ADD_PAYMENT_INFO = "add_payment_info";
        public static final String ADD_TO_CART = "add_to_cart";
        public static final String ADD_TO_WISHLIST = "add_to_wishlist";
        public static final String APP_OPEN = "app_open";
        public static final String BEGIN_CHECKOUT = "begin_checkout";
        public static final String CAMPAIGN_DETAILS = "campaign_details";
        public static final String CHECKOUT_PROGRESS = "checkout_progress";
        public static final String EARN_VIRTUAL_CURRENCY = "earn_virtual_currency";
        public static final String ECOMMERCE_PURCHASE = "ecommerce_purchase";
        public static final String GENERATE_LEAD = "generate_lead";
        public static final String JOIN_GROUP = "join_group";
        public static final String LEVEL_END = "level_end";
        public static final String LEVEL_START = "level_start";
        public static final String LEVEL_UP = "level_up";
        public static final String LOGIN = "login";
        public static final String POST_SCORE = "post_score";
        public static final String PRESENT_OFFER = "present_offer";
        public static final String PURCHASE_REFUND = "purchase_refund";
        public static final String REMOVE_FROM_CART = "remove_from_cart";
        public static final String SEARCH = "search";
        public static final String SELECT_CONTENT = "select_content";
        public static final String SET_CHECKOUT_OPTION = "set_checkout_option";
        public static final String SHARE = "share";
        public static final String SIGN_UP = "sign_up";
        public static final String SPEND_VIRTUAL_CURRENCY = "spend_virtual_currency";
        public static final String TUTORIAL_BEGIN = "tutorial_begin";
        public static final String TUTORIAL_COMPLETE = "tutorial_complete";
        public static final String UNLOCK_ACHIEVEMENT = "unlock_achievement";
        public static final String VIEW_ITEM = "view_item";
        public static final String VIEW_ITEM_LIST = "view_item_list";
        public static final String VIEW_SEARCH_RESULTS = "view_search_results";
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class Param {
        public static final String ACHIEVEMENT_ID = "achievement_id";
        public static final String ACLID = "aclid";
        public static final String AFFILIATION = "affiliation";
        public static final String CAMPAIGN = "campaign";
        public static final String CHARACTER = "character";
        public static final String CHECKOUT_OPTION = "checkout_option";
        public static final String CHECKOUT_STEP = "checkout_step";
        public static final String CONTENT = "content";
        public static final String CONTENT_TYPE = "content_type";
        public static final String COUPON = "coupon";
        public static final String CP1 = "cp1";
        public static final String CREATIVE_NAME = "creative_name";
        public static final String CREATIVE_SLOT = "creative_slot";
        public static final String CURRENCY = "currency";
        public static final String DESTINATION = "destination";
        public static final String END_DATE = "end_date";
        public static final String EXTEND_SESSION = "extend_session";
        public static final String FLIGHT_NUMBER = "flight_number";
        public static final String GROUP_ID = "group_id";
        public static final String INDEX = "index";
        public static final String ITEM_BRAND = "item_brand";
        public static final String ITEM_CATEGORY = "item_category";
        public static final String ITEM_ID = "item_id";
        public static final String ITEM_LIST = "item_list";
        public static final String ITEM_LOCATION_ID = "item_location_id";
        public static final String ITEM_NAME = "item_name";
        public static final String ITEM_VARIANT = "item_variant";
        public static final String LEVEL = "level";
        public static final String LEVEL_NAME = "level_name";
        public static final String LOCATION = "location";
        public static final String MEDIUM = "medium";
        public static final String METHOD = "method";
        public static final String NUMBER_OF_NIGHTS = "number_of_nights";
        public static final String NUMBER_OF_PASSENGERS = "number_of_passengers";
        public static final String NUMBER_OF_ROOMS = "number_of_rooms";
        public static final String ORIGIN = "origin";
        public static final String PRICE = "price";
        public static final String QUANTITY = "quantity";
        public static final String SCORE = "score";
        public static final String SEARCH_TERM = "search_term";
        public static final String SHIPPING = "shipping";
        @Deprecated
        public static final String SIGN_UP_METHOD = "sign_up_method";
        public static final String SOURCE = "source";
        public static final String START_DATE = "start_date";
        public static final String SUCCESS = "success";
        public static final String TAX = "tax";
        public static final String TERM = "term";
        public static final String TRANSACTION_ID = "transaction_id";
        public static final String TRAVEL_CLASS = "travel_class";
        public static final String VALUE = "value";
        public static final String VIRTUAL_CURRENCY_NAME = "virtual_currency_name";
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class UserProperty {
        public static final String SIGN_UP_METHOD = "sign_up_method";
    }

    private FirebaseAnalytics(zzby zzbyVar) {
        Preconditions.checkNotNull(zzbyVar);
        this.zzl = zzbyVar;
        this.zzaan = null;
        this.zzn = false;
        this.zzaaq = new Object();
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (zzaam == null) {
            synchronized (FirebaseAnalytics.class) {
                if (zzaam == null) {
                    if (zzaa.zzf(context)) {
                        zzaam = new FirebaseAnalytics(zzaa.zza(context));
                    } else {
                        zzaam = new FirebaseAnalytics(zzby.zza(context, (zzy) null));
                    }
                }
            }
        }
        return zzaam;
    }

    @Keep
    public static zzdy getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzaa zza;
        if (zzaa.zzf(context) && (zza = zzaa.zza(context, (String) null, (String) null, (String) null, bundle)) != null) {
            return new zzb(zza);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbi(String str) {
        synchronized (this.zzaaq) {
            this.zzaao = str;
            if (this.zzn) {
                this.zzaap = DefaultClock.getInstance().elapsedRealtime();
            } else {
                this.zzaap = this.zzl.zzz().elapsedRealtime();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zzj() {
        long elapsedRealtime;
        synchronized (this.zzaaq) {
            if (this.zzn) {
                elapsedRealtime = DefaultClock.getInstance().elapsedRealtime();
            } else {
                elapsedRealtime = this.zzl.zzz().elapsedRealtime();
            }
            if (Math.abs(elapsedRealtime - this.zzaap) < 1000) {
                return this.zzaao;
            }
            return null;
        }
    }

    private final ExecutorService zzjt() {
        ExecutorService executorService;
        synchronized (FirebaseAnalytics.class) {
            if (this.zzab == null) {
                this.zzab = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
            }
            executorService = this.zzab;
        }
        return executorService;
    }

    public final Task<String> getAppInstanceId() {
        try {
            String zzj = zzj();
            if (zzj != null) {
                return Tasks.forResult(zzj);
            }
            return Tasks.call(zzjt(), new zza(this));
        } catch (Exception e) {
            if (this.zzn) {
                this.zzaan.zza(5, "Failed to schedule task for getAppInstanceId", (Object) null, (Object) null, (Object) null);
            } else {
                this.zzl.zzad().zzdd().zzaq("Failed to schedule task for getAppInstanceId");
            }
            return Tasks.forException(e);
        }
    }

    @Keep
    public final String getFirebaseInstanceId() {
        return FirebaseInstanceId.getInstance().getId();
    }

    public final void logEvent(String str, Bundle bundle) {
        if (this.zzn) {
            this.zzaan.logEvent(str, bundle);
        } else {
            this.zzl.zzs().zza(SettingsJsonConstants.APP_KEY, str, bundle, true);
        }
    }

    public final void resetAnalyticsData() {
        zzbi(null);
        if (this.zzn) {
            this.zzaan.resetAnalyticsData();
        } else {
            this.zzl.zzs().resetAnalyticsData(this.zzl.zzz().currentTimeMillis());
        }
    }

    public final void setAnalyticsCollectionEnabled(boolean z) {
        if (this.zzn) {
            this.zzaan.setMeasurementEnabled(z);
        } else {
            this.zzl.zzs().setMeasurementEnabled(z);
        }
    }

    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        if (this.zzn) {
            this.zzaan.setCurrentScreen(activity, str, str2);
        } else if (!zzq.isMainThread()) {
            this.zzl.zzad().zzdd().zzaq("setCurrentScreen must be called from the main thread");
        } else {
            this.zzl.zzv().setCurrentScreen(activity, str, str2);
        }
    }

    @Deprecated
    public final void setMinimumSessionDuration(long j) {
        if (this.zzn) {
            this.zzaan.setMinimumSessionDuration(j);
        } else {
            this.zzl.zzs().setMinimumSessionDuration(j);
        }
    }

    public final void setSessionTimeoutDuration(long j) {
        if (this.zzn) {
            this.zzaan.setSessionTimeoutDuration(j);
        } else {
            this.zzl.zzs().setSessionTimeoutDuration(j);
        }
    }

    public final void setUserId(String str) {
        if (this.zzn) {
            this.zzaan.setUserId(str);
        } else {
            this.zzl.zzs().zzb(SettingsJsonConstants.APP_KEY, "_id", (Object) str, true);
        }
    }

    public final void setUserProperty(String str, String str2) {
        if (this.zzn) {
            this.zzaan.setUserProperty(str, str2);
        } else {
            this.zzl.zzs().zzb(SettingsJsonConstants.APP_KEY, str, (Object) str2, false);
        }
    }

    private FirebaseAnalytics(zzaa zzaaVar) {
        Preconditions.checkNotNull(zzaaVar);
        this.zzl = null;
        this.zzaan = zzaaVar;
        this.zzn = true;
        this.zzaaq = new Object();
    }
}
