# Prebuild gRPC Google API

gRPC + Google APIをAndroidから呼び出すためのライブラリをまとめたプロジェクトです。
現在のところ下記に対応しています。

 * [Cloud Speech API](https://cloud.google.com/speech/)

# 使用方法

```
// build.gradle
repositories {
    // add maven repository
    maven { url "http://eaglesakura.github.io/maven/" }
}

dependencies {
    // add library
    compile "com.eaglesakura:prebuilt-android-google-api:1.0.7"
}
```


# LICENSE

このプロジェクト自体はMITライセンスで配布します。

* アプリ等の成果物で権利情報を表示可能な場合
	* 権利情報の表示を行う（行える）場合、MIT Licenseを使用してください。
	* [MIT License](LICENSE.txt)
