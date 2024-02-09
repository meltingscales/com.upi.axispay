.class public La3$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic b:La3;


# direct methods
.method public constructor <init>(La3;)V
    .locals 0

    .line 1
    iput-object p1, p0, La3$b;->b:La3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, La3$b;->b:La3;

    invoke-virtual {v0}, La3;->r()V

    return-void
.end method
