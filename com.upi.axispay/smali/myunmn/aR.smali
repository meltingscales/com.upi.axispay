.class public Lmyunmn/aR;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/String; = "libjni_proxy_launcher.so"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lmyunmn/aR;->a:Ljava/lang/String;

    invoke-static {v0, p0}, Lmyunmn/aR;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static native a(Ljava/lang/String;Ljava/lang/String;)V
.end method
