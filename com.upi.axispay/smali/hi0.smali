.class public final Lhi0;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhi0$a;,
        Lhi0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field public static final b:Lhi0$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhi0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhi0$a;-><init>(Lvl0;)V

    sput-object v0, Lhi0;->b:Lhi0$a;

    return-void
.end method

.method public static a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    return-object p0
.end method
