# EmailValidator

## Overview
`EmailValidator` is a String validator made of Kotlin to check email or not.

## Usage

```kotlin
val fooValidator = EmailValidator("foo@example.com")
fooValidator.isValid    // true

val barValidator = EmailValidator("barexample.com")
barValidator.isValid    // false
```

## Installation

```gradle
dependencies {
    compile 'com.worlddowntown.emailvalidator:emailvalidator:1.0.0'
}

repositories {
    maven { url 'http://raw.github.com/WorldDownTown/EmailValidator/master/repository/' }
}
```

## Author
WorldDownTown, WorldDownTown@gmail.com

## License
EmailValidator is available under the MIT license. See the LICENSE file for more info.
