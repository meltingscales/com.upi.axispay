.class public final synthetic Lds;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final synthetic b:Lds;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lds;

    invoke-direct {v0}, Lds;-><init>()V

    sput-object v0, Lds;->b:Lds;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 0

    invoke-static {}, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/AlarmManagerSchedulerBroadcastReceiver;->a()V

    return-void
.end method
