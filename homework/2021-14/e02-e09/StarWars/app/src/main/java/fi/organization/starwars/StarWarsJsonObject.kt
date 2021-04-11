package fi.organization.starwars

import com.fasterxml.jackson.annotation.JsonIgnoreProperties


@JsonIgnoreProperties(ignoreUnknown = true)
data class StarWarsJsonObject(var results: MutableList<Person>? = null)