package com.crashlytics.android.core;

import android.app.ActivityManager;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.services.common.IdManager;
import java.util.List;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class SessionProtobufHelper {
    private static final String SIGNAL_DEFAULT = null;
    private static final ByteString SIGNAL_DEFAULT_BYTE_STRING;
    private static final ByteString UNITY_PLATFORM_BYTE_STRING;

    static {
        C0059ao.a(SessionProtobufHelper.class, 304);
        SIGNAL_DEFAULT_BYTE_STRING = ByteString.copyFromUtf8(C0059ao.a(5988));
        UNITY_PLATFORM_BYTE_STRING = ByteString.copyFromUtf8(C0059ao.a(5989));
    }

    private SessionProtobufHelper() {
    }

    private static int getBinaryImageSize(ByteString byteString, ByteString byteString2) {
        int computeUInt64Size = CodedOutputStream.computeUInt64Size(1, 0L) + 0 + CodedOutputStream.computeUInt64Size(2, 0L) + CodedOutputStream.computeBytesSize(3, byteString);
        return byteString2 != null ? computeUInt64Size + CodedOutputStream.computeBytesSize(4, byteString2) : computeUInt64Size;
    }

    private static int getDeviceIdentifierSize(IdManager.DeviceIdentifierType deviceIdentifierType, String str) {
        return CodedOutputStream.computeEnumSize(1, deviceIdentifierType.protobufIndex) + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(str));
    }

    private static int getEventAppCustomAttributeSize(String str, String str2) {
        int computeBytesSize = CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(str));
        if (str2 == null) {
            str2 = C0059ao.a(5990);
        }
        return computeBytesSize + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(str2));
    }

    private static int getEventAppExecutionExceptionSize(TrimmedThrowableData trimmedThrowableData, int i, int i2) {
        int i3 = 0;
        int computeBytesSize = CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(trimmedThrowableData.className)) + 0;
        String str = trimmedThrowableData.localizedMessage;
        if (str != null) {
            computeBytesSize += CodedOutputStream.computeBytesSize(3, ByteString.copyFromUtf8(str));
        }
        for (StackTraceElement stackTraceElement : trimmedThrowableData.stacktrace) {
            int frameSize = getFrameSize(stackTraceElement, true);
            computeBytesSize += CodedOutputStream.computeTagSize(4) + CodedOutputStream.computeRawVarint32Size(frameSize) + frameSize;
        }
        TrimmedThrowableData trimmedThrowableData2 = trimmedThrowableData.cause;
        if (trimmedThrowableData2 != null) {
            if (i < i2) {
                int eventAppExecutionExceptionSize = getEventAppExecutionExceptionSize(trimmedThrowableData2, i + 1, i2);
                return computeBytesSize + CodedOutputStream.computeTagSize(6) + CodedOutputStream.computeRawVarint32Size(eventAppExecutionExceptionSize) + eventAppExecutionExceptionSize;
            }
            while (trimmedThrowableData2 != null) {
                trimmedThrowableData2 = trimmedThrowableData2.cause;
                i3++;
            }
            return computeBytesSize + CodedOutputStream.computeUInt32Size(7, i3);
        }
        return computeBytesSize;
    }

    private static int getEventAppExecutionSignalSize() {
        ByteString byteString = SIGNAL_DEFAULT_BYTE_STRING;
        return CodedOutputStream.computeBytesSize(1, byteString) + 0 + CodedOutputStream.computeBytesSize(2, byteString) + CodedOutputStream.computeUInt64Size(3, 0L);
    }

    private static int getEventAppExecutionSize(TrimmedThrowableData trimmedThrowableData, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, ByteString byteString, ByteString byteString2) {
        int threadSize = getThreadSize(thread, stackTraceElementArr, 4, true);
        int computeTagSize = CodedOutputStream.computeTagSize(1) + CodedOutputStream.computeRawVarint32Size(threadSize) + threadSize + 0;
        int length = threadArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int threadSize2 = getThreadSize(threadArr[i2], list.get(i2), 0, false);
            computeTagSize += CodedOutputStream.computeTagSize(1) + CodedOutputStream.computeRawVarint32Size(threadSize2) + threadSize2;
        }
        int eventAppExecutionExceptionSize = getEventAppExecutionExceptionSize(trimmedThrowableData, 1, i);
        int eventAppExecutionSignalSize = getEventAppExecutionSignalSize();
        int binaryImageSize = getBinaryImageSize(byteString, byteString2);
        return computeTagSize + CodedOutputStream.computeTagSize(2) + CodedOutputStream.computeRawVarint32Size(eventAppExecutionExceptionSize) + eventAppExecutionExceptionSize + CodedOutputStream.computeTagSize(3) + CodedOutputStream.computeRawVarint32Size(eventAppExecutionSignalSize) + eventAppExecutionSignalSize + CodedOutputStream.computeTagSize(3) + CodedOutputStream.computeRawVarint32Size(binaryImageSize) + binaryImageSize;
    }

    private static int getEventAppSize(TrimmedThrowableData trimmedThrowableData, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, ByteString byteString, ByteString byteString2, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i2) {
        int eventAppExecutionSize = getEventAppExecutionSize(trimmedThrowableData, thread, stackTraceElementArr, threadArr, list, i, byteString, byteString2);
        int computeTagSize = CodedOutputStream.computeTagSize(1) + CodedOutputStream.computeRawVarint32Size(eventAppExecutionSize) + eventAppExecutionSize + 0;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                int eventAppCustomAttributeSize = getEventAppCustomAttributeSize(entry.getKey(), entry.getValue());
                computeTagSize += CodedOutputStream.computeTagSize(2) + CodedOutputStream.computeRawVarint32Size(eventAppCustomAttributeSize) + eventAppCustomAttributeSize;
            }
        }
        if (runningAppProcessInfo != null) {
            computeTagSize += CodedOutputStream.computeBoolSize(3, runningAppProcessInfo.importance != 100);
        }
        return computeTagSize + CodedOutputStream.computeUInt32Size(4, i2);
    }

    private static int getEventDeviceSize(Float f, int i, boolean z, int i2, long j, long j2) {
        return (f != null ? 0 + CodedOutputStream.computeFloatSize(1, f.floatValue()) : 0) + CodedOutputStream.computeSInt32Size(2, i) + CodedOutputStream.computeBoolSize(3, z) + CodedOutputStream.computeUInt32Size(4, i2) + CodedOutputStream.computeUInt64Size(5, j) + CodedOutputStream.computeUInt64Size(6, j2);
    }

    private static int getEventLogSize(ByteString byteString) {
        return CodedOutputStream.computeBytesSize(1, byteString);
    }

    private static int getFrameSize(StackTraceElement stackTraceElement, boolean z) {
        int computeUInt64Size;
        if (stackTraceElement.isNativeMethod()) {
            computeUInt64Size = CodedOutputStream.computeUInt64Size(1, Math.max(stackTraceElement.getLineNumber(), 0));
        } else {
            computeUInt64Size = CodedOutputStream.computeUInt64Size(1, 0L);
        }
        int computeBytesSize = computeUInt64Size + 0 + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(stackTraceElement.getClassName() + C0059ao.a(5991) + stackTraceElement.getMethodName()));
        if (stackTraceElement.getFileName() != null) {
            computeBytesSize += CodedOutputStream.computeBytesSize(3, ByteString.copyFromUtf8(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            computeBytesSize += CodedOutputStream.computeUInt64Size(4, stackTraceElement.getLineNumber());
        }
        return computeBytesSize + CodedOutputStream.computeUInt32Size(5, z ? 2 : 0);
    }

    private static int getSessionAppOrgSize(ByteString byteString) {
        return CodedOutputStream.computeBytesSize(1, byteString) + 0;
    }

    private static int getSessionAppSize(ByteString byteString, ByteString byteString2, ByteString byteString3, ByteString byteString4, ByteString byteString5, int i, ByteString byteString6) {
        int sessionAppOrgSize = getSessionAppOrgSize(byteString2);
        int computeBytesSize = CodedOutputStream.computeBytesSize(1, byteString) + 0 + CodedOutputStream.computeBytesSize(2, byteString3) + CodedOutputStream.computeBytesSize(3, byteString4) + CodedOutputStream.computeTagSize(5) + CodedOutputStream.computeRawVarint32Size(sessionAppOrgSize) + sessionAppOrgSize + CodedOutputStream.computeBytesSize(6, byteString5);
        if (byteString6 != null) {
            computeBytesSize = computeBytesSize + CodedOutputStream.computeBytesSize(8, UNITY_PLATFORM_BYTE_STRING) + CodedOutputStream.computeBytesSize(9, byteString6);
        }
        return computeBytesSize + CodedOutputStream.computeEnumSize(10, i);
    }

    private static int getSessionDeviceSize(int i, ByteString byteString, int i2, long j, long j2, boolean z, Map<IdManager.DeviceIdentifierType, String> map, int i3, ByteString byteString2, ByteString byteString3) {
        int computeEnumSize = CodedOutputStream.computeEnumSize(3, i) + 0 + (byteString == null ? 0 : CodedOutputStream.computeBytesSize(4, byteString)) + CodedOutputStream.computeUInt32Size(5, i2) + CodedOutputStream.computeUInt64Size(6, j) + CodedOutputStream.computeUInt64Size(7, j2) + CodedOutputStream.computeBoolSize(10, z);
        if (map != null) {
            for (Map.Entry<IdManager.DeviceIdentifierType, String> entry : map.entrySet()) {
                int deviceIdentifierSize = getDeviceIdentifierSize(entry.getKey(), entry.getValue());
                computeEnumSize += CodedOutputStream.computeTagSize(11) + CodedOutputStream.computeRawVarint32Size(deviceIdentifierSize) + deviceIdentifierSize;
            }
        }
        return computeEnumSize + CodedOutputStream.computeUInt32Size(12, i3) + (byteString2 == null ? 0 : CodedOutputStream.computeBytesSize(13, byteString2)) + (byteString3 != null ? CodedOutputStream.computeBytesSize(14, byteString3) : 0);
    }

    private static int getSessionEventSize(long j, String str, TrimmedThrowableData trimmedThrowableData, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i2, ByteString byteString, ByteString byteString2, Float f, int i3, boolean z, long j2, long j3, ByteString byteString3) {
        int computeUInt64Size = CodedOutputStream.computeUInt64Size(1, j) + 0 + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(str));
        int eventAppSize = getEventAppSize(trimmedThrowableData, thread, stackTraceElementArr, threadArr, list, i, byteString, byteString2, map, runningAppProcessInfo, i2);
        int eventDeviceSize = getEventDeviceSize(f, i3, z, i2, j2, j3);
        int computeTagSize = computeUInt64Size + CodedOutputStream.computeTagSize(3) + CodedOutputStream.computeRawVarint32Size(eventAppSize) + eventAppSize + CodedOutputStream.computeTagSize(5) + CodedOutputStream.computeRawVarint32Size(eventDeviceSize) + eventDeviceSize;
        if (byteString3 != null) {
            int eventLogSize = getEventLogSize(byteString3);
            return computeTagSize + CodedOutputStream.computeTagSize(6) + CodedOutputStream.computeRawVarint32Size(eventLogSize) + eventLogSize;
        }
        return computeTagSize;
    }

    private static int getSessionOSSize(ByteString byteString, ByteString byteString2, boolean z) {
        return CodedOutputStream.computeEnumSize(1, 3) + 0 + CodedOutputStream.computeBytesSize(2, byteString) + CodedOutputStream.computeBytesSize(3, byteString2) + CodedOutputStream.computeBoolSize(4, z);
    }

    private static int getThreadSize(Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        int computeBytesSize = CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(thread.getName())) + CodedOutputStream.computeUInt32Size(2, i);
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            int frameSize = getFrameSize(stackTraceElement, z);
            computeBytesSize += CodedOutputStream.computeTagSize(3) + CodedOutputStream.computeRawVarint32Size(frameSize) + frameSize;
        }
        return computeBytesSize;
    }

    private static ByteString stringToByteString(String str) {
        if (str == null) {
            return null;
        }
        return ByteString.copyFromUtf8(str);
    }

    public static void writeBeginSession(CodedOutputStream codedOutputStream, String str, String str2, long j) throws Exception {
        codedOutputStream.writeBytes(1, ByteString.copyFromUtf8(str2));
        codedOutputStream.writeBytes(2, ByteString.copyFromUtf8(str));
        codedOutputStream.writeUInt64(3, j);
    }

    private static void writeFrame(CodedOutputStream codedOutputStream, int i, StackTraceElement stackTraceElement, boolean z) throws Exception {
        codedOutputStream.writeTag(i, 2);
        codedOutputStream.writeRawVarint32(getFrameSize(stackTraceElement, z));
        if (stackTraceElement.isNativeMethod()) {
            codedOutputStream.writeUInt64(1, Math.max(stackTraceElement.getLineNumber(), 0));
        } else {
            codedOutputStream.writeUInt64(1, 0L);
        }
        codedOutputStream.writeBytes(2, ByteString.copyFromUtf8(stackTraceElement.getClassName() + C0059ao.a(5992) + stackTraceElement.getMethodName()));
        if (stackTraceElement.getFileName() != null) {
            codedOutputStream.writeBytes(3, ByteString.copyFromUtf8(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            codedOutputStream.writeUInt64(4, stackTraceElement.getLineNumber());
        }
        codedOutputStream.writeUInt32(5, z ? 4 : 0);
    }

    public static void writeSessionApp(CodedOutputStream codedOutputStream, String str, String str2, String str3, String str4, String str5, int i, String str6) throws Exception {
        ByteString copyFromUtf8 = ByteString.copyFromUtf8(str);
        ByteString copyFromUtf82 = ByteString.copyFromUtf8(str2);
        ByteString copyFromUtf83 = ByteString.copyFromUtf8(str3);
        ByteString copyFromUtf84 = ByteString.copyFromUtf8(str4);
        ByteString copyFromUtf85 = ByteString.copyFromUtf8(str5);
        ByteString copyFromUtf86 = str6 != null ? ByteString.copyFromUtf8(str6) : null;
        codedOutputStream.writeTag(7, 2);
        codedOutputStream.writeRawVarint32(getSessionAppSize(copyFromUtf8, copyFromUtf82, copyFromUtf83, copyFromUtf84, copyFromUtf85, i, copyFromUtf86));
        codedOutputStream.writeBytes(1, copyFromUtf8);
        codedOutputStream.writeBytes(2, copyFromUtf83);
        codedOutputStream.writeBytes(3, copyFromUtf84);
        codedOutputStream.writeTag(5, 2);
        codedOutputStream.writeRawVarint32(getSessionAppOrgSize(copyFromUtf82));
        codedOutputStream.writeBytes(1, copyFromUtf82);
        codedOutputStream.writeBytes(6, copyFromUtf85);
        if (copyFromUtf86 != null) {
            codedOutputStream.writeBytes(8, UNITY_PLATFORM_BYTE_STRING);
            codedOutputStream.writeBytes(9, copyFromUtf86);
        }
        codedOutputStream.writeEnum(10, i);
    }

    public static void writeSessionDevice(CodedOutputStream codedOutputStream, int i, String str, int i2, long j, long j2, boolean z, Map<IdManager.DeviceIdentifierType, String> map, int i3, String str2, String str3) throws Exception {
        ByteString stringToByteString = stringToByteString(str);
        ByteString stringToByteString2 = stringToByteString(str3);
        ByteString stringToByteString3 = stringToByteString(str2);
        codedOutputStream.writeTag(9, 2);
        codedOutputStream.writeRawVarint32(getSessionDeviceSize(i, stringToByteString, i2, j, j2, z, map, i3, stringToByteString3, stringToByteString2));
        codedOutputStream.writeEnum(3, i);
        codedOutputStream.writeBytes(4, stringToByteString);
        codedOutputStream.writeUInt32(5, i2);
        codedOutputStream.writeUInt64(6, j);
        codedOutputStream.writeUInt64(7, j2);
        codedOutputStream.writeBool(10, z);
        for (Map.Entry<IdManager.DeviceIdentifierType, String> entry : map.entrySet()) {
            codedOutputStream.writeTag(11, 2);
            codedOutputStream.writeRawVarint32(getDeviceIdentifierSize(entry.getKey(), entry.getValue()));
            codedOutputStream.writeEnum(1, entry.getKey().protobufIndex);
            codedOutputStream.writeBytes(2, ByteString.copyFromUtf8(entry.getValue()));
        }
        codedOutputStream.writeUInt32(12, i3);
        if (stringToByteString3 != null) {
            codedOutputStream.writeBytes(13, stringToByteString3);
        }
        if (stringToByteString2 != null) {
            codedOutputStream.writeBytes(14, stringToByteString2);
        }
    }

    public static void writeSessionEvent(CodedOutputStream codedOutputStream, long j, String str, TrimmedThrowableData trimmedThrowableData, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, Map<String, String> map, LogFileManager logFileManager, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i, String str2, String str3, Float f, int i2, boolean z, long j2, long j3) throws Exception {
        ByteString copyFromUtf8 = ByteString.copyFromUtf8(str2);
        ByteString copyFromUtf82 = str3 == null ? null : ByteString.copyFromUtf8(str3.replace(C0059ao.a(5993), C0059ao.a(5994)));
        ByteString byteStringForLog = logFileManager.getByteStringForLog();
        if (byteStringForLog == null) {
            Fabric.getLogger().d(C0059ao.a(5995), C0059ao.a(5996));
        }
        logFileManager.clearLog();
        codedOutputStream.writeTag(10, 2);
        codedOutputStream.writeRawVarint32(getSessionEventSize(j, str, trimmedThrowableData, thread, stackTraceElementArr, threadArr, list, 8, map, runningAppProcessInfo, i, copyFromUtf8, copyFromUtf82, f, i2, z, j2, j3, byteStringForLog));
        codedOutputStream.writeUInt64(1, j);
        codedOutputStream.writeBytes(2, ByteString.copyFromUtf8(str));
        writeSessionEventApp(codedOutputStream, trimmedThrowableData, thread, stackTraceElementArr, threadArr, list, 8, copyFromUtf8, copyFromUtf82, map, runningAppProcessInfo, i);
        writeSessionEventDevice(codedOutputStream, f, i2, z, i, j2, j3);
        writeSessionEventLog(codedOutputStream, byteStringForLog);
    }

    private static void writeSessionEventApp(CodedOutputStream codedOutputStream, TrimmedThrowableData trimmedThrowableData, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, ByteString byteString, ByteString byteString2, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i2) throws Exception {
        codedOutputStream.writeTag(3, 2);
        codedOutputStream.writeRawVarint32(getEventAppSize(trimmedThrowableData, thread, stackTraceElementArr, threadArr, list, i, byteString, byteString2, map, runningAppProcessInfo, i2));
        writeSessionEventAppExecution(codedOutputStream, trimmedThrowableData, thread, stackTraceElementArr, threadArr, list, i, byteString, byteString2);
        if (map != null && !map.isEmpty()) {
            writeSessionEventAppCustomAttributes(codedOutputStream, map);
        }
        if (runningAppProcessInfo != null) {
            codedOutputStream.writeBool(3, runningAppProcessInfo.importance != 100);
        }
        codedOutputStream.writeUInt32(4, i2);
    }

    private static void writeSessionEventAppCustomAttributes(CodedOutputStream codedOutputStream, Map<String, String> map) throws Exception {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            codedOutputStream.writeTag(2, 2);
            codedOutputStream.writeRawVarint32(getEventAppCustomAttributeSize(entry.getKey(), entry.getValue()));
            codedOutputStream.writeBytes(1, ByteString.copyFromUtf8(entry.getKey()));
            String value = entry.getValue();
            if (value == null) {
                value = C0059ao.a(5997);
            }
            codedOutputStream.writeBytes(2, ByteString.copyFromUtf8(value));
        }
    }

    private static void writeSessionEventAppExecution(CodedOutputStream codedOutputStream, TrimmedThrowableData trimmedThrowableData, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, ByteString byteString, ByteString byteString2) throws Exception {
        codedOutputStream.writeTag(1, 2);
        codedOutputStream.writeRawVarint32(getEventAppExecutionSize(trimmedThrowableData, thread, stackTraceElementArr, threadArr, list, i, byteString, byteString2));
        writeThread(codedOutputStream, thread, stackTraceElementArr, 4, true);
        int length = threadArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            writeThread(codedOutputStream, threadArr[i2], list.get(i2), 0, false);
        }
        writeSessionEventAppExecutionException(codedOutputStream, trimmedThrowableData, 1, i, 2);
        codedOutputStream.writeTag(3, 2);
        codedOutputStream.writeRawVarint32(getEventAppExecutionSignalSize());
        ByteString byteString3 = SIGNAL_DEFAULT_BYTE_STRING;
        codedOutputStream.writeBytes(1, byteString3);
        codedOutputStream.writeBytes(2, byteString3);
        codedOutputStream.writeUInt64(3, 0L);
        codedOutputStream.writeTag(4, 2);
        codedOutputStream.writeRawVarint32(getBinaryImageSize(byteString, byteString2));
        codedOutputStream.writeUInt64(1, 0L);
        codedOutputStream.writeUInt64(2, 0L);
        codedOutputStream.writeBytes(3, byteString);
        if (byteString2 != null) {
            codedOutputStream.writeBytes(4, byteString2);
        }
    }

    private static void writeSessionEventAppExecutionException(CodedOutputStream codedOutputStream, TrimmedThrowableData trimmedThrowableData, int i, int i2, int i3) throws Exception {
        codedOutputStream.writeTag(i3, 2);
        codedOutputStream.writeRawVarint32(getEventAppExecutionExceptionSize(trimmedThrowableData, 1, i2));
        codedOutputStream.writeBytes(1, ByteString.copyFromUtf8(trimmedThrowableData.className));
        String str = trimmedThrowableData.localizedMessage;
        if (str != null) {
            codedOutputStream.writeBytes(3, ByteString.copyFromUtf8(str));
        }
        int i4 = 0;
        for (StackTraceElement stackTraceElement : trimmedThrowableData.stacktrace) {
            writeFrame(codedOutputStream, 4, stackTraceElement, true);
        }
        TrimmedThrowableData trimmedThrowableData2 = trimmedThrowableData.cause;
        if (trimmedThrowableData2 != null) {
            if (i < i2) {
                writeSessionEventAppExecutionException(codedOutputStream, trimmedThrowableData2, i + 1, i2, 6);
                return;
            }
            while (trimmedThrowableData2 != null) {
                trimmedThrowableData2 = trimmedThrowableData2.cause;
                i4++;
            }
            codedOutputStream.writeUInt32(7, i4);
        }
    }

    private static void writeSessionEventDevice(CodedOutputStream codedOutputStream, Float f, int i, boolean z, int i2, long j, long j2) throws Exception {
        codedOutputStream.writeTag(5, 2);
        codedOutputStream.writeRawVarint32(getEventDeviceSize(f, i, z, i2, j, j2));
        if (f != null) {
            codedOutputStream.writeFloat(1, f.floatValue());
        }
        codedOutputStream.writeSInt32(2, i);
        codedOutputStream.writeBool(3, z);
        codedOutputStream.writeUInt32(4, i2);
        codedOutputStream.writeUInt64(5, j);
        codedOutputStream.writeUInt64(6, j2);
    }

    private static void writeSessionEventLog(CodedOutputStream codedOutputStream, ByteString byteString) throws Exception {
        if (byteString != null) {
            codedOutputStream.writeTag(6, 2);
            codedOutputStream.writeRawVarint32(getEventLogSize(byteString));
            codedOutputStream.writeBytes(1, byteString);
        }
    }

    public static void writeSessionOS(CodedOutputStream codedOutputStream, String str, String str2, boolean z) throws Exception {
        ByteString copyFromUtf8 = ByteString.copyFromUtf8(str);
        ByteString copyFromUtf82 = ByteString.copyFromUtf8(str2);
        codedOutputStream.writeTag(8, 2);
        codedOutputStream.writeRawVarint32(getSessionOSSize(copyFromUtf8, copyFromUtf82, z));
        codedOutputStream.writeEnum(1, 3);
        codedOutputStream.writeBytes(2, copyFromUtf8);
        codedOutputStream.writeBytes(3, copyFromUtf82);
        codedOutputStream.writeBool(4, z);
    }

    public static void writeSessionUser(CodedOutputStream codedOutputStream, String str, String str2, String str3) throws Exception {
        if (str == null) {
            str = C0059ao.a(5998);
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8(str);
        ByteString stringToByteString = stringToByteString(str2);
        ByteString stringToByteString2 = stringToByteString(str3);
        int computeBytesSize = CodedOutputStream.computeBytesSize(1, copyFromUtf8) + 0;
        if (str2 != null) {
            computeBytesSize += CodedOutputStream.computeBytesSize(2, stringToByteString);
        }
        if (str3 != null) {
            computeBytesSize += CodedOutputStream.computeBytesSize(3, stringToByteString2);
        }
        codedOutputStream.writeTag(6, 2);
        codedOutputStream.writeRawVarint32(computeBytesSize);
        codedOutputStream.writeBytes(1, copyFromUtf8);
        if (str2 != null) {
            codedOutputStream.writeBytes(2, stringToByteString);
        }
        if (str3 != null) {
            codedOutputStream.writeBytes(3, stringToByteString2);
        }
    }

    private static void writeThread(CodedOutputStream codedOutputStream, Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) throws Exception {
        codedOutputStream.writeTag(1, 2);
        codedOutputStream.writeRawVarint32(getThreadSize(thread, stackTraceElementArr, i, z));
        codedOutputStream.writeBytes(1, ByteString.copyFromUtf8(thread.getName()));
        codedOutputStream.writeUInt32(2, i);
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            writeFrame(codedOutputStream, 3, stackTraceElement, z);
        }
    }
}
