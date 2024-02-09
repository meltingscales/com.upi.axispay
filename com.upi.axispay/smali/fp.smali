.class public final Lfp;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfp$a;,
        Lfp$b;
    }
.end annotation


# instance fields
.field public final a:Lcom/google/firebase/encoders/DataEncoder;

.field public final b:Landroid/net/ConnectivityManager;

.field public final c:Landroid/content/Context;

.field public final d:Ljava/net/URL;

.field public final e:Lzu;

.field public final f:Lzu;

.field public final g:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lzu;Lzu;)V
    .locals 1

    const v0, 0x9c40

    .line 9
    invoke-direct {p0, p1, p2, p3, v0}, Lfp;-><init>(Landroid/content/Context;Lzu;Lzu;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lzu;Lzu;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Lqp;->b()Lcom/google/firebase/encoders/DataEncoder;

    move-result-object v0

    iput-object v0, p0, Lfp;->a:Lcom/google/firebase/encoders/DataEncoder;

    .line 3
    iput-object p1, p0, Lfp;->c:Landroid/content/Context;

    const v0, 0x177e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/ConnectivityManager;

    iput-object p1, p0, Lfp;->b:Landroid/net/ConnectivityManager;

    .line 5
    sget-object p1, Lep;->c:Ljava/lang/String;

    invoke-static {p1}, Lfp;->m(Ljava/lang/String;)Ljava/net/URL;

    move-result-object p1

    iput-object p1, p0, Lfp;->d:Ljava/net/URL;

    .line 6
    iput-object p3, p0, Lfp;->e:Lzu;

    .line 7
    iput-object p2, p0, Lfp;->f:Lzu;

    .line 8
    iput p4, p0, Lfp;->g:I

    return-void
.end method

.method public static d(Landroid/net/NetworkInfo;)I
    .locals 1

    if-nez p0, :cond_0

    .line 1
    sget-object p0, Lvp$b;->c:Lvp$b;

    invoke-virtual {p0}, Lvp$b;->b()I

    move-result p0

    return p0

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getSubtype()I

    move-result p0

    const/4 v0, -0x1

    if-ne p0, v0, :cond_1

    .line 3
    sget-object p0, Lvp$b;->w:Lvp$b;

    invoke-virtual {p0}, Lvp$b;->b()I

    move-result p0

    return p0

    .line 4
    :cond_1
    invoke-static {p0}, Lvp$b;->a(I)Lvp$b;

    move-result-object v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static e(Landroid/net/NetworkInfo;)I
    .locals 0

    if-nez p0, :cond_0

    .line 1
    sget-object p0, Lvp$c;->u:Lvp$c;

    invoke-virtual {p0}, Lvp$c;->b()I

    move-result p0

    return p0

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getType()I

    move-result p0

    return p0
.end method

.method public static f(Landroid/content/Context;)I
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/4 v2, 0x0

    invoke-virtual {v1, p0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    iget p0, p0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p0

    const v0, 0x177f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v0, 0x1780

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 3
    invoke-static {v1, v2, p0}, Lqr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, -0x1

    return p0
.end method

.method public static h(Landroid/content/Context;)Landroid/telephony/TelephonyManager;
    .locals 1

    const v0, 0x1781

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 1
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/telephony/TelephonyManager;

    return-object p0
.end method

.method public static i()J
    .locals 3

    .line 1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 2
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v0

    .line 3
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/TimeZone;->getOffset(J)I

    move-result v0

    div-int/lit16 v0, v0, 0x3e8

    int-to-long v0, v0

    return-wide v0
.end method

.method public static synthetic j(Lfp;Lfp$a;)Lfp$b;
    .locals 0

    invoke-virtual {p0, p1}, Lfp;->c(Lfp$a;)Lfp$b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lfp$a;Lfp$b;)Lfp$a;
    .locals 3

    .line 1
    iget-object v0, p1, Lfp$b;->b:Ljava/net/URL;

    if-eqz v0, :cond_0

    const v1, 0x1782

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x1783

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-static {v1, v2, v0}, Lqr;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 3
    iget-object p1, p1, Lfp$b;->b:Ljava/net/URL;

    invoke-virtual {p0, p1}, Lfp$a;->a(Ljava/net/URL;)Lfp$a;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static l(Ljava/io/InputStream;Ljava/lang/String;)Ljava/io/InputStream;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const v0, 0x1784

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 1
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    new-instance p1, Ljava/util/zip/GZIPInputStream;

    invoke-direct {p1, p0}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    return-object p1

    :cond_0
    return-object p0
.end method

.method public static m(Ljava/lang/String;)Ljava/net/URL;
    .locals 5

    .line 1
    :try_start_0
    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v1

    .line 2
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x1785

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method


# virtual methods
.method public a(Lfq;)Lfq;
    .locals 4

    .line 1
    iget-object v0, p0, Lfp;->b:Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Lfq;->l()Lfq$a;

    move-result-object p1

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const v2, 0x1786

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 3
    invoke-virtual {p1, v2, v1}, Lfq$a;->a(Ljava/lang/String;I)Lfq$a;

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const v2, 0x1787

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-virtual {p1, v2, v1}, Lfq$a;->c(Ljava/lang/String;Ljava/lang/String;)Lfq$a;

    sget-object v1, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    const v2, 0x1788

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 5
    invoke-virtual {p1, v2, v1}, Lfq$a;->c(Ljava/lang/String;Ljava/lang/String;)Lfq$a;

    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    const v2, 0x1789

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 6
    invoke-virtual {p1, v2, v1}, Lfq$a;->c(Ljava/lang/String;Ljava/lang/String;)Lfq$a;

    sget-object v1, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    const v2, 0x178a

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 7
    invoke-virtual {p1, v2, v1}, Lfq$a;->c(Ljava/lang/String;Ljava/lang/String;)Lfq$a;

    sget-object v1, Landroid/os/Build;->ID:Ljava/lang/String;

    const v2, 0x178b

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 8
    invoke-virtual {p1, v2, v1}, Lfq$a;->c(Ljava/lang/String;Ljava/lang/String;)Lfq$a;

    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const v2, 0x178c

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 9
    invoke-virtual {p1, v2, v1}, Lfq$a;->c(Ljava/lang/String;Ljava/lang/String;)Lfq$a;

    sget-object v1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    const v2, 0x178d

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 10
    invoke-virtual {p1, v2, v1}, Lfq$a;->c(Ljava/lang/String;Ljava/lang/String;)Lfq$a;

    .line 11
    invoke-static {}, Lfp;->i()J

    move-result-wide v1

    const v3, 0x178e

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3, v1, v2}, Lfq$a;->b(Ljava/lang/String;J)Lfq$a;

    .line 12
    invoke-static {v0}, Lfp;->e(Landroid/net/NetworkInfo;)I

    move-result v1

    const v2, 0x178f

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2, v1}, Lfq$a;->a(Ljava/lang/String;I)Lfq$a;

    .line 13
    invoke-static {v0}, Lfp;->d(Landroid/net/NetworkInfo;)I

    move-result v0

    const v1, 0x1790

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Lfq$a;->a(Ljava/lang/String;I)Lfq$a;

    .line 14
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    const v1, 0x1791

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Lfq$a;->c(Ljava/lang/String;Ljava/lang/String;)Lfq$a;

    .line 15
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    const v1, 0x1792

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Lfq$a;->c(Ljava/lang/String;Ljava/lang/String;)Lfq$a;

    iget-object v0, p0, Lfp;->c:Landroid/content/Context;

    .line 16
    invoke-static {v0}, Lfp;->h(Landroid/content/Context;)Landroid/telephony/TelephonyManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimOperator()Ljava/lang/String;

    move-result-object v0

    const v1, 0x1793

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Lfq$a;->c(Ljava/lang/String;Ljava/lang/String;)Lfq$a;

    iget-object v0, p0, Lfp;->c:Landroid/content/Context;

    .line 17
    invoke-static {v0}, Lfp;->f(Landroid/content/Context;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x1794

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 18
    invoke-virtual {p1, v1, v0}, Lfq$a;->c(Ljava/lang/String;Ljava/lang/String;)Lfq$a;

    .line 19
    invoke-virtual {p1}, Lfq$a;->d()Lfq;

    move-result-object p1

    return-object p1
.end method

.method public b(Lxq;)Lyq;
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, Lfp;->g(Lxq;)Lqp;

    move-result-object v1

    .line 2
    iget-object v2, p0, Lfp;->d:Ljava/net/URL;

    .line 3
    invoke-virtual {p1}, Lxq;->c()[B

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    .line 4
    :try_start_0
    invoke-virtual {p1}, Lxq;->c()[B

    move-result-object p1

    invoke-static {p1}, Lep;->d([B)Lep;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lep;->e()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 6
    invoke-virtual {p1}, Lep;->e()Ljava/lang/String;

    move-result-object v3

    move-object v4, v3

    .line 7
    :cond_0
    invoke-virtual {p1}, Lep;->f()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 8
    invoke-virtual {p1}, Lep;->f()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lfp;->m(Ljava/lang/String;)Ljava/net/URL;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, p1

    goto :goto_0

    .line 9
    :catch_0
    invoke-static {}, Lyq;->a()Lyq;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x5

    .line 10
    :try_start_1
    new-instance v3, Lfp$a;

    invoke-direct {v3, v2, v1, v4}, Lfp$a;-><init>(Ljava/net/URL;Lqp;Ljava/lang/String;)V

    new-instance v1, Ldp;

    invoke-direct {v1, p0}, Ldp;-><init>(Lfp;)V

    sget-object v2, Lcp;->a:Lcp;

    .line 11
    invoke-static {p1, v3, v1, v2}, Lsr;->a(ILjava/lang/Object;Lrr;Ltr;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lfp$b;

    .line 12
    iget v1, p1, Lfp$b;->a:I

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_2

    .line 13
    iget-wide v1, p1, Lfp$b;->c:J

    invoke-static {v1, v2}, Lyq;->e(J)Lyq;

    move-result-object p1

    return-object p1

    :cond_2
    const/16 p1, 0x1f4

    if-ge v1, p1, :cond_5

    const/16 p1, 0x194

    if-ne v1, p1, :cond_3

    goto :goto_1

    :cond_3
    const/16 p1, 0x190

    if-ne v1, p1, :cond_4

    .line 14
    invoke-static {}, Lyq;->d()Lyq;

    move-result-object p1

    return-object p1

    .line 15
    :cond_4
    invoke-static {}, Lyq;->a()Lyq;

    move-result-object p1

    return-object p1

    .line 16
    :cond_5
    :goto_1
    invoke-static {}, Lyq;->f()Lyq;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p1

    :catch_1
    move-exception p1

    const v0, 0x1795

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v0, 0x1796

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 17
    invoke-static {v1, v2, p1}, Lqr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    invoke-static {}, Lyq;->f()Lyq;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lfp$a;)Lfp$b;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v1, p1, Lfp$a;->a:Ljava/net/URL;

    const v0, 0x1797

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v0, 0x1798

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v1}, Lqr;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    iget-object v1, p1, Lfp$a;->a:Ljava/net/URL;

    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v1

    check-cast v1, Ljava/net/HttpURLConnection;

    const/16 v3, 0x7530

    .line 3
    invoke-virtual {v1, v3}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 4
    iget v3, p0, Lfp;->g:I

    invoke-virtual {v1, v3}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    const/4 v3, 0x1

    .line 5
    invoke-virtual {v1, v3}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    const/4 v4, 0x0

    .line 6
    invoke-virtual {v1, v4}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    const v0, 0x1799

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 7
    invoke-virtual {v1, v5}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    new-array v3, v3, [Ljava/lang/Object;

    const v0, 0x179a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    const v0, 0x179b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 8
    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const v0, 0x179c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 9
    invoke-virtual {v1, v4, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const v0, 0x179d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v0, 0x179e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 10
    invoke-virtual {v1, v3, v4}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const v0, 0x179f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const v0, 0x17a0

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    .line 11
    invoke-virtual {v1, v5, v6}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const v0, 0x17a1

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    .line 12
    invoke-virtual {v1, v6, v4}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    iget-object v4, p1, Lfp$a;->c:Ljava/lang/String;

    if-eqz v4, :cond_0

    const v0, 0x17a2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    .line 14
    invoke-virtual {v1, v6, v4}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const-wide/16 v6, 0x0

    const/4 v4, 0x0

    .line 15
    :try_start_0
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v8
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/google/firebase/encoders/EncodingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    :try_start_1
    new-instance v9, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v9, v8}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    .line 17
    :try_start_2
    iget-object v10, p0, Lfp;->a:Lcom/google/firebase/encoders/DataEncoder;

    iget-object p1, p1, Lfp$a;->b:Lqp;

    new-instance v11, Ljava/io/BufferedWriter;

    new-instance v12, Ljava/io/OutputStreamWriter;

    invoke-direct {v12, v9}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {v11, v12}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    invoke-interface {v10, p1, v11}, Lcom/google/firebase/encoders/DataEncoder;->encode(Ljava/lang/Object;Ljava/io/Writer;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 18
    :try_start_3
    invoke-virtual {v9}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    if-eqz v8, :cond_1

    :try_start_4
    invoke-virtual {v8}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/net/ConnectException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/net/UnknownHostException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Lcom/google/firebase/encoders/EncodingException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 19
    :cond_1
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result p1

    .line 20
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x17a3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v2, v8}, Lqr;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x17a4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lqr;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x17a5

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lqr;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x12e

    if-eq p1, v2, :cond_8

    const/16 v2, 0x12d

    if-eq p1, v2, :cond_8

    const/16 v2, 0x133

    if-ne p1, v2, :cond_2

    goto :goto_2

    :cond_2
    const/16 v2, 0xc8

    if-eq p1, v2, :cond_3

    .line 23
    new-instance v1, Lfp$b;

    invoke-direct {v1, p1, v4, v6, v7}, Lfp$b;-><init>(ILjava/net/URL;J)V

    return-object v1

    .line 24
    :cond_3
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    .line 25
    :try_start_5
    invoke-virtual {v1, v3}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lfp;->l(Ljava/io/InputStream;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 26
    :try_start_6
    new-instance v3, Ljava/io/BufferedReader;

    new-instance v5, Ljava/io/InputStreamReader;

    invoke-direct {v5, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v3, v5}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 27
    invoke-static {v3}, Lup;->b(Ljava/io/Reader;)Lup;

    move-result-object v3

    .line 28
    invoke-virtual {v3}, Lup;->c()J

    move-result-wide v5

    .line 29
    new-instance v3, Lfp$b;

    invoke-direct {v3, p1, v4, v5, v6}, Lfp$b;-><init>(ILjava/net/URL;J)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-eqz v1, :cond_4

    .line 30
    :try_start_7
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :cond_4
    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    :cond_5
    return-object v3

    :catchall_0
    move-exception p1

    if-eqz v1, :cond_6

    .line 31
    :try_start_8
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    :try_start_9
    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_6
    :goto_0
    throw p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :catchall_2
    move-exception p1

    if-eqz v2, :cond_7

    :try_start_a
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v1

    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_7
    :goto_1
    throw p1

    :cond_8
    :goto_2
    const v0, 0x17a6

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 32
    invoke-virtual {v1, v2}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 33
    new-instance v2, Lfp$b;

    new-instance v3, Ljava/net/URL;

    invoke-direct {v3, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, p1, v3, v6, v7}, Lfp$b;-><init>(ILjava/net/URL;J)V

    return-object v2

    :catchall_4
    move-exception p1

    .line 34
    :try_start_b
    invoke-virtual {v9}, Ljava/io/OutputStream;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    goto :goto_3

    :catchall_5
    move-exception v1

    :try_start_c
    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    :catchall_6
    move-exception p1

    if-eqz v8, :cond_9

    :try_start_d
    invoke-virtual {v8}, Ljava/io/OutputStream;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    goto :goto_4

    :catchall_7
    move-exception v1

    :try_start_e
    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_9
    :goto_4
    throw p1
    :try_end_e
    .catch Ljava/net/ConnectException; {:try_start_e .. :try_end_e} :catch_3
    .catch Ljava/net/UnknownHostException; {:try_start_e .. :try_end_e} :catch_2
    .catch Lcom/google/firebase/encoders/EncodingException; {:try_start_e .. :try_end_e} :catch_1
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_0

    :catch_0
    move-exception p1

    goto :goto_5

    :catch_1
    move-exception p1

    :goto_5
    const v0, 0x17a7

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 35
    invoke-static {v2, v1, p1}, Lqr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    new-instance p1, Lfp$b;

    const/16 v1, 0x190

    invoke-direct {p1, v1, v4, v6, v7}, Lfp$b;-><init>(ILjava/net/URL;J)V

    return-object p1

    :catch_2
    move-exception p1

    goto :goto_6

    :catch_3
    move-exception p1

    :goto_6
    const v0, 0x17a8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 37
    invoke-static {v2, v1, p1}, Lqr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 38
    new-instance p1, Lfp$b;

    const/16 v1, 0x1f4

    invoke-direct {p1, v1, v4, v6, v7}, Lfp$b;-><init>(ILjava/net/URL;J)V

    return-object p1
.end method

.method public final g(Lxq;)Lqp;
    .locals 9

    .line 1
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 2
    invoke-virtual {p1}, Lxq;->b()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfq;

    .line 3
    invoke-virtual {v2}, Lfq;->j()Ljava/lang/String;

    move-result-object v3

    .line 4
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 5
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 6
    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 9
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 11
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    const/4 v4, 0x0

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfq;

    .line 12
    invoke-static {}, Ltp;->a()Ltp$a;

    move-result-object v4

    sget-object v5, Lwp;->b:Lwp;

    .line 13
    invoke-virtual {v4, v5}, Ltp$a;->f(Lwp;)Ltp$a;

    iget-object v5, p0, Lfp;->f:Lzu;

    .line 14
    invoke-interface {v5}, Lzu;->a()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Ltp$a;->g(J)Ltp$a;

    iget-object v5, p0, Lfp;->e:Lzu;

    .line 15
    invoke-interface {v5}, Lzu;->a()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Ltp$a;->h(J)Ltp$a;

    .line 16
    invoke-static {}, Lrp;->a()Lrp$a;

    move-result-object v5

    sget-object v6, Lrp$b;->c:Lrp$b;

    .line 17
    invoke-virtual {v5, v6}, Lrp$a;->c(Lrp$b;)Lrp$a;

    .line 18
    invoke-static {}, Lhp;->a()Lhp$a;

    move-result-object v6

    const v0, 0x17a9

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 19
    invoke-virtual {v3, v7}, Lfq;->g(Ljava/lang/String;)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v6, v7}, Lhp$a;->m(Ljava/lang/Integer;)Lhp$a;

    const v0, 0x17aa

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 20
    invoke-virtual {v3, v7}, Lfq;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lhp$a;->j(Ljava/lang/String;)Lhp$a;

    const v0, 0x17ab

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 21
    invoke-virtual {v3, v7}, Lfq;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lhp$a;->f(Ljava/lang/String;)Lhp$a;

    const v0, 0x17ac

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 22
    invoke-virtual {v3, v7}, Lfq;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lhp$a;->d(Ljava/lang/String;)Lhp$a;

    const v0, 0x17ad

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 23
    invoke-virtual {v3, v7}, Lfq;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lhp$a;->l(Ljava/lang/String;)Lhp$a;

    const v0, 0x17ae

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 24
    invoke-virtual {v3, v7}, Lfq;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lhp$a;->k(Ljava/lang/String;)Lhp$a;

    const v0, 0x17af

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 25
    invoke-virtual {v3, v7}, Lfq;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lhp$a;->h(Ljava/lang/String;)Lhp$a;

    const v0, 0x17b0

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 26
    invoke-virtual {v3, v7}, Lfq;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lhp$a;->e(Ljava/lang/String;)Lhp$a;

    const v0, 0x17b1

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 27
    invoke-virtual {v3, v7}, Lfq;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lhp$a;->c(Ljava/lang/String;)Lhp$a;

    const v0, 0x17b2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 28
    invoke-virtual {v3, v7}, Lfq;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lhp$a;->g(Ljava/lang/String;)Lhp$a;

    const v0, 0x17b3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 29
    invoke-virtual {v3, v7}, Lfq;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lhp$a;->i(Ljava/lang/String;)Lhp$a;

    const v0, 0x17b4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 30
    invoke-virtual {v3, v7}, Lfq;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Lhp$a;->b(Ljava/lang/String;)Lhp$a;

    .line 31
    invoke-virtual {v6}, Lhp$a;->a()Lhp;

    move-result-object v3

    .line 32
    invoke-virtual {v5, v3}, Lrp$a;->b(Lhp;)Lrp$a;

    .line 33
    invoke-virtual {v5}, Lrp$a;->a()Lrp;

    move-result-object v3

    .line 34
    invoke-virtual {v4, v3}, Ltp$a;->b(Lrp;)Ltp$a;

    .line 35
    :try_start_0
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v4, v3}, Ltp$a;->i(I)Ltp$a;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 36
    :catch_0
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v4, v3}, Ltp$a;->j(Ljava/lang/String;)Ltp$a;

    .line 37
    :goto_2
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 38
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lfq;

    .line 39
    invoke-virtual {v5}, Lfq;->e()Leq;

    move-result-object v6

    .line 40
    invoke-virtual {v6}, Leq;->b()Lvo;

    move-result-object v7

    const v0, 0x17b5

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    .line 41
    invoke-static {v8}, Lvo;->b(Ljava/lang/String;)Lvo;

    move-result-object v8

    invoke-virtual {v7, v8}, Lvo;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 42
    invoke-virtual {v6}, Leq;->a()[B

    move-result-object v6

    invoke-static {v6}, Lsp;->j([B)Lsp$a;

    move-result-object v6

    goto :goto_4

    :cond_2
    const v0, 0x17b6

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    .line 43
    invoke-static {v8}, Lvo;->b(Ljava/lang/String;)Lvo;

    move-result-object v8

    invoke-virtual {v7, v8}, Lvo;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 44
    new-instance v7, Ljava/lang/String;

    .line 45
    invoke-virtual {v6}, Leq;->a()[B

    move-result-object v6

    const v0, 0x17b7

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v8

    invoke-direct {v7, v6, v8}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-static {v7}, Lsp;->i(Ljava/lang/String;)Lsp$a;

    move-result-object v6

    .line 46
    :goto_4
    invoke-virtual {v5}, Lfq;->f()J

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Lsp$a;->c(J)Lsp$a;

    .line 47
    invoke-virtual {v5}, Lfq;->k()J

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Lsp$a;->d(J)Lsp$a;

    const v0, 0x17b8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 48
    invoke-virtual {v5, v7}, Lfq;->h(Ljava/lang/String;)J

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Lsp$a;->h(J)Lsp$a;

    .line 49
    invoke-static {}, Lvp;->a()Lvp$a;

    move-result-object v7

    const v0, 0x17b9

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    .line 50
    invoke-virtual {v5, v8}, Lfq;->g(Ljava/lang/String;)I

    move-result v8

    .line 51
    invoke-static {v8}, Lvp$c;->a(I)Lvp$c;

    move-result-object v8

    .line 52
    invoke-virtual {v7, v8}, Lvp$a;->c(Lvp$c;)Lvp$a;

    const v0, 0x17ba

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    .line 53
    invoke-virtual {v5, v8}, Lfq;->g(Ljava/lang/String;)I

    move-result v8

    .line 54
    invoke-static {v8}, Lvp$b;->a(I)Lvp$b;

    move-result-object v8

    .line 55
    invoke-virtual {v7, v8}, Lvp$a;->b(Lvp$b;)Lvp$a;

    .line 56
    invoke-virtual {v7}, Lvp$a;->a()Lvp;

    move-result-object v7

    .line 57
    invoke-virtual {v6, v7}, Lsp$a;->e(Lvp;)Lsp$a;

    .line 58
    invoke-virtual {v5}, Lfq;->d()Ljava/lang/Integer;

    move-result-object v7

    if-eqz v7, :cond_3

    .line 59
    invoke-virtual {v5}, Lfq;->d()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v6, v5}, Lsp$a;->b(Ljava/lang/Integer;)Lsp$a;

    .line 60
    :cond_3
    invoke-virtual {v6}, Lsp$a;->a()Lsp;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    :cond_4
    const v0, 0x17bb

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const v0, 0x17bc

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    .line 61
    invoke-static {v5, v6, v7}, Lqr;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_3

    .line 62
    :cond_5
    invoke-virtual {v4, v3}, Ltp$a;->c(Ljava/util/List;)Ltp$a;

    .line 63
    invoke-virtual {v4}, Ltp$a;->a()Ltp;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 64
    :cond_6
    invoke-static {p1}, Lqp;->a(Ljava/util/List;)Lqp;

    move-result-object p1

    return-object p1
.end method
