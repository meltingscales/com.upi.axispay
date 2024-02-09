package com.olive.upi.transport;

import android.app.AlertDialog;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class GPSTracker extends Service implements LocationListener {
    private static final long MIN_DISTANCE_CHANGE_FOR_UPDATES = 0;
    private static final long MIN_TIME_BW_UPDATES = 0;
    public double latitude;
    public Location location;
    public LocationManager locationManager;
    public double longitude;
    private final Context mContext;
    public boolean isGPSEnabled = false;
    public boolean isNetworkEnabled = false;
    public boolean canGetLocation = false;

    static {
        C0059ao.a(GPSTracker.class, 227);
    }

    public GPSTracker(Context context) {
        this.mContext = context;
        getLocation();
    }

    public boolean canGetLocation() {
        return this.canGetLocation;
    }

    public double getLatitude() {
        Location location = this.location;
        if (location != null) {
            this.latitude = location.getLatitude();
        }
        return this.latitude;
    }

    public Location getLocation() {
        try {
            LocationManager locationManager = (LocationManager) this.mContext.getSystemService(C0059ao.a(6189));
            this.locationManager = locationManager;
            String a = C0059ao.a(6190);
            String a2 = C0059ao.a(6191);
            if (locationManager != null) {
                this.isGPSEnabled = locationManager.isProviderEnabled(a2);
                this.isNetworkEnabled = this.locationManager.isProviderEnabled(a);
            }
            if (this.isGPSEnabled || this.isNetworkEnabled) {
                if (t8.a(this, C0059ao.a(6192)) != 0 && t8.a(this, C0059ao.a(6193)) != 0) {
                    return this.location;
                }
                this.canGetLocation = true;
                if (this.isNetworkEnabled) {
                    this.locationManager.requestLocationUpdates(C0059ao.a(6194), 60000L, 10.0f, this);
                    LocationManager locationManager2 = this.locationManager;
                    if (locationManager2 != null) {
                        Location lastKnownLocation = locationManager2.getLastKnownLocation(a);
                        this.location = lastKnownLocation;
                        if (lastKnownLocation != null) {
                            this.latitude = lastKnownLocation.getLatitude();
                            this.longitude = this.location.getLongitude();
                        }
                    }
                }
                if (this.isGPSEnabled && this.location == null) {
                    this.locationManager.requestLocationUpdates(C0059ao.a(6195), 60000L, 10.0f, this);
                    LocationManager locationManager3 = this.locationManager;
                    if (locationManager3 != null) {
                        Location lastKnownLocation2 = locationManager3.getLastKnownLocation(a2);
                        this.location = lastKnownLocation2;
                        if (lastKnownLocation2 != null) {
                            this.latitude = lastKnownLocation2.getLatitude();
                            this.longitude = this.location.getLongitude();
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return this.location;
    }

    public double getLongitude() {
        Location location = this.location;
        if (location != null) {
            this.longitude = location.getLongitude();
        }
        return this.longitude;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public void showSettingsAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.mContext);
        builder.setTitle(C0059ao.a(6196));
        builder.setMessage(C0059ao.a(6197));
        builder.setPositiveButton(C0059ao.a(6198), new DialogInterface.OnClickListener() { // from class: com.olive.upi.transport.GPSTracker.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                GPSTracker.this.mContext.startActivity(new Intent(C0059ao.a(14112)));
            }
        });
        builder.setNegativeButton(C0059ao.a(6199), new DialogInterface.OnClickListener() { // from class: com.olive.upi.transport.GPSTracker.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        builder.show();
    }

    public void stopUsingGPS() {
        LocationManager locationManager = this.locationManager;
        if (locationManager != null) {
            locationManager.removeUpdates(this);
        }
    }
}
