package model

class Camera {
    // Atributos
    private var isOn: Boolean = false

    // Métodos
    fun turnOn() {
        isOn = true
    }

    fun turnOf() {
        isOn = false
    }

    fun cameraStatus(): String {
        return if (isOn) "Camera is Turned" else "Camera is not turned"
    }
}