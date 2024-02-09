.class public Lrh$b;
.super Landroid/media/MediaRouter2$ControllerCallback;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lrh;


# direct methods
.method public constructor <init>(Lrh;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrh$b;->a:Lrh;

    invoke-direct {p0}, Landroid/media/MediaRouter2$ControllerCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onControllerUpdated(Landroid/media/MediaRouter2$RoutingController;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lrh$b;->a:Lrh;

    invoke-virtual {v0, p1}, Lrh;->F(Landroid/media/MediaRouter2$RoutingController;)V

    return-void
.end method
