package org.example.lesson_14

open class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val isSuitableForLanding: Boolean,
)

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
    val satellites: List<Satellite>,
) : CelestialBody(name, hasAtmosphere, isSuitableForLanding)

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
) : CelestialBody(name, hasAtmosphere, isSuitableForLanding)

fun main() {
    val planetMars = Planet(
        "Mars",
        true,
        true,
        listOf(
            Satellite("Phobos", false, false),
            Satellite("Deimos", false, false),
        )
    )
    val satellitesQuantity = planetMars.satellites.size
    println("Планета ${planetMars.name} имеет " +
            "$satellitesQuantity спутника: " +
            planetMars.satellites.joinToString(", ") { it.name }
    )
}