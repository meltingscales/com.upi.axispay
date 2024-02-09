.class public final Lcom/google/firebase/messaging/zzc;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public final id:I

.field public final tag:Ljava/lang/String;

.field public final zzea:Lm8$e;


# direct methods
.method public constructor <init>(Lm8$e;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/google/firebase/messaging/zzc;->zzea:Lm8$e;

    .line 3
    iput-object p2, p0, Lcom/google/firebase/messaging/zzc;->tag:Ljava/lang/String;

    const/4 p1, 0x0

    .line 4
    iput p1, p0, Lcom/google/firebase/messaging/zzc;->id:I

    return-void
.end method
