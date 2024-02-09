.class public Lcf0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcf0;->N()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcf0;


# direct methods
.method public constructor <init>(Lcf0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcf0$a;->b:Lcf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcf0$a;->b:Lcf0;

    iget-object p1, p1, Lcf0;->z:Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-virtual {p1}, Landroid/app/DialogFragment;->dismiss()V

    .line 2
    iget-object p1, p0, Lcf0$a;->b:Lcf0;

    const/4 v0, 0x0

    iput-object v0, p1, Lcf0;->z:Lcom/upi/axispay/custom/LoginPopupFragment;

    .line 3
    invoke-static {p1}, Lcf0;->y(Lcf0;)V

    return-void
.end method
