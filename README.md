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
  implementation 'com.github.miumiuhaskeer:SnowEffect:1.0'
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

## Methods
```Java
//Set elements array for snow effect
setElements(SnowElement... elements)

//Start showing snow effect
void startShowing()

//Start showing snow effect with duration (ms)
void startShowing(int duration)

//Stop showing effect smoothly
void stopShowing()

//Stop showing effect immediately
void stopShowingNow()

//Set element falling speed (from 0 to 1)
void setElementSpeed(float speed)

//Set element location on screen
// 0 -> element always in background
// 1 -> element always in foreground
// 2 -> element in background and foreground
void setElementShowIn(int location)

//Check if Snow Effect is active now
boolean isFalling()
```
