.class public Lux$k;
.super Lux$l;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lux;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "k"
.end annotation


# instance fields
.field public final synthetic e:Lux;


# direct methods
.method public constructor <init>(Lux;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lux$k;->e:Lux;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lux$l;-><init>(Lux;Lux$a;)V

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    .line 1
    iget-object v0, p0, Lux$k;->e:Lux;

    iget v0, v0, Lux;->h:F

    return v0
.end method
