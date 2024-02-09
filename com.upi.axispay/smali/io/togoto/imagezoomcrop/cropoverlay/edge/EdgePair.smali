.class public Lio/togoto/imagezoomcrop/cropoverlay/edge/EdgePair;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public primary:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

.field public secondary:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;


# direct methods
.method public constructor <init>(Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/togoto/imagezoomcrop/cropoverlay/edge/EdgePair;->primary:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    .line 3
    iput-object p2, p0, Lio/togoto/imagezoomcrop/cropoverlay/edge/EdgePair;->secondary:Lio/togoto/imagezoomcrop/cropoverlay/edge/Edge;

    return-void
.end method
