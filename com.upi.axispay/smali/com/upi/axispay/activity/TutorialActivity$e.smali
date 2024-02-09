.class public Lcom/upi/axispay/activity/TutorialActivity$e;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/upi/axispay/activity/TutorialActivity;->d0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ld70;

.field public final synthetic c:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/upi/axispay/activity/TutorialActivity;Ld70;[Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/upi/axispay/activity/TutorialActivity$e;->b:Ld70;

    iput-object p3, p0, Lcom/upi/axispay/activity/TutorialActivity$e;->c:[Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/activity/TutorialActivity$e;->b:Ld70;

    iget-object v1, p0, Lcom/upi/axispay/activity/TutorialActivity$e;->c:[Ljava/lang/String;

    aget-object v1, v1, p2

    invoke-virtual {v0, v1}, Ld70;->h(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/upi/axispay/activity/TutorialActivity$e;->c:[Ljava/lang/String;

    aget-object p2, v0, p2

    sput-object p2, Lcom/olive/upi/transport/TransportConstants;->API_BASE_URL:Ljava/lang/String;

    .line 3
    invoke-static {}, Lcom/olive/upi/transport/TransportManager;->getInstance()Lcom/olive/upi/transport/TransportManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/olive/upi/transport/TransportManager;->resetUpiService()V

    .line 4
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method
