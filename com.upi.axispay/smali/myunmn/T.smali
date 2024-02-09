.class public final Lmyunmn/T;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lmyunmn/f;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()V
    .locals 1

    sget-object v0, Lmyunmn/T;->a:Lmyunmn/f;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lmyunmn/T;->a(Lmyunmn/f;)V

    const/4 v0, 0x0

    sput-object v0, Lmyunmn/T;->a:Lmyunmn/f;

    :cond_0
    return-void
.end method

.method public static native a(Landroid/content/Context;Lmyunmn/f;)V
.end method

.method public static native a(Lmyunmn/f;)V
.end method

.method public static b(Landroid/content/Context;Lmyunmn/f;)V
    .locals 0

    invoke-static {}, Lmyunmn/T;->a()V

    sput-object p1, Lmyunmn/T;->a:Lmyunmn/f;

    invoke-static {p0, p1}, Lmyunmn/T;->a(Landroid/content/Context;Lmyunmn/f;)V

    return-void
.end method
