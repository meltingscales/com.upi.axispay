.class public Lcx$h;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcx;->t(Landroid/view/View;Lhx;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcx;


# direct methods
.method public constructor <init>(Lcx;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcx$h;->b:Lcx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcx$h;->b:Lcx;

    invoke-virtual {p1}, Lcx;->F()V

    return-void
.end method
