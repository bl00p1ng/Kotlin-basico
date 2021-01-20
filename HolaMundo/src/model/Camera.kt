package model

class Camera {
    // Atributos
    private var isOn: Boolean = false
    private var resolution: Int = 640

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
}