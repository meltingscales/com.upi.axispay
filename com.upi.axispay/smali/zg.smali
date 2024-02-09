.class public Lzg;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static final a:Lzg;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lzg;

    invoke-direct {v0}, Lzg;-><init>()V

    sput-object v0, Lzg;->a:Lzg;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lzg;
    .locals 1

    .line 1
    sget-object v0, Lzg;->a:Lzg;

    return-object v0
.end method


# virtual methods
.method public b()Lwg;
    .locals 1

    .line 1
    new-instance v0, Lwg;

    invoke-direct {v0}, Lwg;-><init>()V

    return-object v0
.end method

.method public c()Lyg;
    .locals 1

    .line 1
    new-instance v0, Lyg;

    invoke-direct {v0}, Lyg;-><init>()V

    return-object v0
.end method
