.class public abstract Lsp;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsp$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lsp$a;
    .locals 1

    .line 1
    new-instance v0, Lmp$b;

    invoke-direct {v0}, Lmp$b;-><init>()V

    return-object v0
.end method

.method public static i(Ljava/lang/String;)Lsp$a;
    .locals 1

    .line 1
    invoke-static {}, Lsp;->a()Lsp$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lsp$a;->g(Ljava/lang/String;)Lsp$a;

    return-object v0
.end method

.method public static j([B)Lsp$a;
    .locals 1

    .line 1
    invoke-static {}, Lsp;->a()Lsp$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lsp$a;->f([B)Lsp$a;

    return-object v0
.end method


# virtual methods
.method public abstract b()Ljava/lang/Integer;
.end method

.method public abstract c()J
.end method

.method public abstract d()J
.end method

.method public abstract e()Lvp;
.end method

.method public abstract f()[B
.end method

.method public abstract g()Ljava/lang/String;
.end method

.method public abstract h()J
.end method
