.class public final Lun0$a;
.super Lzl0;
.source "AxisPay"

# interfaces
.implements Ldl0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lun0;->b(Ljava/lang/String;)Ldl0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lzl0;",
        "Ldl0<",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lun0$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lun0$a;

    invoke-direct {v0}, Lun0$a;-><init>()V

    sput-object v0, Lun0$a;->b:Lun0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lzl0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const v0, 0x12d0

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lun0$a;->b(Ljava/lang/String;)Ljava/lang/String;

    return-object p1
.end method
