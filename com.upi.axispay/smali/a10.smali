.class public final synthetic La10;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcom/google/firebase/inject/Provider;


# static fields
.field public static final synthetic a:La10;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, La10;

    invoke-direct {v0}, La10;-><init>()V

    sput-object v0, La10;->a:La10;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
