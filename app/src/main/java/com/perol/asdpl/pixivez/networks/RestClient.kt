package com.perol.asdpl.pixivez.networks

import android.net.SSLCertificateSocketFactory
import android.util.Log

import com.google.gson.GsonBuilder
import com.perol.asdpl.pixivez.services.PxEZApp
import okhttp3.*


import java.io.IOException

import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.net.InetAddress
import java.net.Socket
import java.security.cert.X509Certificate
import javax.net.ssl.*

/**
 * Created by asdpl on 2018/2/10.
 */

class RestClient {
    private val httpsDns = RubyHttpDns()
    private val pixivOkHttpClient: OkHttpClient
        get() {
            val builder = OkHttpClient.Builder()

            builder!!.addInterceptor(object : Interceptor {
                @Throws(IOException::class)
                override fun intercept(chain: Interceptor.Chain): Response {
                    val original = chain.request()
                    val requestBuilder = original.newBuilder()
                            .addHeader("Accept-Language", if (PxEZApp.locale == "zh") "zh-cn" else "en-hk")
                            .addHeader("User-Agent", "PixivIOSApp/5.8.0")
                    val request = requestBuilder.build()
                    return chain.proceed(request)
                }
            })
            if (!PxEZApp.disableProxy) {
                builder.sslSocketFactory(RubySSLSocketFactory(), object : X509TrustManager {
                    override fun checkClientTrusted(p0: Array<out X509Certificate>?, p1: String?) {
                    }

                    override fun checkServerTrusted(p0: Array<out X509Certificate>?, p1: String?) {
                    }

                    override fun getAcceptedIssuers(): Array<X509Certificate> {
                        return arrayOf()
                    }
                }).hostnameVerifier(HostnameVerifier { p0, p1 -> true })
                builder.dns(httpsDns)
            }
            val okHttpClient = builder.build()

            return okHttpClient
        }
    val imageHttpClient: OkHttpClient
        get() {
            val builder = OkHttpClient.Builder()
            builder.addInterceptor(object : Interceptor {
                @Throws(IOException::class)
                override fun intercept(chain: Interceptor.Chain): Response {
                    val original = chain.request()
                    val requestBuilder = original.newBuilder()
                            .addHeader("User-Agent", "PixivIOSApp/5.8.0")
                            .addHeader("referer", "https://app-api.pixiv.net/")
                    val request = requestBuilder.build()
                    return chain.proceed(request)
                }
            })
            val okHttpClient = builder.build()
            return okHttpClient
        }



    private val gson = GsonBuilder()
            .create()
    val retrofit_AppAPI: Retrofit
        get() {
            val retrofit_OAuthSecure = Retrofit.Builder()
                    .baseUrl("https://app-api.pixiv.net")
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build()
            return retrofit_OAuthSecure
        }

    val rApi: Retrofit
        get() {

            val retrofit_AppAPI = Retrofit.Builder()
                    .baseUrl("https://app-api.pixiv.net/")
                    .client(rclient)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build()
            return retrofit_AppAPI
        }


    private val rclient: OkHttpClient
        get() {
            val httpLoggingInterceptor = HttpLoggingInterceptor(object : HttpLoggingInterceptor.Logger {
                override fun log(message: String) {
                    Log.i("aaa", "message====$message")
                }
            })
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
            val builder = OkHttpClient.Builder()
            builder!!.addInterceptor(object : Interceptor {
                @Throws(IOException::class)
                override fun intercept(chain: Interceptor.Chain): Response {
                    val original = chain.request()
                    val requestBuilder = original.newBuilder()
                            .addHeader("User-Agent", "PixivIOSApp/5.8.0")

                    val request = requestBuilder.build()
                    return chain.proceed(request)
                }
            }).addInterceptor(httpLoggingInterceptor)
            val okHttpClient = builder!!.build()
            return okHttpClient
        }

    val pixiviSion_AppAPI: Retrofit
        get() {
            val retrofit_AppAPI = Retrofit.Builder()
                    .baseUrl("https://app-api.pixiv.net/")
                    .client(pixivOkHttpClient)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build()
            return retrofit_AppAPI
        }

    val retrofit_Account: Retrofit
        get() {
            val retrofit_AppAPI = Retrofit.Builder()
                    .baseUrl("https://accounts.pixiv.net/")
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build()
            return retrofit_AppAPI
        }

    private val okHttpClient: OkHttpClient
        get() {
            val httpLoggingInterceptor = HttpLoggingInterceptor(object : HttpLoggingInterceptor.Logger {
                override fun log(message: String) {
                    Log.i("aaa", "message====$message")
                }
            })
            httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
            val builder = OkHttpClient.Builder()
            builder!!.addInterceptor(object : Interceptor {
                @Throws(IOException::class)
                override fun intercept(chain: Interceptor.Chain): Response {
                    val original = chain.request()
                    val requestBuilder = original.newBuilder()
                            .addHeader("User-Agent", "PixivIOSApp/5.8.0")
                    val request = requestBuilder.build()
                    return chain.proceed(request)
                }
            }).addInterceptor(httpLoggingInterceptor)
            if (!PxEZApp.disableProxy) {
                builder.sslSocketFactory(RubySSLSocketFactory(), object : X509TrustManager {
                    override fun checkClientTrusted(p0: Array<out X509Certificate>?, p1: String?) {
                    }

                    override fun checkServerTrusted(p0: Array<out X509Certificate>?, p1: String?) {
                    }

                    override fun getAcceptedIssuers(): Array<X509Certificate> {
                        return arrayOf()
                    }
                }).hostnameVerifier(HostnameVerifier { p0, p1 -> true })
                builder.dns(httpsDns)
            }
            return builder
                    .build()
        }


    fun getretrofit_GIF(): Retrofit {

        val retrofit_OAuthSecure = Retrofit.Builder()
                .baseUrl("https://oauth.secure.pixiv.net/")
                .client(imageHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
        return retrofit_OAuthSecure
    }

    fun getretrofit_OAuthSecure(): Retrofit {


        val retrofit_OAuthSecure = Retrofit.Builder()
                .baseUrl("https://oauth.secure.pixiv.net/")
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()

        return retrofit_OAuthSecure
    }


}
