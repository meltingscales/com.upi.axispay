.class public final synthetic Lps;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lyu$a;


# instance fields
.field public final synthetic a:Lzs;


# direct methods
.method public synthetic constructor <init>(Lzs;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lps;->a:Lzs;

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lps;->a:Lzs;

    invoke-virtual {v0}, Lzs;->c()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
