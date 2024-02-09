.class public final Lch$e;
.super Landroid/support/v4/media/session/MediaControllerCompat$Callback;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lch;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "e"
.end annotation


# instance fields
.field public final synthetic a:Lch;


# direct methods
.method public constructor <init>(Lch;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lch$e;->a:Lch;

    invoke-direct {p0}, Landroid/support/v4/media/session/MediaControllerCompat$Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public onMetadataChanged(Landroid/support/v4/media/MediaMetadataCompat;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lch$e;->a:Lch;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/support/v4/media/MediaMetadataCompat;->getDescription()Landroid/support/v4/media/MediaDescriptionCompat;

    move-result-object p1

    :goto_0
    iput-object p1, v0, Lch;->K:Landroid/support/v4/media/MediaDescriptionCompat;

    .line 2
    iget-object p1, p0, Lch$e;->a:Lch;

    invoke-virtual {p1}, Lch;->m()V

    .line 3
    iget-object p1, p0, Lch$e;->a:Lch;

    invoke-virtual {p1}, Lch;->s()V

    return-void
.end method

.method public onSessionDestroyed()V
    .locals 2

    .line 1
    iget-object v0, p0, Lch$e;->a:Lch;

    iget-object v1, v0, Lch;->I:Landroid/support/v4/media/session/MediaControllerCompat;

    if-eqz v1, :cond_0

    .line 2
    iget-object v0, v0, Lch;->J:Lch$e;

    invoke-virtual {v1, v0}, Landroid/support/v4/media/session/MediaControllerCompat;->unregisterCallback(Landroid/support/v4/media/session/MediaControllerCompat$Callback;)V

    .line 3
    iget-object v0, p0, Lch$e;->a:Lch;

    const/4 v1, 0x0

    iput-object v1, v0, Lch;->I:Landroid/support/v4/media/session/MediaControllerCompat;

    :cond_0
    return-void
.end method
