.class public Ln1$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ln1;


# direct methods
.method public constructor <init>(Ln1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln1$a;->b:Ln1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss()V
    .locals 1

    .line 1
    iget-object v0, p0, Ln1$a;->b:Ln1;

    invoke-virtual {v0}, Ln1;->e()V

    return-void
.end method
