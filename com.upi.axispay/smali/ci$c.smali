.class public Lci$c;
.super Lbi$b;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lci;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lci$b;",
        ">",
        "Lbi$b<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lci$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lbi$b;-><init>(Lbi$a;)V

    return-void
.end method


# virtual methods
.method public onRoutePresentationDisplayChanged(Landroid/media/MediaRouter;Landroid/media/MediaRouter$RouteInfo;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lbi$b;->a:Lbi$a;

    check-cast p1, Lci$b;

    invoke-interface {p1, p2}, Lci$b;->a(Ljava/lang/Object;)V

    return-void
.end method
