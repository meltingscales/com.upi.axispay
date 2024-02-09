.class public Lcom/olive/upi/transport/GPSTracker;
.super Landroid/app/Service;
.source "AxisPay"

# interfaces
.implements Landroid/location/LocationListener;


# static fields
.field private static final MIN_DISTANCE_CHANGE_FOR_UPDATES:J

.field private static final MIN_TIME_BW_UPDATES:J


# instance fields
.field public canGetLocation:Z

.field public isGPSEnabled:Z

.field public isNetworkEnabled:Z

.field public latitude:D

.field public location:Landroid/location/Location;

.field public locationManager:Landroid/location/LocationManager;

.field public longitude:D

.field private final mContext:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/olive/upi/transport/GPSTracker;

    const v1, 0xe3

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/olive/upi/transport/GPSTracker;->isGPSEnabled:Z

    .line 3
    iput-boolean v0, p0, Lcom/olive/upi/transport/GPSTracker;->isNetworkEnabled:Z

    .line 4
    iput-boolean v0, p0, Lcom/olive/upi/transport/GPSTracker;->canGetLocation:Z

    .line 5
    iput-object p1, p0, Lcom/olive/upi/transport/GPSTracker;->mContext:Landroid/content/Context;

    .line 6
    invoke-virtual {p0}, Lcom/olive/upi/transport/GPSTracker;->getLocation()Landroid/location/Location;

    return-void
.end method

.method public static synthetic access$000(Lcom/olive/upi/transport/GPSTracker;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/olive/upi/transport/GPSTracker;->mContext:Landroid/content/Context;

    return-object p0
.end method


# virtual methods
.method public canGetLocation()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/olive/upi/transport/GPSTracker;->canGetLocation:Z

    return v0
.end method

.method public getLatitude()D
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/GPSTracker;->location:Landroid/location/Location;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/olive/upi/transport/GPSTracker;->latitude:D

    .line 3
    :cond_0
    iget-wide v0, p0, Lcom/olive/upi/transport/GPSTracker;->latitude:D

    return-wide v0
.end method

.method public getLocation()Landroid/location/Location;
    .locals 10

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/olive/upi/transport/GPSTracker;->mContext:Landroid/content/Context;

    const v0, 0x182d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/location/LocationManager;

    iput-object v1, p0, Lcom/olive/upi/transport/GPSTracker;->locationManager:Landroid/location/LocationManager;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const v0, 0x182e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v0, 0x182f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    if-eqz v1, :cond_0

    .line 3
    :try_start_1
    invoke-virtual {v1, v3}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/olive/upi/transport/GPSTracker;->isGPSEnabled:Z

    .line 4
    iget-object v1, p0, Lcom/olive/upi/transport/GPSTracker;->locationManager:Landroid/location/LocationManager;

    .line 5
    invoke-virtual {v1, v2}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/olive/upi/transport/GPSTracker;->isNetworkEnabled:Z

    .line 6
    :cond_0
    iget-boolean v1, p0, Lcom/olive/upi/transport/GPSTracker;->isGPSEnabled:Z

    if-nez v1, :cond_1

    iget-boolean v1, p0, Lcom/olive/upi/transport/GPSTracker;->isNetworkEnabled:Z

    if-nez v1, :cond_1

    goto/16 :goto_0

    :cond_1
    const v0, 0x1830

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-static {p0, v1}, Lt8;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_2

    const v0, 0x1831

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Lt8;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_2

    .line 8
    iget-object v1, p0, Lcom/olive/upi/transport/GPSTracker;->location:Landroid/location/Location;

    return-object v1

    :cond_2
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, p0, Lcom/olive/upi/transport/GPSTracker;->canGetLocation:Z

    .line 10
    iget-boolean v1, p0, Lcom/olive/upi/transport/GPSTracker;->isNetworkEnabled:Z

    if-eqz v1, :cond_3

    .line 11
    iget-object v4, p0, Lcom/olive/upi/transport/GPSTracker;->locationManager:Landroid/location/LocationManager;

    const v0, 0x1832

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const-wide/32 v6, 0xea60

    const/high16 v8, 0x41200000    # 10.0f

    move-object v9, p0

    invoke-virtual/range {v4 .. v9}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V

    .line 12
    iget-object v1, p0, Lcom/olive/upi/transport/GPSTracker;->locationManager:Landroid/location/LocationManager;

    if-eqz v1, :cond_3

    .line 13
    invoke-virtual {v1, v2}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v1

    iput-object v1, p0, Lcom/olive/upi/transport/GPSTracker;->location:Landroid/location/Location;

    if-eqz v1, :cond_3

    .line 14
    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    iput-wide v1, p0, Lcom/olive/upi/transport/GPSTracker;->latitude:D

    .line 15
    iget-object v1, p0, Lcom/olive/upi/transport/GPSTracker;->location:Landroid/location/Location;

    invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    iput-wide v1, p0, Lcom/olive/upi/transport/GPSTracker;->longitude:D

    .line 16
    :cond_3
    iget-boolean v1, p0, Lcom/olive/upi/transport/GPSTracker;->isGPSEnabled:Z

    if-eqz v1, :cond_4

    .line 17
    iget-object v1, p0, Lcom/olive/upi/transport/GPSTracker;->location:Landroid/location/Location;

    if-nez v1, :cond_4

    .line 18
    iget-object v4, p0, Lcom/olive/upi/transport/GPSTracker;->locationManager:Landroid/location/LocationManager;

    const v0, 0x1833

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const-wide/32 v6, 0xea60

    const/high16 v8, 0x41200000    # 10.0f

    move-object v9, p0

    invoke-virtual/range {v4 .. v9}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V

    .line 19
    iget-object v1, p0, Lcom/olive/upi/transport/GPSTracker;->locationManager:Landroid/location/LocationManager;

    if-eqz v1, :cond_4

    .line 20
    invoke-virtual {v1, v3}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v1

    iput-object v1, p0, Lcom/olive/upi/transport/GPSTracker;->location:Landroid/location/Location;

    if-eqz v1, :cond_4

    .line 21
    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    iput-wide v1, p0, Lcom/olive/upi/transport/GPSTracker;->latitude:D

    .line 22
    iget-object v1, p0, Lcom/olive/upi/transport/GPSTracker;->location:Landroid/location/Location;

    invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    iput-wide v1, p0, Lcom/olive/upi/transport/GPSTracker;->longitude:D
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 23
    :catch_0
    :cond_4
    :goto_0
    iget-object v1, p0, Lcom/olive/upi/transport/GPSTracker;->location:Landroid/location/Location;

    return-object v1
.end method

.method public getLongitude()D
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/GPSTracker;->location:Landroid/location/Location;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/olive/upi/transport/GPSTracker;->longitude:D

    .line 3
    :cond_0
    iget-wide v0, p0, Lcom/olive/upi/transport/GPSTracker;->longitude:D

    return-wide v0
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onLocationChanged(Landroid/location/Location;)V
    .locals 0

    return-void
.end method

.method public onProviderDisabled(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onProviderEnabled(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public showSettingsAlert()V
    .locals 3

    .line 1
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/olive/upi/transport/GPSTracker;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x1834

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    const v1, 0x1835

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 4
    new-instance v1, Lcom/olive/upi/transport/GPSTracker$1;

    invoke-direct {v1, p0}, Lcom/olive/upi/transport/GPSTracker$1;-><init>(Lcom/olive/upi/transport/GPSTracker;)V

    const v2, 0x1836

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 5
    new-instance v1, Lcom/olive/upi/transport/GPSTracker$2;

    invoke-direct {v1, p0}, Lcom/olive/upi/transport/GPSTracker$2;-><init>(Lcom/olive/upi/transport/GPSTracker;)V

    const v2, 0x1837

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 6
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    return-void
.end method

.method public stopUsingGPS()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/GPSTracker;->locationManager:Landroid/location/LocationManager;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p0}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    :cond_0
    return-void
.end method
