package com.timecat.plugin.version

/**
 * @author 林学渊
 * @email linxy59@mail2.sysu.edu.cn
 * @date 2020/12/3
 * @description null
 * @usage null
 */
val retrofit = "2.6.0"
val retrofit2 = "2.5.0"
val gson = "2.8.5"
val glide = "4.8.0"
val junit = "4.13-beta-3"

//region 第三方
//1. kotlin
val kotlin_version = "1.4.20"
val jetbrains_annotations_version = "16.0.3"
val kotlinx_coroutines_version = "1.3.7"

//2. network
val retrofitSdkVersion = "2.6.0"

//3. image
val glideSdkVersion = "4.8.0"

//4. web
val agentwebVersion = "4.0.2"

//5. view
val butterknifeSdkVersion = "10.1.0"

//6. rx1
val rxlifecycleSdkVersion = "1.0"

//7. rx2
val rxlifecycle2SdkVersion = "2.2.1"

//8. tools
val dagger2SdkVersion = "2.22.1"
val shadow_version = "2.0.13"

//9. test
val espressoSdkVersion = "3.0.1"
val canarySdkVersion = "1.5.4"

//10. router
val component_router_version = "1.8.3.5"

object Dep {
    //1. kotlin
    val kotlin_stdlib_jdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlin_version"
    val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlin_version"
    val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
    val org_jetbrains_annotations = "org.jetbrains:annotations:$jetbrains_annotations_version"
    val kotlinx_coroutines_android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$kotlinx_coroutines_version"
    val kotlinx_coroutines_core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinx_coroutines_version"

    //support
    val support_v4 = "androidx.legacy:legacy-support-v4:1.0.0"

    //2. network
    val retrofit = "com.squareup.retrofit2:retrofit:$retrofitSdkVersion"
    val retrofit_converter_gson = "com.squareup.retrofit2:converter-gson:$retrofitSdkVersion"
    val retrofit_adapter_rxjava = "com.squareup.retrofit2:adapter-rxjava:$retrofitSdkVersion"
    val retrofit_adapter_rxjava2 = "com.squareup.retrofit2:adapter-rxjava2:$retrofitSdkVersion"
    val okhttp3 = "com.squareup.okhttp3:okhttp:3.10.0"
    val okhttp_urlconnection = "com.squareup.okhttp:okhttp-urlconnection:2.0.0"
    val okhttp3_logging_interceptor = "com.squareup.okhttp3:logging-interceptor:3.10.0"

    //3. image
    val glide = "com.github.bumptech.glide:glide:$glideSdkVersion"
    val glide_compiler = "com.github.bumptech.glide:compiler:$glideSdkVersion"
    val glide_loader_okhttp3 = "com.github.bumptech.glide:okhttp3-integration:$glideSdkVersion"
    val picasso = "com.squareup.picasso:picasso:2.5.2"

    //4. web
    val agentweb = "com.just.agentweb:agentweb:$agentwebVersion"
    val agentweb_download = "com.just.agentweb:download:$agentwebVersion"
    val agentweb_filechooser = "com.just.agentweb:filechooser:$agentwebVersion"

    //5. view
    val autolayout = "com.zhy:autolayout:1.4.5"
    val butterknife = "com.jakewharton:butterknife:$butterknifeSdkVersion"
    val butterknife_compiler = "com.jakewharton:butterknife-compiler:$butterknifeSdkVersion"
    val pickerview = "com.contrarywind:Android-PickerView:4.1.2"
    val photoview = "com.github.chrisbanes.photoview:library:1.2.3"
    val nineoldandroids = "com.nineoldandroids:library:2.4.0"
    val paginate = "com.github.markomilos:paginate:0.5.1"
    val vlayout = "com.alibaba.android:vlayout:1.1.0@aar"
    val lottie = "com.airbnb.android:lottie:2.5.4"
    val realtimeblurview = "com.github.mmin18:realtimeblurview:1.0.6"
    val circleimageview = "de.hdodenhof:circleimageview:2.2.0"
    val loadinglayout = "com.github.czy1121:loadinglayout:1.0.1"
    val BaseRecyclerViewAdapterHelper = "com.github.CymChad:BaseRecyclerViewAdapterHelper:3.0.4"
    val banner = "com.youth.banner:banner:2.0.11"
    val StatusLayoutManager = "com.github.Bakumon:StatusLayoutManager:1.0.4"
    val roundedimageview = "com.makeramen:roundedimageview:2.3.0"
    val expansionpanel = "com.github.florent37:expansionpanel:1.0.7"
    val HoloColorPicker = "com.larswerkman:HoloColorPicker:1.5"
    val RoundCornerProgressBar = "com.akexorcist:round-corner-progress-bar:2.1.1"
    val countdownview = "com.github.iwgang:countdownview:2.1.6"
    val compoundlayout = "com.github.jaouan:compoundlayout:1.0.1"
    val FlowLayout = "org.apmem.tools:layouts:1.10@aar"
    val viewtooltip = "com.github.florent37:viewtooltip:1.1.8"
    val taptargetview = "com.getkeepsafe.taptargetview:taptargetview:1.12.0"
    val DateTimeRangePicker = "com.github.skedgo:DateTimeRangePicker:v1.3"
    val BasePopup = "com.github.razerdp:BasePopup:2.2.1"
    val FancyShowCaseView = "me.toptas.fancyshowcase:fancyshowcaseview:1.1.5"
    val PhotoView = "com.github.chrisbanes:PhotoView:2.0.0"

    //6. rx1
    val rxandroid = "io.reactivex:rxandroid:1.2.1"
    val rxjava = "io.reactivex:rxjava:1.3.2"
    val rxlifecycle = "com.trello:rxlifecycle:$rxlifecycleSdkVersion"
    val rxlifecycle_components = "com.trello:rxlifecycle-components:$rxlifecycleSdkVersion"
    val rxcache = "com.github.VictorAlbertos.RxCache:runtime:1.7.0-1.x"
    val rxcache_jolyglot_gson = "com.github.VictorAlbertos.Jolyglot:gson:0.0.3"
    val rxbinding_recyclerview_v7 = "com.jakewharton.rxbinding:rxbinding-recyclerview-v7:1.0.1"
    val rxpermissions = "com.tbruyelle.rxpermissions:rxpermissions:0.9.4@aar"
    val rxerrorhandler = "me.jessyan:rxerrorhandler:1.0.1"

    //7. rx2
    val rxandroid2 = "io.reactivex.rxjava2:rxandroid:2.1.1"
    val rxjava2 = "io.reactivex.rxjava2:rxjava:2.2.4"
    val rxlifecycle2 = "com.trello.rxlifecycle2:rxlifecycle:$rxlifecycle2SdkVersion"
    val rxlifecycle2_android = "com.trello.rxlifecycle2:rxlifecycle-android:$rxlifecycle2SdkVersion"
    val rxlifecycle2_components = "com.trello.rxlifecycle2:rxlifecycle-components:$rxlifecycle2SdkVersion"
    val rxcache2 = "com.github.VictorAlbertos.RxCache:runtime:1.8.3-2.x"
    val rxpermissions2 = "com.tbruyelle.rxpermissions2:rxpermissions:0.9.5@aar"
    val rxerrorhandler2 = "me.jessyan:rxerrorhandler:2.1.1"

    //8. tools
    val dagger2 = "com.google.dagger:dagger:$dagger2SdkVersion"
    val dagger2_android = "com.google.dagger:dagger-android:$dagger2SdkVersion"
    val dagger2_android_support = "com.google.dagger:dagger-android-support:$dagger2SdkVersion"
    val dagger2_compiler = "com.google.dagger:dagger-compiler:$dagger2SdkVersion"
    val dagger2_android_processor = "com.google.dagger:dagger-android-processor:$dagger2SdkVersion"
    val androideventbus = "org.simple:androideventbus:1.0.5.1"
    val otto = "com.squareup:otto:1.3.8"
    val gson = "com.google.code.gson:gson:2.8.5"
    val fastjson = "com.alibaba:fastjson:1.2.9"
    val javax_annotation = "javax.annotation:jsr250-api:1.0"
    val router = "com.github.xiaojinzi123.Component:component-impl:$component_router_version-androidx"
    val router_compiler = "com.github.xiaojinzi123.Component:component-compiler:$component_router_version-androidx"
    val arouter = "com.alibaba:arouter-api:1.3.1"
    val arouter_compiler = "com.alibaba:arouter-compiler:1.1.4"
    val progressmanager = "me.jessyan:progressmanager:1.5.0"
    val retrofit_url_manager = "me.jessyan:retrofit-url-manager:1.4.0"
    val lifecyclemodel = "me.jessyan:lifecyclemodel:1.0.1"
    val timber = "com.jakewharton.timber:timber:4.7.1"
    val logger = "com.orhanobut:logger:2.2.0"
    val eventBus = "org.greenrobot:eventbus:3.1.1"
    val joda_time = "joda-time:joda-time:2.10.1"
    val jgit = "org.eclipse.jgit:org.eclipse.jgit:5.7.0.202003110725-r"
    val shadow_dynamic_host = "com.tencent.shadow.dynamic:host:$shadow_version"

    //9. test
    val junit = "junit:junit:4.12"
    val androidJUnitRunner = "androidx.test.runner.AndroidJUnitRunner"
    val runner = "androidx.test.ext:junit:1.1.0"
    val espresso_core = "androidx.test.espresso:espresso-core:3.1.0"
    val espresso_contrib = "androidx.test.espresso:espresso-contrib:3.1.0"
    val espresso_intents = "com.android.support.test.espresso:espresso-intents:$espressoSdkVersion"
    val mockito_core = "org.mockito:mockito-core:1.+"
    val canary_debug = "com.squareup.leakcanary:leakcanary-android:$canarySdkVersion"
    val canary_release = "com.squareup.leakcanary:leakcanary-android-no-op:$canarySdkVersion"
    val umeng_analytics = "com.umeng.analytics:analytics:6.0.1"
}
//endregion

//region support
val androidX = "1.1.0"
val androidx_core_version = "1.5.0-alpha01"
val androidx_fragment_version = "1.2.5"
val constraintLayout = "2.0.1"
val material_version = "1.2.1"
val androidx_room_version = "2.2.5"
val androidx_lifecycle_version = "2.2.0"
val androidx_preference_version = "1.1.1"
val androidx_databinding_version = "4.1.1"

object androidx_lib {
    val design = "com.google.android.material:material:$material_version"
    val appcompat = "androidx.appcompat:appcompat:$androidX"
    val annotations = "androidx.annotation:annotation:$androidX"
    val core = "androidx.core:core:$androidx_core_version"
    val core_ktx = "androidx.core:core-ktx:$androidx_core_version"

    val fragment = "androidx.fragment:fragment:$androidx_fragment_version"
    val fragment_ktx = "androidx.fragment:fragment-ktx:$androidx_fragment_version"

    val support_vector_drawable = "androidx.vectordrawable:vectordrawable:$androidX"
    val transition = "androidx.transition:transition:$androidX"

    val coordinatorlayout = "androidx.coordinatorlayout:coordinatorlayout:$androidX"
    val constraint_layout = "androidx.constraintlayout:constraintlayout:$constraintLayout"
    val constraintlayout_solver = "androidx.constraintlayout:constraintlayout-solver:$constraintLayout"

    val recyclerview = "androidx.recyclerview:recyclerview:$androidX"
    val recyclerview_selection = "androidx.recyclerview:recyclerview-selection:$androidX"
    val swiperefreshlayout = "androidx.swiperefreshlayout:swiperefreshlayout:$androidX"

    val support_dynamic_animation = "androidx.dynamicanimation:dynamicanimation:1.0.0"
    val cardview = "androidx.cardview:cardview:1.0.0"
    val customtabs = "androidx.browser:browser:1.2.0"
    val palette = "androidx.palette:palette:1.0.0"
    val multidex = "androidx.multidex:multidex:2.0.0"

    val preference = "androidx.preference:preference:$androidx_preference_version"
    val preference_ktx = "androidx.preference:preference-ktx:$androidx_preference_version"

    val drawerlayout = "androidx.drawerlayout:drawerlayout:$androidX"
    val browser = "androidx.browser:browser:$androidX"
    val webkit = "androidx.webkit:webkit:$androidX"

    val lifecycle_extensions = "androidx.lifecycle:lifecycle-extensions:$androidx_lifecycle_version"
    val lifecycle_common_java8 = "androidx.lifecycle:lifecycle-common-java8:$androidx_lifecycle_version"
    val lifecycle_livedata_ktx = "androidx.lifecycle:lifecycle-livedata-ktx:$androidx_lifecycle_version"
    val lifecycle_process = "androidx.lifecycle:lifecycle-process:$androidx_lifecycle_version"
    val lifecycle_runtime_ktx = "androidx.lifecycle:lifecycle-runtime-ktx:$androidx_lifecycle_version"
    val lifecycle_viewmodel_ktx = "androidx.lifecycle:lifecycle-viewmodel-ktx:$androidx_lifecycle_version"

    val androidx_room_runtime = "androidx.room:room-runtime:$androidx_room_version"
    val androidx_room_testing = "androidx.room:room-testing:$androidx_room_version"
    val androidx_room_compiler = "androidx.room:room-compiler:$androidx_room_version"
    val androidx_room_rxjava2 = "androidx.room:room-rxjava2:$androidx_room_version"
    val androidx_room_common = "androidx.room:room-common:$androidx_room_version"

    val support = "androidx.legacy:legacy-support-v4:$androidX"

    val databinding_runtime = "androidx.databinding:databinding-runtime:$androidx_databinding_version"
    val databinding_compiler = "androidx.databinding:databinding-compiler:$androidx_databinding_version"
}
//endregion

