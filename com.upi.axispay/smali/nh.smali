.class public final synthetic Lnh;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/util/function/Function;


# static fields
.field public static final synthetic a:Lnh;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lnh;

    invoke-direct {v0}, Lnh;-><init>()V

    sput-object v0, Lnh;->a:Lnh;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/media/MediaRoute2Info;

    invoke-static {p1}, Lzh;->c(Landroid/media/MediaRoute2Info;)Lsh;

    move-result-object p1

    return-object p1
.end method
