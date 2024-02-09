.class public Lcf0$f;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcf0;->x()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ly;


# direct methods
.method public constructor <init>(Lcf0;Ly;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcf0$f;->b:Ly;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcf0$f;->b:Ly;

    invoke-virtual {p1}, Landroid/app/Dialog;->hide()V

    return-void
.end method
