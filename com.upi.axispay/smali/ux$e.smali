.class public Lux$e;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lux;->r()Landroid/view/ViewTreeObserver$OnPreDrawListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lux;


# direct methods
.method public constructor <init>(Lux;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lux$e;->b:Lux;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lux$e;->b:Lux;

    invoke-virtual {v0}, Lux;->H()V

    const/4 v0, 0x1

    return v0
.end method
