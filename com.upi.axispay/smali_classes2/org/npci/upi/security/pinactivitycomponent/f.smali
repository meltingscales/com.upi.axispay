.class public Lorg/npci/upi/security/pinactivitycomponent/f;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public a:Lin/org/npci/commonlibrary/b;

.field public b:Ljava/lang/String;

.field public c:Lorg/npci/upi/security/pinactivitycomponent/e;


# direct methods
.method public constructor <init>(Lin/org/npci/commonlibrary/b;Lorg/npci/upi/security/pinactivitycomponent/e;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/f;->a:Lin/org/npci/commonlibrary/b;

    iput-object p3, p0, Lorg/npci/upi/security/pinactivitycomponent/f;->b:Ljava/lang/String;

    iput-object p2, p0, Lorg/npci/upi/security/pinactivitycomponent/f;->c:Lorg/npci/upi/security/pinactivitycomponent/e;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lin/org/npci/commonlibrary/Message;
    .locals 8

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/f;->a:Lin/org/npci/commonlibrary/b;

    iget-object v3, p0, Lorg/npci/upi/security/pinactivitycomponent/f;->b:Ljava/lang/String;

    move-object v4, p4

    move-object v5, p5

    move-object v6, p1

    move-object v7, p6

    invoke-virtual/range {v2 .. v7}, Lin/org/npci/commonlibrary/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lin/org/npci/commonlibrary/Message;

    move-result-object v1

    invoke-virtual {v1, p2}, Lin/org/npci/commonlibrary/Message;->c(Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Lin/org/npci/commonlibrary/Message;->b(Ljava/lang/String;)V

    invoke-virtual {v1}, Lin/org/npci/commonlibrary/Message;->a()Lin/org/npci/commonlibrary/Data;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x97b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lin/org/npci/commonlibrary/Message;->a()Lin/org/npci/commonlibrary/Data;

    move-result-object p3

    invoke-virtual {p3}, Lin/org/npci/commonlibrary/Data;->a()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lin/org/npci/commonlibrary/Data;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Lin/org/npci/commonlibrary/c; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const v0, 0x97c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    const v0, 0x97d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/npci/upi/security/pinactivitycomponent/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object v1
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Lin/org/npci/commonlibrary/Message;
    .locals 11

    const v0, 0x97e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_0
    const v0, 0x97f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p4, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const v0, 0x980

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p4, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const v0, 0x981

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p4, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const v0, 0x982

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p4, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const v0, 0x983

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p4, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v5, p0, Lorg/npci/upi/security/pinactivitycomponent/f;->c:Lorg/npci/upi/security/pinactivitycomponent/e;

    if-nez v5, :cond_0

    const v0, 0x984

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_0
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    :goto_0
    const v0, 0x985

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v5}, Lorg/npci/upi/security/pinactivitycomponent/l;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v5, p0, Lorg/npci/upi/security/pinactivitycomponent/f;->c:Lorg/npci/upi/security/pinactivitycomponent/e;

    invoke-virtual {v5, v3, v4, p4}, Lorg/npci/upi/security/pinactivitycomponent/e;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const v0, 0x986

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4, v10}, Lorg/npci/upi/security/pinactivitycomponent/l;->c(Ljava/lang/String;Ljava/lang/String;)V

    const v0, 0x987

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p4

    invoke-virtual {p4, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    new-instance p4, Ljava/lang/StringBuffer;

    invoke-direct {p4}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    move-object v4, p0

    move-object v6, p2

    move-object v7, p3

    invoke-virtual/range {v4 .. v10}, Lorg/npci/upi/security/pinactivitycomponent/f;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lin/org/npci/commonlibrary/Message;

    move-result-object v2

    invoke-virtual {v2}, Lin/org/npci/commonlibrary/Message;->a()Lin/org/npci/commonlibrary/Data;

    move-result-object p2

    invoke-virtual {p2}, Lin/org/npci/commonlibrary/Data;->a()Ljava/lang/String;

    move-result-object p2

    const v0, 0x988

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    const v0, 0x989

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, p3, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/util/regex/Matcher;->quoteReplacement(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p4, p2}, Ljava/util/regex/Matcher;->appendReplacement(Ljava/lang/StringBuffer;Ljava/lang/String;)Ljava/util/regex/Matcher;

    :cond_1
    invoke-virtual {p4}, Ljava/lang/StringBuffer;->length()I

    move-result p2

    if-lez p2, :cond_2

    invoke-virtual {p1, p4}, Ljava/util/regex/Matcher;->appendTail(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {p4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x98a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Lorg/npci/upi/security/pinactivitycomponent/l;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Lin/org/npci/commonlibrary/Message;->a()Lin/org/npci/commonlibrary/Data;

    move-result-object p2

    invoke-virtual {p2, p1}, Lin/org/npci/commonlibrary/Data;->b(Ljava/lang/String;)V

    :cond_3
    return-object v2

    :catch_0
    const v0, 0x98b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lorg/npci/upi/security/pinactivitycomponent/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method
