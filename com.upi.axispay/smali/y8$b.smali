.class public final Ly8$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ly8$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly8;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:[Ly8$c;


# direct methods
.method public constructor <init>([Ly8$c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ly8$b;->a:[Ly8$c;

    return-void
.end method


# virtual methods
.method public a()[Ly8$c;
    .locals 1

    .line 1
    iget-object v0, p0, Ly8$b;->a:[Ly8$c;

    return-object v0
.end method
