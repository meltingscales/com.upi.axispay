.class public final synthetic Lit;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ltu$b;


# static fields
.field public static final synthetic a:Lit;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lit;

    invoke-direct {v0}, Lit;-><init>()V

    sput-object v0, Lit;->a:Lit;

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

    check-cast p1, Landroid/database/Cursor;

    invoke-static {p1}, Ltu;->w0(Landroid/database/Cursor;)[B

    move-result-object p1

    return-object p1
.end method
