.class public final Lxg$o;
.super Landroid/support/v4/media/session/MediaControllerCompat$Callback;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "o"
.end annotation


# instance fields
.field public final synthetic a:Lxg;


# direct methods
.method public constructor <init>(Lxg;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxg$o;->a:Lxg;

    invoke-direct {p0}, Landroid/support/v4/media/session/MediaControllerCompat$Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public onMetadataChanged(Landroid/support/v4/media/MediaMetadataCompat;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lxg$o;->a:Lxg;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/support/v4/media/MediaMetadataCompat;->getDescription()Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object p1

    :goto_0
    iput-object p1, v0, Lxg;->V:Landroid/support/v4/media/MediaDescriptionCompat;

    .line 2
    iget-object p1, p0, Lxg$o;->a:Lxg;

    invoke-virtual {p1}, Lxg;->I()V

    .line 3
    iget-object p1, p0, Lxg$o;->a:Lxg;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lxg;->H(Z)V

    return-void
.end method

.method public onPlaybackStateChanged(Landroid/support/v4/media/session/PlaybackStateCompat;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lxg$o;->a:Lxg;

    iput-object p1, v0, Lxg;->U:Landroid/support/v4/media/session/PlaybackStateCompat;

    const/4 p1, 0x0

    .line 2
    invoke-virtual {v0, p1}, Lxg;->H(Z)V

    return-void
.end method

.method public onSessionDestroyed()V
    .locals 2

    .line 1
    iget-object v0, p0, Lxg$o;->a:Lxg;

    iget-object v1, v0, Lxg;->S:Landroid/support/v4/media/session/MediaControllerCompat;

    if-eqz v1, :cond_0

    .line 2
    iget-object v0, v0, Lxg;->T:Lxg$o;

    invoke-virtual {v1, v0}, Landroid/support/v4/media/session/MediaControllerCompat;->unregisterCallback(Landroid/support/v4/media/session/MediaControllerCompat$Callback;)V

    .line 3
    iget-object v0, p0, Lxg$o;->a:Lxg;

    const/4 v1, 0x0

    iput-object v1, v0, Lxg;->S:Landroid/support/v4/media/session/MediaControllerCompat;

    :cond_0
    return-void
.end method
