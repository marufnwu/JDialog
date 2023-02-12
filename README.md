**Implementation of JDialog Android library is so easy. You can check /app directory for demo. Let's have look on basic steps of implementation.**

i. Gradle
In Build.gradle of app module, include these dependencies. If you want to show animations, include Lottie animation library.

```
repositories {
    mavenCentral()
}
```
```
dependencies {
   implementation 'com.github.marufnwu:JDialog:1.0.4'
}

```

ii. Customize Dialog Color (Optional)
If you want to customize dialog view, you can override color in colors.xml as below.

```
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <color name="purple_200">#FFBB86FC</color>
    <color name="purple_500">#FF6200EE</color>
    <color name="purple_700">#FF3700B3</color>
    <color name="teal_200">#FF03DAC5</color>
    <color name="teal_700">#FF018786</color>
    <color name="black">#FF000000</color>
    <color name="white">#FFFFFFFF</color>

    <color name="jdialog_button_color">#FF6200EE</color>
    <color name="jdialog_body_text_color">#FF03DAC5</color>
</resources>
```

**Create Dialog Instance**

Create dialog using predefined Icon Type
Availabe icon type is WARNING, SUCCESS, ERROR

```
    JDialog.make(this)
        .setCancelable(false)
        .setPositiveButton("Dismiss"){
            it.hideDialog()
        }
        .setNegativeButton("Hide"){
            it.hideDialog()
        }
        .setBodyText("Here is warning dialog")
        .setIconType(JDialog.IconType.WARNING)
        .build()
        .showDialog()
```

Create dialog with image
imageUri function can accept JDialogImage class and JdialogImage has two field image path and onclick url 
```
    JDialog.make(this)
        .setCancelable(false)
        .setPositiveButton("Dismiss"){
            it.hideDialog()
        }
        .setNegativeButton("Hide"){
            it.hideDialog()
        }
        .setBodyText("Here is warning dialog")
        .imageUrl(JDialogImage(resources.getString(R.string.image_url), null))
        .build()
        .showDialog()
```

