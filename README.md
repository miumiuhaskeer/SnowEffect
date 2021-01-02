# SnowEffect
[![](https://jitpack.io/v/miumiuhaskeer/SnowEffect.svg)](https://jitpack.io/#miumiuhaskeer/SnowEffect)
<br><br>
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

## License
```
Copyright (c) 2020 miumiuhaskeer

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
