.class public enum Lcom/crashlytics/android/core/WireFormat$FieldType;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/crashlytics/android/core/WireFormat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = "FieldType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/crashlytics/android/core/WireFormat$FieldType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum BOOL:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum BYTES:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum DOUBLE:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum ENUM:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum FIXED32:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum FIXED64:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum FLOAT:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum GROUP:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum INT32:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum INT64:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum MESSAGE:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum SFIXED32:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum SFIXED64:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum SINT32:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum SINT64:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum STRING:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum UINT32:Lcom/crashlytics/android/core/WireFormat$FieldType;

.field public static final enum UINT64:Lcom/crashlytics/android/core/WireFormat$FieldType;


# instance fields
.field private final javaType:Lcom/crashlytics/android/core/WireFormat$JavaType;

.field private final wireType:I


# direct methods
.method public static constructor <clinit>()V
    .locals 22

    .line 1
    new-instance v0, Lcom/crashlytics/android/core/WireFormat$FieldType;

    sget-object v1, Lcom/crashlytics/android/core/WireFormat$JavaType;->DOUBLE:Lcom/crashlytics/android/core/WireFormat$JavaType;

    const-string v2, "DOUBLE"

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v0, Lcom/crashlytics/android/core/WireFormat$FieldType;->DOUBLE:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 2
    new-instance v1, Lcom/crashlytics/android/core/WireFormat$FieldType;

    sget-object v2, Lcom/crashlytics/android/core/WireFormat$JavaType;->FLOAT:Lcom/crashlytics/android/core/WireFormat$JavaType;

    const-string v5, "FLOAT"

    const/4 v6, 0x5

    invoke-direct {v1, v5, v4, v2, v6}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v1, Lcom/crashlytics/android/core/WireFormat$FieldType;->FLOAT:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 3
    new-instance v2, Lcom/crashlytics/android/core/WireFormat$FieldType;

    sget-object v5, Lcom/crashlytics/android/core/WireFormat$JavaType;->LONG:Lcom/crashlytics/android/core/WireFormat$JavaType;

    const-string v7, "INT64"

    const/4 v8, 0x2

    invoke-direct {v2, v7, v8, v5, v3}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v2, Lcom/crashlytics/android/core/WireFormat$FieldType;->INT64:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 4
    new-instance v7, Lcom/crashlytics/android/core/WireFormat$FieldType;

    const-string v9, "UINT64"

    const/4 v10, 0x3

    invoke-direct {v7, v9, v10, v5, v3}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v7, Lcom/crashlytics/android/core/WireFormat$FieldType;->UINT64:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 5
    new-instance v9, Lcom/crashlytics/android/core/WireFormat$FieldType;

    sget-object v11, Lcom/crashlytics/android/core/WireFormat$JavaType;->INT:Lcom/crashlytics/android/core/WireFormat$JavaType;

    const-string v12, "INT32"

    const/4 v13, 0x4

    invoke-direct {v9, v12, v13, v11, v3}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v9, Lcom/crashlytics/android/core/WireFormat$FieldType;->INT32:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 6
    new-instance v12, Lcom/crashlytics/android/core/WireFormat$FieldType;

    const-string v14, "FIXED64"

    invoke-direct {v12, v14, v6, v5, v4}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v12, Lcom/crashlytics/android/core/WireFormat$FieldType;->FIXED64:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 7
    new-instance v14, Lcom/crashlytics/android/core/WireFormat$FieldType;

    const-string v15, "FIXED32"

    const/4 v13, 0x6

    invoke-direct {v14, v15, v13, v11, v6}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v14, Lcom/crashlytics/android/core/WireFormat$FieldType;->FIXED32:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 8
    new-instance v15, Lcom/crashlytics/android/core/WireFormat$FieldType;

    sget-object v13, Lcom/crashlytics/android/core/WireFormat$JavaType;->BOOLEAN:Lcom/crashlytics/android/core/WireFormat$JavaType;

    const-string v4, "BOOL"

    const/4 v6, 0x7

    invoke-direct {v15, v4, v6, v13, v3}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v15, Lcom/crashlytics/android/core/WireFormat$FieldType;->BOOL:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 9
    new-instance v4, Lcom/crashlytics/android/core/WireFormat$FieldType$1;

    sget-object v13, Lcom/crashlytics/android/core/WireFormat$JavaType;->STRING:Lcom/crashlytics/android/core/WireFormat$JavaType;

    const-string v6, "STRING"

    const/16 v3, 0x8

    invoke-direct {v4, v6, v3, v13, v8}, Lcom/crashlytics/android/core/WireFormat$FieldType$1;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v4, Lcom/crashlytics/android/core/WireFormat$FieldType;->STRING:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 10
    new-instance v6, Lcom/crashlytics/android/core/WireFormat$FieldType$2;

    sget-object v13, Lcom/crashlytics/android/core/WireFormat$JavaType;->MESSAGE:Lcom/crashlytics/android/core/WireFormat$JavaType;

    const-string v3, "GROUP"

    const/16 v8, 0x9

    invoke-direct {v6, v3, v8, v13, v10}, Lcom/crashlytics/android/core/WireFormat$FieldType$2;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v6, Lcom/crashlytics/android/core/WireFormat$FieldType;->GROUP:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 11
    new-instance v3, Lcom/crashlytics/android/core/WireFormat$FieldType$3;

    const-string v8, "MESSAGE"

    const/16 v10, 0xa

    move-object/from16 v16, v6

    const/4 v6, 0x2

    invoke-direct {v3, v8, v10, v13, v6}, Lcom/crashlytics/android/core/WireFormat$FieldType$3;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v3, Lcom/crashlytics/android/core/WireFormat$FieldType;->MESSAGE:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 12
    new-instance v8, Lcom/crashlytics/android/core/WireFormat$FieldType$4;

    sget-object v13, Lcom/crashlytics/android/core/WireFormat$JavaType;->BYTE_STRING:Lcom/crashlytics/android/core/WireFormat$JavaType;

    const-string v10, "BYTES"

    move-object/from16 v17, v3

    const/16 v3, 0xb

    invoke-direct {v8, v10, v3, v13, v6}, Lcom/crashlytics/android/core/WireFormat$FieldType$4;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v8, Lcom/crashlytics/android/core/WireFormat$FieldType;->BYTES:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 13
    new-instance v6, Lcom/crashlytics/android/core/WireFormat$FieldType;

    const-string v10, "UINT32"

    const/16 v13, 0xc

    const/4 v3, 0x0

    invoke-direct {v6, v10, v13, v11, v3}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v6, Lcom/crashlytics/android/core/WireFormat$FieldType;->UINT32:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 14
    new-instance v10, Lcom/crashlytics/android/core/WireFormat$FieldType;

    sget-object v13, Lcom/crashlytics/android/core/WireFormat$JavaType;->ENUM:Lcom/crashlytics/android/core/WireFormat$JavaType;

    move-object/from16 v18, v6

    const-string v6, "ENUM"

    move-object/from16 v19, v8

    const/16 v8, 0xd

    invoke-direct {v10, v6, v8, v13, v3}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v10, Lcom/crashlytics/android/core/WireFormat$FieldType;->ENUM:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 15
    new-instance v3, Lcom/crashlytics/android/core/WireFormat$FieldType;

    const-string v6, "SFIXED32"

    const/16 v13, 0xe

    const/4 v8, 0x5

    invoke-direct {v3, v6, v13, v11, v8}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v3, Lcom/crashlytics/android/core/WireFormat$FieldType;->SFIXED32:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 16
    new-instance v6, Lcom/crashlytics/android/core/WireFormat$FieldType;

    const-string v8, "SFIXED64"

    const/16 v13, 0xf

    move-object/from16 v20, v3

    const/4 v3, 0x1

    invoke-direct {v6, v8, v13, v5, v3}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v6, Lcom/crashlytics/android/core/WireFormat$FieldType;->SFIXED64:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 17
    new-instance v3, Lcom/crashlytics/android/core/WireFormat$FieldType;

    const-string v8, "SINT32"

    const/16 v13, 0x10

    move-object/from16 v21, v6

    const/4 v6, 0x0

    invoke-direct {v3, v8, v13, v11, v6}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v3, Lcom/crashlytics/android/core/WireFormat$FieldType;->SINT32:Lcom/crashlytics/android/core/WireFormat$FieldType;

    .line 18
    new-instance v8, Lcom/crashlytics/android/core/WireFormat$FieldType;

    const-string v11, "SINT64"

    const/16 v13, 0x11

    invoke-direct {v8, v11, v13, v5, v6}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    sput-object v8, Lcom/crashlytics/android/core/WireFormat$FieldType;->SINT64:Lcom/crashlytics/android/core/WireFormat$FieldType;

    const/16 v5, 0x12

    new-array v5, v5, [Lcom/crashlytics/android/core/WireFormat$FieldType;

    aput-object v0, v5, v6

    const/4 v0, 0x1

    aput-object v1, v5, v0

    const/4 v0, 0x2

    aput-object v2, v5, v0

    const/4 v0, 0x3

    aput-object v7, v5, v0

    const/4 v0, 0x4

    aput-object v9, v5, v0

    const/4 v0, 0x5

    aput-object v12, v5, v0

    const/4 v0, 0x6

    aput-object v14, v5, v0

    const/4 v0, 0x7

    aput-object v15, v5, v0

    const/16 v0, 0x8

    aput-object v4, v5, v0

    const/16 v0, 0x9

    aput-object v16, v5, v0

    const/16 v0, 0xa

    aput-object v17, v5, v0

    const/16 v0, 0xb

    aput-object v19, v5, v0

    const/16 v0, 0xc

    aput-object v18, v5, v0

    const/16 v0, 0xd

    aput-object v10, v5, v0

    const/16 v0, 0xe

    aput-object v20, v5, v0

    const/16 v0, 0xf

    aput-object v21, v5, v0

    const/16 v0, 0x10

    aput-object v3, v5, v0

    aput-object v8, v5, v13

    .line 19
    sput-object v5, Lcom/crashlytics/android/core/WireFormat$FieldType;->$VALUES:[Lcom/crashlytics/android/core/WireFormat$FieldType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/crashlytics/android/core/WireFormat$JavaType;",
            "I)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 3
    iput-object p3, p0, Lcom/crashlytics/android/core/WireFormat$FieldType;->javaType:Lcom/crashlytics/android/core/WireFormat$JavaType;

    .line 4
    iput p4, p0, Lcom/crashlytics/android/core/WireFormat$FieldType;->wireType:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;ILcom/crashlytics/android/core/WireFormat$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/crashlytics/android/core/WireFormat$FieldType;-><init>(Ljava/lang/String;ILcom/crashlytics/android/core/WireFormat$JavaType;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/crashlytics/android/core/WireFormat$FieldType;
    .locals 1

    .line 1
    const-class v0, Lcom/crashlytics/android/core/WireFormat$FieldType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/crashlytics/android/core/WireFormat$FieldType;

    return-object p0
.end method

.method public static values()[Lcom/crashlytics/android/core/WireFormat$FieldType;
    .locals 1

    .line 1
    sget-object v0, Lcom/crashlytics/android/core/WireFormat$FieldType;->$VALUES:[Lcom/crashlytics/android/core/WireFormat$FieldType;

    invoke-virtual {v0}, [Lcom/crashlytics/android/core/WireFormat$FieldType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/crashlytics/android/core/WireFormat$FieldType;

    return-object v0
.end method


# virtual methods
.method public getJavaType()Lcom/crashlytics/android/core/WireFormat$JavaType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/crashlytics/android/core/WireFormat$FieldType;->javaType:Lcom/crashlytics/android/core/WireFormat$JavaType;

    return-object v0
.end method

.method public getWireType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/crashlytics/android/core/WireFormat$FieldType;->wireType:I

    return v0
.end method

.method public isPackable()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
