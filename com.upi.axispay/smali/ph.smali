.class public final synthetic Lph;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/util/function/Predicate;


# static fields
.field public static final synthetic a:Lph;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lph;

    invoke-direct {v0}, Lph;-><init>()V

    sput-object v0, Lph;->a:Lph;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Landroid/media/MediaRoute2Info;

    invoke-static {p1}, Ljava/util/Objects;->nonNull(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
