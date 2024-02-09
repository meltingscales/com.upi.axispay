.class public Lcg0;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Ljava/util/logging/Logger;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lcg0;

    const v1, 0x145

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    const-class v0, Lcg0;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcg0;->b:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)[B
    .locals 5

    .line 1
    sget-object v0, Lcg0;->b:Ljava/util/logging/Logger;

    sget-object v1, Lcg0;->a:Ljava/lang/String;

    const v2, 0x6a5

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/logging/Logger;->entering(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    const-class v3, Lcg0;

    invoke-static {v3}, Ljava/util/prefs/Preferences;->userNodeForPackage(Ljava/lang/Class;)Ljava/util/prefs/Preferences;

    move-result-object v3

    const v4, 0x6a6

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 3
    invoke-virtual {v3, v4, p0}, Ljava/util/prefs/Preferences;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0, v1, v2}, Ljava/util/logging/Logger;->exiting(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    .line 5
    invoke-virtual {v3, v4, p0}, Ljava/util/prefs/Preferences;->getByteArray(Ljava/lang/String;[B)[B

    move-result-object p0

    return-object p0
.end method

.method public static b([B)Ljava/lang/String;
    .locals 5

    .line 1
    sget-object v0, Lcg0;->b:Ljava/util/logging/Logger;

    sget-object v1, Lcg0;->a:Ljava/lang/String;

    const v2, 0x6a7

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/logging/Logger;->entering(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    const-class v3, Lcg0;

    invoke-static {v3}, Ljava/util/prefs/Preferences;->userNodeForPackage(Ljava/lang/Class;)Ljava/util/prefs/Preferences;

    move-result-object v3

    const v4, 0x6a8

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 3
    invoke-virtual {v3, v4, p0}, Ljava/util/prefs/Preferences;->putByteArray(Ljava/lang/String;[B)V

    .line 4
    invoke-virtual {v0, v1, v2}, Ljava/util/logging/Logger;->exiting(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    .line 5
    invoke-virtual {v3, v4, p0}, Ljava/util/prefs/Preferences;->get(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
