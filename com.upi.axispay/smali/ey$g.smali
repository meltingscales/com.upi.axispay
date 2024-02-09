.class public Ley$g;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ley$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ley;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation


# instance fields
.field public final a:Lk1;

.field public b:Z


# direct methods
.method public constructor <init>(Lk1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ley$g;->a:Lk1;

    return-void
.end method


# virtual methods
.method public a()Lk1;
    .locals 1

    .line 1
    iget-object v0, p0, Ley$g;->a:Lk1;

    return-object v0
.end method
