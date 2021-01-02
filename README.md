# SnowEffect
Customizable snow effect view for Android. You can use custom colors and drawables for elements!
<br><br>
<img src="https://github.com/miumiuhaskeer/SnowEffect/blob/master/arts/snow_effect_demonstration.gif" width="221.25" height="480" />

## Download
Add it in your root build.gradle at the end of repositories:
```gradle
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```
Add the dependency
```gradle
dependencies {
  implementation 'com.github.miumiuhaskeer:SnowEffect:1.0.2'
}
```
## Usage
#### Default implementation
Layout file:
```xml
<com.miumiuhaskeer.snoweffect.SnowEffect
        android:id="@+id/snowEffect"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>
```
MainActivity file:
```Java
SnowEffect effect = findViewById(R.id.snowEffect);
effect.startShowing();
```
## SnowElement class
This class was created for define element that will fall. One object contains drawable for element and color for drawable.

## Layout fully customized
```xml
<com.miumiuhaskeer.snoweffect.SnowEffect
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:elementSpeed="1"
        app:elementShowSpeedMillis="150"
        app:elementShowIn="foreground"/>
```
