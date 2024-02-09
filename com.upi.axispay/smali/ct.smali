.class public final synthetic Lct;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ltu$b;


# static fields
.field public static final synthetic a:Lct;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lct;

    invoke-direct {v0}, Lct;-><init>()V

    sput-object v0, Lct;->a:Lct;

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

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Ltu;->c0(Ljava/lang/Throwable;)Landroid/database/sqlite/SQLiteDatabase;

    const/4 p1, 0x0

    throw p1
.end method
