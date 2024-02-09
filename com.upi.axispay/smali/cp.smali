.class public final synthetic Lcp;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ltr;


# static fields
.field public static final synthetic a:Lcp;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcp;

    invoke-direct {v0}, Lcp;-><init>()V

    sput-object v0, Lcp;->a:Lcp;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfp$a;

    check-cast p2, Lfp$b;

    invoke-static {p1, p2}, Lfp;->k(Lfp$a;Lfp$b;)Lfp$a;

    move-result-object p1

    return-object p1
.end method
