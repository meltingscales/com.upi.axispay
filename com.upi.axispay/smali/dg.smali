.class public final Ldg;
.super Leg;
.source "AxisPay"


# direct methods
.method public constructor <init>(Landroid/media/session/MediaSessionManager$RemoteUserInfo;)V
    .locals 2

    .line 3
    invoke-virtual {p1}, Landroid/media/session/MediaSessionManager$RemoteUserInfo;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/media/session/MediaSessionManager$RemoteUserInfo;->getPid()I

    move-result v1

    .line 4
    invoke-virtual {p1}, Landroid/media/session/MediaSessionManager$RemoteUserInfo;->getUid()I

    move-result p1

    .line 5
    invoke-direct {p0, v0, v1, p1}, Leg;-><init>(Ljava/lang/String;II)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2, p3}, Leg;-><init>(Ljava/lang/String;II)V

    .line 2
    new-instance v0, Landroid/media/session/MediaSessionManager$RemoteUserInfo;

    invoke-direct {v0, p1, p2, p3}, Landroid/media/session/MediaSessionManager$RemoteUserInfo;-><init>(Ljava/lang/String;II)V

    return-void
.end method

.method public static a(Landroid/media/session/MediaSessionManager$RemoteUserInfo;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/media/session/MediaSessionManager$RemoteUserInfo;->getPackageName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
