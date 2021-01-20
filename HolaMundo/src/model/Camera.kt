package model

class Camera {
    // Atributos
    private var isOn: Boolean = false
    private var resolution: Int = 640
    private var isSelfieMode: Boolean = false
    private var isFlash: Boolean = false

    // Métodos
    fun turnOn() {
        isOn = true
    }

    fun turnOf() {
        isOn = false
    }

    // Getters y Setters
    fun getCameraStatus(): String {
        return if (isOn) "Camera is Turned" else "Camera is not turned"
    }

    /*fun setCameraStatus(onOff: Boolean) {
        isOn = onOff
    }*/

    fun setResolution(resolution: Int) {
        this.resolution = resolution
    }

    fun getResolution(): Int {
        return this.resolution
    }

    fun getSelfieModeStatus(): String {
        return if (this.isSelfieMode) "Selfie Mode: On" else "Selfie Mode: Off"
    }

    fun setSelfieModeStatus(status: Boolean) {
        this.isSelfieMode = status
    }

    fun getFlashStatus(): String {
        return if (isFlash) "Flash: On" else "Flash: Off"
    }

    fun setFlashStatus(status: Boolean) {
        this.isFlash = status
    }
}