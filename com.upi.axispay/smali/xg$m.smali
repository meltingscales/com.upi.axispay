.class public final Lxg$m;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "m"
.end annotation


# instance fields
.field public final synthetic b:Lxg;


# direct methods
.method public constructor <init>(Lxg;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxg$m;->b:Lxg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const/4 v0, 0x1

    const v1, 0x1020019

    if-eq p1, v1, :cond_6

    const v2, 0x102001a

    if-ne p1, v2, :cond_0

    goto/16 :goto_2

    .line 2
    :cond_0
    sget v1, Lng;->mr_control_playback_ctrl:I

    if-ne p1, v1, :cond_5

    .line 3
    iget-object p1, p0, Lxg$m;->b:Lxg;

    iget-object v1, p1, Lxg;->S:Landroid/support/v4/media/session/MediaControllerCompat;

    if-eqz v1, :cond_9

    iget-object p1, p1, Lxg;->U:Landroid/support/v4/media/session/PlaybackStateCompat;

    if-eqz p1, :cond_9

    .line 4
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->getState()I

    move-result p1

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-ne p1, v1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    if-eqz v0, :cond_2

    .line 5
    iget-object p1, p0, Lxg$m;->b:Lxg;

    invoke-virtual {p1}, Lxg;->w()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 6
    iget-object p1, p0, Lxg$m;->b:Lxg;

    iget-object p1, p1, Lxg;->S:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat;->getTransportControls()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;->pause()V

    .line 7
    sget v2, Lrg;->mr_controller_pause:I

    goto :goto_1

    :cond_2
    if-eqz v0, :cond_3

    .line 8
    iget-object p1, p0, Lxg$m;->b:Lxg;

    invoke-virtual {p1}, Lxg;->y()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 9
    iget-object p1, p0, Lxg$m;->b:Lxg;

    iget-object p1, p1, Lxg;->S:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat;->getTransportControls()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;->stop()V

    .line 10
    sget v2, Lrg;->mr_controller_stop:I

    goto :goto_1

    :cond_3
    if-nez v0, :cond_4

    .line 11
    iget-object p1, p0, Lxg$m;->b:Lxg;

    invoke-virtual {p1}, Lxg;->x()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 12
    iget-object p1, p0, Lxg$m;->b:Lxg;

    iget-object p1, p1, Lxg;->S:Landroid/support/v4/media/session/MediaControllerCompat;

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat;->getTransportControls()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;->play()V

    .line 13
    sget v2, Lrg;->mr_controller_play:I

    .line 14
    :cond_4
    :goto_1
    iget-object p1, p0, Lxg$m;->b:Lxg;

    iget-object p1, p1, Lxg;->o0:Landroid/view/accessibility/AccessibilityManager;

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result p1

    if-eqz p1, :cond_9

    if-eqz v2, :cond_9

    const/16 p1, 0x4000

    .line 15
    invoke-static {p1}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    .line 16
    iget-object v0, p0, Lxg$m;->b:Lxg;

    iget-object v0, v0, Lxg;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setPackageName(Ljava/lang/CharSequence;)V

    .line 17
    const-class v0, Lxg$m;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    .line 18
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lxg$m;->b:Lxg;

    iget-object v1, v1, Lxg;->h:Landroid/content/Context;

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19
    iget-object v0, p0, Lxg$m;->b:Lxg;

    iget-object v0, v0, Lxg;->o0:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityManager;->sendAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    goto :goto_3

    .line 20
    :cond_5
    sget v0, Lng;->mr_close:I

    if-ne p1, v0, :cond_9

    .line 21
    iget-object p1, p0, Lxg$m;->b:Lxg;

    invoke-virtual {p1}, Lc0;->dismiss()V

    goto :goto_3

    .line 22
    :cond_6
    :goto_2
    iget-object v2, p0, Lxg$m;->b:Lxg;

    iget-object v2, v2, Lxg;->g:Lyh$i;

    invoke-virtual {v2}, Lyh$i;->B()Z

    move-result v2

    if-eqz v2, :cond_8

    .line 23
    iget-object v2, p0, Lxg$m;->b:Lxg;

    iget-object v2, v2, Lxg;->e:Lyh;

    if-ne p1, v1, :cond_7

    const/4 v0, 0x2

    :cond_7
    invoke-virtual {v2, v0}, Lyh;->r(I)V

    .line 24
    :cond_8
    iget-object p1, p0, Lxg$m;->b:Lxg;

    invoke-virtual {p1}, Lc0;->dismiss()V

    :cond_9
    :goto_3
    return-void
.end method
