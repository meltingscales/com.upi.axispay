.class public final synthetic Lxt;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ltu$b;


# instance fields
.field public final synthetic a:Ltu;


# direct methods
.method public synthetic constructor <init>(Ltu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxt;->a:Ltu;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lxt;->a:Ltu;

    check-cast p1, Landroid/database/Cursor;

    invoke-virtual {v0, p1}, Ltu;->y0(Landroid/database/Cursor;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
