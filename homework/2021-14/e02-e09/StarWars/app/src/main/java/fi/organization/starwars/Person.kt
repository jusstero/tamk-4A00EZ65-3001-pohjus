package fi.organization.starwars

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import kotlin.math.roundToInt

@JsonIgnoreProperties(ignoreUnknown = true)
data class Person(var name: String? = null, var mass: Int = 0, var height: Int = 0) {

    fun getBmi() : Int {
        val weight = this.mass.toDouble()
        val height = this.height.toDouble()
        var bmi = weight / height / height * 10000
        return bmi.roundToInt()
    }
    override fun toString(): String {
        return "name = $name, bmi = ${getBmi()}"
    }
}